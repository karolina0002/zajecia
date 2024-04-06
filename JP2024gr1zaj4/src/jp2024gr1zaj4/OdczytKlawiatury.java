package jp2024gr1zaj4;

import java.util.Scanner;

public class OdczytKlawiatury {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Podaj jakiś tekst: ");
        String linia = sc.nextLine();
        
        System.out.println("Podałeś tekst: "+linia.toUpperCase());
        
    }
    
}
