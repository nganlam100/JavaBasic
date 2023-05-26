package nganlam.com.javabasic.BT5;

import java.util.ArrayList;
import java.util.List;

public class BTArrayList {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i ++){
            if(i % 2 == 0){
                ArrayList<Integer> listSoChan = new ArrayList<Integer>();
                listSoChan.add(i);
                for (int y = 0; y < listSoChan.size(); y++){
                    System.out.println(listSoChan.get(y));
                }
            }
        }
        BTArrayList arrayList = new BTArrayList();
        arrayList.ThongTinNhanVien();

    }
    public void ThongTinNhanVien(){
        String tenNV = "Nguyen Van Teo";
        String diachiNV = "234 duong so 5";

        List<String> nhanvienList = new ArrayList<String>();
        nhanvienList.add(tenNV);
        nhanvienList.add(diachiNV);

        for (String thongtinNV : nhanvienList){
            System.out.println(thongtinNV);
        }

    }
}
