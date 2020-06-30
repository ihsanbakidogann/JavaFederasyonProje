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
public class Takım {
    String takimİsim;
    String takimRenkleri;
    ArrayList<Sporcular>sporcular=new ArrayList<Sporcular>();
    Kaleci kaleci;
    Forvet[] forvet;
    Defans[] defans;
    public Takım(String takimİsim,String takimRenkleri,Kaleci kaleci,Forvet[] forvet,Defans[] defans){
        this.takimİsim=takimİsim;
        this.takimRenkleri=takimRenkleri;
        this.sporcular=sporcular;
        this.kaleci=kaleci;
        this.defans=defans;
        this.forvet=forvet;
       
    }
    public void isimDeğiştir(String yeniİsim){
        
    }
}
