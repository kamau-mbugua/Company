package com.kamauCoder;

public class PartTime extends Employee {
    private  double hourlyRate, hoursWorked;
    public PartTime(String name, String address, int number, double hourlyRate) {
        super(name, address, number);
        setHourlyRate(hourlyRate);
    }
    public void mailCheck(){
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()+ " with salary " + hourlyRate);
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double newRate) {
        /*this.hourlyRate = hourlyRate;*/
        if (newRate >= 0.0 && newRate <= 200.00);
        {
            hourlyRate = newRate;
        }
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double h) {
        /*this.hoursWorked = hoursWorked;*/

        if (h >=0 && h<= 80){
            hoursWorked = h;

        }

    }

    public  double computePay(){
        System.out.println("Computing hourly pay for"+ getName());
        if (hoursWorked <=40){
            return  hourlyRate * hoursWorked;
        }
        else {
            return  hourlyRate * 40 + hourlyRate *1.5*(hoursWorked -40);
        }
    }
    /*private int hoursWorked, moreHours, payRate;
    public PartTime(String name, String address, int number) {
        super(name, address, number);

        hoursWorked =0;
    }

    public void addHours(){
        hoursWorked += moreHours;
        }

        public  double pay(){
        double payement = payRate*hoursWorked;
        hoursWorked =0;
        return  payement;
        }

        public String toString(){
        String result =super.toString();
         result += "\n Current hours:"+ hoursWorked;
         return  result;
        }*/
}
