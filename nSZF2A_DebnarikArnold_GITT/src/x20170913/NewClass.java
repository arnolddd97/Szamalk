
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tanulo
 */
public class NewClass {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       String sz= sc.nextLine();
       
       int [] szamok = new int [11];
        for (int i = 0; i <11; i++) {
            char f = sz.charAt(0+i);
            szamok[i]  = Character.getNumericValue(f);
            
        }
        if (szamok[0] == 1) {
            System.out.println("Férfi");
        }
        else if (szamok[0] == 2){
            System.out.println("Nő");
        }
        else if (szamok[0] == 3){
            System.out.println("Férfi");
        }
        else if (szamok[0] == 4){
            System.out.println("Nő");
        }
        else{
            System.out.println("Hibás, kérem ellenörizze a számot");
        }
        int k = 0;
        int k_szor = 10;
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            k = szamok[0+i] * k_szor;
            k_szor--;
            sum = sum + k;
        }
        int utolso = szamok[10];
        System.out.println(""+sum);
        if (sum % 11 == utolso) {
            System.out.println("Helyes");
        }
        else{
            System.out.println("Hibás");
        }
        
        
       
       
    }
    
    
}
