/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author RIZAL
 */
public class ConstructorMain1841720218Rizal {
    public static void main(String[] args) {
        Constructor1Tugas1841720218Rizal c1 = new Constructor1Tugas1841720218Rizal("Polygone",10,2);
        Constructor1Tugas1841720218Rizal c2 = new Constructor1Tugas1841720218Rizal("Wiim Cycle",10,2);
        Constructor2Tugas1841720218Rizal c3 = new Constructor2Tugas1841720218Rizal();
        
        c1.cetakStatusRizal();
        
        c2.tambahKecepatanRizal(10);
        c2.gantiGearRizal(3);
        c2.cetakStatusRizal();
        
        c3.setMerkRizal("Klinee");
        c3.tambahKecepatanRizal(5);
        c3.gantiGearRizal(7);
        c3.setTipeSuspensiRizal("Gas Suspension");
        c3.cetakStatusRizal();
    }
}
