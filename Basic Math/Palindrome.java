
import java.util.Scanner;
public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dup = n;
		int revNum = 0;
		while(n>0){
			int ld = n%10;
			revNum = (revNum*10) + ld;
			n = n/10;
		}
		if(dup==revNum){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

		
	}
}
