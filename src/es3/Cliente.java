package es3;

import java.time.LocalDateTime;

public class Cliente {
    /*ATTRIBUTI*/
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private LocalDateTime dataIscrizione;

    /*COSTRUTTI*/
    public Cliente(String nome, String cognome, String email) {
        this.codiceCliente = (int) Math.floor(Math.random());
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = LocalDateTime.now();
    }
}
