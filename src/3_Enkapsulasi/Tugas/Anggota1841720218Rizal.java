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
public class Anggota1841720218Rizal {
    private int mNomorKTP;
    private String mNama;
    private int sLimitPeminjaman;
    private int mJumlahPinjaman;

    public Anggota1841720218Rizal(int mNomorKTP, String mNama, int sLimitPeminjaman) {
        this.mNomorKTP = mNomorKTP;
        this.mNama = mNama;
        this.sLimitPeminjaman = sLimitPeminjaman;
        this.mJumlahPinjaman = 0;
    }
    
    public String getNamaRizal(){
        return mNama;
    }
    public int getLimitPinjamanRizal(){
        return sLimitPeminjaman;
    }
    public int getJumlahPinjamanRizal(){
        return mJumlahPinjaman;
    }
    public void pinjamRizal(int newJumlahPinjam){
        if (newJumlahPinjam>sLimitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
            newJumlahPinjam=0;
        }
        mJumlahPinjaman += newJumlahPinjam;
    }
    public void angsurRizal(int newAngsuran){
        mJumlahPinjaman -= newAngsuran;
    }
}
