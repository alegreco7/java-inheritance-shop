package org.exercise.java;

public class Cuffie extends Prodotto {
    // Attributi specifici di Cuffie
    private String colore;
    private boolean wireless;

    // Costruttore per inizializzare gli attributi specifici e quelli della superclasse
    public Cuffie(int codice, String nome, String descrizione, double prezzo, double iva, String colore, boolean wireless) {
        super(codice, nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    // Getter e setter per colore
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    // Getter e setter per wireless
    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    // Metodo toString per stampare i dettagli di Cuffie
    @Override
    public String toString() {
        return "Cuffie{" +
                super.toString() +
                ", colore='" + colore + '\'' +
                ", wireless=" + wireless +
                '}';
    }
}
