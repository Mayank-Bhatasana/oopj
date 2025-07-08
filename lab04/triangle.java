class triangle {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int flag = 0;
		if (a + b > c || a + c > b || b + c > a) {
			flag = 1;
		}

		if (flag==1) {
			if (a == b && b == c) {
				System.out.println("It's equilateral triangle");
			} else if (a == b || b == c || a == c) {
				System.out.println("It's isosceles triangle");
			} else if(a != b && b != c && a != c){
				System.out.println("It's scalene triangle");
			}
			
			if ( a*a == b*b + c*c || b*b == a*a + c*c  || c*c == b*b + a*a ){
				System.out.print("It's right-angled triangle");
			}
		}

	}
}