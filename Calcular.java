/*
3. 메소드과제
   문제 : 
     두개의 정수와 연산기호(+, -,*,/,%)를 
     전달 받아서(인수) 전달된 연산기호에 따라 두수를 연산하여 
     결과를 출력하는 메소드와 이메소드를호출하는 
     메인메소드를 정의해보세요.
    (조건 : 
연산기호가 (+, -,*,/,%) 이외의 값이 들어오면 
     오류메시지 출력한다. )

	 
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
		default: System.out.println("올바른 계산이 아닙니다!");
		}
	}
}
	 