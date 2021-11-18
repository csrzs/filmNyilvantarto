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

  public void deleteFilm(int input) {
    kazettaJegyzek[input] = null;
  }
}