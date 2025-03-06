class Employee{

	public void displayCompanyDetails()
	{
		System.out.println("101, Infosys, Pune");
	}
	
	public void displayEmployeeDetails()
	{
		System.out.println("Name: Gayatri");
		System.out.println("Address: PCMC");
		System.out.println("Contact No.: 1234567890");
	}
	
	public static void main(String[] args)
	{
		Employee e = new Employee();
		System.out.println("Company Details:");
		e.displayCompanyDetails();
		System.out.println("Employee Details:");
		e.displayEmployeeDetails();
	}
}