/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author RIZAL
 */
public class SepedaDemo1841720218Rizal {
    public static void main(String[] args) {
        Sepeda1841720218Rizal spd1 = new Sepeda1841720218Rizal();
        Sepeda1841720218Rizal spd2 = new Sepeda1841720218Rizal();
        SepedaGunung1841720218Rizal spd3 = new SepedaGunung1841720218Rizal();
        
        spd1.setMerkRizal("Polygone");
        spd1.tambahKecepatanRizal(10);
        spd1.gantiGearRizal(2);
        spd1.cetakStatusRizal();
        
        spd2.setMerkRizal("Wiim Cycle");
        spd2.tambahKecepatanRizal(10);
        spd2.gantiGearRizal(2);
        spd2.tambahKecepatanRizal(10);
        spd2.gantiGearRizal(3);
        spd2.cetakStatusRizal();
        
        spd3.setMerkRizal("Klinee");
        spd3.tambahKecepatanRizal(5);
        spd3.gantiGearRizal(7);
        spd3.setTipeSuspensiRizal("Gas Suspension");
        spd3.cetakStatusRizal();
    }
}
