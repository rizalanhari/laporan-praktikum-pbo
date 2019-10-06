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
public class Laptop1841720218Rizal extends Komputer1841720218Rizal{
    public String mJnsBatrai;

    public Laptop1841720218Rizal() {
    }

    public Laptop1841720218Rizal(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor, String mJnsBatrai) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor);
        this.mJnsBatrai = mJnsBatrai;
    }
    public void tampilLaptopRizal(){
        super.tampilDataRizal();
        System.out.println("Jns Batrai      : "+mJnsBatrai);
    }
}
