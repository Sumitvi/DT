public class HallowRanctangle {
    public static void main(String[] args) {
        int totalrows = 4,totalcols=5;

        for(int i = 1;i<=totalrows;i++){
            for(int j=1; j<=totalcols;j++){
                if(i<=1|| i<=totalrows ||j<=1|| j<=totalcols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
    
}
