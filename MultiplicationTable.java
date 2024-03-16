import java.util.Scanner;
class MultiplicationTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter anumber : ");
		int x =input.nextInt();
		System.out.print("*  | ");
		
		for(int j=1 ;j<=x;j++){
			
			System.out.print(j+" ");
			
			}
		System.out.println();
		for(int a=0 ; a<=x ;a++){
			System.out.print("---");
			}
		
			System.out.println();
		for (int i=1; i<=x;i++ ){
			System.out.print(i+" |  ");
			for (int k=1 ;k<=x;k++){
				
				
				int m = i*k;
				System.out.print(m +"  ");
				}System.out.println();
			
			}

		}}
