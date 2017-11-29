/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171004;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Tanulo
 */
public class FileRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //absulut hívatkozás
        //File theFile = new File("C:/Users/Tanulo/Documents/NetBeansProjects/fileRead/src/fileread/input.txt");
        //relative file-ra hívatkozás
        //File theFile = new File("input.txt");
        File theFile = new File("input.txt");
        
        try{
            Scanner eyes = new Scanner(theFile);
            while(eyes.hasNextLine()){
                String sor = eyes.nextLine();
                System.out.println(sor);
            }
            eyes.close();
        }
        catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
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

        
    }
}
