/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x20170111;

import static x20170111.Verem_kivetel.Verem.msec;
import static x20170111.Verem_kivetel.Verem.vár;

/**
 *
 * @author Tanulo
 */
public class Verem_kivetel {
public static class Verem_Exception extends Exception{
    public Verem_Exception(String hibaüzenet){
        super(hibaüzenet);
    }
}
 public static class Verem{
    private final static int MERET=3;
    private int[]verem=new int[MERET];
    private int mutato=0;
    
    public void betesz(int i) throws Verem_Exception{
        if (mutato<MERET) {
            verem[mutato]=i;
            mutato++;
        }else{
            throw new Verem_Exception("Verem megtelt!");
        }
    }
    public int kivesz() throws Verem_Exception{
        if (mutato==0) {
            throw new Verem_Exception("A verem üres!");
        }else{
            mutato--;
            int i = verem[mutato];
            System.out.println("A szám("+i+") a veremből kivéve!");
            return i;
        }
       
    }
    public static int msec = 2000;
    public static void vár(int n){
        try{
        Thread.sleep(n);
        }
        catch(InterruptedException e ){
            Thread.currentThread().interrupt();
        }
    
 }
    }

    public static void main(String[] args) {
        Verem v = new Verem();
        try {
             v.betesz(21);
             v.betesz(52);
             v.betesz(77);
             vár(msec);
             v.betesz(99);
        } catch (Verem_Exception ve) {
            System.out.println(ve);
        }
        try {
            v.kivesz();
            v.kivesz();
            v.kivesz();
            v.kivesz();
        } catch (Verem_Exception ve) {
            System.out.println(ve);
        }
       
    }  

    private static class n {

        public n() {
        }
    }
    }