package es2;

public class Main {
    public static void main(String[] args) {
        Chiamata chiamata1 = new Chiamata("3271930800", 4000);
        Sim myNumeroTelefono = new Sim("3291912006", 0, chiamata1);
        System.out.println(myNumeroTelefono.infoSim());
    }
}
