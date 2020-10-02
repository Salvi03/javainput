package main;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world");

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);

        System.out.print("Inserisci il tuo nome: ");
        String nome = tastiera.readLine();

        System.out.println("Ciao " + nome);

        System.out.print("Inserisci il tuo nome ma con lo scanner: ");
        String nome1 = new Scanner(System.in).next();

        System.out.println("Ciao " + nome1);
    }
}
