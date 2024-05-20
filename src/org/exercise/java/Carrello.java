package org.exercise.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrello {
    // Lista di prodotti nel carrello
    private ArrayList<Prodotto> prodotti;

    // Costruttore per inizializzare la lista
    public Carrello() {
        this.prodotti = new ArrayList<>();
    }

    // Metodo per aggiungere un prodotto al carrello
    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
    }

    // Metodo per stampare i dettagli dei prodotti nel carrello
    public void stampaCarrello() {
        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto);
        }
    }

    // Metodo main per l'interazione con l'utente
    public static void main(String[] args) {
        Carrello carrello = new Carrello();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti prodotti vuoi inserire?");
        int numProdotti = scanner.nextInt();
        scanner.nextLine();  

        for (int i = 0; i < numProdotti; i++) {
            System.out.println("Inserisci il tipo di prodotto (1. Smartphone, 2. Televisore, 3. Cuffie):");
            int tipoProdotto = scanner.nextInt();
            scanner.nextLine();  

            System.out.println("Inserisci il codice:");
            int codice = scanner.nextInt();
            scanner.nextLine();  

            System.out.println("Inserisci il nome:");
            String nome = scanner.nextLine();

            System.out.println("Inserisci la descrizione:");
            String descrizione = scanner.nextLine();

            System.out.println("Inserisci il prezzo:");
            double prezzo = scanner.nextDouble();

            System.out.println("Inserisci l'IVA:");
            double iva = scanner.nextDouble();
            scanner.nextLine();  

            // Switch per gestire i diversi tipi di prodotti
            switch (tipoProdotto) {
                case 1: // Smartphone
                    System.out.println("Inserisci il codice IMEI:");
                    String imei = scanner.nextLine();
                    System.out.println("Inserisci la quantità di memoria:");
                    int memoria = scanner.nextInt();
                    scanner.nextLine();  
                    Smartphone smartphone = new Smartphone(codice, nome, descrizione, prezzo, iva, imei, memoria);
                    carrello.aggiungiProdotto(smartphone);
                    break;
                case 2: // Televisore
                    System.out.println("Inserisci le dimensioni:");
                    int dimensioni = scanner.nextInt();
                    System.out.println("È smart (true/false)?");
                    boolean smart = scanner.nextBoolean();
                    scanner.nextLine();  
                    Televisore televisore = new Televisore(codice, nome, descrizione, prezzo, iva, dimensioni, smart);
                    carrello.aggiungiProdotto(televisore);
                    break;
                case 3: // Cuffie
                    System.out.println("Inserisci il colore:");
                    String colore = scanner.nextLine();
                    System.out.println("Sono wireless (true/false)?");
                    boolean wireless = scanner.nextBoolean();
                    scanner.nextLine();  
                    Cuffie cuffie = new Cuffie(codice, nome, descrizione, prezzo, iva, colore, wireless);
                    carrello.aggiungiProdotto(cuffie);
                    break;
                default:
                    System.out.println("Tipo di prodotto non valido.");
                    i--;  // Ripete l'iterazione per un prodotto valido
                    break;
            }
        }

        // Stampa i prodotti nel carrello
        System.out.println("Prodotti nel carrello:");
        carrello.stampaCarrello();

        scanner.close();
    }
}
