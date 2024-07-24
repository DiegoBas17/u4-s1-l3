package es3;

public class Carrello {
    /*ATTRIBUTI*/
    private int codiceCliente;
    private Articolo[] elencoArticoli;
    private int totaleCostoArticoli;

    /*COSTRUTTI*/
    public Carrello(int codiceCliente, Articolo articolo) {
        this.codiceCliente = codiceCliente;
        this.elencoArticoli = new Articolo[]{articolo};
    }
}
