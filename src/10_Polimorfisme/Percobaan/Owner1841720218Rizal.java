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
public class Owner1841720218Rizal {
    public void payRizal(IPayable1841720218Rizal p){
        System.out.println("Total payment = "+p.getPaymentAmountRizal());
        if (p instanceof ElectricityBill1841720218Rizal) {
            ElectricityBill1841720218Rizal eb =(ElectricityBill1841720218Rizal) p;
            System.out.println(""+eb.getBillInfo());
        }
        else if(p instanceof PermanentEmployee1841720218Rizal){
            PermanentEmployee1841720218Rizal pe = (PermanentEmployee1841720218Rizal) p;
            pe.getEmployeeInfoRizal();
            System.out.println(""+pe.getEmployeeInfoRizal());
        }
    }
    public void showMyEmployee(Employee1841720218Rizal e){
        System.out.println(""+e.getEmployeeInfoRizal());
        if(e instanceof PermanentEmployee1841720218Rizal){
            System.out.println("You have pay her/him mothly!!!");
        }
        else{
            System.out.println("No need to pay him/her");
        }
    }
}
