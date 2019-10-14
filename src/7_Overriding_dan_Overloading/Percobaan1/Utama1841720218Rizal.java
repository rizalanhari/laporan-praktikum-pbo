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
public class Utama1841720218Rizal {
    public static void main(String[] args) {
        Manager1841720218Rizal man[]=new Manager1841720218Rizal[2];
        Staff1841720218Rizal staff1[]=new Staff1841720218Rizal[2];
        Staff1841720218Rizal staff2[]=new Staff1841720218Rizal[3];
        
        man[0]=new Manager1841720218Rizal();
        man[0].setmNamaRizal("Tedjo");
        man[0].setmNipRizal("101");
        man[0].setmGolonganRizal("1");
        man[0].setmTunjanganRizal(5000000);
        man[0].setmBagianRizal("Administrasi");
        
        man[1]=new Manager1841720218Rizal();
        man[1].setmNamaRizal("Atika");
        man[1].setmNipRizal("102");
        man[1].setmGolonganRizal("1");
        man[1].setmTunjanganRizal(2500000);
        man[1].setmBagianRizal("Pemasaran");
        
        staff1[0]=new Staff1841720218Rizal();
        staff1[0].setmNamaRizal("Usman");
        staff1[0].setmNipRizal("0003");
        staff1[0].setmGolonganRizal("2");
        staff1[0].setmLemburRizal(10);
        staff1[0].setmGajiLemburRizal(10000);
        
        staff1[1]=new Staff1841720218Rizal();
        staff1[1].setmNamaRizal("Anugrah");
        staff1[1].setmNipRizal("0005");
        staff1[1].setmGolonganRizal("2");
        staff1[1].setmLemburRizal(10);
        staff1[1].setmGajiLemburRizal(55000);
        man[0].setmStRizal(staff1);
        
         
        staff2[0]=new Staff1841720218Rizal();
        staff2[0].setmNamaRizal("Hendra");
        staff2[0].setmNipRizal("0004");
        staff2[0].setmGolonganRizal("3");
        staff2[0].setmLemburRizal(15);
        staff2[0].setmGajiLemburRizal(5500);
        
        staff2[1]=new Staff1841720218Rizal();
        staff2[1].setmNamaRizal("Arie");
        staff2[1].setmNipRizal("0006");
        staff2[1].setmGolonganRizal("4");
        staff2[1].setmLemburRizal(5);
        staff2[1].setmGajiLemburRizal(100000);
        
        staff2[2]=new Staff1841720218Rizal();
        staff2[2].setmNamaRizal("Mentari");
        staff2[2].setmNipRizal("0007");
        staff2[2].setmGolonganRizal("3");
        staff2[2].setmLemburRizal(6);
        staff2[2].setmGajiLemburRizal(20000);
        man[1].setmStRizal(staff2);
        
        man[0].lihatInfoRizal();
        man[1].lihatInfoRizal();
    }
}
