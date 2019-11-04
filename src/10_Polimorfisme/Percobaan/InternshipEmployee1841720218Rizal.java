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
public class InternshipEmployee1841720218Rizal extends Employee1841720218Rizal {

    private int mLength;

    public InternshipEmployee1841720218Rizal(String mName, int mLength) {
        this.mName = mName;
        this.mLength = mLength;
    }

    public int getmLength() {
        return mLength;
    }

    public void setmLength(int mLength) {
        this.mLength = mLength;
    }

    @Override
    public String getEmployeeInfoRizal() {
        String info = super.getEmployeeInfoRizal()+"\n";
        info += "Register as internship employee for "+mLength+" moth/s\n";
        return info;
    }
    
}
