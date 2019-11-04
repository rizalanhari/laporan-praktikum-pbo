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
public class JumpingZombie1841720218Rizal extends Zombie1841720218Rizal {

    public JumpingZombie1841720218Rizal(int mHealth, int mLevel) {
        this.mHealth = mHealth;
        this.mLevel = mLevel;
    }

    @Override
    public void healRizal() {
        switch (mLevel) {
            case 1:
                mHealth = mHealth + (mHealth * 30 / 100);
                break;
            case 2:
                mHealth = mHealth + (mHealth * 40 / 100);
                break;
            case 3:
                mHealth = mHealth + (mHealth * 50 / 100);
                break;
            default:
                break;
        }
    }

    @Override
    public void destroyedRizal() {
        mHealth -= mHealth * 0.01;
    }

    @Override
    public String getZombieInfoRizal() {
        String info = "Jumping Zombie Data = \n"
                + "Health = " + mHealth + "\n"
                + "Level = " + mLevel;
        return info;
    }

}
