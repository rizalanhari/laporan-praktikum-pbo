/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan6;

/**
 *
 * @author RIZAL
 */
public class Manager1841720218Rizal extends Karyawan1841720218Rizal{
    public int mTunjangan;

    public Manager1841720218Rizal() {
    }
    
    public void tampilDataManagerRizal(){
        super.tampilDataKaryawanRizal();
        System.out.println("Tunjangan       = "+mTunjangan);
        System.out.println("Total Gaji      = "+super.mGaji+mTunjangan);
    }
}
