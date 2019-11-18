/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan4;
import java.util.ArrayList;
/**
 *
 * @author RIZAL
 */
public class InputData1841720218Rizal {
    ArrayList<Mahasiswa1841720218Rizal> ListMahasiswa;

    public InputData1841720218Rizal() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDaraRizal(String mNim, String mNama, String mAlamat){
        Mahasiswa1841720218Rizal mhs = new Mahasiswa1841720218Rizal(mNim, mNama, mAlamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720218Rizal> getDataRizal(){
        return ListMahasiswa;
    }
}
