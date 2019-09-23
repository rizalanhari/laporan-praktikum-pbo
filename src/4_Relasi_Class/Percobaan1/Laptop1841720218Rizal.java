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
public class Laptop1841720218Rizal {
    private String mMerk;
    private Processor1841720218Rizal proc;

    public Laptop1841720218Rizal() {
    }

    public Laptop1841720218Rizal(String mMerk, Processor1841720218Rizal proc) {
        this.mMerk = mMerk;
        this.proc = proc;
    }
    
    public void infoRizal(){
        System.out.println("Merk Laptop = "+mMerk);
        proc.infoRizal();
    }

    public String getmMerkRizal() {
        return mMerk;
    }

    public void setmMerkRizal(String mMerk) {
        this.mMerk = mMerk;
    }

    public Processor1841720218Rizal getProcRizal() {
        return proc;
    }

    public void setProcRizal(Processor1841720218Rizal proc) {
        this.proc = proc;
    }
    
    
}
