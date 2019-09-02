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
public class PersegiMain1841720218Rizal {
    public static void main(String[] args) {
        PersegiPanjang1841720218Rizal p = new PersegiPanjang1841720218Rizal(2, 4);
        Balok1841720218Rizal b = new Balok1841720218Rizal();
        
        p.hitungLuasRizal();
        p.printLuasRizal();
        
        b.setLebarRizal(4);
        b.setPanjangRizal(5);
        b.setTinggiRizal(6);
        b.hitungLuasRizal();
        b.printLuasRizal();
        b.hitungVolumeRizal();
        b.printVolumeRizal();
    }
}
