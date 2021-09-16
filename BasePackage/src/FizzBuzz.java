public class FizzBuzz {
    public static void main (String[] args){
        System.out.println("Hello anything");
        countTo100();
    }
    public static void countTo100(){
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
