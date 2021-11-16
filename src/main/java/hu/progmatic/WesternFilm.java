package hu.progmatic;

final public class WesternFilm extends Film {
  private boolean voltakBenneIndianok;

  // KONSTRUKTOROK ---------------------------------------------------------------------------------------

  public WesternFilm(String nyilvantartasiSzam) {
    super(nyilvantartasiSzam);
  }

  public WesternFilm(String nyilvantartasiSzam, String cim, int kiadasiEv, int hossz, int koltsegvetes) {
    super(nyilvantartasiSzam, cim, kiadasiEv, hossz, koltsegvetes);
  }

  public WesternFilm(String nyilvantartasiSzam, String cim, int kiadasiEv, String mufaj, int hossz, int koltsegvetes) {
    super(nyilvantartasiSzam, cim, kiadasiEv, mufaj, hossz, koltsegvetes);
  }

// GETTEREK, SETTEREK ----------------------------------------------------------------------------------


  public boolean isVoltakBenneIndianok() {
    return voltakBenneIndianok;
  }

  public void setVoltakBenneIndianok(boolean voltakBenneIndianok) {
    this.voltakBenneIndianok = voltakBenneIndianok;
  }

  @Override
  public int getMufajErtekeles() {
    if (isVoltakBenneIndianok()) {
      return 5;
    }
    return 0;
  }
}
