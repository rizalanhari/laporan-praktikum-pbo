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
public class Constructor2Tugas1841720218Rizal extends Constructor1Tugas1841720218Rizal{
    private String mTipeSuspensi;

    public Constructor2Tugas1841720218Rizal() {
        super(null, 0, 0);
    }
    
    public void setTipeSuspensiRizal(String newValue){
        mTipeSuspensi = newValue;
    }
    public void cetakStatusRizal(){
        super.cetakStatusRizal();
        System.out.println("Tipe Suspensi: "+mTipeSuspensi);
    }
}
