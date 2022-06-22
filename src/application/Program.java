package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String name = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payday = sc.nextInt();
		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		Department department = new Department (name, payday, new Address(email, phone));
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do funcionário  " + i + ":" );
			System.out.print("Nome: ");
		    name = sc.nextLine();
		    sc.nextLine();
		    System.out.print("Salário: ");
		    double salary = sc.nextDouble();
			Employee employee = new Employee(name, salary);
			department.addEmployee(employee);
		}
		
		showReport(department);
		System.out.println(department);
		
		sc.close();
	}

	private static void showReport(Department department) {
		StringBuilder sb = new StringBuilder();
 		sb.append("FOLHA DE PAGAMENTO:");
 		sb.append("Departamento" + department.getName() + "= R$ " + Department.payroll(department));
 		sb.append("Pagamento realizado no dia" + department.getPayday());
 		sb.append("Funcionários:");
 		sb.append(Arrays.asList(department.getEmployees()));
 		sb.append("Funcionários:");
 		sb.append("Para dúvidas favor entrar em contato:" + department.getAddress().getEmail());
 	    sb.toString();
	    
		
	}
	
	

}
