package calc;

public class CalculatorMain {
	public CalculatorMain(){
		}
	public int add(int a, int b){
		return a+b;
	}
	public int Sub(int a, int b) {
		return a-b;
        
	}
        public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		if(b==0) {
			return 0;
		}
		else {
			return a/b;
		}
	}
		public Object Square(int a) {
		return a*a;
	}
	public Object fact(int a) {
		// TODO Auto-generated method stub
		return a*(a-1);
	}
}
