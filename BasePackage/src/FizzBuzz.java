public class FizzBuzz {
    public static void main(String[] args) {
        int MaxNum = 255;
        CaseFactory Fizz = new CaseFactory(3, "Fizz");
        CaseFactory Buzz = new CaseFactory(5, "Buzz");
        CaseFactory Bang = new CaseFactory(7, "Bang");
        CaseFactory Bong = new CaseFactory(11, "Bong");
        CaseFactory Fezz = new CaseFactory(11, "Fezz");
        countTo(Fizz, Buzz, Bang, Bong);
    }


    public static void countTo(CaseFactory fizz, CaseFactory Buzz, CaseFactory Bang, CaseFactory Bong) {
        for (int i = 1; i < 256+1; i++) {
            String result = "";
            result = fizz.checkCondition(result, i);
            result = Buzz.checkCondition(result, i);
            result = Bang.checkCondition(result, i);
            System.out.println(
                    result.isEmpty() ? i : result
            );
        }

    }

    public static void askUserMaxNum() {

    }


}
