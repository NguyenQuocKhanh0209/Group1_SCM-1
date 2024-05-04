package Demo;

import java.io.IOException;
import java.util.*;

import java.io.*;

interface IFAN {
	double sum_total();
}

abstract class FAN implements IFAN {
	int fanID;
	String manifacturer;
	String color;
	int Wattage;
	String MachineStatus;
	double price;
	double num;

	// constructor
	public FAN(int fanID, String manifacturer, String color, int Wattage, String MachineStatus, double price,
			double num) {
		this.fanID = fanID;
		this.manifacturer = manifacturer;
		this.color = color;
		this.Wattage = Wattage;
		this.MachineStatus = MachineStatus;
		this.price = price;
		this.num = num;
	}
	public FAN() {
		this.fanID = 0;
		this.manifacturer = " ";
		this.color = " ";
		this.Wattage = 0;
		this.MachineStatus = " ";
		this.price = 0;
		this.num = 0;
	}

	public int getFanID() {
		return fanID;
	}

	public void setFanID(int fanID) {
		this.fanID = fanID;
	}

	public String getManifacturer() {
		return manifacturer;
	}

	public void setManifacturer(String manifacturer) {
		this.manifacturer = manifacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWattage() {
		return Wattage;
	}

	public void setWattage(int wattage) {
		Wattage = wattage;
	}

	public String getMachineStatus() {
		return MachineStatus;
	}

	public void setMachineStatus(String machineStatus) {
		MachineStatus = machineStatus;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public double sum_total() {
		return sum_total();
	}

	// input
	void input() {
		Scanner objSc = new Scanner(System.in);
		System.out.print("Nhap ID quat:");
		this.setFanID(objSc.nextInt());
		System.out.print("Nhap nha san xuat:");
		this.setManifacturer(objSc.next());
		System.out.print("Nhap mau sau :");
		this.setColor(objSc.next());
		System.out.print("Nhap cong suat:");
		this.setWattage(objSc.nextInt());
		System.out.print("Nhap trang thai may:");
		this.setMachineStatus(objSc.next());
		System.out.print("Nhap gia :");
		this.setPrice(objSc.nextDouble());
		System.out.print("Nhap so luong:");
		this.setNum(objSc.nextDouble());
	}

	// output
	void output() {
		System.out.println("ID quat :" + this.getFanID());
		System.out.println("Nha San Xuat :" + this.getManifacturer());
		System.out.println("Mau Sac :" + this.getColor());
		System.out.println("Cong Suat Quat :" + this.getWattage());
		System.out.println("Trang thai may : " + this.getMachineStatus());
		System.out.println("Gia :" + this.getPrice());
		System.out.println("So Luong :" + this.getNum());
	}
	 abstract double discount();
	
}
class SteamFan extends FAN {
	double waterCapacity;
	String CoolingMode;
	int numberOfSteamLevels;
	String CoolingTechnology;
	

	public String getCoolingTechnology() {
		return CoolingTechnology;
	}

	public void setCoolingTechnology(String coolingTechnology) {
		CoolingTechnology = coolingTechnology;
	}

	public double getWaterCapacity() {
		return waterCapacity;
	}

	public void setWaterCapacity(double waterCapacity) {
		this.waterCapacity = waterCapacity;
	}

	public String getCoolingMode() {
		return CoolingMode;
	}

	public void setCoolingMode(String coolingMode) {
		CoolingMode = coolingMode;
	}

	public int getNumberOfSteamLevels() {
		return numberOfSteamLevels;
	}

	public void setNumberOfSteamLevels(int numberOfSteamLevels) {
		this.numberOfSteamLevels = numberOfSteamLevels;
	}

	// input
	void input() {
		super.input();
		Scanner objSc = new Scanner(System.in);
		System.out.print("Nhap dung tich nuoc:");
		this.setWaterCapacity(objSc.nextDouble());
		System.out.print("Nhap che do lam mat :");
		this.setCoolingMode(objSc.next());
		System.out.print("Nhap so cap do hoi nuoc:");
		this.setNumberOfSteamLevels(objSc.nextInt());
		System.out.print("Nhap cong nghe lam mat ( Lux / Nor ):");
		this.setCoolingTechnology(objSc.next());
	}

	// output
	void output() {
		super.output();
		System.out.println("Dung tich nuoc:" + this.getWaterCapacity());
		System.out.println("Che do lam mat: " + this.getCoolingMode());
		System.out.println("So cap do hoi nuoc :" + this.getNumberOfSteamLevels());
		System.out.println("Cong nghe lam mat :" + this.getCoolingTechnology());
	}

	@Override
	public double discount() {
		double dis = 0;
		if (this.getCoolingTechnology().equals("Lux")) {
			dis = this.getNum() + this.getPrice() * 0.4;
		} else if(this.getCoolingMode().equals("Nor")) {
			dis = this.getNum() + this.getPrice() * 0.2;
		}
		return dis;
	}

	public double sum_total() {
		double sum = 0;
		sum = this.getNum() * this.getPrice() - this.discount();
		return sum;

	}

}

class RegularFan extends FAN {
	String impellerSize;
	String FanStyle;
	public String getFanStyle() {
		return FanStyle;
	}

	public void setFanStyle(String fanStyle) {
		FanStyle = fanStyle;
	}

	String timeFunction;
	int numberOfwindLevels;
	double surcharge;

	public String getImpellerSize() {
		return impellerSize;
	}

	public void setImpellerSize(String impellerSize) {
		this.impellerSize = impellerSize;
	}

	public String getTimeFunction() {
		return timeFunction;
	}

	public void setTimeFunction(String timeFunction) {
		this.timeFunction = timeFunction;
	}

	public int getNumberOfwindLevels() {
		return numberOfwindLevels;
	}

	public void setNumberOfwindLevels(int numberOfwindLevels) {
		this.numberOfwindLevels = numberOfwindLevels;
	}

	public double getSurcharge() {
		return surcharge;
	}

	public void setSurcharge(double surcharge) {
		this.surcharge = surcharge;
	}

	void input() {
		super.input();
		Scanner objSc = new Scanner(System.in);
		System.out.print("Nhap kich thuoc canh quat:");
		this.setImpellerSize(objSc.next());
		System.out.print("Nhap kieu dang (modern / classic):");
		this.setFanStyle(objSc.next());
		System.out.print("Nhap chuc nang hen gio:");
		this.setTimeFunction(objSc.next());
		System.out.print("Nhap so cap do gio:");
		this.setNumberOfwindLevels(objSc.nextInt());
		System.out.print("Nhap phu phi :");
		this.setSurcharge(objSc.nextDouble());
	}

	void output() {
		super.output();
		System.out.println("Kich thuoc canh quat:" + this.getImpellerSize());
		System.out.println("Kieu dang quat:" + this.getFanStyle());
		System.out.println("Chuc nang hen gio :" + this.getTimeFunction());
		System.out.println("So cap do gio cua quat:" + this.getNumberOfwindLevels());
		System.out.println("Phu phi them:" + this.getSurcharge());
	}

	@Override
	public double discount() {
		double dis = 0;
		if (this.getFanStyle().equals("modern")) {
			dis = this.getNum() + this.getPrice() * 0.4;
		} else if(this.getFanStyle().equals("classic")) {
			dis = this.getNum() + this.getPrice() * 0.2;
		}
		return dis;
	}

	public double sum_total() {
		double sum = 0;
		sum = this.getPrice() + this.surcharge - this.getNum();
		return sum;
	}
	
}
class FANLIST{
	ArrayList<FAN> list = new ArrayList<> ();
	int n = 0;
	char chon , loai;
	
	void input() throws IOException {
		FAN[] fan = new FAN[10];
		do {
			System.out.println("Quat hoi nuoc{S) hay Quat thuong (R) (S/R)");
			loai = (char) System.in.read();
			if(loai == 'S' || loai == 's')
				fan[n] = new SteamFan();
			else
				fan[n] = new RegularFan();
			list.add(fan[n]);
			System.in.skip(loai);
			fan[n++].input();
			System.out.println("Tiep tuc (C/K)?");
			chon = (char) System.in.read();
			System.in.skip(chon);
			if ((n == 100) || (chon == 'K') || (chon == 'k'))
				break;
	}while (true);
   }
	 void output() {
        double totalCost = 0;
        for (FAN fan : list) {
            totalCost += fan.sum_total();
        }
        System.out.println("Tong chi phi cua tat ca quat co o day: " + totalCost);
	 
	 
	 for (int i = 0 ; i < list.size();i++) {
		 list.get(i).output();
	 }
  }
	 //update
	 void update() {
			Scanner objSc = new Scanner(System.in);
			System.out.print("Nhap ma Quat can cap nhat: ");
			int fanID = objSc.nextInt();

			for (FAN fan : list) {
				if (fan.getFanID() == fanID) {
					System.out.print("Nhap thong tin moi: \n");
					fan.input();
					return;
				}
			}
		}
	 //delete
	 void delete() {
			Scanner objSc = new Scanner(System.in);
			System.out.print("Nhap loai Quat can xoa: ");
			int fanID = objSc.nextInt();

			for (FAN fan : list) {
				if (fan.getFanID() == fanID) {
					list.remove(fan);
					System.out.println("Loai Quat " + fanID + " da xoa.");
					return;
				}
			}

			System.out.println("Khong tim thay loai Quat " + fanID);
		}
	  //sort
	 void sort() {
			Collections.sort(list, Comparator.comparingInt(FAN::getFanID));
			
			System.out.println("Da sap xep theo ma Quat");
		}
	 //find
	 void findFAN() {
			Scanner objSc = new Scanner(System.in);
			System.out.print("Nhap ma Quat can tim kiem: ");
			int fanID = objSc.nextInt();

			for (FAN fan : list) {
				if (fan.getFanID() == fanID) {
					fan.output();
					return;
				}
			}
			System.out.println("\nKhong tim thay ma Quat: " + fanID);
			System.out.println("Su dung 6.Display Order de kiem tra lai ID hien co!!");
		}	
	 void readFromFile() {
	        try (BufferedReader reader = new BufferedReader(new FileReader("E:\\project.txt"))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(" ");
	                if (parts[0].equalsIgnoreCase("S")) {
	                    SteamFan steamFan = new SteamFan();
	                    steamFan.setFanID(Integer.parseInt(parts[1]));
	                    // set other properties for SteamFan
	                    list.add(steamFan);
	                } else if (parts[0].equalsIgnoreCase("R")) {
	                    RegularFan regularFan = new RegularFan();
	                    regularFan.setFanID(Integer.parseInt(parts[1]));
	                    // set other properties for RegularFan
	                    list.add(regularFan);
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	
	    void writeToFile() {
	        try (PrintWriter writer = new PrintWriter(new FileWriter("E:\\project.txt"))) {
	            for (FAN fan : list) {
	                String fanType = (fan instanceof SteamFan) ? "S" : "R";
	                writer.println(fanType + " " + fan.getFanID());
	               	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }


}
public class project {
    public static void main(String[] args) throws IOException {
        FANLIST fanList = new FANLIST();
        Scanner objSc = new Scanner(System.in);
        
        fanList.readFromFile();

        int choice;
        do {
            System.out.println("\n----- Fan Management -----");
            System.out.println(" +++++++++-MENU-++++++++++");
            System.out.println("1. Add Fan");
            System.out.println("2. Update Fan");
            System.out.println("3. Find Fan");
            System.out.println("4. Delete Fan");
            System.out.println("5. Sort Fan");
            System.out.println("6. Display Fan");
            System.out.println("0. Exit");
            System.out.print("Nhập Lựa chọn: ");

            choice = objSc.nextInt();
            objSc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    fanList.input();
                    break;
                case 2:
                    fanList.update();
                    break;
                case 3:
                    fanList.findFAN();
                    break;
                case 4:
                    fanList.delete();
                    break;
                case 5:
                    fanList.sort();
                    break;
                case 6:
                    fanList.output();
                    break;
                case 0:
                    System.out.println("Kết thúc Chương trình!!!");
                    break;
                default:
                    System.out.println("Lựa chọn sai, vui lòng nhập lại!!!");
            }
        } while (choice != 0);

        objSc.close();
    }
}