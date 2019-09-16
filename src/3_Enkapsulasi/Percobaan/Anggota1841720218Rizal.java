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
public class Anggota1841720218Rizal {
    private String mNama, mAlamat;
    private float mSimpanan;
    
    public void setNamaRizal(String mNama){
        this.mNama=mNama;
    }
    public void setAlamatRizal(String mAlamat){
        this.mAlamat=mAlamat;
    }
    public String getNamaRizal(){
        return  mNama;
    }
    public String getAlamatRizal(){
        return mAlamat;
    }
    public float getSimpananRIzal(){
        return mSimpanan;
    }
    public void setorRizal(float uang){
        mSimpanan +=uang;
    }
    public void pinjamRizal(float uang){
        mSimpanan -=uang;
    }
}
