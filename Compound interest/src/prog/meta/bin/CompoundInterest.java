package prog.meta.bin;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Double amount;
double principle=10000;
double rate = 0.01;
for(int day=1;day<=20;day++){
	amount=principle*Math.pow(1+rate, day);
	System.out.println(day+" "+amount);
}
	}

}
