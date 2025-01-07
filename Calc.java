class Calculator{
	void sub(int a, int b){
		System.out.println(a-b);
	}

	public static void main(String args[]){
		int a = 10, b = 5;
		add(a, b);
		sub(a, b);
		mul(a, b);
		div(a, b);
	}
}