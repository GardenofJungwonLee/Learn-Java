/*
3. �޼ҵ����
   ���� : 
     �ΰ��� ������ �����ȣ(+, -,*,/,%)�� 
     ���� �޾Ƽ�(�μ�) ���޵� �����ȣ�� ���� �μ��� �����Ͽ� 
     ����� ����ϴ� �޼ҵ�� �̸޼ҵ带ȣ���ϴ� 
     ���θ޼ҵ带 �����غ�����.
    (���� : 
�����ȣ�� (+, -,*,/,%) �̿��� ���� ������ 
     �����޽��� ����Ѵ�. )

	 
	 */

class Calcular{	
	public static void main (String []args){
		Calcular calc = new Calcular();
		calc.run(2,'*',2);
	 }

	void run(int a , char ch, int b) {
		switch (ch)
		{
		case '+' : System.out.println(a+b);break;
		case '-' : System.out.println(a-b);break;
		case '*' : System.out.println(a*b);break;
		case '/' : System.out.println(a/b);break;
		case '%' : System.out.println(a%b);break;
		default: System.out.println("�ùٸ� ����� �ƴմϴ�!");
		}
	}
}
	 