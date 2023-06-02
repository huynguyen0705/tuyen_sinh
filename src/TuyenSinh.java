import java.util.ArrayList;

public class TuyenSinh {
    ArrayList<ThiSinhKhoiA> DsKhoiA;
    ArrayList<ThiSinhKhoiB> DsKhoiB;
    ArrayList<ThiSinhKhoiC> DsKhoiC;
    ArrayList<ThiSinh> DsThiSinh;

    public TuyenSinh(){
        DsKhoiA = new ArrayList<>();
        DsKhoiB = new ArrayList<>();
        DsKhoiC = new ArrayList<>();
        DsThiSinh = new ArrayList<>();
    }
    public void ThemKhoiA(int soBaoDanh, String hoTen, String diaChi, String uuTien, String khoiThi){
        ThiSinhKhoiA thiSinhKhoiA = new ThiSinhKhoiA(soBaoDanh, hoTen, diaChi, uuTien, khoiThi);
        DsKhoiA.add(thiSinhKhoiA);
        System.out.println("thêm thành công");
    }
    public void ThemKhoiB(int soBaoDanh, String hoTen, String diaChi, String uuTien, String khoiThi){
        ThiSinhKhoiB thiSinhKhoiB = new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, uuTien, khoiThi);
        DsKhoiB.add(thiSinhKhoiB);
        System.out.println("thêm thành công");
    }
    public void ThemKhoiC(int soBaoDanh, String hoTen, String diaChi, String uuTien, String khoiThi){
        ThiSinhKhoiC thiSinhKhoiC = new ThiSinhKhoiC(soBaoDanh, hoTen, diaChi, uuTien, khoiThi);
        DsKhoiC.add(thiSinhKhoiC);
        System.out.println("thêm thành công");
    }
    public void HienThiThiSinhTheoTenKhoiA(String ten){
        ThiSinhKhoiA thiSinhKhoiA = null;
        for (int i = 0; i < DsKhoiA.size(); i++) {
            if (DsKhoiA.get(i).getHoTen().equals(ten)) {
                thiSinhKhoiA = DsKhoiA.get(i);
                break;
            }
        }
        if (thiSinhKhoiA == null) {
            System.out.println("không có người tên là: " + ten);
            return;
        }else {
            thiSinhKhoiA.HienThiKhoiA();
        }
    }
    public void HienThiThiSinhTheoTenKhoiB(String ten){
        ThiSinhKhoiB thiSinhKhoiB = null;
        for (int i = 0; i < DsKhoiB.size(); i++) {
            if (DsKhoiB.get(i).getHoTen().equals(ten)) {
                thiSinhKhoiB = DsKhoiB.get(i);
                break;
            }
        }
        if (thiSinhKhoiB == null) {
            System.out.println("không có người tên là: " + ten);
            return;
        }else {
            thiSinhKhoiB.HienThiKhoiB();
        }
    }
    public void HienThiThiSinhTheoTenKhoiC(String ten){
        ThiSinhKhoiC thiSinhKhoiC = null;
        for (int i = 0; i < DsKhoiC.size(); i++) {
            if (DsKhoiC.get(i).getHoTen().equals(ten)) {
                thiSinhKhoiC = DsKhoiC.get(i);
                break;
            }
        }
        if (thiSinhKhoiC == null) {
            System.out.println("không có người tên là: " + ten);
            return;
        }else {
            thiSinhKhoiC.HienThiKhoiC();
        }
    }
    public void TimKiemTheoSbd(int sbd){
        ThiSinh thiSinh = null;
        for (int i = 0; i < DsKhoiA.size(); i++) {
            if (DsKhoiA.get(i).getSoBaoDanh() == sbd) {
                thiSinh = DsKhoiA.get(i);
                break;
            }
        }
        if (thiSinh == null) {
            for (int i = 0; i < DsKhoiB.size(); i++) {
                if (DsKhoiB.get(i).getSoBaoDanh() == sbd) {
                    thiSinh = DsKhoiB.get(i);
                    break;
                }
            }
        }
        if (thiSinh == null) {
            for (int i = 0; i < DsKhoiC.size(); i++) {
                if (DsKhoiC.get(i).getSoBaoDanh() == sbd) {
                    thiSinh = DsKhoiC.get(i);
                    break;
                }
            }
        }
        if (thiSinh == null) {
            System.out.println("Khong tim thay thi sinh co so bao danh " + sbd);
        }else {
            thiSinh.HienThiThiSinh();
        }
    }
}
