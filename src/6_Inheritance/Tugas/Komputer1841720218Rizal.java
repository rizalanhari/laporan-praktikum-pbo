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
public class Komputer1841720218Rizal {
    public String mMerk;
    public int mKecProsesor;
    public int mSizeMemory;
    public String mJnsProsesor;

    public Komputer1841720218Rizal() {
    }

    public Komputer1841720218Rizal(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor) {
        this.mMerk = mMerk;
        this.mKecProsesor = mKecProsesor;
        this.mSizeMemory = mSizeMemory;
        this.mJnsProsesor = mJnsProsesor;
    }
    
    public void tampilDataRizal(){
        System.out.println("Merk            : "+mMerk);
        System.out.println("Kec Prosesor    : "+mKecProsesor);
        System.out.println("Size Memory     : "+mSizeMemory);
        System.out.println("Jns Prosesor    : "+mJnsProsesor);
    }
}
