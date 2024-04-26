import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        int[] iArr = new int[n]; 
        for(int i=0; i< n; i++) {
        	iArr[i] = sc.nextInt();
        }
        
        int max = 1, min = 1000001;
        
        for(int i=0; i< n; i++) {
        	if(iArr[i] > max) {
        		max = iArr[i];        		
        	}
        	if(iArr[i] < min) {
        		min = iArr[i];        		
        	}
        }
        
        int a = min * max;
        System.out.println(a);
       
    }
    
}
