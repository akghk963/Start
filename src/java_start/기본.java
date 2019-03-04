package java_start;

import java.util.Scanner;

public class 기본 {

	public static void main(String[] args) {
		
} 
	}
		
/** 			SWitch문(사계절);
		Scanner scan = new Scanner(System.in);
	  
	  System.out.print("월(1~12)을 입력하시오: ");
	    int month = scan.nextInt();
	    switch(month) {
	     case 3: case 4: case 5:
	    	 System.out.println("봄 입니다.");
	    break;
	     case 6: case 7: case 8:
	    	 System.out.println("여름 입니다.");
	    	 break;
	     case 9: case 10: case 11:
	    	 System.out.println("가을 입니다.");
	    	 break;
	     case 12: case 1: case 2:
	    	 System.out.println("겨울 입니다."); break;
	    	 default:
	    	 System.out.println("잘못 입력하셨습니다.");
	    scan.close();
} **/

/** 		중첩 if-else(4학년은70점 미만이면 불합격)
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scan.nextInt();
		System.out.print("학년을 입력하세요(1~4): ");
		int year = scan.nextInt();
		
		if(score>=60) {
		  if(year!=4)
			 System.out.println("합격!"); 
		  else if(score>=70)
			 System.out.println("합격!"); //4학년이 아니면 합격
		  else
			 System.out.println("불합격!"); //4학년이 70점 미만이면 불합격
		}else {
			 System.out.println("뷸합격!");
		}
			scan.close();
**/
		
/** 		다중if-else(점수로 학점구하기)
	char good;	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("점수를 입력하세요(0~100): ");
	int score =scan.nextInt(); 
	
	if(score>=90) {
	good = 'A';
	}else if(score>=80) {
	good = 'B';
   }else if(score>=70) {
	good = 'C';
   }else if(score>=60) {
	good = 'D';
   }else {
	good = 'F';
   }
   
	System.out.println("학점은 " + good + "입니다.");
	scan.close();
**/	

/** 	if else문(20대인지 아닌지)
  Scanner scan = new Scanner(System.in);
	
	System.out.print("나이를 입력하시오 : ");
	int age = scan.nextInt();
	if((age>=20) && (age<30)) { 
	System.out.println("20대 입니다.");	
	 }else {
	System.out.println("20대가 아닙니다.");
	 }
	scan.close();
	}
} **/

		/**	Scanner를 이용한 키 입력 연습(19-03-04)
	    System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		String city = scan.next();
		System.out.println("당신 도시는  " + city + "입니다.");
		
		int age = scan.nextInt();
		System.out.println("당신 나이는  " + age + "살 입니다.");
		
		double weight = scan.nextDouble();
		System.out.println("당신 몸무게는  " + weight + "kg입니다.");
		
		boolean single = scan.nextBoolean();
		System.out.println("당신 독신 여부는  " + single + "입니다.");
		
		
		scan.close(); **/