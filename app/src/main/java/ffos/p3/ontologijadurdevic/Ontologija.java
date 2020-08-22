package ffos.p3.ontologijadurdevic;

import java.io.Serializable;

public class Ontologija implements Serializable {

    public Ontologija() {
        this.sifra = sifra;
        this.knjiga = knjiga;
        this.nakladnik = nakladnik;
        this.objavljena = objavljena;
        this.imaStranica = imaStranica;
        this.dostupnost = dostupnost;
        this.brPosudbi = brPosudbi;
        this.vrijemePosudbe = vrijemePosudbe;
    }

    private int sifra;
    private String knjiga;
    private String nakladnik;
    private int objavljena;
    private int imaStranica;
    private int dostupnost;
    private int brPosudbi;
    private String vrijemePosudbe;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getKnjiga() {
        return knjiga;
    }

    public void setKnjiga(String knjiga) {
        this.knjiga = knjiga;
    }

    public String getNakladnik() {
        return nakladnik;
    }

    public void setNakladnik(String nakladnik) {
        this.nakladnik = nakladnik;
    }

    public int getObjavljena() {
        return objavljena;
    }

    public void setObjavljena(int objavljena) {
        this.objavljena = objavljena;
    }

    public int getImaStranica() {
        return imaStranica;
    }

    public void setImaStranica(int imaStranica) {
        this.imaStranica = imaStranica;
    }

    public int getDostupnost() {
        return dostupnost;
    }

    public void setDostupnost(int dostupnost) {
        this.dostupnost = dostupnost;
    }

    public int getBrPosudbi() {
        return brPosudbi;
    }

    public void setBrPosudbi(int brPosudbi) {
        this.brPosudbi = brPosudbi;
    }

    public String getVrijemePosudbe() {
        return vrijemePosudbe;
    }

    public void setVrijemePosudbe(String vrijemePosudbe) {
        this.vrijemePosudbe = vrijemePosudbe;
    }
}
