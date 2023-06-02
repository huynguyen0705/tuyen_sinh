public class ThiSinhKhoiB extends ThiSinh{

    public ThiSinhKhoiB(int soBaoDanh, String hoTen, String diaChi, String uuTien, String khoiThi) {
        setSoBaoDanh(soBaoDanh);
        setHoTen(hoTen);
        setDiaChi(diaChi);
        setUuTien(uuTien);
        setKhoiThi(khoiThi);
    }
    public void HienThiKhoiB(){
        System.out.println("số báo danh: " + getSoBaoDanh());
        System.out.println("họ tên: " + getHoTen());
        System.out.println("địa chỉ: " + getDiaChi());
        System.out.println("ưu tiên: " + getUuTien());
        System.out.println("khối thi: " + getKhoiThi());
    }
}
