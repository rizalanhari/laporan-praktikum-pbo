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
public class Barrier1841720218Rizal implements IDestroyable1841720218Rizal{
    private int mStrength;

    public Barrier1841720218Rizal(int mStrength) {
        this.mStrength = mStrength;
    }

    public int getmStrength() {
        return mStrength;
    }

    public void setmStrength(int mStrength) {
        this.mStrength = mStrength;
    }
    
    public String getBarrierInfoRizal(){
        return "Barrier Strength = "+getmStrength();
    }

    public void destroyRizal(){
        destroyedRizal();
    }

    @Override
    public void destroyedRizal() {
        mStrength -= mStrength * 0.1;
    }
    
}
