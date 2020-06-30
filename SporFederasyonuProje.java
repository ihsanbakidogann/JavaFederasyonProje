package tbf;

import java.util.ArrayList;

public class TurkiyeBasketbolFederasyonu {

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
