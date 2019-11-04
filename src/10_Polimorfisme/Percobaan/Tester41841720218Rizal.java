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
public class Tester41841720218Rizal {
    public static void main(String[] args) {
        Owner1841720218Rizal ow = new Owner1841720218Rizal();
        ElectricityBill1841720218Rizal eBill = new ElectricityBill1841720218Rizal(5, "R-1");
        ow.payRizal(eBill);
        System.out.println("----------------------");
        
        PermanentEmployee1841720218Rizal pEmp = new PermanentEmployee1841720218Rizal("Dedik", 500);
        ow.payRizal(pEmp);
        System.out.println("-----------------------");
        
        InternshipEmployee1841720218Rizal iEmp = new InternshipEmployee1841720218Rizal("Sumarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("-----------------------");
        ow.showMyEmployee(iEmp);
    }
}
