/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author RIZAL
 */
public class Orang1841720218Rizal {
    private String mNama;
    private  Hewan1841720218Rizal hewanPeliharaan;
    
    public Orang1841720218Rizal(String nama){
        this.mNama=nama;
    }
    public void periharaanHewanRizal(Hewan1841720218Rizal hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku "+ this.mNama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerakRizal();
        System.out.println("-----------------------------------------");
    }
}
