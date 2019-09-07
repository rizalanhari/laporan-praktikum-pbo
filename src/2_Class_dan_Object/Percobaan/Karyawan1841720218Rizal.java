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
public class Karyawan1841720218Rizal {
    String mId, mNama, mJabatan; 
    char mJenisKelamin;
    int mGaji;

    public Karyawan1841720218Rizal(String mId, String mNama, String mJabatan, char mJenisKelamin, int mGaji) {
        this.mId = mId;
        this.mNama = mNama;
        this.mJabatan = mJabatan;
        this.mJenisKelamin = mJenisKelamin;
        this.mGaji = mGaji;
    }
    
    void tampilDataRizal(){
        System.out.println("ID: "+mId);
        System.out.println("Nama: "+mNama);
        System.out.println("Jabatan: "+mJabatan);
        System.out.println("Jenis Kelamin: "+mJenisKelamin);
        System.out.println("Gaji: "+mGaji);
    }
}
