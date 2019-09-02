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
public class Extends1Tugas1841720218Rizal {
    public static final double PHI = 3.14;
    int mJari2;
    double mKeliling;
    
    public void setJari2Rizal(int newValue){
        mJari2 = newValue;
    }
    public void hitungKelilingRizal(){
        mKeliling = 2*PHI*mJari2;
    }
    public void printKeliling(){
        System.out.println("Lingkaran");
        System.out.println("Keliling: "+mKeliling);
    }
}
