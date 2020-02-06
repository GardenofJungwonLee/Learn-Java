/*
   1. 성적표기능을 만들 클래스를 선언하고 메인메소드 작성한다.
   2. 메인메소드안에서 하는 일
       - 본인 이름(String)을 저장할 변수를 선언한다.
       - 국어(int),영어(int),수학(int) 점수(를 저장할 변수를 선언한다.
       - 총점(int), 평균(double), 학점(char)을 저장할 변수를 선언한다.

       - 선언된 국어, 영어, 수학 변수에 45 ~ 100사이의 난수를 발생하여 저장한다)
       - 국어, 영어, 수학점수을 총점을 구하여 총점 변수에 저장한다.
       - 총점을 가지고 평균을 구하여 평균 변수에 저장한다.

       - 평균이 90이상이면 학점을 A  
                80~89사이 이면 B
                70~79사이 이면 C
                60~69사이 이면 D
                60미만 이면 F

           * if문 , switch문 두가지 방법 모두 사용한다.

       - 평균을 출력할대 소수점 2자리까지만 출력한다(함수사용안됨)             

       - 이름 , 국어점수, 영어점수, 수학점수, 총점,평균, 학점을 예쁘게 출력해본다.

*/

   class UpGrade {
      public static void main(String []args){
      String name = "Leejugnwon";
      int eng = (int)(Math.random()*56)+45;//주어진 100을 맞춰서 random값 설정하기
      int kor = (int)(Math.random()*56)+45;
      int math = (int)(Math.random()*56)+45;      
      
      int tot = (eng+kor+math);
      double avg = (double)(tot/3.00);
      char grade;
      
      if (avg>=90){
         grade = 'A';
      } else if (avg>=80){
         grade = 'B';
      } else if (avg>=70){
         grade = 'C';
      } else if (avg>=60){
         grade = 'D';
      } else {
         grade = 'F';
      } 
	   System.out.println("if문으로 구한 학점= "+grade);

	char swigrade;
	int newavg = (int) (tot / (3.00));
	int swiavg = newavg / 10;
	switch (swiavg) {
	case 10:
	case 9:
		swigrade = 'A';
		break;
	case 8:
		swigrade = 'B';
		break;
	case 7:
		swigrade = 'C';
		break;
	case 6:
		swigrade = 'D';
		break;
	default:
		swigrade = 'F';
		break;
	}
	System.out.println("switch문으로 구한 학점 = " + swigrade);

      }

   }








