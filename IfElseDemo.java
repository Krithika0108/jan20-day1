
public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-10;
		if(num++>0) {
			System.out.println("+ve number");
		}
		else if(num++<0) {
			System.out.println("-ve number");
		}
		else if(num++ ==0) {
			System.out.println("zero number....");
		}
		System.out.println("num---->"+num);
		System.out.println("ends");

	}

}
