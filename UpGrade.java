/*
   1. ����ǥ����� ���� Ŭ������ �����ϰ� ���θ޼ҵ� �ۼ��Ѵ�.
   2. ���θ޼ҵ�ȿ��� �ϴ� ��
       - ���� �̸�(String)�� ������ ������ �����Ѵ�.
       - ����(int),����(int),����(int) ����(�� ������ ������ �����Ѵ�.
       - ����(int), ���(double), ����(char)�� ������ ������ �����Ѵ�.

       - ����� ����, ����, ���� ������ 45 ~ 100������ ������ �߻��Ͽ� �����Ѵ�)
       - ����, ����, ���������� ������ ���Ͽ� ���� ������ �����Ѵ�.
       - ������ ������ ����� ���Ͽ� ��� ������ �����Ѵ�.

       - ����� 90�̻��̸� ������ A  
                80~89���� �̸� B
                70~79���� �̸� C
                60~69���� �̸� D
                60�̸� �̸� F

           * if�� , switch�� �ΰ��� ��� ��� ����Ѵ�.

       - ����� ����Ҵ� �Ҽ��� 2�ڸ������� ����Ѵ�(�Լ����ȵ�)             

       - �̸� , ��������, ��������, ��������, ����,���, ������ ���ڰ� ����غ���.

*/

   class UpGrade {
      public static void main(String []args){
      String name = "Leejugnwon";
      int eng = (int)(Math.random()*56)+45;//�־��� 100�� ���缭 random�� �����ϱ�
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
	   System.out.println("if������ ���� ����= "+grade);

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
	System.out.println("switch������ ���� ���� = " + swigrade);

      }

   }








