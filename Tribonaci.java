import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(),a=0,b=1,c=1,d=0;
		System.out.print(a+" "+b+" "+c+" ");
		while(n>3){
			d=a+b+c;
			System.out.print(d+" ");
			a=b;
			b=c;
			c=d;
			n--;
		}
		
	}
}