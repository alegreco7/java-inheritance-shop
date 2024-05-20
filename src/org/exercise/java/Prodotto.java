package org.exercise.java;

public class Prodotto {
    // Attributi privati del prodotto
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    // Costruttore per inizializzare gli attributi
    public Prodotto(int codice, String nome, String descrizione, double prezzo, double iva) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    // Getter per il codice, accessibile solo in lettura
    public int getCodice() {
        return codice;
    }

    // Getter e setter per il nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e setter per la descrizione
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    // Getter e setter per il prezzo
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    // Getter e setter per l'iva
    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    // Metodo per ottenere il prezzo base
    public double getPrezzoBase() {
        return prezzo;
    }

    // Metodo per ottenere il prezzo comprensivo di IVA
    public double getPrezzoIvato() {
        return prezzo + (prezzo * iva / 100);
    }

    // Metodo toString per stampare i dettagli del prodotto
    @Override
    public String toString() {
        return "Prodotto{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                '}';
    }
}
