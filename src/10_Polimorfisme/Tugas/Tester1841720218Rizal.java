/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author RIZAL
 */
public class Tester1841720218Rizal {
    public static void main(String[] args) {
        WalkingZombie1841720218Rizal wz = new WalkingZombie1841720218Rizal(100, 1);
        JumpingZombie1841720218Rizal jz = new JumpingZombie1841720218Rizal(100, 2);
        Barrier1841720218Rizal b = new Barrier1841720218Rizal(100);
        Plant1841720218Rizal p = new Plant1841720218Rizal();
        System.out.println(""+wz.getZombieInfoRizal());
        System.out.println(""+jz.getZombieInfoRizal());
        System.out.println(""+b.getBarrierInfoRizal());
        System.out.println("----------------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfoRizal());
        System.out.println(""+jz.getZombieInfoRizal());
        System.out.println(""+b.getBarrierInfoRizal());
    }
}
