package com.dzh.pojo;

public class GoodsInfo {

    //id(自增) 、goodsTitle、goodsName、basePrice、price、costPrice、stockNum、goodsDesc、goodsHot、status(必须是TOP 上架  DOWN 下架 DBL 删除)、goodsType

    private int id;
    private String goodsTitle;
    private String goodsName;
    private double basePrice;
    private double price;
    private double costPrice;
    private int stockNum;
    private String goodsDesc;
    private int goodsHot;
    private String status;
    private String goodsType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public int getStockNum() {
        return stockNum;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public int getGoodsHot() {
        return goodsHot;
    }

    public void setGoodsHot(int goodsHot) {
        this.goodsHot = goodsHot;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public GoodsInfo() {
    }

    public GoodsInfo(int id, String goodsTitle, String goodsName, double basePrice, double price, double costPrice, int stockNum, String goodsDesc, int goodsHot, String status, String goodsType) {
        this.id = id;
        this.goodsTitle = goodsTitle;
        this.goodsName = goodsName;
        this.basePrice = basePrice;
        this.price = price;
        this.costPrice = costPrice;
        this.stockNum = stockNum;
        this.goodsDesc = goodsDesc;
        this.goodsHot = goodsHot;
        this.status = status;
        this.goodsType = goodsType;
    }

    @Override
    public String toString() {
        return "GoodsInfo{" +
                "id=" + id +
                ", goodsTitle='" + goodsTitle + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", basePrice=" + basePrice +
                ", price=" + price +
                ", costPrice=" + costPrice +
                ", stockNum=" + stockNum +
                ", goodsDesc='" + goodsDesc + '\'' +
                ", goodsHot=" + goodsHot +
                ", status='" + status + '\'' +
                ", goodsType='" + goodsType + '\'' +
                '}';
    }
}
