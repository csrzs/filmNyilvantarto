package hu.progmatic;

public class Main {
  public static void main(String[] args) {
    Videoteka videoteka = new Videoteka(10);
    Film itChapterOne = new HorrorFilm("1", "IT: Chapter One", 2017, "Horror", 8100, 800000);
    System.out.println("Hello");

    System.out.println(videoteka.getKazettahelyekSzama());
    System.out.println(videoteka.getSzabadHelyekSzama());
    System.out.println(videoteka.getElsoSzabadHelyIndex());
    System.out.println();
    videoteka.addFilm(itChapterOne);
    System.out.println(videoteka.getSzabadHelyekSzama());
    System.out.println(videoteka.getElsoSzabadHelyIndex());
    System.out.println();
    videoteka.addFilm(itChapterOne);
    System.out.println(videoteka.getSzabadHelyekSzama());
    System.out.println(videoteka.getElsoSzabadHelyIndex());
    System.out.println();
    videoteka.addFilm(itChapterOne);
    videoteka.addFilm(itChapterOne);
    videoteka.addFilm(itChapterOne);
    videoteka.addFilm(itChapterOne);
    videoteka.addFilm(itChapterOne);
    videoteka.addFilm(itChapterOne);
    videoteka.addFilm(itChapterOne);
    videoteka.addFilm(itChapterOne);
    videoteka.deleteFilm(3);
    System.out.println(videoteka.getSzabadHelyekSzama());
    System.out.println(videoteka.getElsoSzabadHelyIndex());
  }
}
