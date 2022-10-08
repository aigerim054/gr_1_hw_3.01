public class Main {
    public static void main(String[] args){
            double[] numbers = {2.0,-3.3,-9.0,4.3,5.4,1.2,-6.1,3.5,7.6,8.8,-6.7,10.0,-2.1,9.1,3.9};
            double count = 0.0;
            double counter = 0.0;
            for (double i: numbers){
                counter ++;
                count +=i;
                if (i <= 0){
                    count = 0;
                    counter = 0;
                    continue;
                }
            }
            System.out.println(count/counter);

        }}


