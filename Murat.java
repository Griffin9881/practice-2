public class Murat {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        num2 = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num1);
            num1+=num2;
            System.out.println(num2);
            num2+=num1;
        }
    }
}
