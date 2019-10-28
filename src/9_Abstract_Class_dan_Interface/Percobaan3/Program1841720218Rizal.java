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
public class Program1841720218Rizal {
    public static void main(String[] args) {
        Rektor1841720218Rizal pakRektor = new Rektor1841720218Rizal();
        
//        Mahasiswa1841720218Rizal mahasiswaBiasa = new Mahasiswa1841720218Rizal("Charlie");
        Sarjana1841720218Rizal sarjanaCumlaude = new Sarjana1841720218Rizal("Dini");
        PascaSarjana1841720218Rizal masterCumlaude = new PascaSarjana1841720218Rizal("Elok");
        
//        pakRektor.beriSertifikatCumlaudeRizal(mahasiswaBiasa);
//        pakRektor.beriSertifikatCumlaudeRizal(sarjanaCumlaude);
//        pakRektor.beriSertifikatCumlaudeRizal(masterCumlaude);

//        pakRektor.beriSertifikatMawapresRizal(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapresRizal(masterCumlaude);
    }
}
