package Lesson2;

public class Raznoe {
    private static int power (int base, int sign){
        int result = 1;
        for (int i = 0; i<sign; i++) {
            result = result * base;
        }
        return result;
    }

    private static void pifagor( int width, int height){
        for (int i =1; i <= height; i++) {
            for (int j = 1; j <= width; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //System.out.println(power(2,10));
        pifagor(10,10);
    }
}
