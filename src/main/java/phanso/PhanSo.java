package phanso;

import java.util.Scanner;

public class PhanSo {
    // thuoc tinh
    private int tuSo;
    private int mauSo;

    // phuong thuc
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo() {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    // ham nhap phan so
    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.print("Nhap tu so: ");
            a = sc.nextInt();
            System.out.print("Nhap mau so : ");
            b = sc.nextInt();
            if (b == 0) {
                System.out.println("Mau so khong duoc bang 0!");
            } else {
                tuSo = a;
                mauSo = b;
            }

        }
        while (b == 0);
    }

    // ham hien thi phan so
    public void hienThi() {
        if (tuSo * mauSo < 0) {
            System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
        } else {
            System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
        }
    }


    public PhanSo congPS(PhanSo ps2) {
        int a = tuSo * ps2.mauSo + mauSo * ps2.tuSo;
        int b = mauSo * ps2.mauSo;
        PhanSo tong = new PhanSo(a, b);
        return tong;
    }

    public PhanSo truPS(PhanSo ps2) {
        int a = tuSo * ps2.mauSo - mauSo * ps2.tuSo;
        int b = mauSo * ps2.mauSo;
        PhanSo hieu = new PhanSo(a, b);
        return hieu;
    }

    public PhanSo tichPS(PhanSo ps2) {
        int a = tuSo * ps2.tuSo;
        int b = mauSo * ps2.mauSo;
        PhanSo tich = new PhanSo(a, b);
        return tich;
    }

    public PhanSo thuongPS(PhanSo ps2) {
        int a = tuSo * ps2.mauSo;
        int b = mauSo * ps2.tuSo;
        PhanSo thuong = new PhanSo(a, b);
        return thuong;
    }

    public int timUSCLN(int a, int b) {
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public boolean kiemTraPSToiGian() {
        if (timUSCLN(tuSo, mauSo) == 1) {
            return true;
        }
        return false;
    }

    public int timBSCNN(int a, int b) {
        int ret;
        ret = a * b / timUSCLN(a, b);
        return ret;
    }

    public PhanSo quyDongMauSo(PhanSo ps2) {
        int tmp = timBSCNN(mauSo, ps2.mauSo) / mauSo;
        tuSo = tuSo * tmp;
        mauSo = mauSo * tmp;
        return new PhanSo(tuSo, mauSo);
    }

    public PhanSo rutGon() {
        int x = timUSCLN(tuSo, mauSo);
        tuSo = tuSo / x;
        mauSo = mauSo / x;
        return new PhanSo(tuSo, mauSo);
    }

    public boolean kiemTraPSDuong() {
        if (tuSo * mauSo > 0) {
            return true;
        }
        return false;
    }

    public int soSanhPS(PhanSo ps2) {
        int ret;
        float s1 = (float) (tuSo / mauSo);
        float s2 = (float) (ps2.tuSo / ps2.mauSo);
        if (s1 > s2) {
            return ret = 1;
        } else if (s1 == s2) {
            return ret = 0;
        }
        else return ret = -1;
    }
}

