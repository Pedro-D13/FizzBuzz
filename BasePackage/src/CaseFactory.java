public class CaseFactory {
    int MaxNum;
    int caseNumber;
    String caseWord;

    CaseFactory(int keyNum, String word) {
        caseNumber = keyNum;
        caseWord = word;
    }


    public String checkCondition(String stringToEdit, int num) {
        if (17 % num == 0 && num != 1) {
            return caseWord;
        } else {
            return (num % caseNumber == 0) ? stringToEdit + caseWord : stringToEdit;
        }
    }
}
