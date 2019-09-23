/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author RIZAL
 */
public class MainPercobaan21841720218Rizal {
    public static void main(String[] args) {
        Mobil1841720218Rizal m = new Mobil1841720218Rizal();
        m.setmMerkRizal("Avanza");
        m.setBiayaRizal(350000);
        Sopir1841720218Rizal s = new Sopir1841720218Rizal();
        s.setmNamaRizal("John Doe");
        s.setmBiayaRizal(200000);
        Pelanggan1841720218Rizal p = new Pelanggan1841720218Rizal();
        p.setNamaRizal("Jane Doe");
        p.setMobilRizal(m);
        p.setSopirRizal(s);
        p.setHariRizal(2);
        System.out.println("Biaya Total = "+p.hitungBiayaTotalRizal());
    }
}
