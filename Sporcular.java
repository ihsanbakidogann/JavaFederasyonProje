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
enum pozisyon{
    defans,
    forvet,
    kaleci
}
public class Sporcular {
    String isim;
    int yaş;
    int boy;
    int numara;
    String ülke;
    pozisyon pozisyon;
    
    public String isimSöyle(){
        return this.isim;
    }
    public pozisyon pozisyonunNey(){
        return this.pozisyon;
    }
    public int yaşNey(){
        return this.yaş;
    }
    public int numaraNey(){
        return this.numara;
    }
    public int boyunNey(){
      return  this.boy;
    }
    public String hangiÜlkendensin(){
        return this.ülke;
    }  
}
