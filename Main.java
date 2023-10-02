public class Main {

    public static void main(String[] args) {
        int numbers = 20;
        int i;
        int lastnumber = 0;
        int k = 1;
        for(i = 0; i <= ((numbers/2)-1); i++){
            System.out.print(lastnumber + ", ");
            lastnumber += k;
            if(i == 9){
            System.out.println(k);
            break;
            } else {
                System.out.print(k + ", ");
                k += lastnumber;
            }
        }
        int numbers2 = 20;
        int i2 = 0;
        int lastnumber2 = 0;
        int k2 = 1;
        while (i2 <= ((numbers2/2)-1)) {
            System.out.print(lastnumber2 + ", ");
            lastnumber2 += k2;
            if (i2 == 9){
                System.out.println(k2);
                break;
            } else{
            System.out.print(k2 + ", ");
            k2 += lastnumber2; 
            i2 ++;
            }
        }

        int numbers3 = 20;
        int i3 = 0;
        int lastnumber3 = 0;
        int k3 = 1;
        do {
            System.out.print(lastnumber3 + ", ");
            lastnumber3 += k3;
            if(i3 == 9){
                System.out.println(k3);
                break;
            } else{
            System.out.print(k3 + ", ");
            k3 += lastnumber3; 
            i3 ++;
            }
        } while (i3 <= ((numbers3/2)-1));
    }
}
