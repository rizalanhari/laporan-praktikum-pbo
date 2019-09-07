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
public class TestBarang1841720218Rizal {
    public static void main(String[] args) {
        Barang1841720218Rizal brg1 = new Barang1841720218Rizal();
        brg1.mNamaBrg="Pensil";
        brg1.mjenisBrg="ATK";
        brg1.mStok=10;
        brg1.tampilBarangRizal();
        System.out.println("Stock BAru adalah "+brg1.tambahStokRizal(20));
    }
}
