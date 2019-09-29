package zpo;

public class Kwadrat extends Figura {

    private double bok;

    private void sprawdzBok(double bok) {
        if (bok <= 0) {
            throw new IllegalArgumentException("Nieprawidlowa dlugosc boku kwadratu!");
        }
    }

    public Kwadrat(double bok) {
        sprawdzBok(bok);
        this.bok = bok;
    }

    @Override
    double pole() {
        return bok * bok;
    }

    @Override
    double obwod() {
        return 4 * bok;
    }

    public void setBok(double bok) {
        sprawdzBok(bok);
        this.bok = bok;
    }

}
