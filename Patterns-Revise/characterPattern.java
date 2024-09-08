public class characterPattern {
    public static void main(String[] args) {

        char currchar= 'A';
        
        for(int line = 1;line<=4;line++){
            for(int star = 1;star<=line;star++){
                System.out.print(currchar + " ");
                currchar++;
            }
            System.out.println();
        }
    }
    
}
