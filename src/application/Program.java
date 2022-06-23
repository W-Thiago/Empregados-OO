package application;

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

		Department department = new Department(name, payday, new Address(email, phone));

		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionário  " + i + ":");
			System.out.print("Nome: ");
			String nameEmployee = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			Employee employee = new Employee(nameEmployee, salary);
			department.addEmployee(employee);
			sc.nextLine();
		}

		showReport(department);

		sc.close();
	}

	private static void showReport(Department department) {
		System.out.println("##############################################################################");
		System.out.println("FOLHA DE PAGAMENTO: ");
		StringBuilder sb = new StringBuilder();
		sb.append("Departamento ").append(department.getName()).append(" = R$ ").append(Department.payroll(department));
		System.out.println(sb);

		StringBuilder sb1 = new StringBuilder();
		sb1.append("Pagamento realizado no dia ").append(department.getPayday());
		System.out.println(sb1);

		System.out.println("Funcionários: ");
		for (Employee employee : department.getEmployees()) {
			System.out.println(employee.getName());
		}
		StringBuilder sb2 = new StringBuilder();
		sb2.append("Para dúvidas favor entrar em contato: ").append(department.getAddress().getEmail());
		System.out.println(sb2);
		System.out.println("##############################################################################");

	}
}
