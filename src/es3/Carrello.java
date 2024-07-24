package es3;

import java.util.ArrayList;

public class Carrello {
    /*ATTRIBUTI*/
    private int codiceCliente;
    private ArrayList<Articolo> elencoArticoli;
    private int totaleCostoArticoli;

    /*COSTRUTTI*/
    public Carrello(int codiceCliente) {
        this.codiceCliente = codiceCliente;
        this.elencoArticoli = new ArrayList<>();
        this.totaleCostoArticoli = 0;
    }

    /* METODI */
    public void aggiungiArticolo(Articolo articolo) {
        elencoArticoli.add(articolo);
        totaleCostoArticoli = totaleCostoArticoli + articolo.getPrezzo();
    }

    public int getTotaleCostoArticoli() {
        return totaleCostoArticoli;
    }

    public ArrayList<Articolo> getElencoArticoli() {
        return elencoArticoli;
    }
}
