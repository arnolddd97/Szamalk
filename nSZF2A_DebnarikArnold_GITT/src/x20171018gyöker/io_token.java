/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171018gyöker;

/**
 *
 * @author Jesus Christ
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class io_token {
    public static void main(String[] args) {

        int sum = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérek több egész számot vesszővel elválasztva!");
        String sor = sc.nextLine(); // sor beolvasása

        // darabolás
        StringTokenizer st = new StringTokenizer(sor," "); // elválasztójel a vessző!
        int db = st.countTokens(); //adatok (tokenek) száma
        
        
        try{while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
            System.out.println("A beolvasott számok (" + db + " db) összege: " + sum);
        }
        }catch(NumberFormatException ne){
            System.out.println("HIBA");
        }
    }
}
