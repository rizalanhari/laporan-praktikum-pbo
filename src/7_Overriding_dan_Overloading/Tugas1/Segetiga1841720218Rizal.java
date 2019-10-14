/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author RIZAL
 */
public class Segetiga1841720218Rizal {
    private int mSudut;
    private int mKeliling;

    public int totalSudutRizal(int sudutA) {
        mSudut = 180 - sudutA;
        return mSudut;
    }

    public int totalSudutRizal(int sudutA, int sudutB) {
        mSudut = 180 - (sudutA + sudutB);
        return mSudut;
    }

    public int kelilingRizal(int sudutA, int sudutB, int sudutC) {
        mKeliling = sudutA + sudutB + sudutC;
        return mKeliling;
    }

    public double kelilingRizal(int sudutA, int sudutB) {
        double sudutC = Math.sqrt(Math.pow(sudutA, 2) + Math.pow(sudutB, 2));
        double mKeliling = sudutA + sudutB + sudutC;
        return mKeliling;
    }

    public static void main(String[] args) {
        Segetiga1841720218Rizal sgt = new Segetiga1841720218Rizal();
        System.out.println(sgt.kelilingRizal(2, 3));
        System.out.println(sgt.kelilingRizal(2, 3, 4));
        
        System.out.println(sgt.totalSudutRizal(90));
        System.out.println(sgt.totalSudutRizal(90, 60));

    }
}
