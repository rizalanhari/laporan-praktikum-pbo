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
public class Pc1841720218Rizal extends Komputer1841720218Rizal{
    public int mUkuranMonitor;

    public Pc1841720218Rizal() {
    }

    public Pc1841720218Rizal(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor, int mUkuranMonitor) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor);
        this.mUkuranMonitor = mUkuranMonitor;
    }
    public void tampilPCRizal(){
        super.tampilDataRizal();
        System.out.println("Ukuran Monitor      : "+mUkuranMonitor);
    }
}
