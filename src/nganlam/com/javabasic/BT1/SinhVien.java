package nganlam.com.javabasic.BT1;

public class SinhVien {
    public int tuoiSV = 20; //bien instance

    public static String diaChiSV = "123 Truong Chinh"; //bien static

    public void TenSV(){
        String tenSV = "Nguyen Van A"; //bien local
        System.out.println(tenSV);
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        sv.TenSV();

        System.out.println(sv.tuoiSV);
        System.out.println(diaChiSV);

        System.out.println(ThongTin.namSinhSV);
        System.out.println(ThongTin.sdtSV);

    }
}
