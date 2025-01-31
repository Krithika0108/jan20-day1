import java.util.Scanner;

public class CountNotes {

	public static void main(String[] args) {
		// Write a program to count total number of notes in given amount
		
		//10
		//1 2 5 10
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount to return");
		int rupees=sc.nextInt();
		//58
		int notes10=0,coin5=0,coin2=0,coin1=0;
		if(rupees>10) {
			notes10=rupees / 10;//5 of 10
			rupees=rupees % 10;//8
		}
		if(rupees>5) {
			coin5= rupees / 5;
			rupees=rupees % 5;
		}
		if(rupees>2) {
			coin2=rupees / 2;
			rupees=rupees % 2;
		}
		if(rupees==1) {
			coin1=rupees/1;
		}
		System.out.println("10 Notes--->"+notes10);
		System.out.println("5 coins--->"+coin5);
		System.out.println("2 coin--->"+coin2);
		System.out.println("1 coin--->"+coin1);
	}

}
