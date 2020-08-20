package com.kamauCoder;

public class VirtualDemo {
    public static  void main(String [] args){
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP",
                3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA",
                2, 2400.00);
        Employee h = new PartTime("James John","Nairobi , Ke",16, 8000);
        Employee l = new Salary("James John","Nairobi , Ke",16, 8.00);

        System.out.println("Call mailCheck using Salary Reference ==");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee Reference ==");
        e.mailCheck();
        System.out.println("\n Call mailCheck using Employee H Reference ==" );
        ((PartTime)h).setHoursWorked(140);
        ((PartTime)h).computePay();
        h.mailCheck();
        System.out.println("\n Call mailCheck using Employee l Reference ==" );
        l.mailCheck();

    }
}
