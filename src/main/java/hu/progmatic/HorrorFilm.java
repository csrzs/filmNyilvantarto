package hu.progmatic;

final public class HorrorFilm extends Film {
  private boolean voltBenneSzellem;
  private boolean voltBenneSzornyeteg;

  // KONSTRUKTOROK ---------------------------------------------------------------------------------------

  public HorrorFilm(String nyilvantartasiSzam) {
    super(nyilvantartasiSzam);
  }

  public HorrorFilm(String nyilvantartasiSzam, String cim, int kiadasiEv, int hossz, int koltsegvetes) {
    super(nyilvantartasiSzam, cim, kiadasiEv, hossz, koltsegvetes);
  }

  public HorrorFilm(String nyilvantartasiSzam, String cim, int kiadasiEv, String mufaj, int hossz, int koltsegvetes) {
    super(nyilvantartasiSzam, cim, kiadasiEv, mufaj, hossz, koltsegvetes);
  }

// GETTEREK, SETTEREK ----------------------------------------------------------------------------------


  public boolean isVoltBenneSzellem() {
    return voltBenneSzellem;
  }

  public void setVoltBenneSzellem(boolean voltBenneSzellem) {
    this.voltBenneSzellem = voltBenneSzellem;
  }

  public boolean isVoltBenneSzornyeteg() {
    return voltBenneSzornyeteg;
  }

  public void setVoltBenneSzornyeteg(boolean voltBenneSzornyeteg) {
    this.voltBenneSzornyeteg = voltBenneSzornyeteg;
  }

  @Override
  public int getMufajErtekeles() {
    if (isVoltBenneSzellem()) {
      return 2;
    } else if (isVoltBenneSzornyeteg()) {
      return 3;
    }
    return 0;
  }


}

