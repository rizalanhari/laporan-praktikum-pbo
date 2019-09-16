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
public class EncapDemo1841720218Rizal {
    private String mName;
    private int mAge;
    
    public String getNameRizal(){
        return mName;
    }
    public void setNameRizal(String newName){
        mName=newName;
    }
    public int getAgeRizal(){
        return mAge;
    }
    public void setAgeRizal(int newAge){
        if (newAge>30) {
            mAge=30;
        }
        else{
            mAge=newAge;
        }
    }
}
