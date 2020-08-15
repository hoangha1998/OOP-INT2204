package Task2;

import javax.management.remote.SubjectDelegationPermission;

public class Staff extends Person {
    private String school;
    private double pay;


    public Staff(String name, String address, String school, double pay){
        super(name,address);
        this.setSchool(school);
        this.setPay(pay);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    public String toString(){
        return  "Staff[" + super.toString() + ",school=" + this.getSchool()+ ",pay="+ this.getPay()+"]";
    }
}
