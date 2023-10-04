public class Divisable {
    public static void main(String[] args) {
        int i;
        int foundAnswers = 0;
        int sum = 0;
        for(i = 0; foundAnswers < 10; i++){
            if(((i % 3) == 0) && ((i % 5) == 0) && i != 0){
                foundAnswers++;
                sum += i;
            }
        }
        System.out.println(sum);
        
        int i2 = 0;
        int foundAnswers2 = 0;
        int sum2 = 0;
        while (foundAnswers2 < 10){
            if(((i2 % 3) == 0) && ((i2 % 5) == 0) && i2 != 0){
                foundAnswers2++;
                sum2 += i2;
            }
            i2++;
        }
        System.out.println(sum2);
        
    }
}
