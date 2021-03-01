package practiceSession;

public class DivisibilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisibilityTest name = new DivisibilityTest();
		name.m1();

	}
	 void m1() {
		 for (int i = 1; i < 12; i++) {
			 if(i%3==0 && i%2==0) {
				 System.out.println(i +" is /2 & /3");
			 }
			 else if(i%2==0) {
				 System.out.println( i+" is /2");
			 }
			 else if(i%3==0) {
				 System.out.println( i+" is /3");
			 }
			 else {
				 System.out.println(i+" imposible");
			 }
			
			
		}
		
	}

}
