package zpo;

abstract public class Figura {

    abstract double pole();

    abstract double obwod();

    double polePrzezObwod() {
        return pole() / obwod();
    }
}
