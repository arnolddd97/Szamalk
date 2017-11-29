/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171115_ZH;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Tanulo
 */
public class DebnárikArnoldZH {
    static String [] azon = new String [1000];
    static String [] pontok = new String [1000];
    static int i = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Feladat1();
        Feladat2();
        Feladat3();
    }
    static void Feladat1()
        {
            System.out.println("1. feladat: Az adatok beolvasása");
            File theFile = new File("src/x20171115_ZH/valaszok.txt");
            try{
        Scanner eyes = new Scanner(theFile);
        while (eyes.hasNextLine()){
            String sor = eyes.nextLine();
            StringTokenizer st = new StringTokenizer(sor," "); // elválasztójel a vessző!
            azon [i] = st.nextToken();
            pontok [i] = st.nextToken();
            i++;
        }        
        eyes.close();
        }
        catch(Exception e){
        System.out.println("Error: "+e.getMessage());
    }
            System.out.println(i-1);

        }

    private static void Feladat2() {
        System.out.println("2. feladat: A vetélkedön " + i + " versenyző indult");
        System.out.println(pontok[1]);
    }

    private static void Feladat3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg az azonosított");
        String azonosit = sc.nextLine(); 
        System.out.println("3. feladat: A versenyző azonosítója = "+azonosit);
        int j = 0;
        for (j = 0; j < azon.length; j++) {
            if (azon [j]== azonosit) {
                System.out.println(pontok[j]);
            }
            else{
                j++;
            }
            
        }
        System.out.println(pontok [j]);
    }
    
}
