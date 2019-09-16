/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;

/**
 *
 * @author RIZAL
 */
public class KoperasiDemo1841720218Rizal {
     public static void main(String[] args) {
        Anggota1841720218Rizal anggota1 = new Anggota1841720218Rizal();
        
        anggota1.setNamaRizal("Iwan Setiawan");
        anggota1.setAlamatRizal("Jalan Sukarno Hatta no 10");
        anggota1.setorRizal(100000);
        System.out.println("Simpanan "+anggota1.getNamaRizal()+" : Rp "+anggota1.getSimpananRIzal());
        
        anggota1.pinjamRizal(5000);
        System.out.println("Simpanan "+anggota1.getNamaRizal()+" : Rp "+anggota1.getSimpananRIzal());
    }
}
