/*
1. �������ϴ� ����� ����ϴ� Ŭ���� 

   1) ����, ����, ���� ������ �μ��޾� ������ ���Ͽ�
      ������ �����ϴ� �޼ҵ� �ۼ�
      (���������� private)

   2) ������ ������� �μ��ι޾� ����� ���Ͽ�
      ����� �����ϴ� �޼ҵ� �ۼ� 
      (���������� private)

   3) ����� �μ��� �޾� ����� ���Ͽ� ����� �������ִ�
       �޼ҵ� �ۼ��Ѵ�(���������� private)
   
   4) �̸�, ����, ����, ���� ������ �μ��� �޾�
      ���� , ��� ,��� �� ���Ͽ� �� ����� ȭ�鿡 ����ϴ�
      �޼ҵ带 �����ϼ���.
      (���������� public,
       ������ ��� , ����� �̹� ������� 1) , 2) ,3) �޼ҵ带 ȣ��
       �Ͽ� �� ����� ���� ���´�)
---------------------------------------------
2. ���� �޼ҵ尡 �ִ� Ŭ������ �����Ѵ�.
   ���� �޼ҵ带 �ۼ��Ͽ� �� �ȿ���
   ���� 1���� ���� �޼ҵ��� ������ ����ϴ� �޼ҵ带 ȣ���Ͽ�
   ��������� Ȯ���Ѵ�.
   ����)  
     ����,����,���� ,�̸��� Ű���� �Է��� �޴´�.

-------------------------------------------

   nextInt() -> nextInt() -> next() --����

   nextInt() -> nextInt() -> nextLine() -- ��������


  nextLine() -> nextLine() -> nextLine() -- ����

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
       //����
	    int result = this.total(kor,eng,math);

	   //���
		int ave = (int)(this.average(result,3));
	   
	   //���
		String score = this.grade(ave);

		System.out.println(name+" ���� : "+result+" ��� : "+ave+" ���� : "+score);
	}



	 public static void main(String[] args) {
	  int kor = (int)((Math.random()*56)+45);
	  int eng = (int)((Math.random()*56)+45);
	  int math= (int)((Math.random()*56)+45);
	  MoreGrade tot = new MoreGrade();
	  tot.reportCard("jwLee",kor, eng, math);
	 }

	}


   
  

