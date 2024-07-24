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

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public void setCodiceArticolo(String codiceArticolo) {
        this.codiceArticolo = codiceArticolo;
    }

    public int getNumeriPzDisponibili() {
        return numeriPzDisponibili;
    }

    public void setNumeriPzDisponibili(int numeriPzDisponibili) {
        this.numeriPzDisponibili = numeriPzDisponibili;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public void setDescrizioneArticolo(String descrizioneArticolo) {
        this.descrizioneArticolo = descrizioneArticolo;
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
