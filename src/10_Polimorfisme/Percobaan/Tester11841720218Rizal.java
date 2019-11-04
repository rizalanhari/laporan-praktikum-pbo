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
public class Tester11841720218Rizal {
    public static void main(String[] args) {
        PermanentEmployee1841720218Rizal pEmp = new PermanentEmployee1841720218Rizal("Dedik", 500);
        InternshipEmployee1841720218Rizal iEmp = new InternshipEmployee1841720218Rizal("Sumarto", 5);
        ElectricityBill1841720218Rizal eBill = new ElectricityBill1841720218Rizal(5, "A-1");
        Employee1841720218Rizal e;
        IPayable1841720218Rizal p;
        e=pEmp;
        e=iEmp;
        p=pEmp;
        p=eBill;
    }
}
