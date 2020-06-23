package com.dcis.frontier.models;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
@Table(name = "client_member")
public class ClientMember {
    /**
     * 会员编号
     */
    @Id
    private Integer memberNo;

    /**
     * 手机号
     */
    private String mobliePhone;

    /**
     * 剩余金额
     */
    private BigDecimal remainMoney;

    /**
     * 最近充值时间
     */
    private Date recentRechargeTime;

    /**
     * 收账金额
     */
    private BigDecimal receiveMoney;

    /**
     * 充值兑换倍数
     */
    private Long rechargeMul;

    /**
     * 自定义金额
     */
    private BigDecimal customMoney;

    private String note;

    public Integer getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(Integer memberNo) {
        this.memberNo = memberNo;
    }

    public BigDecimal getRemainMoney() {
        return remainMoney;
    }

    public void setRemainMoney(BigDecimal remainMoney) {
        this.remainMoney = remainMoney;
    }

    public void setReceiveMoney(BigDecimal receiveMoney) {
        this.receiveMoney = receiveMoney;
    }

    /**
     * 获取手机号
     *
     * @return mobliePhone - 手机号
     */
    public String getMobliePhone() {
        return mobliePhone;
    }

    /**
     * 设置手机号
     *
     * @param mobliePhone 手机号
     */
    public void setMobliePhone(String mobliePhone) {
        this.mobliePhone = mobliePhone;
    }


    /**
     * 获取最近充值时间
     *
     * @return recentRechargeTime - 最近充值时间
     */
    public Date getRecentRechargeTime() {
        return recentRechargeTime;
    }

    /**
     * 设置最近充值时间
     *
     * @param recentRechargeTime 最近充值时间
     */
    public void setRecentRechargeTime(Date recentRechargeTime) {
        this.recentRechargeTime = recentRechargeTime;
    }

    public BigDecimal getReceiveMoney() {
        return receiveMoney;
    }

    /**
     * 获取充值兑换倍数
     *
     * @return rechargeMul - 充值兑换倍数
     */
    public Long getRechargeMul() {
        return rechargeMul;
    }

    /**
     * 设置充值兑换倍数
     *
     * @param rechargeMul 充值兑换倍数
     */
    public void setRechargeMul(Long rechargeMul) {
        this.rechargeMul = rechargeMul;
    }

    /**
     * 获取自定义金额
     *
     * @return customMoney - 自定义金额
     */
    public BigDecimal getCustomMoney() {
        return customMoney;
    }

    /**
     * 设置自定义金额
     *
     * @param customMoney 自定义金额
     */
    public void setCustomMoney(BigDecimal customMoney) {
        this.customMoney = customMoney;
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
}