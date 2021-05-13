/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



// FULL TIME EMPLOYEE

public class FTE extends EmployeeInfo {
    
    //Attributes
    public double yearlySalary;
    
    //Constructor
    public FTE(int eN, String fN, String lN, int g, int wL, int eR, double dR, double yS) {
        
        super(eN, fN, lN, g, wL, eR, dR);
        yearlySalary = yS;
        
    }
    
    //Methods
    public void modifyEmployeeFTE(double newYS){
      this.yearlySalary = newYS;
    }
    public double getYearlySalary(){
        return yearlySalary;
    }
    
    //Calculates net annual income based of the yearly salary and deduction rate
    public double calcNetAnnualIncome(){
        return Math.round(((yearlySalary - (getDeductRate() * yearlySalary))*100)/100);
    }
    
}
