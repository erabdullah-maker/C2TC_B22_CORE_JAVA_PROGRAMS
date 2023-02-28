
public class UnaryOperator4Example {

	public static void main(String[] args) {

    int namA=5;
    int namB=31;
    int namC=17;
    
    int namD = --namC + namB--; //(16[Predecrement Operator] + 31[Postdecrement Operator])
     System.out.println(namD);
     
	}

}

//Output
// namD = 47