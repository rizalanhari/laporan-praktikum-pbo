/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan5;

/**
 *
 * @author RIZAL
 */
public class Inheritance11841720218Rizal {
    public static void main(String[] args) {
        Manager1841720218Rizal M = new Manager1841720218Rizal();
        M.mNama="Vivin";
        M.mAlamat="Jl. Vinolia";
        M.mUmur=25;
        M.mJk="Perempuan";
        M.mGaji=3000000;
        M.mTunjangan=1000000;
        M.tampilDataManagerRizal();
        System.out.println("");
        Staff1841720218Rizal S = new Staff1841720218Rizal();
        S.mNama="Lestari";
        S.mAlamat="JMalang";
        S.mUmur=25;
        S.mJk="Perempuan";
        S.mGaji=2000000;
        S.mLembur=500000;
        S.mPotongan=250000;
        S.tampilDataStaffRizal();
    }
}
