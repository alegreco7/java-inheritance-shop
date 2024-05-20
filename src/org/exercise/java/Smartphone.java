package org.exercise.java;

public class Smartphone extends Prodotto {
    // Attributi specifici di Smartphone
    private String imei;
    private int memoria;

    // Costruttore per inizializzare gli attributi specifici e quelli della superclasse
    public Smartphone(int codice, String nome, String descrizione, double prezzo, double iva, String imei, int memoria) {
        super(codice, nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    // Getter e setter per imei
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    // Getter e setter per memoria
    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    // Metodo toString per stampare i dettagli di Smartphone
    @Override
    public String toString() {
        return "Smartphone{" +
                super.toString() +
                ", imei='" + imei + '\'' +
                ", memoria=" + memoria +
                '}';
    }
}
