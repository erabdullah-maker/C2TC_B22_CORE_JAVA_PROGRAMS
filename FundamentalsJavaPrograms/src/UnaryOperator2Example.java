
public class UnaryOperator2Example {

	public static void main(String[] args) {
	
		int namA=5;
		int namB=4;
		int namC=10;
		
		int namD = --namC + namB--; //(9[Predecrement Operator] + 4[Postdecrement Operator]);
		
		System.out.println(namD);
		

	}

}

//Output
// namD = 13