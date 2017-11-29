/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20170111;

import java.util.Scanner;

/**
 *
 * @author Debnárik Arnold
 */
public class osztás {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Kérem az osztandót.");
        int osztando = sc.nextInt();
        System.out.println("Kérem az osztót: ");
        int oszto = sc.nextInt();
        boolean siker = false;
        double hányados = 0;
        try {
            hányados = (double) (osztando / oszto);
            System.out.println(osztando +"/"+oszto +"="+hányados);
            siker = true;
        } catch (ArithmeticException ae) {
            System.out.println("hiba?"+ae.getMessage());
        }
        finally{
            if (siker) {
                System.out.println("Az osztás rendben lezajlót!");
            }
            else{
                System.out.println("Osztás sikertelen!");
            }
        }
    }
    
}
