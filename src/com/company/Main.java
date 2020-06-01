package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga su nombre");
        String usuario = scanner.nextLine();
        String saludar = "Saludos";
        System.out.println(saludar + " " + usuario);


    }
}
