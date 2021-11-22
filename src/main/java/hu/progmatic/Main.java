package hu.progmatic;

public class Main {
  public static void main(String[] args) {
    Videoteka mainVideoteka = tesztAdatok();

    System.out.println("--- ÖSSZES FILM ---");
    mainVideoteka.listaz();
    System.out.println("--- SZELLEMES FILMEK ---");
    mainVideoteka.szellemesFilmek();
    System.out.println("--- HÁZASSÁGOK SZÁMA ---");
    mainVideoteka.hazassagokSzama();
    System.out.println("--- FILMEK ÉVSZÁM SZERINT ---");
    mainVideoteka.filmekEvszamSzerint(2017);
    System.out.println("--- FILMEK ÉRTÉKELÉS SZERINT ---");
    mainVideoteka.filmekErtekelesSzerint(5);
    System.out.println("--- ROMANTIKUS FILMEK ---");
    mainVideoteka.filmekMufajSzerint("Romantikus");
  }

  public static Videoteka tesztAdatok() {
    Videoteka videoteka = new Videoteka(10);
    Film[] kazettaJegyzek;

    int nyilvantartasiSzam = 0; // folyósorszámot adok a filmeknek
    videoteka.addFilm(new HorrorFilm
            ("" + (nyilvantartasiSzam += 1), "Az", 2017, "Horror", 8100, 35000000));
    videoteka.addFilm(new HorrorFilm
            ("" + (nyilvantartasiSzam += 1), "Az ördögűző", 1973, "Horror", 7320, 12000000));
    videoteka.addFilm(new HorrorFilm
            ("" + (nyilvantartasiSzam += 1), "Az - Második fejezet", 2019, "Horror", 10140, 79000000));
    videoteka.addFilm(new HorrorFilm
            ("" + (nyilvantartasiSzam += 1), "Z világháború", 2013, "Horror", 6960, 269000000));
    videoteka.addFilm(new RomantikusFilm
            ("" + (nyilvantartasiSzam += 1), "Titanic", 1997, "Romantikus", 11640, 200000000));
    videoteka.addFilm(new RomantikusFilm
            ("" + (nyilvantartasiSzam += 1), "A szépség és a szörnyeteg", 2017, "Romantikus", 7740, 255000000));
    videoteka.addFilm(new RomantikusFilm
            ("" + (nyilvantartasiSzam += 1), "Shrek 2", 2004, "Romantikus", 5580, 150000000));
    videoteka.addFilm(new WesternFilm
            ("" + (nyilvantartasiSzam += 1), "Farkasokkal táncoló", 1990, "Western", 10860, 22000000));
    videoteka.addFilm(new WesternFilm
            ("" + (nyilvantartasiSzam += 1), "A visszatérő", 2015, "Western", 9360, 135000000));
    videoteka.addFilm(new WesternFilm
            ("" + (nyilvantartasiSzam += 1), "A félszemű", 2010, "Western", 6600, 38000000));

    kazettaJegyzek = videoteka.getKazettaJegyzek();

    ((HorrorFilm)kazettaJegyzek[0]).setVoltBenneSzornyeteg(true);
    ((HorrorFilm)kazettaJegyzek[1]).setVoltBenneSzellem(true);
    ((HorrorFilm)kazettaJegyzek[1]).setVoltBenneSzornyeteg(true);
    ((HorrorFilm)kazettaJegyzek[2]).setVoltBenneSzornyeteg(true);
    ((HorrorFilm)kazettaJegyzek[3]).setVoltBenneSzornyeteg(true);

    ((RomantikusFilm)kazettaJegyzek[4]).setHazassagokSzama(1);
    ((RomantikusFilm)kazettaJegyzek[5]).setHazassagokSzama(2);
    ((RomantikusFilm)kazettaJegyzek[6]).setHazassagokSzama(10);

    ((WesternFilm)kazettaJegyzek[7]).setVoltakBenneIndianok(true);
    ((WesternFilm)kazettaJegyzek[8]).setVoltakBenneIndianok(true);

    return videoteka;
  }
}