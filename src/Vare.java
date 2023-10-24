public class Vare {
    private int vNr;
    private String vNavn;
    private int antPaaLager;
    private double stkPris;

    private double nyStykPris;


    public Vare(int vNr, String vNavn, int antPaaLager, double stkPris) {
        this.vNr = vNr;
        this.vNavn = vNavn;
        this.antPaaLager = antPaaLager;
        this.stkPris = stkPris;
    }

    public void fjernVare(int fjernAntal){
    this.antPaaLager -= fjernAntal;
    }

    public void Tilfoej(int Tilfoej){
        this.antPaaLager += Tilfoej;
    }

    public void plusVare(int plusVare){
        this.stkPris *= plusVare;
    }

    public void nyPris(int nyPris){
        this.stkPris = nyPris;
    }

    public double rabat(int antal){
        double indkoebsPris = antal * stkPris;
        if (antal >20)
            indkoebsPris = indkoebsPris - (indkoebsPris*0.15);
        return indkoebsPris;
    }

    public void nyPris(double nyStkPris){
        this.nyStykPris = nyStkPris;
    }













//Getter and Setter & tostring
    public int getvNr() {
        return vNr;
    }

    public void setvNr(int vNr) {
        this.vNr = vNr;
    }

    public String getvNavn() {
        return vNavn;
    }

    public void setvNavn(String vNavn) {
        this.vNavn = vNavn;
    }

    public int getAntPaaLager() {
        return antPaaLager;
    }

    public void setAntPaaLager(int antPaaLager) {
        this.antPaaLager = antPaaLager;
    }

    public double getStkPris() {
        return stkPris;
    }

    public void setStkPris(double stkPris) {
        this.stkPris = stkPris;
    }

    @Override
    public String toString() {
        return "Vare{" +
                "vNr=" + vNr +
                ", vNavn='" + vNavn + '\'' +
                ", antPaaLager=" + antPaaLager +
                ", stkPris=" + stkPris +
                '}';
    }
}
