/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// PART TIME EMPLOYEE

public class PTE extends EmployeeInfo {
    
    //Attributes
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;
    
    //Constructors
    public PTE(int eN, String fN, String lN, int g, int wL, int eR, double dR, double hW, double hPW, double wPY) {
        super(eN, fN, lN, g, wL, eR, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;

    }
    
    //Methods
    
    public void modifyEmployeePTE(double newHW, double newHPW, double newWPY){
        this.hourlyWage = newHW;
        this.hoursPerWeek = newHPW;
        this.weeksPerYear = newWPY;
    } 
    
    public double getHourlyWage(){
        return hourlyWage;
    }
    
    public double getHoursPerWeek(){
        return hoursPerWeek;
    }
    
    public double getWeeksPerYear(){
        return weeksPerYear;
    }
    
    //Calculates net annual income based of the hourly wage, hours per week, weeks per year, and deduction rate
    public double calcNetAnnualIncome(){
       int totalSalary = (int) (hourlyWage * hoursPerWeek * weeksPerYear);
       return Math.round(totalSalary - (getDeductRate() * totalSalary));
    }
}
