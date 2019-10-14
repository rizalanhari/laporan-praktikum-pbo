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
public class Karyawan1841720218Rizal {

    private String mNama, mNip, mGolongan;
    private double mGaji;

    public void setmNamaRizal(String mNama) {
        this.mNama = mNama;
    }

    public void setmNipRizal(String mNip) {
        this.mNip = mNip;
    }

    public void setmGolonganRizal(String mGolongan) {
        this.mGolongan = mGolongan;

        switch (mGolongan.charAt(0)) {
            case '1':
                this.mGaji = 5000000;
                break;
            case '2':
                this.mGaji = 3000000;
                break;
            case '3':
                this.mGaji = 2000000;
                break;
            case '4':
                this.mGaji = 1000000;
                break;
            case '5':
                this.mGaji = 750000;
                break;
        }
    }

    public void setmGajiRizal(double mGaji) {
        this.mGaji = mGaji;
    }

    public String getmNamaRizal() {
        return mNama;
    }

    public String getmNipRizal() {
        return mNip;
    }

    public String getmGolonganRizal() {
        return mGolongan;
    }

    public double getmGajiRizal() {
        return mGaji;
    }
    

}
