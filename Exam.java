package practice;

public class Exam {
	public void unit() {
		int day=2;
		
		
		switch (day) {
		case 1: System.out.println("Monday");
			
			break;
		case 2: System.out.println("Tuesday");
		break;

		default: System.out.println("Select any value between 1 AND 2");
			break;
		}

		
	}
	public static void main(String[] args) {
		Exam e = new Exam();
		e.unit();
	}

}
