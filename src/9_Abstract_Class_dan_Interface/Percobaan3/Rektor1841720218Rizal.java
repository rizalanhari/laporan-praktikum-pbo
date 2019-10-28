/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;

import Percobaan2.*;

/**
 *
 * @author RIZAL
 */
public class Rektor1841720218Rizal {

    public void beriSertifikatCumlaudeRizal(Mahasiswa1841720218Rizal mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silakan perkenalkan diri anda..");

        mahasiswa.kuliahDiKampusRizal();
        mahasiswa.lulusRizal();
        mahasiswa.meraihIPKTinggiRizal();

        System.out.println("--------------------------------------------");
    }
    
    public void beriSertifikatMawapresRizal(IBerprestasi1841720218Rizal mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi");
        
        mahasiswa.menjuaraiKompetisiRizal();
        mahasiswa.membuatPublikasiIlmiahRizal();
        
        System.out.println("--------------------------------------------");
    }
}
