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
public class BarangTugas1841720218Rizal {
    String mKode, mNamaBarang;
    int mHargaDasar;
    float mDiskon;

    public BarangTugas1841720218Rizal(String mKode, String mNamaBarang, int mHargaDasar, float mDiskon) {
        this.mKode=mKode;
        this.mNamaBarang=mNamaBarang;
        this.mHargaDasar=mHargaDasar;
        this.mDiskon=mDiskon;
    }
    
    int hitungHargaJualRizal(){
        return (int) (mHargaDasar-(mDiskon/100*mHargaDasar));
    }
    void tampilDataRizal(){
        System.out.println("Kode        : "+mKode);
        System.out.println("Nama Barang : "+mNamaBarang);
        System.out.println("Harga Dasar : "+mHargaDasar);
        System.out.println("Diskon      : "+mDiskon+"%");
        System.out.println("Harga Jual  : "+hitungHargaJualRizal());
    }
}
