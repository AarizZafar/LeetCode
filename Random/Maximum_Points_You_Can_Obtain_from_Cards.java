package Random;
public class Maximum_Points_You_Can_Obtain_from_Cards {
    public int maxScore(int[] cardPoints, int k) {
        int Msum = 0;
        int sum = 0;

        for(int ptr2=cardPoints.length-k;ptr2<cardPoints.length;ptr2++)
            sum += cardPoints[ptr2];

        Msum = sum;
        
        int ptr1 = cardPoints.length - k;
        for(int ptr2=0;ptr2<k;ptr2++){
            sum += cardPoints[ptr2] - cardPoints[ptr1++];
            Msum = Math.max(Msum,sum);
        }
        return Msum;
    }

    public static void main(String[] args){
        Maximum_Points_You_Can_Obtain_from_Cards test1 = new Maximum_Points_You_Can_Obtain_from_Cards();
        int[] cardPoints = {23,21,14,3,4,6,8,1,2,20,12};
        int k = 5;
        System.out.println(test1.maxScore(cardPoints, k));

    }
    
}
