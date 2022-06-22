package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private int payday;
	
	private Address address;
	
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {	
	}

	public Department(String name, int payday,  Address address) {
		this.name = name;
		this.payday = payday;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayday() {
		return payday;
	}

	public void setPayday(int payday) {
		this.payday = payday;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	
	public void addEmployee (Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee (Employee employee) {
		employees.remove(employee);
	}
	
	//public double payroll() {
	  // double result = 0.0;
	 //  for (Employee employee : employees ) {  //get busca,  set troca
		// result +=  employee.getSalary();
	//   } 
  
	//return result;
	//}
	
	
	
	public static double payroll(Department dep ) {
		   double result = 0.0;
		   for (Employee employee : dep.getEmployees()) {  //get busca,  set troca
			 result +=  employee.getSalary();
		   }
	  
		return result;
		}

	@Override
	public String toString() {
		return "Department [name=" + name + ", payday=" + payday + ", address=" + address + ", employees=" + employees
				+ ", getName()=" + getName() + ", getPayday()=" + getPayday() + ", getAddress()=" + getAddress()
				+ ", getEmployees()=" + getEmployees() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}

// payroll = folha de pagamento




