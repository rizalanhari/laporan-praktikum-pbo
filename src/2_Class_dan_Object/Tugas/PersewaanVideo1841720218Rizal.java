/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author RIZAL
 */
public class PersewaanVideo1841720218Rizal {
    public String mId, mNamaMember, mNamaGame;
    public int mHarga;

    public PersewaanVideo1841720218Rizal(String mId, String mNamaMember, String mNamaGame, int mHarga) {
        this.mId = mId;
        this.mNamaMember = mNamaMember;
        this.mNamaGame = mNamaGame;
        this.mHarga = mHarga;
    }
    
    int setHargaRIzal(int mLamaSewa){
        return mHarga = mHarga*mLamaSewa;
    }
    
    void printHarga( ){
        System.out.println("ID          : "+mId);
        System.out.println("Nama        : "+mNamaMember);
        System.out.println("Nama Game   : "+mNamaGame);
        System.out.println("Harga       : "+mHarga);
    }
}
