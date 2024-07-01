package oops;
	class Pen{
		String color;
		int tip;
		void setColor(String newColor) {
			color = newColor;
		}
		void setTip(int newTip) {
			tip = newTip;
		}
	}
	class Student{
		String name;
		int age;
		float percentage;
		void calcPercentage(int phy, int che, int math){
			percentage=(phy + che + math)/3;
			
		}
		void setname(String newname) {
			name = newname;
		}
		void setage(int newage) {
			age = newage;
		}
	}
	
	public class ClassNObject {

		public static void main(String[] args) {
			
			
			Pen p1 = new Pen();
			p1.setColor("blue");
			System.out.println(p1.color);
			p1.setTip(5);
			System.out.println(p1.tip);
			Student s1 = new Student();
			s1.setage(25);
			System.out.println(s1.age);
			s1.setname("Avinash");
			System.out.println(s1.name);
			s1.calcPercentage(80,90,85);
//			System.out.print(s1.calcPercentage(80,85,90));
//			System.out.println(s1.calcPercentage(80,90,85));
		}

		}



	