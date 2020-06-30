/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sporfederasyonu.proje;

import java.util.ArrayList;

/**
 *
 * @author kerem ayseli
 */
public class SporFederasyonuProje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Kaleci kale = new Kaleci();
       Sporcular sporcu = new Sporcular();
    System.out.println("Yediği Goller : "+kale.yediğiGol());
       kale.yediğiGol(5);
       System.out.println("Yediği Goller : "+kale.yediğiGol());
       sporcu.isim="Fatih";
    System.out.println("Sporcu isim : "+sporcu.isimSöyle());   
    System.out.println( "Kaleci isim : "+  kale.isimSöyle());
    }
    
}
