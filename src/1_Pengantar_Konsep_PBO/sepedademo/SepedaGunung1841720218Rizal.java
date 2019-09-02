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
public class SepedaGunung1841720218Rizal extends Sepeda1841720218Rizal{
    private String mTipeSuspensi;
    
    public void setTipeSuspensiRizal(String newValue){
        mTipeSuspensi = newValue;
    }
    public void cetakStatusRizal(){
        super.cetakStatusRizal();
        System.out.println("Tipe Suspensi: "+mTipeSuspensi);
    }
}
