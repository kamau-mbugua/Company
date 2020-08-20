package com.kamauCoder;

public class Lecturer extends Salary {
    int subjects;
    public Lecturer(String name, String address, int number, double salary ,int subjects) {
        super(name, address, number, salary);
        setSubjects(subjects);
    }

    public int getSubjects() {
        return subjects;
    }

    public void setSubjects(int S) {
        /*this.subjects = subjects;*/
        if (S >= 1){
            subjects = S;

        }
    }
    public  double computePay(){
        System.out.println("Computing Bonus pay for lecture more than one"+ getName());
        if (subjects > 1){
            return getSalary()*subjects;
        }
        else {
            return  getSalary() - subjects;/*getSalary() * subjects + getSalary()*(subjects -40);*/
        }
    }
}
