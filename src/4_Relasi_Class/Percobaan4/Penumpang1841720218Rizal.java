/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan4;

/**
 *
 * @author RIZAL
 */
public class Penumpang1841720218Rizal {
    private String mKtp;
    private String mNama;

    public Penumpang1841720218Rizal(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }

    public String getmKtpRizal() {
        return mKtp;
    }

    public void setmKtpRizal(String mKtp) {
        this.mKtp = mKtp;
    }

    public String getmNamaRizal() {
        return mNama;
    }

    public void setmNamaRizal(String mNama) {
        this.mNama = mNama;
    }
    
    public String infoRizal(){
        String info = "";
        info += "Ktp: "+mKtp+"\n";
        info += "Nama: "+mNama+"\n";
        return info;
    }
}
