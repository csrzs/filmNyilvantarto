package hu.progmatic;

final public class HorrorFilm extends Film {

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
}
