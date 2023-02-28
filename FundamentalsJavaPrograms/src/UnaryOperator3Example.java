
public class UnaryOperator3Example {

	public static void main(String[] args) {

     int namA=5;
     int namB=0;
     int namC=7;
     
     int namD = --namC + namB; //(6[Predecrement Operator] + 0[Postdecrement Operator])
     
     System.out.println(namD);

	}

}

//Output
// namD = 6