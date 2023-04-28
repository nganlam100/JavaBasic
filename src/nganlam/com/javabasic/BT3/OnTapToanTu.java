package nganlam.com.javabasic.BT3;

public class OnTapToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        //Toan Tu Quan he & Logic
        boolean checkValue = (a != b) || (b == c);
        boolean checkValue1 = (b > a) && (a > c);
        boolean checkValue2 = (a >= b) || (a <= c);

        System.out.println(checkValue);
        System.out.println(checkValue1);
        System.out.println(checkValue2);

        //Toan Tu Dieu Kien
        String checkValue3 = (b % a == 0) ? "b chia het cho a" : "b khong chia het cho b";
        String checkValue4 = (c % b == 0) ? "c chia het cho b" : "c khong chia het cho b";

        System.out.println(checkValue3);
        System.out.println(checkValue4);

        //Toan Tu gan
        int d,e;
        d = a;
        e = c;

        System.out.println("d = " + d);
        System.out.println("e = " + e);

        //Toan Tu So Hoc
        int x = a + b * c; //10+20*15
        int y = (a + b) * c;
        int z = b / a + c;
        int w = b / (c - a);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);

    }
}