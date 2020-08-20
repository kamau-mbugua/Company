#Solves the question below 

Create a new class called PartTime which extends the employee class.

A parttime employee is paid on a weekly basis.

A parttime employee inherit all the attributes of an Employee class but also has number of hrs works
and hourly rate as further attributes.

In the mailCheck method, indicate that the check is being mailed on a monthly basis for a given number
of hourly and an hourly rate.

Include a computePay method that computes monthly pay as number of hours worked X wage per hour.
Have an interface called manageWork that both salariedEmployees and parttime employees implement.
All employees have to work for a tleast 40 hrs. For parttime employee the hrs worked is checked against
the due hrs, if hrs worked is less than 40, a warning is printed on the screen, if number of hrs is more
than 40, a bonus is given. This bonus is added to their monthly wage. The bonus is calculated as extra
hrs X hrly rate.

If a salariedEmployees are supposed to work for at least 200 days in a year, If he or she works for less
that 200 days, a warning is given. If he or she worked for more than 200 days then a bonus is given. The 
bonus is calculated as their (monthly salary X number of extra days )/20. This bonus is added to their
yearly salary.

A Lecture inherits from a Salaried employee and have the attributes subjects that hold the course names
of the courses he or she teaches.

A cleaner inherits from the parttime employee and has the attribute location that indicates the place
they are allocated to clean.

Instantiate several salaried and part time employees and show their monthly wages or salaries.
Instantiate several Lecturers and cleaners. 
