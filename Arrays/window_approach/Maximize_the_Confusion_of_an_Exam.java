package window_approach;
public class Maximize_the_Confusion_of_an_Exam {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int Mcount = 0;
        char FV;
        int ptr1 = 0;
        int tempCount = 0;
    
        FV = 'T';
        for (int ptr2 = 0; ptr2 < answerKey.length(); ptr2++) {
            if (answerKey.charAt(ptr2) == FV)
                tempCount++;
    
            while (tempCount > k) {
                if (answerKey.charAt(ptr1) == FV)
                    tempCount--;
                ptr1++;
            }
            Mcount = Math.max(Mcount, ptr2 - ptr1 + 1);
        }
        
        FV = 'F';
        ptr1 = 0;
        tempCount = 0;

        for (int ptr2 = 0; ptr2 < answerKey.length(); ptr2++) {
            if (answerKey.charAt(ptr2) == FV)
                tempCount++;
    
            while (tempCount > k) {
                if (answerKey.charAt(ptr1) == FV)
                    tempCount--;
                ptr1++;
            }
            Mcount = Math.max(Mcount, ptr2 - ptr1 + 1);
        }
        return Mcount;
    }

    public static void main(String[] args) {
        Maximize_the_Confusion_of_an_Exam test1 = new Maximize_the_Confusion_of_an_Exam();
        String str = "FFFTTFTTFT";
        System.out.println(test1.maxConsecutiveAnswers(str, 3));
    }
}
