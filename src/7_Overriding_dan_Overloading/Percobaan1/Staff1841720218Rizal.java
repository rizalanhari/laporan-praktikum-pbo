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
public class Staff1841720218Rizal extends Karyawan1841720218Rizal {

    private int mLembur;
    private double mGajiLembur;

    public int getmLemburRizal() {
        return mLembur;
    }

    public void setmLemburRizal(int mLembur) {
        this.mLembur = mLembur;
    }

    public double getmGajiLemburRizal() {
        return mGajiLembur;
    }

    public void setmGajiLemburRizal(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    public double getmGajiRizal(int mLembur, double mGajiLembur) {
        return super.getmGajiRizal() + mLembur * mGajiLembur;
    }

    public double getmGajiRizal() {
        return super.getmGajiRizal() + mLembur * mGajiLembur;
    }

    public void lihatInfoRizal() {
        System.out.println("NIP : " + this.getmNipRizal());
        System.out.println("Nama : " + this.getmNamaRizal());
        System.out.println("Golongan : " + this.getmGolonganRizal());
        System.out.println("Jml Lembur : " + this.getmLemburRizal());
        System.out.printf("Gaji Lembur : %.0f\n", this.getmGajiLemburRizal());
        System.out.printf("Gaji : %.0f\n", this.getmGajiRizal());
    }
}
