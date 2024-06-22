import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt(),max=0,s_max=0,temp=num,rem=0; 
	while(num>0){
		rem=num%10;
		if(rem>max)
			max=rem;
		num/=10;		
		}
	System.out.println(max);
	num=temp;
	while(num>0){
		rem=num%10;
		if(rem<max){
			if(rem>s_max)
				s_max=rem;
			}
		num=num/10;	
		}
	System.out.println(s_max);
	}
	
}