import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		int num=sc.nextInt(),temp=num,sum=0,c=0,rem=0;
		while(num>0){
			c++;
			num/=10;
		}
		num=temp;
		while(num>0){
			rem=num%10;
			sum+=(int)Math.pow(rem,c);
			num/=10;
		}
		System.out.println(temp==sum?"Armstrong":"Not a Armstrong");
	}
}