/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author RIZAL
 */
public class Mahasiswa1841720218Rizal implements ICumlaude1841720218Rizal{
    protected String mNama;

    public Mahasiswa1841720218Rizal(String mNama) {
        this.mNama = mNama;
    }
    
    public void kuliahDiKampusRizal(){
        System.out.println("Aku mahasiswa, namaku "+this.mNama);
        System.out.println("Aku berkuliah di kampus.");
    }

    @Override
    public void lulusRizal() {
        
    }

    @Override
    public void meraihIPKTinggiRizal() {
        
    }
}
