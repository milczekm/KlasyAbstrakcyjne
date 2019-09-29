package zpo;

public class Prostokat extends Figura {

    private double bok1, bok2;

    private void sprawdzBoki(double bok1, double bok2) {
        if (bok1 <= 0 || bok2 <= 0) {
            throw new IllegalArgumentException("Nie mozna utworzyc prostokata - niepoprawne boki!");
        }
    }

    private void sprawdzBok(double bok) {
        if (bok <= 0) {
            throw new IllegalArgumentException("Nie mozna utworzyc prostokata - niepoprawne dlugosci bokow prostokata!");
        }
    }

    public Prostokat(double bok1, double bok2) {
        sprawdzBoki(bok1, bok2);
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    double pole() {
        return bok1 * bok2;
    }

    @Override
    double obwod() {
        return 2 * bok1 + 2 * bok2;
    }

    public void setBok1(double bok1) {
        sprawdzBok(bok1);
        this.bok1 = bok1;
    }

    public void setBok2(double bok2) {
        sprawdzBok(bok2);
        this.bok2 = bok2;
    }

    public double getBok1() {
        return bok1;
    }

    public double getBok2() {
        return bok2;
    }

}
