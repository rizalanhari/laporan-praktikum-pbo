/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author RIZAL
 */
public class Processor1841720218Rizal {
    private String mMerk;
    private double mCache;

    public Processor1841720218Rizal() {
    }

    public Processor1841720218Rizal(String mMerk, double mCache) {
        this.mMerk = mMerk;
        this.mCache = mCache;
    }

    public String getmMerkRizal() {
        return mMerk;
    }

    public void setmMerkRizal(String mMerk) {
        this.mMerk = mMerk;
    }

    public double getmCacheRizal() {
        return mCache;
    }

    public void setmCacheRizal(double mCache) {
        this.mCache = mCache;
    }
    
    public void infoRizal(){
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache Memory = %.2f\n", mCache);
    }
}
