/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan4;

/**
 *
 * @author RIZAL
 */
public class MainPercobaan41841720218Rizal {
    public static void main(String[] args) {
        Penumpang1841720218Rizal p = new Penumpang1841720218Rizal("12345", "Mr. Krab");
        Gerbong1841720218Rizal gerbong = new Gerbong1841720218Rizal("A", 10);
        gerbong.setPenumpangRizal(p, 1);
        System.out.println(gerbong.infoRizal());
    }
}
