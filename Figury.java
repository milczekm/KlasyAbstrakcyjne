package zpo;

public class Figury {

    static void wyswietlFigure(Figura f) {
        System.out.println("Pole figury: " + f.pole());
        System.out.println("Obwod figury: " + f.obwod());
        System.out.println("Pole przez obwod: " + f.polePrzezObwod());
        System.out.println();
    }

    double sredniePolePrzezObwod(Figura[] figury) {
        double srednie = 0;

        for (int i = 0; i < figury.length; i++) {
            srednie += figury[i].polePrzezObwod();
        }

        return srednie / figury.length;
    }

    public static void main(String[] args) {
        Figura p = new Prostokat(10, 15);
        Figura k = new Kwadrat(20.4);
        Figura kolo = new Kolo(4);

        wyswietlFigure(p);
        wyswietlFigure(k);
        wyswietlFigure(k);

    }

}
