package es3;

public class Articolo {
    /*ATTRIBUTI*/
    private String codiceArticolo;
    private String descrizioneArticolo;
    private int prezzo;
    private int numeriPzDisponibili;

    /*COSTRUTTI*/
    public Articolo(String codiceArticolo, String descrizioneArticolo, int prezzo, int numeriPzDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.numeriPzDisponibili = numeriPzDisponibili;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "codiceArticolo='" + codiceArticolo + '\'' +
                ", descrizioneArticolo='" + descrizioneArticolo + '\'' +
                ", prezzo=" + prezzo +
                ", numeriPzDisponibili=" + numeriPzDisponibili +
                '}';
    }
}
