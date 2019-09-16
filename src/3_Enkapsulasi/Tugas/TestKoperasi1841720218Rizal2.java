/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author RIZAL
 */
public class TestKoperasi1841720218Rizal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int mPilihan=0;
        System.out.println("----------------------------");
        System.out.print("Masukkan noKTP: ");
        int mKtp=sc.nextInt();
        System.out.print("Masukkan Nama: ");
        String mNama=scan.nextLine();
        System.out.print("Masukkan Limit Pinjaman: ");
        int mLimit=sc.nextInt();
        Anggota1841720218Rizal2 a = new Anggota1841720218Rizal2(mKtp, mNama, mLimit);
        do {            
            a.menu();
            System.out.print("Masukkan Inputan: ");
            mPilihan=sc.nextInt();
            System.out.println("--------------------");
            switch(mPilihan){
                case 1: 
                    System.out.print("Massukan jumlah pinjam: ");
                    int pinjam=sc.nextInt();
                    a.pinjamRizal(pinjam);
                    break;
                case 2: 
                    System.out.print("Masukkan jumlah Angsur: ");
                    int angsur=sc.nextInt();
                    a.angsurRizal(angsur);
                    break;
                case 3: 
                    System.out.println("Jumlah pinjaman saat ini: "+a.getJumlahPinjamanRizal());
                    break;
            }
        } while (mPilihan!=4);
    }
}
