/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20171018gyöker;

import java.util.Scanner;

/**
 *
 * @author Tanulo
 */
public class gyök {
    public static void main(String[] args) throws Exception {
        System.out.println("Kérek egy számot: ");
        Scanner sc = new Scanner (System.in);
        double a = sc.nextDouble();
        
        boolean siker = false;
        double szam;
        szam = Math.sqrt(a);
        if (Double.isNaN(szam)) {
            throw  new Exception();
        }
        try{
            System.out.println(szam);
        }
        catch(Exception e){
            System.out.println("Nem jó"+e);
        }
    }

}
