import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();
        while (isRunning){
            try {
                System.out.println("Quản lý thí sinh");
                System.out.println("1. Nhập thông tin các thí sinh");
                System.out.println("2. Hiển thi thí sinh theo tên");
                System.out.println("3. Tìm kiếm theo số báo danh");
                System.out.println("4. Thoát");
                System.out.println("Mời nhập: ");
                int input1 = scanner.nextInt();
                if (input1 < 1 || input1 > 4) {
                    System.out.println("Nhập sai");
                }
                switch (input1){
                    case 1:
                        System.out.println("1. nhập thông tin thí sinh khối A");
                        System.out.println("2. nhập thông tin thí sinh khối B");
                        System.out.println("3. nhập thông tin thí sinh khối C");
                        int input2 = scanner.nextInt();
                        if (input2 < 1 || input2 > 3) {
                            System.out.println("Nhập sai");
                        }
                        switch (input2){
                            case 1:
                                System.out.println("nhập thông tin thí sinh khối A");
                                System.out.println("nhập số báo danh: ");
                                Scanner scanner1 = new Scanner(System.in);
                                int sbd = scanner1.nextInt();
                                System.out.println("nhập họ tên: ");
                                Scanner scanner2 = new Scanner(System.in);
                                String hoTen = scanner2.next();
                                System.out.println("nhập địa chỉ: ");
                                Scanner scanner3 = new Scanner(System.in);
                                String diaChi = scanner3.next();
                                System.out.println("nhap ưu tiên: ");
                                Scanner scanner4 = new Scanner(System.in);
                                String uuTien = scanner4.next();
                                System.out.println("nhập khoi thi: ");
                                Scanner scanner5 = new Scanner(System.in);
                                String khoiThi = scanner5.next();
                                tuyenSinh.ThemKhoiA(sbd,hoTen,diaChi,uuTien,khoiThi);
                                break;
                            case 2:
                                System.out.println("nhập thông tin thí sinh khối B");
                                System.out.println("nhập số báo danh: ");
                                Scanner scanner6 = new Scanner(System.in);
                                int sbdB = scanner6.nextInt();
                                System.out.println("nhập họ tên: ");
                                Scanner scanner7 = new Scanner(System.in);
                                String hoTenB = scanner7.next();
                                System.out.println("nhập địa chỉ: ");
                                Scanner scanner8 = new Scanner(System.in);
                                String diaChiB = scanner8.next();
                                System.out.println("nhap ưu tiên: ");
                                Scanner scanner9 = new Scanner(System.in);
                                String uuTienB = scanner9.next();
                                System.out.println("nhập khoi thi: ");
                                Scanner scanner10 = new Scanner(System.in);
                                String khoiThiB = scanner10.next();
                                tuyenSinh.ThemKhoiB(sbdB,hoTenB,diaChiB,uuTienB,khoiThiB);
                                break;
                            case 3:
                                System.out.println("nhập thông tin thí sinh khối C");
                                System.out.println("nhập số báo danh: ");
                                Scanner scanner11 = new Scanner(System.in);
                                int sbdC = scanner11.nextInt();
                                System.out.println("nhập họ tên: ");
                                Scanner scanner12 = new Scanner(System.in);
                                String hoTenC = scanner12.next();
                                System.out.println("nhập địa chỉ: ");
                                Scanner scanner13 = new Scanner(System.in);
                                String diaChiC = scanner13.next();
                                System.out.println("nhap ưu tiên: ");
                                Scanner scanner14 = new Scanner(System.in);
                                String uuTienC = scanner14.next();
                                System.out.println("nhập khoi thi: ");
                                Scanner scanner15 = new Scanner(System.in);
                                String khoiThiC = scanner15.next();
                                tuyenSinh.ThemKhoiC(sbdC,hoTenC,diaChiC,uuTienC,khoiThiC);
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("1. tìm tên khối A");
                        System.out.println("2. tìm tên khối B");
                        System.out.println("3. tìm tên khối C");
                        int input3 = scanner.nextInt();
                        if (input3 < 1 || input3 > 3){
                            System.out.println("nhập sai");
                        }
                        switch (input3){
                            case 1:
                                System.out.println("nhập tên: ");
                                Scanner scanner16 = new Scanner(System.in);
                                String ten = scanner16.next();
                                tuyenSinh.HienThiThiSinhTheoTenKhoiA(ten);
                                break;
                            case 2:
                                System.out.println("nhập tên: ");
                                Scanner scanner17 = new Scanner(System.in);
                                String tenB = scanner17.next();
                                tuyenSinh.HienThiThiSinhTheoTenKhoiB(tenB);
                                break;
                            case 3:
                                System.out.println("nhập tên: ");
                                Scanner scanner18 = new Scanner(System.in);
                                String tenC = scanner18.next();
                                tuyenSinh.HienThiThiSinhTheoTenKhoiC(tenC);
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("tìm kiếm theo số báo danh");
                        System.out.println("nhâập số báo danh");
                        Scanner scanner19 = new Scanner(System.in);
                        int sbd = scanner19.nextInt();
                        tuyenSinh.TimKiemTheoSbd(sbd);
                        break;
                    case 4:
                        isRunning = false;
                        break;
                }

            }catch (InputMismatchException ex){
                System.out.println("nhập sai kiểu");
            }
        }
    }
}