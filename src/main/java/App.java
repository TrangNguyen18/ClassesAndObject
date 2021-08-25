import phanso.PhanSo;

public class App {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        PhanSo ps3 = new PhanSo();
        PhanSo ps4 = new PhanSo();
        PhanSo psTong = new PhanSo();
        PhanSo psHieu = new PhanSo();
        PhanSo psTich = new PhanSo();
        PhanSo psThuong = new PhanSo();
        PhanSo psQuyDong1 = new PhanSo();
        PhanSo psQuyDong2 = new PhanSo();

        //nhap phan so
        System.out.println("Nhap phan so thu 1 ");
        ps1.nhapPhanSo();
        ps1.hienThi();
        System.out.print("Phan so rut gon cua phan so la: ");
        ps1.rutGon().hienThi();

        System.out.println("Nhap phan so thu 2");
        ps2.nhapPhanSo();
        ps2.hienThi();
        System.out.print("Phan so rut gon cua phan so la: ");
        ps2.rutGon().hienThi();

        //tinh tong 2 phan so
        psTong = ps1.congPS(ps2);
        System.out.print("Tong cua hai phan so la : ");
        psTong.hienThi();

        // tinh hieu cua 2 phan so
        psHieu = ps1.truPS(ps2);
        System.out.print("Hieu cua hai phan so la : ");
        psHieu.hienThi();

        // tich cua hai phan so
        psTich = ps1.tichPS(ps2);
        System.out.print("Tich cua hai phan so la : ");
        psTich.hienThi();

        //thuong cua hai phan so
        psThuong = ps1.thuongPS(ps2);
        System.out.print("Thuong cua hai phan so la : ");
        psThuong.hienThi();



        // quy dong hai phan so
        psQuyDong1 = ps1.quyDongMauSo(ps2);
        psQuyDong2 = ps2.quyDongMauSo(ps1);
        System.out.print("Phan so quy dong cua phan so thu 1 la: ");
        psQuyDong1.hienThi();
        System.out.println();
        System.out.print("Phan so quy dong cua phan so thu 2 la:");
        psQuyDong2.hienThi();

        // so sanh hai phan so
        if (ps1.soSanhPS(ps2)==1) {
            System.out.println("Phan so 1 lon hon phan so 2");
        }
        else if(ps1.soSanhPS(ps2)==0){
            System.out.println("Phan so 1 bang phan so 2");
        }
        else System.out.println("Phan so 1 nho hon phan so 2");

        //kiem tra phan so toi gian
        System.out.println("Kiem tra so toi gian------------");
        ps3.nhapPhanSo();
        if (ps3.kiemTraPSToiGian()) {
            System.out.println("Phan so la phan so toi gian");
        } else {
            System.out.println("Phan so khong phai la phan so toi gian");
        }

        // kiem tra phan so la am hay duong
        System.out.println("Kiem tra so am hay duong----------------");
        ps4.nhapPhanSo();
        if (ps4.kiemTraPSDuong()) {
            System.out.println("Phan so la phan so duong");
        } else {
            System.out.println("Phan so la phan so am");
        }

    }
}
