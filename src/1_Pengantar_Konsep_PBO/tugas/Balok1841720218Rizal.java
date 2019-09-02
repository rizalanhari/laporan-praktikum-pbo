/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author RIZAL
 */
public class Balok1841720218Rizal extends PersegiPanjang1841720218Rizal{

    public Balok1841720218Rizal() {
        super(0, 0);
    }
    
    private int mTinggi;
    private  int mVolume;
    
    public void setTinggiRizal(int newValue){
        mTinggi = newValue;
    }
    public void hitungVolumeRizal(){
        mVolume = Luas*mTinggi;
    }
    public void printVolumeRizal(){
        super.printLuasRizal();
        System.out.println("Tinggi: "+mTinggi);
        System.out.println("Volume Balok: "+mVolume);
    }
}
