/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tanulo
 */
package newclass1;
import java.io.*;
public class NewClass1 {
    public static void main(String[] args)throws Exception {
        try {
            FileWriter theFile = new FileWriter("output.txt");
            BufferedWriter write = new BufferedWriter(theFile);
            
            for (int i = 1; i < 91; i++) {
                write.write(Integer.toString(i));
                write.newLine();
            }
            write.close();
        } catch (Exception e) {
            System.out.println("I/O hiba: "+e.getMessage());
        }
    }
}
