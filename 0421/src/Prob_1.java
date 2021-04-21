import java.util.Scanner;

public class Prob_1 {

		public static void main(String[] args) {
			
			int a;
			int b;
			int sum=0;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("시작 숫자 :");
			a = sc.nextInt();
			System.out.println("끝 숫자 :");
			b = sc.nextInt();
			
			for(int i=a;i<b;i++){
				sum+=i;
			}
			
			System.out.println(a + "부터 " + b + "까지의 합은 " + sum);
			}
			
		}
