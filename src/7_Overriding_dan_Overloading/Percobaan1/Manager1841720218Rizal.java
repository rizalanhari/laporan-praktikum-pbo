/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author RIZAL
 */
public class Manager1841720218Rizal extends Karyawan1841720218Rizal {

    private double mTunjangan;
    private String mBagian;
    private Staff1841720218Rizal mSt[];

    public double getmTunjanganRizal() {
        return mTunjangan;
    }

    public void setmTunjanganRizal(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public String getmBagianRizal() {
        return mBagian;
    }

    public void setmBagianRizal(String mBagian) {
        this.mBagian = mBagian;
    }

    public void setmStRizal(Staff1841720218Rizal[] mSt) {
        this.mSt = mSt;
    }

    public void viewStaffRizal() {
        int i;
        System.out.println("-----------------");
        for (i = 0; i < mSt.length; i++) {
            mSt[i].lihatInfoRizal();
        }
        System.out.println("-----------------");
    }

    public void lihatInfoRizal() {
        System.out.println("Manager : " + this.getmBagianRizal());
        System.out.println("NIP : " + this.getmNipRizal());
        System.out.println("Nama : " + this.getmNamaRizal());
        System.out.println("Golongan : " + this.getmGolonganRizal());
        System.out.printf("Tunjangan: %.0f\n", this.getmTunjanganRizal());
        System.out.printf("Gaji : %.0f\n", this.getmGajiRizal());
        System.out.println("Bagian : " + this.getmBagianRizal());
        this.viewStaffRizal();
    }

    public double getmGajiRizal() {
        return super.getmGajiRizal() + mTunjangan;
    }
}
