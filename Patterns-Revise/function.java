public class function {

    public static void PrinHello() {
        System.out.println("Hello Sumit");
    }

    public static int SumofTwo(int a, int b) {
        int add = a + b;
        return add;
    }

    public static void Isprime(int n) {
        boolean isPrime = true;
      for(int i =2;i<Math.sqrt(n);i++){
        if (n % 2 == 0) {
            isPrime = false;
            break;
           

        }
      }


      if(isPrime){
        System.out.println("Number is Prime");
      }else{
        System.out.println("Number is not Prime");
      }
    }

    public static void main(String args[]) {
        PrinHello();

        int sum = SumofTwo(10, 13);
        System.out.println(sum);

        Isprime(20);
    }

}
