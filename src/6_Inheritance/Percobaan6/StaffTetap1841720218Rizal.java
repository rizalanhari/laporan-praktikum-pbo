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
public class StaffTetap1841720218Rizal extends Staff1841720218Rizal{
    public String mGolongan;
    public int mAsuransi;

    public StaffTetap1841720218Rizal() {
    }

    public StaffTetap1841720218Rizal(String mNama, String mAlamat, String mJk, int mUmur, int mGaji, int mLembur, int mPotongan, String mGolongan, int mAsuransi) {
        super(mNama, mAlamat, mJk, mUmur, mGaji, mLembur, mPotongan);
        this.mGolongan = mGolongan;
        this.mAsuransi = mAsuransi;
    }
    public void tampilStaffTetapRizal(){
        System.out.println("==============Data Staff Tetap==============");
        super.tampilDataStaffRizal();
        System.out.println("Golongan        = "+mGolongan);
        System.out.println("Jumlah Asuransi = "+mAsuransi);
        System.out.println("Gaji Bersih     = "+(mGaji+mLembur-mPotongan-mAsuransi));
    }
}
