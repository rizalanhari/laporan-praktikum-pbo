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
public class Program1841720218Rizal {
    public static void main(String[] args) {
        Kucing1841720218Rizal kucingKampung = new Kucing1841720218Rizal();
        Ikan1841720218Rizal lumbaLumba = new Ikan1841720218Rizal();
        
        Orang1841720218Rizal ani = new Orang1841720218Rizal("Ani");
        Orang1841720218Rizal budi = new Orang1841720218Rizal("Budi");
        
        ani.periharaanHewanRizal(kucingKampung);
        budi.periharaanHewanRizal(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}
