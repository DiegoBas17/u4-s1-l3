package es2;

public class Sim {
    /*ATTRIBUTI*/
    private String numeroCellulare;
    private int creditoDisponibile;
    private Chiamata[] chiamate;

    /*COSTRUTTI*/
    public Sim(String numeroCellulare, int creditoDisponibile) {
        this.numeroCellulare = numeroCellulare;
        this.creditoDisponibile = creditoDisponibile;
        this.chiamate = new Chiamata[5];
    }

    /*METODI*/
    public String infoSim() {
        return "info Sim: " +
                "numero di cellulare: " + getNumeroCellulare() + " " +
                "credito disponibile: " + getCreditoDisponibile();
    }

    public String getNumeroCellulare() {
        return numeroCellulare;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    public int getCreditoDisponibile() {
        return creditoDisponibile;
    }
}
