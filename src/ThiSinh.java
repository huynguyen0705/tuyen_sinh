public class ThiSinh {
    private int SoBaoDanh;
    private String HoTen;
    private String DiaChi;
    private String UuTien;
    private String KhoiThi;

    public String getKhoiThi() {
        return KhoiThi;
    }

    public void setKhoiThi(String khoiThi) {
        KhoiThi = khoiThi;
    }

    public int getSoBaoDanh() {
        return SoBaoDanh;
    }

    public void setSoBaoDanh(int soBaoDanh) {
        SoBaoDanh = soBaoDanh;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getUuTien() {
        return UuTien;
    }

    public void setUuTien(String uuTien) {
        UuTien = uuTien;
    }
    public void HienThiThiSinh(){
        System.out.println("số báo danh: " + getSoBaoDanh());
        System.out.println("họ tên: " + getHoTen());
        System.out.println("địa chỉ: " + getDiaChi());
        System.out.println("ưu tiên: " + getUuTien());
        System.out.println("Khối thi: " + getKhoiThi());
    }
}
