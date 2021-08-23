package OOPS;

public class EmployeeDetails {
	
	public String EmpName;
	public String EmpDept;
	public int EmpId;
	public float EmpSal;
	public float EmpIncrement;
	
	public void displayEmpDetails() {
		
		System.out.println(EmpName);
		System.out.println(EmpDept);
		System.out.println(EmpId);
		System.out.println(EmpSal);
		System.out.println(EmpIncrement);
	}
	
	public float IncrementCalc(float empsal, float percentage) {
		EmpSal = empsal;
		EmpIncrement = EmpSal + (EmpSal * percentage/100);
		System.out.println(EmpIncrement);
		return EmpIncrement;
	}
	
	
	

}
