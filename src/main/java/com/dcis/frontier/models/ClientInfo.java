package com.dcis.frontier.models;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name="client_Info")
public class ClientInfo {
    /**
     * 客户编号
     */
    @Id
    private Integer clientNo;

    /**
     * 客户名称
     */
    private String clientName;

    /**
     * 客户性质（企业/个人）
     */
    private String clientType;

    /**
     * 手机号码
     */
    private String mobilePhone;

    /**
     * 订单数量
     */
    private Integer orderNum;

    /**
     * 订单商品
     */
    private String orderGoods;

    /**
     * 交易金额
     */
    private BigDecimal dealMoney;

    /**
     * 利润
     */
    private BigDecimal profit;

    /**
     * 最近一次购买时间
     */
    private Date recentBuying;

    /**
     * 客户信用
     */
    private String clientCredit;

    private String note;

    private BigDecimal allProfit;

    private BigDecimal allDealMoney;


    public Integer getClientNo() {
        return clientNo;
    }

    public void setClientNo(Integer clientNo) {
        this.clientNo = clientNo;
    }

    /**
     * 获取客户名称
     *
     * @return clientName - 客户名称
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * 设置客户名称
     *
     * @param clientName 客户名称
     */
    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    /**
     * 获取客户性质（企业/个人）
     *
     * @return clientType - 客户性质（企业/个人）
     */
    public String getClientType() {
        return clientType;
    }

    /**
     * 设置客户性质（企业/个人）
     *
     * @param clientType 客户性质（企业/个人）
     */
    public void setClientType(String clientType) {
        this.clientType = clientType == null ? null : clientType.trim();
    }

    /**
     * 获取手机号码
     *
     * @return mobilePhone - 手机号码
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置手机号码
     *
     * @param mobilePhone 手机号码
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 获取订单数量
     *
     * @return orderNum - 订单数量
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * 设置订单数量
     *
     * @param orderNum 订单数量
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取订单商品
     *
     * @return orderGoods - 订单商品
     */
    public String getOrderGoods() {
        return orderGoods;
    }

    /**
     * 设置订单商品
     *
     * @param orderGoods 订单商品
     */
    public void setOrderGoods(String orderGoods) {
        this.orderGoods = orderGoods == null ? null : orderGoods.trim();
    }

    public BigDecimal getDealMoney() {
        return dealMoney;
    }

    public void setDealMoney(BigDecimal dealMoney) {
        this.dealMoney = dealMoney;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
    }

    /**
     * 获取最近一次购买时间
     *
     * @return recentBuying - 最近一次购买时间
     */
    public Date getRecentBuying() {
        return recentBuying;
    }

    /**
     * 设置最近一次购买时间
     *
     * @param recentBuying 最近一次购买时间
     */
    public void setRecentBuying(Date recentBuying) {
        this.recentBuying = recentBuying;
    }

    /**
     * 获取客户信用
     *
     * @return clientCredit - 客户信用
     */
    public String getClientCredit() {
        return clientCredit;
    }

    /**
     * 设置客户信用
     *
     * @param clientCredit 客户信用
     */
    public void setClientCredit(String clientCredit) {
        this.clientCredit = clientCredit == null ? null : clientCredit.trim();
    }

    /**
     * @return note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public BigDecimal getAllProfit() {
        return allProfit;
    }

    public void setAllProfit(BigDecimal allProfit) {
        this.allProfit = allProfit;
    }

    public BigDecimal getAllDealMoney() {
        return allDealMoney;
    }

    public void setAllDealMoney(BigDecimal allDealMoney) {
        this.allDealMoney = allDealMoney;
    }
}