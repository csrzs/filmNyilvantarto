package hu.progmatic;

public class Film {
  private final String nyilvantartasiSzam;
  private String cim;
  private int kiadasiEv;
  private String mufaj;
  private int hossz;
  private int koltsegvetes;
  private int mufajertekeles;

// KONSTRUKTOROK ---------------------------------------------------------------------------------------

  public Film(String nyilvantartasiSzam) {
    this.nyilvantartasiSzam = nyilvantartasiSzam;
  }

  public Film(String nyilvantartasiSzam, String cim, int kiadasiEv, int hossz, int koltsegvetes) {
    this.nyilvantartasiSzam = nyilvantartasiSzam;
    this.cim = cim;
    this.kiadasiEv = kiadasiEv;
    this.hossz = hossz;
    this.koltsegvetes = koltsegvetes;
  }

  public Film(String nyilvantartasiSzam, String cim, int kiadasiEv, String mufaj, int hossz, int koltsegvetes) {
    this.nyilvantartasiSzam = nyilvantartasiSzam;
    this.cim = cim;
    this.kiadasiEv = kiadasiEv;
    this.mufaj = mufaj;
    this.hossz = hossz;
    this.koltsegvetes = koltsegvetes;

    if (mufaj == null || mufaj.equals("")) {
      this.mufaj = "idk";
    }
  }

// GETTEREK, SETTEREK ----------------------------------------------------------------------------------

  final public int getErtekeles() {
    return getKoltsegvetesiKategoria() + getMufajErtekeles();
  }

  public int getMufajErtekeles() {
    return 0;
  }

  final public int getKoltsegvetesiKategoria() {
    if (koltsegvetes <= 1000) {
      return 0;
    } else if (koltsegvetes <= 10000) {
      return 1;
    } else if (koltsegvetes <= 100000) {
      return 2;
    } else if (koltsegvetes <= 1000000) {
      return 3;
    } else if (koltsegvetes <= 10000000) {
      return 4;
    } else
      return 5;
  }

  final public int getFilmkockak() {
    return hossz * 24;
  }

  final public String getNyilvantartasiSzam() {
    return nyilvantartasiSzam;
  }

  final public String getCim() {
    return cim;
  }

  final public void setCim(String cim) {
    this.cim = cim;
  }

  final public int getKiadasiEv() {
    return kiadasiEv;
  }

  final public void setKiadasiEv(int kiadasiEv) {
    this.kiadasiEv = kiadasiEv;
  }

  final public String getMufaj() {
    return mufaj;
  }

  final public void setMufaj(String mufaj) {
    this.mufaj = mufaj;

    if (mufaj == null || mufaj.equals("")) {
      this.mufaj = "idk";
    }
  }

  final public int getHossz() {
    return hossz;
  }

  final public void setHossz(int hossz) {
    this.hossz = hossz;
  }

  final public int getKoltsegvetes() {
    return koltsegvetes;
  }

  final public void setKoltsegvetes(int koltsegvetes) {
    this.koltsegvetes = koltsegvetes;
  }

  // OVERRIDEOK ----------------------------------------------------------------------------------------

  @Override
  public String toString() {
    return "Nyilvántartási szám: " + nyilvantartasiSzam + "\n"
            + "Cím: " + cim + "\n"
            + "Kiadás éve: " + kiadasiEv + "\n"
            + "Műfaj: " + mufaj + "\n"
            + "Hossz (mp): " + hossz + "\n"
            + "Filmkockák száma: " + getFilmkockak() + "\n"
            + "Költségvetés: " + koltsegvetes + "\n"
            + "Értékelés: " + getErtekeles() + "\n"
            + "Költségvetési kategória: " + getKoltsegvetesiKategoria() + "\n";

  }
}