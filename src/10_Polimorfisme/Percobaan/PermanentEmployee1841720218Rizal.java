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
public class PermanentEmployee1841720218Rizal extends Employee1841720218Rizal implements  IPayable1841720218Rizal{
    private int mSalary;

    public PermanentEmployee1841720218Rizal(String mName, int mSalary) {
        this.mName = mName;
        this.mSalary = mSalary;
    }

    public int getmSalary() {
        return mSalary;
    }

    public void setmSalary(int mSalary) {
        this.mSalary = mSalary;
    }
    
    @Override
    public int getPaymentAmountRizal() {
        return (int) (mSalary+0.05*mSalary);
    }

    @Override
    public String getEmployeeInfoRizal() {
        String info = super.getEmployeeInfoRizal()+"\n";
        info += "Registered as permanent employee with salary "+mSalary+"\n";
        return info;
    }
    
    
}
