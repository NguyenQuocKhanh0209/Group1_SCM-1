package Baihoc;

import java.util.Calendar;
import java.util.Scanner;

public class Birthday{
	 
	int day , month , year;
	
	Birthday(){
		
	}
	
	Birthday(int day , int month , int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	double calYearOld() {
		return (Calendar.getInstance().get(Calendar.YEAR) - year);
	}
	
	public void display() {
		System.out.println("Your birthday :" + day + "/" + month + "/" + year);
		System.out.println("you:" + calYearOld() + "year old");
	}
	
	public void input() {
		Scanner scan = new Scanner (System.in);
		int iday ,imonth, iyear;
		do {
			System.out.println("Enter year:");
			iyear = scan.nextInt();
			if(iyear < 1990 || iyear >2999) {
				System.out.println("Invalid number of year .Try again!");
			}else {
				do {
					System.out.println("Enter month:");
					imonth = scan.nextInt();
					if(imonth <= 0 || imonth > 12) {
						System.out.println("Invalid number of year .Try again!");
					}else {
						boolean checkDay = false;
						do {
							System.out.println("Enter day:");
							iday = scan.nextInt();
							if(iday <= 0 || iday > 31) {
								System.out.println("Invalid number of year .Try again!");
							}else if ((imonth == 2&& iday >29) || ((imonth == 4 || imonth == 6 || imonth == 9 || imonth ==11) && iday>30)){
								System.out.println("Invalid number of year .Try again!");
							}else {
								checkDay = true;
								day = iday;
								month = imonth;
								year = iyear;
							}
						}while (!checkDay);
					}
				}while(imonth <= 0 || imonth > 12);
			}
		}while (iyear < 1990 || iyear > 2999);
	}
	
	public static void main (String[] args) {
		Birthday bday = new Birthday();
		bday.input();
		bday.display();
	}
}
	





