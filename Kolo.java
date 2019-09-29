package zpo;

public class Kolo extends Figura {

    private double promien;

    private void sprawdzPromien(double promien) {
        if (promien <= 0) {
            throw new IllegalArgumentException("Nieprawidlowa wartosc promienia kola!");
        }
    }

    public Kolo(double promien) {
        sprawdzPromien(promien);
        this.promien = promien;
    }

    @Override
    double pole() {
        return Math.PI * promien * promien;
    }

    @Override
    double obwod() {
        return 2 * Math.PI * promien;
    }

    public void setPromien(double promien) {
        sprawdzPromien(promien);
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

}
