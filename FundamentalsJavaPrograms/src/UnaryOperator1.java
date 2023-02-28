
public class UnaryOperator1 {

	public static void main(String[] args) {

     int namA=5;
     int namB=10;
     int namC=0;
     
     int namD = --namC + namB--; //(-1[Predecrement Operataor] + 10only[Postdecrement Operator]);
   
     System.out.println(namD);

	}

}
 //Output
// namD = 9