/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author RIZAL
 */
public class Constructor1Tugas1841720218Rizal {
    private String mMerek;
    private int mKecepatan;
    private int mGear;

    public Constructor1Tugas1841720218Rizal(String mMerek, int mKecepatan, int mGear) {
        this.mMerek = mMerek;
        this.mKecepatan = mKecepatan;
        this.mGear = mGear;
    }
    
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
    public void cetakStatusRizal(){
        System.out.println("Merek: "+mMerek);
        System.out.println("Kecepatan: "+mKecepatan);
        System.out.println("Gear: "+mGear);
    }
}
