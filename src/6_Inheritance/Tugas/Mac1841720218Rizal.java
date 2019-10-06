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
public class Mac1841720218Rizal extends Laptop1841720218Rizal{
    public String mSecurity;

    public Mac1841720218Rizal() {
    }

    public Mac1841720218Rizal(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor, String mJnsBatrai, String mSecurity) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor, mJnsBatrai);
        this.mSecurity = mSecurity;
    }
    public void tampilMacRizal(){
        System.out.println("============Data Mac============");
        super.tampilLaptopRizal();
        System.out.println("Security        : "+mSecurity);
    }
}
