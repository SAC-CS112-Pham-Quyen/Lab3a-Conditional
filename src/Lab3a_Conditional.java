
import java.util.Scanner;

public class Lab3a_Conditional {

	public static void main(String[] args) {
			
				@SuppressWarnings("resource")
				Scanner input = new Scanner( System.in );
				
				int hungry =1;
				int drinking =2;
				
				System.out.print(" You are hungry.");
				
				System.out.print(" You want burger? 1= hungry  2=drinking ");
				
				hungry = input.nextInt();
				drinking = input.nextInt();
				
				
				
				if ((hungry ==1 ) && (drinking ==2 )){
					
					System.out.println( "hungry, eat more and drinking more " );
				}
				
				if ((hungry ==1 ) || (drinking ==1 )){
					
					System.out.println( "hungry, eat more or drinking less" );
				}
				
				System.out.println(" You had a good lunch");
				
	}

}