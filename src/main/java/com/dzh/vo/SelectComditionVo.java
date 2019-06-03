package com.dzh.vo;

public class SelectComditionVo {

    private String goodsName;
    private double price1;
    private double price2;
    private String status;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice1() {
        return price1;
    }

    public void setPrice1(double price1) {
        this.price1 = price1;
    }

    public double getPrice2() {
        return price2;
    }

    public void setPrice2(double price2) {
        this.price2 = price2;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SelectComditionVo() {
    }

    public SelectComditionVo(String goodsName, double price1, double price2, String status) {
        this.goodsName = goodsName;
        this.price1 = price1;
        this.price2 = price2;
        this.status = status;
    }

    @Override
    public String toString() {
        return "SelectComditionVo{" +
                "goodsName='" + goodsName + '\'' +
                ", price1=" + price1 +
                ", price2=" + price2 +
                ", status='" + status + '\'' +
                '}';
    }
}
