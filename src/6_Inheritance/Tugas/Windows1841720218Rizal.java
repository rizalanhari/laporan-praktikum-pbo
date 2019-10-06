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
public class Windows1841720218Rizal extends Laptop1841720218Rizal{
    public String mFitur;

    public Windows1841720218Rizal() {
    }

    public Windows1841720218Rizal(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor, String mJnsBatrai, String mFitur) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor, mJnsBatrai);
        this.mFitur = mFitur;
    }
    public void tampilWindowsRizal(){
        System.out.println("============Data Windows============");
        super.tampilLaptopRizal();
        System.out.println("Fitur           : "+mFitur);
    }
}
