package com.example.fragmenttablayoutviewpagervlistview.model;

public class Cong {
    private int ImgRes;
    private String ip1,ip2,ip3;

    public Cong() {
    }

    public Cong(int imgRes, String ip1, String ip2, String ip3) {
        ImgRes = imgRes;
        this.ip1 = ip1;
        this.ip2 = ip2;
        this.ip3 = ip3;
    }

    public int getImgRes() {
        return ImgRes;
    }

    public void setImgRes(int imgRes) {
        ImgRes = imgRes;
    }

    public String getIp1() {
        return ip1;
    }

    public void setIp1(String ip1) {
        this.ip1 = ip1;
    }

    public String getIp2() {
        return ip2;
    }

    public void setIp2(String ip2) {
        this.ip2 = ip2;
    }

    public String getIp3() {
        return ip3;
    }

    public void setIp3(String ip3) {
        this.ip3 = ip3;
    }
}
