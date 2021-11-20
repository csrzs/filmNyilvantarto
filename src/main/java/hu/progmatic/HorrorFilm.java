package hu.progmatic;

final public class HorrorFilm extends Film {
  private boolean voltBenneSzellem;
  private boolean voltBenneSzornyeteg;

  // KONSTRUKTOROK -------------------------------------------------------------------------------------

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

  // OVERRIDEOK ----------------------------------------------------------------------------------------

  @Override
  public int getMufajErtekeles() {
    int output = 0;
    if (isVoltBenneSzellem()) {
      output += 2;
    }
    if (isVoltBenneSzornyeteg()) {
      output += 3;
    }
    return output;
  }

  @Override
  public String toString() {
    return super.toString()
            + "Műfajértékelés: " + getMufajErtekeles() + "\n";
  }
}
