/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;

/**
 *
 * @author RIZAL
 */
public class Motor1841720218Rizal2 {
    private int mKecepatan=0;
    private boolean mKontakOn=false;
    
    public void nyalakanMesinRizal(){
        mKontakOn = true;
    }
    public void matikanMesinRizal(){
        mKontakOn=false;
        mKecepatan=0;
    }
    public void tambahKecepatanRizal(){
        if (mKontakOn==true) {
            mKecepatan+=5;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    public void kurangiKecepatan(){
        if (mKontakOn==true) {
            mKecepatan-=5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    public void printStatusRizal(){
        if (mKontakOn==true) {
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+mKecepatan+"\n");
    }
}
