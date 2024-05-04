package btvn;

import java.util.*;
import java.io.IOException;;

class Person {
	int id;
	String name;

	Person() {
		this.id = 0;
		this.name = "";
	}

	void input() {
		Scanner obj = new Scanner(System.in);
		System.out.print("Nhap id : ");
		this.id = obj.nextInt();
		obj.nextLine();
		System.out.print("Nhap ten : ");
		this.name = obj.nextLine();

	}

	void output() {
		System.out.println("Id : " + this.id);
		System.out.println("Name : " + this.name);
	}

	float calculateBonus() {
		return 0;
	}
}

class Student extends Person {
	int studId;
	float avgMark;
	float Bonus;

	Student() {
		this.studId = 0;
		this.avgMark = 0;
	}

	void input() {
		Scanner obj = new Scanner(System.in);
		super.input();
		System.out.print("Nhap ma sinh vien : ");
		this.studId = obj.nextInt();
		System.out.print("Nhap diem trung binh cua sinh vien : ");
		this.avgMark = obj.nextFloat();
		calculateBonus();

	}

	void output() {
		
		super.output();
		System.out.println("Ma sinh vien : " + this.studId);
		System.out.println("Diem trung binh : " + this.avgMark);
		System.out.println("Tien thuong : " + this.Bonus);
		System.out.println("---------------------------");

	}

	float calculateBonus() {
		if (this.avgMark > 8) {
			this.Bonus = 750000;
			return this.Bonus;
		} else {
			this.Bonus = 0;
			return this.Bonus;
		}

	}
}

class Lecturer extends Person {
	int empId;
	int numberOfPaper;
	float Bonus;

	Lecturer() {
		this.empId = 0;
		this.numberOfPaper = 0;
	}

	void input() {
		Scanner obj = new Scanner(System.in);
		super.input();
		System.out.print("Nhap ma giang vien : ");
		this.empId = obj.nextInt();
		System.out.print("Nhap so luong giay : ");
		this.numberOfPaper = obj.nextInt();
		calculateBonus();

	}

	void output() {
		
		super.output();
		System.out.println("Ma giang vien : " + this.empId);
		System.out.println("So luong giay : " + this.numberOfPaper);
		System.out.println("Tien thuong : " + this.Bonus);
		System.out.println("---------------------------");
	}

	float calculateBonus() {
		if (this.numberOfPaper > 3) {
			this.Bonus = 1500000;
			return this.Bonus;
		} else {
			this.Bonus = 0;
			return this.Bonus;
		}

	}

}

class PersonList {
	Person list[] = new Person[100];
	int n = 0;
	char chon, loai;

	void input() throws IOException {

		do {
			System.out.println("Sinh vien hay giang vien ? (S/L)");
			loai = (char) System.in.read();
			if (loai == 'S' || loai == 's') {
				list[n] = new Student();
			} else {
				list[n] = new Lecturer();
			}
			System.in.skip(loai);
			list[n++].input();
			System.out.print("Tiep tuc khong ? (C/K) ");
			chon = (char) System.in.read();
			System.in.skip(chon);
			if ((n == 100) || (chon == 'K') || (chon == 'k')) {

				break;
			}
		} while (true);

	}

	void output() {
		System.out.println("---------------------------");
		System.out.println("Thong tin danh sach da nhap ");
		for (int i = 0; i < n; i++) {
			list[i].output();
		}
	}

	void Sort() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n; j++) {
				if (list[i].calculateBonus() > list[j].calculateBonus()) {
					Person tmp;
					tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
			}
		}
	}

	float SumOfBoNus() {
		float sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + list[i].calculateBonus();
		}
		return sum;
	}

	void display() {
		Person tmp = null;
		float max = list[0].calculateBonus();
		float min = 0;
		for (int i = 0; i < n; i++) {
			if (list[i].calculateBonus() > max) {
				tmp = list[i];
			}
		}

		System.out.println("Thong tin nguoi co muc thuong cao nhat ");
		tmp.output();
		for (int i = 0; i < n; i++) {
			if (list[i].calculateBonus() <= min) {
				tmp = list[i];
			}
		}

		System.out.println("Thong tin nguoi co muc thuong thap nhat ");
		tmp.output();
	}
}

public class btvn5Person {

	public static void main(String[] args) throws IOException {
		PersonList ps = new PersonList();
		ps.input();
		ps.Sort();
		ps.output();
		System.out.println("Tong tien thuong cua toan cong ty la : " + ps.SumOfBoNus());
		System.out.println("---------------------------");
		ps.display();
	}

}
