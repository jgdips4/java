public class oneto100even {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //count all the even numbers from 1 to 100
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Total even numbers from 1 to 100: " + count);





    }

}