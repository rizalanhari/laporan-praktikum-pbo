/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan6;

/**
 *
 * @author RIZAL
 */
public class Karyawan1841720218Rizal {
    public String mNama, mAlamat, mJk;
    public int mUmur, mGaji;
    
    public Karyawan1841720218Rizal(){
        
    }
    public Karyawan1841720218Rizal(String mNama, String mAlamat, String mJk, int mUmur, int mGaji) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mJk = mJk;
        this.mUmur = mUmur;
        this.mGaji = mGaji;
    }
    public void tampilDataKaryawanRizal(){
        System.out.println("Nama            = "+mNama);
        System.out.println("Alamat          = "+mAlamat);
        System.out.println("Jenis Kelamin   = "+mJk);
        System.out.println("Umur            = "+mUmur);
        System.out.println("Gaji            = "+mGaji);
    }
}
