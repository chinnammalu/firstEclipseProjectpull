package java8practice;

public class Patterns {

	public static void main(String[] args) {
		
		int n=5;
		
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=n;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for(int i=n;i>0;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(char c='A';c<='Z';c++) {
			System.out.print(c);
		}
		int fact=1;
		int i=1;
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println("fact...."+fact);
		*/
		boolean isprime=false;
		int num=100;
		for(int i=2;i<=num;i++) {
			
			for(int j=2;j<=num/2;j++) {
				isprime=true;
				if(i%j==0) {
					isprime=false;
					break;
				}
				if(isprime==true) {
					System.out.println(i);
				}
			}
			
			
			
		}
		
		
		
		
		
		
		
	}

}
