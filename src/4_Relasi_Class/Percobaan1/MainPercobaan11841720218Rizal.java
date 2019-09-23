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
public class MainPercobaan11841720218Rizal {
    public static void main(String[] args) {
        Processor1841720218Rizal p = new Processor1841720218Rizal("Intel i5", 3);
        Laptop1841720218Rizal L = new Laptop1841720218Rizal("Thinkpad", p);
        
        L.infoRizal();
        
        Processor1841720218Rizal p1 = new Processor1841720218Rizal();
        p1.setmMerkRizal("Intel i5");
        p1.setmCacheRizal(4);
        Laptop1841720218Rizal L1 = new Laptop1841720218Rizal();
        L1.setmMerkRizal("Thinkpad");
        L1.setProcRizal(p1);
        L1.infoRizal();
    }
}
