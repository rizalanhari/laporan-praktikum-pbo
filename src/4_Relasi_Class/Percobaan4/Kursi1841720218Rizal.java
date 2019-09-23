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
public class Kursi1841720218Rizal {
    private String mNomor;
    private Penumpang1841720218Rizal penumpang;

    public Kursi1841720218Rizal(String mNomor) {
        this.mNomor = mNomor;
    }

    public String getmNomorRizal() {
        return mNomor;
    }

    public void setmNomorRizal(String mNomor) {
        this.mNomor = mNomor;
    }

    public Penumpang1841720218Rizal getPenumpangRizal() {
        return penumpang;
    }

    public void setPenumpangRizal(Penumpang1841720218Rizal penumpang) {
        this.penumpang = penumpang;
    }
    
    public String infoRizal() {
        String info = "";
        info += "Nomor: " + mNomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.infoRizal() + "\n";
        }
        return info;
    }
}
