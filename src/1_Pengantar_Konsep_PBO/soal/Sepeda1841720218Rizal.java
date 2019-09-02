/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author RIZAL
 */
public class Sepeda1841720218Rizal {
    private String mMerek;
    private int mKecepatan;
    private int mGear;
    private String mWarna;
    
    public void setMerkRizal(String newValue){
        mMerek = newValue;
    }
    public void gantiGearRizal(int newValue){
        mGear = newValue;
    }
    public void tambahKecepatanRizal(int increment){
        mKecepatan = mKecepatan + increment;
    }
    public void remRizal(int decrement){
        mKecepatan = mKecepatan - decrement;
    }
    public void setWarna(String newValue){
        mWarna = newValue;
    }
    public void cetakStatusRizal(){
        System.out.println("Merek: "+mMerek);
        System.out.println("Kecepatan: "+mKecepatan);
        System.out.println("Gear: "+mGear);
        System.out.println("Warna: "+mWarna);
    }
}
