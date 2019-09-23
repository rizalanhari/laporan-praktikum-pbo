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
public class MainTugas1841720218Rizal {
    public static void main(String[] args) {
        Baju1841720218Rizal b = new Baju1841720218Rizal();
        b.setmMerk("Polo");
        b.setmHarga(200000);
        Celana1841720218Rizal c = new Celana1841720218Rizal();
        c.setmMerk("Lea");
        c.setmHarga(400000);
        Toko1841720218Rizal t = new Toko1841720218Rizal();
        t.setmNama("Matahari");
        t.setmAlamat("Surabaya");
        Pembeli1841720218Rizal p = new Pembeli1841720218Rizal();
        p.setmNama("Rizal");
        p.setmDiskon(20);
        p.setBaju(b);
        p.setCelana(c);
        p.setToko(t);
        System.out.println("Harga Total: "+p.hitungHargaTotal()+" Toko: "+t.getmNama());
    }
}
