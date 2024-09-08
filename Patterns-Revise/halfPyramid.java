public class halfPyramid{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        for(int line = 1; line<=4;line++){
            for(int start = 1;start<=line; start++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}