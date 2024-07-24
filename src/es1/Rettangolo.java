package es1;

public class Rettangolo {
    /*ATTRIBUTI*/
    public double altezza;
    public double base;

    /*COSTRUTTI*/
    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    /*METODI*/
    public double getPerimetro() {
        return (this.base + this.altezza) * 2;
    }

    public double getArea() {
        return this.base * this.altezza;
    }

    public String stampaRettangolo() {
        return "il perimetro del rettangolo è: " + getPerimetro() + ". L'area invece è: " + getArea() + ".";
    }

    public String stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        return "La somma dei perimetri dei due rettangoli è: " + (rettangolo1.getPerimetro() + rettangolo2.getPerimetro()) + ". La somma delle aree dei due rettangoli invece è: " + (rettangolo1.getArea() + rettangolo2.getArea()) + ".";
    }
}
