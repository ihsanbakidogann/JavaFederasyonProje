/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sporfederasyonu.proje;

/**
 *
 * @author kerem ayseli
 */
public class Kaleci extends Sporcular{

    int tutuğuToplar=3;
    int yediğiGol=1;
    
    public int yediğiGol(){
        return this.yediğiGol;
    }
    public int tutuğutToplar(){
        return this.tutuğuToplar;
    }
    public void yediğiGol(int yediğiGol){
        this.yediğiGol=yediğiGol;
    }

    @Override
    public String isimSöyle(){
        return "Umut";
    }
    
}
