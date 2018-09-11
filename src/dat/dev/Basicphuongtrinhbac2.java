package dat.dev;

public class Basicphuongtrinhbac2 {
	public  static void main(String[] agrs) {
		float a = 2;
		float b = 6;
		float c = 3;
		float x1,x2;
		float delta = (b*b)-(4*a*c);
		if(a==0) {
			if(b==0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			else {
				System.out.println("Phuong trinh co mot nghiem: x = "+(-c/b));
			}
			return;
		}
		if(delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
			x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
			System.out.println("Phuong trinh co nghiem la "+"x1 = "+x1+" va x2 = "+x2);
		} else if (delta==0) {
			x1 = (-b/(2*a));
			System.out.println("Phuong trinh co nghiem kep: "+"x1 = x2 = "+x1);
		}else {
			System.out.println("Phuong trinh vo nghiem");
		}
	
		
		
		
	}

}
