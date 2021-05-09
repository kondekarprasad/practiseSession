package pattern;

public class DiamondWithSpace {

	public static void main(String[] args) {
		new DiamondWithSpace().m1();
	}

	private void m1() {
		// outer increment inner decreament
		for (int i = 0; i < 7; i++) {
			System.out.println();
			for (int j = 7; j>0; j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print("*"+" ");

				}
			}
		}
		for (int i = 0; i < 7; i++) {
			System.out.println();
			for (int j = 0; j <7; j++) {
				if (i>j) {
					System.out.print(" ");
					
				}else {
					System.out.print("*"+" ");

				}
			}
		}
	}

	private void elseif(boolean b) {
		// TODO Auto-generated method stub

	}

}
