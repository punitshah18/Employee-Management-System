
public class EmployeeInfo {

    
    // ATTRIBUTES
    private int empNum;
    private String firstName;
    private String lastName;
    private int gender; // encode e.g. 0 for M, 1 for F, etc.
    private int workLoc; // encode e.g. 0 for Mississauga, etc.
    private int empRole; // encode e.g. 0 for mangerial role, etc.
    private double deductRate; // e.g. 0.21 for 21%
    
    
    // CONSTRUCTORS
    
    public EmployeeInfo(int eN, String fN, String lN, int g, int wL, int eR, double dR) {
    	empNum = eN;
    	firstName = fN;
    	lastName = lN;
    	gender = g;
    	workLoc = wL;
        empRole = eR;
    	deductRate = dR;
    }
    
    
    // METHODS
    
    //modifyEmployee allows the employee to be edited to the edited information the user inputs       
    public void modifyEmployee(int newEN, String newFN, String newLN, int newG, int newWL, int newER, double newDR) { 
       this.empNum = newEN;
       this.firstName = newFN;
       this.lastName = newLN;
       this.gender = newG;
       this.workLoc = newWL;
       this.empRole = newER;
       this.deductRate = newDR;

    }
    public int getEmpNum() {
    	return empNum;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    public int getGender() {
        return gender;
    }
    
    public int getWorkLoc() {
        return workLoc;
    }
    
    public int getEmpRole() {
        return empRole;
    }
    public double getDeductRate() {
        return deductRate;
    }
    
}
