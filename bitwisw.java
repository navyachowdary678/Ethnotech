import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>250){
            System.out.println(n-250);
        }
        else{
            System.out.println("don't pay");
        }
        
	}
}