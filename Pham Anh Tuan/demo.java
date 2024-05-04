package Poli;

import java.io.IOException;

import java.util.*;

//Tao lop truu tuong Employee

 class Employee {

	String ID, name;

	float salary;

//Constructor Employee

	Employee() {

		this.ID = "";

		this.name = "";

		this.salary = 0;

	}

// method calculateSalary

	float calculateSalary() {
		return 0;
	}

	void input() {

		Scanner objSc = new Scanner(System.in);

		System.out.print("Nhap ID:");

		ID = objSc.nextLine();

		System.out.print("Nhap name:");

		name = objSc.nextLine();

		System.out.print("Nhap luong:");

		salary = objSc.nextFloat();
		calculateSalary();
	}

	void output() {

		System.out.println("ID:" + ID);

		System.out.println("Name:" + name);

		System.out.println("Salary:" + salary);

	}

}

class RegularEmployee extends Employee {

	float salaryGrading, benefitGrading;

//constructor RegularEmployee()

	RegularEmployee() {

		this.salaryGrading = 0;

		this.benefitGrading = 0;

	}

	@Override

	float calculateSalary() {

		salary = 1000000 * (1 + salaryGrading + benefitGrading);

		return salary;

	}

	void input() {

		// goi input() tu lop cha

		super.input();

		Scanner objSc = new Scanner(System.in);

		System.out.print("Nhap salaryGrading:");

		salaryGrading = objSc.nextFloat();

		System.out.print("Nhap benefitGrading:");

		benefitGrading = objSc.nextFloat();
		calculateSalary();
	}

}

class ContractStaff extends Employee {

	float wage, workday, excessHoursGrading;

	// constructor ContractStaff

	ContractStaff() {

		this.wage = 0;

		this.workday = 0;

		this.excessHoursGrading = 0;

	}

	void input() {

		// Goi input() tu lop cha

		super.input();

		Scanner objSc = new Scanner(System.in);

		System.out.print("Nhap wage:");

		wage = objSc.nextFloat();

		System.out.print("Nhap workday:");

		workday = objSc.nextFloat();

		System.out.print("Nhap excessHoursGrading:");

		excessHoursGrading = objSc.nextFloat();

	}

	float calculateSalary() {

		salary = wage * workday * (1 + excessHoursGrading);

		return salary;

	}

}

class EmployeeList {

	Employee empList[] = new Employee[100];

	int n = 0;

	char chon, loai;

	void inputEmployee() throws IOException {

		do

		{

			System.out.println("Bien che hay Hop dong (B/H)?");

			loai = (char) System.in.read();

			if (loai == 'B' || loai == 'b')

				empList[n] = new RegularEmployee();

			else

				empList[n] = new ContractStaff();

			System.in.skip(loai);

			empList[n++].input();

			System.out.println("Tiep tuc (C/K)?");

			chon = (char) System.in.read();

			System.in.skip(chon);

			if ((n == 100) || (chon == 'K') || (chon == 'k'))

				break;

		}

		while (true);

	}

	void outputEmployee() {

		for (int i = 0; i < n; i++) {

			System.out.println("ID " + empList[i].ID);

			System.out.println("Luong " + empList[i].salary);

		}

	}

}

public class demo {

	public static void main(String[] args) throws IOException {

		EmployeeList objEmp = new EmployeeList();

		objEmp.inputEmployee();

		objEmp.outputEmployee();

	}

}
