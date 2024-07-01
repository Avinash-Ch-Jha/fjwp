package oops;

class Car{
	int tyre;
	int seat;
	String tyreType;
	String engineType;
	public int getTyre() {
		return tyre;
	}
	public void setTyre(int tyre) {
		this.tyre = tyre;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String getTyreType() {
		return tyreType;
	}
	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
}
 class bike{
	 String bikeName;
	 int millage;
 }
 
 
 
 //-----------------end-------------------------
public class ClassNObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.tyre=4;
		c1.engineType="Petrol";
		c1.seat=6;
		c1.tyreType="tube less";
		System.out.println("number of tyre="+" " +c1.tyre);
		System.out.println("Number of seat="+" " + c1.seat);
		System.out.println("Type  of engine= "+c1.engineType);
		System.out.println("Type of Tyre= "+c1.tyreType);
		
	}

}
