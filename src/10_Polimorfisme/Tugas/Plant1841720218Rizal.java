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
public class Plant1841720218Rizal {
    public void doDestroy(IDestroyable1841720218Rizal d){
        if (d instanceof WalkingZombie1841720218Rizal) {
            WalkingZombie1841720218Rizal wz = (WalkingZombie1841720218Rizal)d;
            wz.destroyedRizal();
        }
        else if(d instanceof JumpingZombie1841720218Rizal){
            JumpingZombie1841720218Rizal jz = (JumpingZombie1841720218Rizal)d;
            jz.destroyedRizal();
        }
        else if (d instanceof Barrier1841720218Rizal){
            Barrier1841720218Rizal b = (Barrier1841720218Rizal)d;
            b.destroyRizal();
        }
    }
}
