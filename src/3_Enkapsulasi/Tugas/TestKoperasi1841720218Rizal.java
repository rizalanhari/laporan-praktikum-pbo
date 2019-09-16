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
public class TestKoperasi1841720218Rizal {
    public static void main(String[] args) {
        Anggota1841720218Rizal donny = new Anggota1841720218Rizal(111333444, "Donny", 5000000);
        
        System.out.println("Nama Anggota: "+donny.getNamaRizal());
        System.out.println("Limit Pinjaman: "+donny.getLimitPinjamanRizal());
        
        System.out.println("\nMeminjam uang 10.000.000");
        donny.pinjamRizal(10000000);
        System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjamanRizal());
        
        System.out.println("\nMeminjam uang 4.000.000");
        donny.pinjamRizal(4000000);
        System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjamanRizal());
        
        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsurRizal(1000000);
        System.out.println("JUmlah pinjaman saat ini: "+donny.getJumlahPinjamanRizal());
        
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsurRizal(3000000);
        System.out.println("JUmlah pinjaman saat ini: "+donny.getJumlahPinjamanRizal());
    }
}
