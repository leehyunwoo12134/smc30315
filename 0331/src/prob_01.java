import java.util.Scanner;

class Grade {
	int math=0;
	int science=0;
	int english=0;
	
	public void average() {
		System.out.println("평균:" +(math+science+english)/3);
		}
	
}


public class prob_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Grade me = new Grade();
		
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		
		me.math = sc.nextInt();
		me.science = sc.nextInt();
		me.english = sc.nextInt();
		
		me.average();
	}

}
