package com.dcis.frontier.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "company_info")
public class CompanyInfo {
    /**
     * 公司编号
     */
    @Id
    private Integer companyNo;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 英文名称
     */
    private String companyNameEn;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 手机号码
     */
    private String mobilePhone;

    /**
     * 联系人
     */
    private String contract;

    /**
     * 7.企业/公司地址
     */
    private String companyAddress;

    /**
     * 注册资产
     */
    private BigDecimal registerMoney;

    private String note;

    public Integer getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(Integer companyNo) {
        this.companyNo = companyNo;
    }

    /**
     * 获取公司名称
     *
     * @return companyName - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 获取英文名称
     *
     * @return companyNameEn - 英文名称
     */
    public String getCompanyNameEn() {
        return companyNameEn;
    }

    /**
     * 设置英文名称
     *
     * @param companyNameEn 英文名称
     */
    public void setCompanyNameEn(String companyNameEn) {
        this.companyNameEn = companyNameEn == null ? null : companyNameEn.trim();
    }

    /**
     * 获取电话
     *
     * @return telephone - 电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置电话
     *
     * @param telephone 电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
     * 获取联系人
     *
     * @return contract - 联系人
     */
    public String getContract() {
        return contract;
    }

    /**
     * 设置联系人
     *
     * @param contract 联系人
     */
    public void setContract(String contract) {
        this.contract = contract == null ? null : contract.trim();
    }

    /**
     * 获取7.企业/公司地址
     *
     * @return companyAddress - 7.企业/公司地址
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * 设置7.企业/公司地址
     *
     * @param companyAddress 7.企业/公司地址
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    /**
     * 获取注册资产
     *
     * @return registerMoney - 注册资产
     */
    public BigDecimal getRegisterMoney() {
        return registerMoney;
    }

    /**
     * 设置注册资产
     *
     * @param registerMoney 注册资产
     */
    public void setRegisterMoney(BigDecimal registerMoney) {
        this.registerMoney = registerMoney;
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