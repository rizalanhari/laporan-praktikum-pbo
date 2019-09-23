/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;

/**
 *
 * @author RIZAL
 */
public class MainPercobaan31841720218Rizal {
    public static void main(String[] args) {
        Pegawai1841720218Rizal masinis = new Pegawai1841720218Rizal("1234", "Spongebob Squarepants");
        Pegawai1841720218Rizal asisten = new Pegawai1841720218Rizal("4567", "Patrick Star");
        KeretaApi1841720218Rizal keretaApi = new KeretaApi1841720218Rizal("Gaya Baru", "Bisnis", masinis, asisten);

        System.out.println(keretaApi.infoRizal());
    }
}
