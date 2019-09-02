/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author RIZAL
 */
public class PersegiPanjang1841720218Rizal {
    private int mLebar;
    private int mPanjang;
    int Luas;

    PersegiPanjang1841720218Rizal(int mLebar, int mPanjang) {
        this.mLebar = mLebar;
        this.mPanjang = mPanjang;
    }
    
    public void setLebarRizal(int newValue){
        mLebar = newValue;
    }
    public void setPanjangRizal(int newValue){
        mPanjang = newValue;
    }
    public void hitungLuasRizal(){
        Luas = mLebar*mPanjang;
    }
    public void printLuasRizal(){
        System.out.println("PersegiPanjang");
        System.out.println("Lebar: "+mLebar);
        System.out.println("Panjang: "+mPanjang);
        System.out.println("Luas: "+Luas);
    }
}
