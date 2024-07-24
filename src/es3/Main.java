package es3;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Aldo", "Baglio", "aldo.baglio@gmailcom");
        Articolo articolo1 = new Articolo("ad520", "gamba", 50, 1);
        Carrello carrello = new Carrello(cliente1.getCodiceCliente());
        carrello.aggiungiArticolo(articolo1);
        System.out.println(cliente1);
        System.out.println(carrello.getElencoArticoli());
    }
}
