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
public class Lingkaran1841720218RIzal {
    double mPHI=3.14;
    double mR;
    
    double hitungLuasRizal(double newValue){
        mR=newValue;
        return mR*mR*mPHI;
    }
    double hitungKelilingRizal(double newValue){
        mR=newValue;
        return 2*mPHI*mR;
    }
}
