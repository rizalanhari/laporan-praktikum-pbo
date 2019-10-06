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
public class Staff1841720218Rizal extends Karyawan1841720218Rizal{
    public int mLembur, mPotongan;

    public Staff1841720218Rizal() {
    }

    public Staff1841720218Rizal(String mNama, String mAlamat, String mJk, int mUmur, int mGaji, int mLembur, int mPotongan) {
        super(mNama, mAlamat, mJk, mUmur, mGaji);
        this.mLembur = mLembur;
        this.mPotongan = mPotongan;
    }
    
    public void tampilDataStaffRizal(){
        super.tampilDataKaryawanRizal();
        System.out.println("Lembur          = "+mLembur);
        System.out.println("Potongan        = "+mPotongan);
        System.out.println("Total Gaji      = "+(mGaji+mLembur-mPotongan));
    }
}
