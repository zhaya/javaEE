import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String [] args){
		ArrayList<String> li = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		long a,b,c;
		int num = scan.nextInt();
		int i = 1;
		while(num > 0){
			a = scan.nextLong();
			b = scan.nextLong();
			c = scan.nextLong();
			if((a+b) > c){
				li.add("true");
			}else{
				li.add("false");
			}
			num--;
		}
		for(String str:li){
			System.out.println("Case #"+i+": "+str);
			System.out.println("");
			i++;
		}
	}
}
