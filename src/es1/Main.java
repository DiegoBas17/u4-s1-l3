package es1;

public class Main {
    public static void main(String[] args) {
        Rettangolo equilatero1 = new Rettangolo(5, 8);
        System.out.println(Rettangolo.stampaRettangolo(equilatero1));
        Rettangolo equilatero2 = new Rettangolo(10, 12);
        System.out.println(Rettangolo.stampaDueRettangoli(equilatero1, equilatero2));
    }
}