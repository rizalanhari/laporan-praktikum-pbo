/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extend;

/**
 *
 * @author RIZAL
 */
public class Extends3Tugas1841720218Rizal extends Extends2Tugas1841720218Rizal{
    private double mVolume;
    
    public void hitungVolumeRizal(){
        mVolume = 4/3*mluas*mJari2;
    }
    public void printVolumeRizal(){
        super.printKeliling();
        super.printLuasRizal();
        System.out.println("Volume:"+mVolume);
    }
}
