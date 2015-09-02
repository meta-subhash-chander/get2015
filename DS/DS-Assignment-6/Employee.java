


public class Employee implements Comparable<Employee> {

	private Integer empId;
	private String name;
	private String address;
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Employee() { 
		empId = 0;
		name = "";
		address = "";
	}
	
	public Employee(int empId, String name, String address) {
		this.empId=empId;
		this.name=name;
		this.address=address;
	}
	
	
	
	@Override
	public String toString() {
		
		return " EmpId : "+empId+" Name : "+name+" Address : "+address ;
	}

	@Override
	public int compareTo(Employee emp) {
		return this.getEmpId()-emp.getEmpId();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		if(this.empId==(emp.getEmpId())){
			return true;
		}
		else {
				return false; 
		}
	}
	
	@Override
	public int hashCode() {
		 final int prime = 31;
	        int result = 1;
	        result = prime * result + this.empId;
	        return result;
	}
}
