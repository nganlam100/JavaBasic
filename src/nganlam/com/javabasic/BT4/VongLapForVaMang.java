package nganlam.com.javabasic.BT4;

public class VongLapForVaMang {
    public static void main(String[] args){
        for (int i = 0; i <= 50; i++){
             if (i % 2 == 0){
                 //System.out.println(i);
                 int []array = {i};
                 for(int y : array){
                     System.out.println("Cac phan tu trong mang: " + y);
                 }
             }
        }
    }
}
