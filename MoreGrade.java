/*
1. 성적구하는 기능을 담당하는 클래스 

   1) 국어, 영어, 수학 점수를 인수받아 총점을 구하여
      총점을 리턴하는 메소드 작성
      (접근제한자 private)

   2) 총점과 과목수를 인수로받아 평균을 구하여
      평균을 리턴하는 메소드 작성 
      (접근제한자 private)

   3) 평균을 인수로 받아 등급을 구하여 등급을 리턴해주는
       메소드 작성한다(접근제한자 private)
   
   4) 이름, 국어, 영어, 수학 점수를 인수로 받아
      총점 , 평균 ,등급 을 구하여 그 결과를 화면에 출력하는
      메소드를 선언하세요.
      (접근제한자 public,
       총점과 평균 , 등급은 이미 만들어진 1) , 2) ,3) 메소드를 호출
       하여 그 결과를 통해 얻어온다)
---------------------------------------------
2. 메인 메소드가 있는 클래스를 선언한다.
   메인 메소드를 작성하여 그 안에서
   위의 1에서 만든 메소드중 성적을 출력하는 메소드를 호출하여
   성적결과를 확인한다.
   조건)  
     국어,영어,수학 ,이름은 키보드 입력을 받는다.

-------------------------------------------

   nextInt() -> nextInt() -> next() --정상

   nextInt() -> nextInt() -> nextLine() -- 비정상동작


  nextLine() -> nextLine() -> nextLine() -- 정상

*/


public class MoreGrade {
	 private int total(int a, int b, int c) {
	  int result =  a+b+c;
	  return result;
	 }
	
	private double average(int sum, int count) {
	 double result =(int)(sum/(double)count)*100/100.0;
	 return result;
	}
	
	private String grade(int a){
		String level;
		if (a>=90){	
			level = "A";
		}else if(a>=80){
			level = "B";
		}else if(a>=70){
			level = "C";
		}else if (a>=60){
			level = "D";
		}else{
			level = "F";
		}
			return level;		
		}
	

	public void reportCard(String name, int kor, int eng, int math){	
       //총점
	    int result = this.total(kor,eng,math);

	   //평균
		int ave = (int)(this.average(result,3));
	   
	   //등급
		String score = this.grade(ave);

		System.out.println(name+" 총점 : "+result+" 평균 : "+ave+" 학점 : "+score);
	}



	 public static void main(String[] args) {
	  int kor = (int)((Math.random()*56)+45);
	  int eng = (int)((Math.random()*56)+45);
	  int math= (int)((Math.random()*56)+45);
	  MoreGrade tot = new MoreGrade();
	  tot.reportCard("jwLee",kor, eng, math);
	 }

	}


   
  

