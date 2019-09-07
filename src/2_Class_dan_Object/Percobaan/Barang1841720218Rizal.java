/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;

/**
 *
 * @author RIZAL
 */
public class Barang1841720218Rizal {
    public String mNamaBrg;
    public String mjenisBrg;
    public int mStok;
    
    public void tampilBarangRizal(){
        System.out.println("Nama Barang     : "+mNamaBrg);
        System.out.println("Jenis Barang    : "+mjenisBrg);
        System.out.println("Stok            : "+mStok);
    }
    public int tambahStokRizal(int mBrgMasuk){
        int mStockBaru=mBrgMasuk+mStok;
        return mStockBaru;
    }
}
