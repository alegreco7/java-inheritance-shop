package org.exercise.java;

public class Televisore extends Prodotto {
    // Attributi specifici di Televisore
    private int dimensioni;
    private boolean smart;

    // Costruttore per inizializzare gli attributi specifici e quelli della superclasse
    public Televisore(int codice, String nome, String descrizione, double prezzo, double iva, int dimensioni, boolean smart) {
        super(codice, nome, descrizione, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    // Getter e setter per dimensioni
    public int getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    // Getter e setter per smart
    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    // Metodo toString per stampare i dettagli di Televisore
    @Override
    public String toString() {
        return "Televisore{" +
                super.toString() +
                ", dimensioni=" + dimensioni +
                ", smart=" + smart +
                '}';
    }
}
