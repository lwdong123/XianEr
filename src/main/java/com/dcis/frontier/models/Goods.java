package com.dcis.frontier.models;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
@Table(name = "GOODS")
public class Goods {
    /**
     * 主键
     */
    @Id
    private Integer goodsNo;

    /**
     * 商品名称
     */
    private String gName;

    /**
     * 规格型号
     */
    private String goodsModel;

    /**
     * 产品名称
     */
    private String appearModel;

    /**
     * 其他规格
     */
    private String otherModel;

    /**
     * 计量单位
     */
    private String unit;

    /**
     * 进价
     */
    private BigDecimal buyingPrice;

    /**
     * 售价
     */
    private BigDecimal sellPrice;

    /**
     * 浮动价格
     */
    private BigDecimal floatPrice;

    /**
     * 币制
     */
    private String curr;

    /**
     * 11.进货数量
     */
    private Integer purchaseNum;

    /**
     * 库存数量
     */
    private Integer stockNum;

    /**
     * 纯利润
     */
    private BigDecimal profit;

    /**
     * 进货时间
     */
    private Date purchaseDate;

    /**
     * 最近售出时间
     */
    private Date recentDate;

    public Integer getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(Integer goodsNo) {
        this.goodsNo = goodsNo;
    }

    /**
     * 获取商品名称
     *
     * @return gName - 商品名称
     */
    public String getgName() {
        return gName;
    }

    /**
     * 设置商品名称
     *
     * @param gName 商品名称
     */
    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    /**
     * 获取规格型号
     *
     * @return goodsModel - 规格型号
     */
    public String getGoodsModel() {
        return goodsModel;
    }

    /**
     * 设置规格型号
     *
     * @param goodsModel 规格型号
     */
    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel == null ? null : goodsModel.trim();
    }

    /**
     * 获取产品名称
     *
     * @return appearModel - 产品名称
     */
    public String getAppearModel() {
        return appearModel;
    }

    /**
     * 设置产品名称
     *
     * @param appearModel 产品名称
     */
    public void setAppearModel(String appearModel) {
        this.appearModel = appearModel == null ? null : appearModel.trim();
    }

    /**
     * 获取其他规格
     *
     * @return otherModel - 其他规格
     */
    public String getOtherModel() {
        return otherModel;
    }

    /**
     * 设置其他规格
     *
     * @param otherModel 其他规格
     */
    public void setOtherModel(String otherModel) {
        this.otherModel = otherModel == null ? null : otherModel.trim();
    }

    /**
     * 获取计量单位
     *
     * @return unit - 计量单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置计量单位
     *
     * @param unit 计量单位
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 获取进价
     *
     * @return buyingPrice - 进价
     */
    public BigDecimal getBuyingPrice() {
        return buyingPrice;
    }

    /**
     * 设置进价
     *
     * @param buyingPrice 进价
     */
    public void setBuyingPrice(BigDecimal buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    /**
     * 获取售价
     *
     * @return sellPrice - 售价
     */
    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    /**
     * 设置售价
     *
     * @param sellPrice 售价
     */
    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * 获取浮动价格
     *
     * @return floatPrice - 浮动价格
     */
    public BigDecimal getFloatPrice() {
        return floatPrice;
    }

    /**
     * 设置浮动价格
     *
     * @param floatPrice 浮动价格
     */
    public void setFloatPrice(BigDecimal floatPrice) {
        this.floatPrice = floatPrice;
    }

    /**
     * 获取币制
     *
     * @return curr - 币制
     */
    public String getCurr() {
        return curr;
    }

    /**
     * 设置币制
     *
     * @param curr 币制
     */
    public void setCurr(String curr) {
        this.curr = curr == null ? null : curr.trim();
    }

    /**
     * 获取11.进货数量
     *
     * @return purchaseNum - 11.进货数量
     */
    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    /**
     * 设置11.进货数量
     *
     * @param purchaseNum 11.进货数量
     */
    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    /**
     * 获取库存数量
     *
     * @return stockNum - 库存数量
     */
    public Integer getStockNum() {
        return stockNum;
    }

    /**
     * 设置库存数量
     *
     * @param stockNum 库存数量
     */
    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    /**
     * 获取纯利润
     *
     * @return profit - 纯利润
     */
    public BigDecimal getProfit() {
        return profit;
    }

    /**
     * 设置纯利润
     *
     * @param profit 纯利润
     */
    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    /**
     * 获取进货时间
     *
     * @return purchaseDate - 进货时间
     */
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * 设置进货时间
     *
     * @param purchaseDate 进货时间
     */
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * 获取最近售出时间
     *
     * @return recentDate - 最近售出时间
     */
    public Date getRecentDate() {
        return recentDate;
    }

    /**
     * 设置最近售出时间
     *
     * @param recentDate 最近售出时间
     */
    public void setRecentDate(Date recentDate) {
        this.recentDate = recentDate;
    }
}