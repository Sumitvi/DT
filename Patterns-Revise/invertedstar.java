import java.util.Scanner;

public class invertedstar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int line = 1;line<=n;line++){
           for(int start = 1;start<=(n-line+1);start++){
                System.out.print("*");
           }
           System.out.println();
        }
    }
    
}
