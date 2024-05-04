package Baihoc;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class fileOE{
	 void input() throws IOException {
		 File fo = new File("E:\\tpm9.txt");
		 FileWriter fw = new FileWriter(fo);
		 try {
			 fw.write("1.Vu Nhu Can");
			 fw.write("2. U Nhu Ky");
		 } catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 fw.close();
	 }
	 
	 void output() throws IOException{
		 File fi = new File("E:\\tpm9.txt");
		 FileReader fr = new FileReader(fi);
		 BufferedReader br = new  BufferedReader (fr);
		 String str = null;
		 try {
			 while ((str = br.readLine()) != null) {
		         System.out.println(str);
			 }
		 }catch  (FileNotFoundException e) {
			 e.printStackTrace();
		 }
		 br.close();
	 }
}
public class Docfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		fileOE f = new fileOE();
		f.input();
		f.output();

	}

}
