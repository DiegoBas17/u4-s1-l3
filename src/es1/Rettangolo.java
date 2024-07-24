package es1;

public class Rettangolo {
    /*ATTRIBUTI*/
    private double altezza;
    private double base;

    /*COSTRUTTI*/
    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public static String stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        return "il perimetro del primo rettangolo è: " + rettangolo1.getPerimetro() + ". L'area del primo rettangolo invece è: " + rettangolo1.getArea() + "." + " Il perimetro del secondo rettangolo è: " + rettangolo2.getPerimetro() + ". L'area del secondo rettangolo invece è: " + rettangolo2.getArea() + "." + "La somma dei perimetri dei due rettangoli è: " + (rettangolo1.getPerimetro() + rettangolo2.getPerimetro()) + ". La somma delle aree dei due rettangoli invece è: " + (rettangolo1.getArea() + rettangolo2.getArea()) + ".";
    }

    public static String stampaRettangolo(Rettangolo rettangolo) {
        return "il perimetro del rettangolo è: " + rettangolo.getPerimetro() + ". L'area invece è: " + rettangolo.getArea() + ".";
    }

    /*METODI*/
    public double getPerimetro() {
        return (this.base + this.altezza) * 2;
    }

    public double getArea() {
        return this.base * this.altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }
}
