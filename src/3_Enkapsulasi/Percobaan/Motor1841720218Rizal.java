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
public class Motor1841720218Rizal {
    public int mKecepatan=0;
    public boolean mKontakOn=false;
    
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
