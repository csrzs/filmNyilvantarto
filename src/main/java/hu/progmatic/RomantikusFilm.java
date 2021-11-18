package hu.progmatic;

final public class RomantikusFilm extends Film {
  private int hazassagokSzama;

  // KONSTRUKTOROK -------------------------------------------------------------------------------------

  public RomantikusFilm(String nyilvantartasiSzam) {
    super(nyilvantartasiSzam);
  }

  public RomantikusFilm(String nyilvantartasiSzam, String cim, int kiadasiEv, int hossz, int koltsegvetes) {
    super(nyilvantartasiSzam, cim, kiadasiEv, hossz, koltsegvetes);
  }

  public RomantikusFilm(String nyilvantartasiSzam, String cim, int kiadasiEv, String mufaj, int hossz, int koltsegvetes) {
    super(nyilvantartasiSzam, cim, kiadasiEv, mufaj, hossz, koltsegvetes);
  }

// GETTEREK, SETTEREK ----------------------------------------------------------------------------------

  public int getHazassagokSzama() {
    return hazassagokSzama;
  }

  public void setHazassagokSzama(int hazassagokSzama) {
    this.hazassagokSzama = hazassagokSzama;
  }

  // OVERRIDEOK ----------------------------------------------------------------------------------------

  @Override
  public int getMufajErtekeles() {
    if (hazassagokSzama > 5) {
      return 5;
    }
    return hazassagokSzama;
  }

  @Override
  public String toString() {
    return super.toString()
            + "Műfajértékelés: " + getMufajErtekeles() + "\n";
  }
}
