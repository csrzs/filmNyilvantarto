package hu.progmatic;

public class Videoteka {
  private final int kazettahelyekSzama;
  private Film[] kazettaJegyzek;

  // KONSTRUKTOROK --------------------------------------------------------------------------------------

  public Videoteka(int kazettahelyekSzama) {
    this.kazettahelyekSzama = kazettahelyekSzama;
    kazettaJegyzek = new Film[kazettahelyekSzama];
  }

  // GETTEREK, SETTEREK ----------------------------------------------------------------------------------

  public int getKazettahelyekSzama() {
    return kazettahelyekSzama;
  }

  public Film[] getKazettaJegyzek() {
    return kazettaJegyzek;
  }

  public int getSzabadHelyekSzama() {
    int output = 0;

    for (Film index : getKazettaJegyzek()) {
      if (index == null) {
        output++;
      }
    }
    return output;
  }

  public int getElsoSzabadHelyIndex() {
    int output = 0;
    for (Film index : getKazettaJegyzek()) {
      if (index == null) {
        return output;
      }
      output++;
    }
    throw new RuntimeException("Nincs szabad hely a kazettának!");
  }


  // EGYÉB METÓDUSOK ------------------------------------------------------------------------------------

  public void addFilm(Film input) {
    kazettaJegyzek[getElsoSzabadHelyIndex()] = input;
  }

  public void addArrayOfFilms(Film[] input) {
    if (!(input.length > getSzabadHelyekSzama())) {
      for (Film elem : input) {
        kazettaJegyzek[getElsoSzabadHelyIndex()] = elem;
      }
    } else {
      throw new RuntimeException("Importálandó filmek mennyisége több mint a szabad helyek száma!");
    }
  }

  public void deleteFilm(int input) {
    kazettaJegyzek[input] = null;
  }

  public void listaz() {
    for (Film elem : getKazettaJegyzek()) {
      if (elem != null) {
        System.out.println(elem);
      } else {
        System.out.println("Index Null: üres hely!");
      }
    }
  }

  public void filmekMufajSzerint(String mufaj) {
    for (Film elem : getKazettaJegyzek()) {
      if (elem != null) {
        if (elem.getMufaj().equals(mufaj)) {
          System.out.println(elem);
        }
      }
    }
  }

  public void filmekEvszamSzerint(int evszam) {
    for (Film elem : getKazettaJegyzek()) {
      if (elem != null) {
        if (elem.getKiadasiEv() == evszam) {
          System.out.println(elem);
        }
      }
    }
  }

  public void filmekErtekelesSzerint(int minErtekeles) {
    for (Film elem : getKazettaJegyzek()) {
      if (elem != null) {
        if (elem.getErtekeles() >= minErtekeles) {
          System.out.println(elem);
        }
      }
    }
  }

  public void szellemesFilmek() {
    for (Film elem : getKazettaJegyzek()) {
      if (elem instanceof HorrorFilm) {
        if (((HorrorFilm) elem).isVoltBenneSzellem()) {
          System.out.println(elem);
        }
      }
    }
  }

  public void hazassagokSzama() {
    int output = 0;
    for (Film elem : getKazettaJegyzek()) {
      if (elem instanceof RomantikusFilm) {
        output += ((RomantikusFilm) elem).getHazassagokSzama();
      }
    }
    System.out.println(output);
  }
}