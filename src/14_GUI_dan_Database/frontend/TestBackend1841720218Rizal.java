/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author mwpras
 */
import backend.*;

public class TestBackend1841720218Rizal {
    public static void main(String[] args){
        Kategori1841720218Rizal kat1 = new Kategori1841720218Rizal("Novel", "Koleksi buku novel");
        Kategori1841720218Rizal kat2 = new Kategori1841720218Rizal("Referensi", "Buku referensi ilmiah");
        Kategori1841720218Rizal kat3 = new Kategori1841720218Rizal("Komik", "Komik anak-anak");
        
        kat1.save();
        kat2.save();
        kat3.save();

        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        kat3.delete();

        for(Kategori1841720218Rizal k : new Kategori1841720218Rizal().getAll()){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        for(Kategori1841720218Rizal k : new Kategori1841720218Rizal().search("ilmiah")){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }
}
