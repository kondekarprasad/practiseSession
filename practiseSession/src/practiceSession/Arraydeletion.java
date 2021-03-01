package practiceSession;import pattern.Test1;

public class Arraydeletion {
	

	private void m1() {
		int k=1;
		char[] charArray = {'a','s','d','f','g','h','j','k','h','g','g'};
		for (int i = 0; i < charArray.length-3; i++) {
			char[] temp = new char[charArray.length-k];
			temp[i]=charArray[i];
			System.out.print(temp);
			}
		
	}
	public static void main(String[] args) {
		new Arraydeletion().m1();
	}


}
