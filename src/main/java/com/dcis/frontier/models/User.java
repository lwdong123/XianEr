package com.dcis.frontier.models;

import java.util.Date;
import javax.persistence.*;

@Table(name = "USER")
public class User {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 账户
     */
    private String acount;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 企业或个人
     */
    private String perOrCom;

    /**
     * qq号码
     */
    private Integer qqNo;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 会员开始时间
     */
    private Date worktime;

    /**
     * 会员续费时长/月
     */
    private Integer memberLong;

    /**
     * 备注
     */
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取账户
     *
     * @return acount - 账户
     */
    public String getAcount() {
        return acount;
    }

    /**
     * 设置账户
     *
     * @param acount 账户
     */
    public void setAcount(String acount) {
        this.acount = acount == null ? null : acount.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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
     * 获取企业或个人
     *
     * @return perOrCom - 企业或个人
     */
    public String getPerOrCom() {
        return perOrCom;
    }

    /**
     * 设置企业或个人
     *
     * @param perOrCom 企业或个人
     */
    public void setPerOrCom(String perOrCom) {
        this.perOrCom = perOrCom == null ? null : perOrCom.trim();
    }

    /**
     * 获取qq号码
     *
     * @return qqNo - qq号码
     */
    public Integer getQqNo() {
        return qqNo;
    }

    /**
     * 设置qq号码
     *
     * @param qqNo qq号码
     */
    public void setQqNo(Integer qqNo) {
        this.qqNo = qqNo;
    }

    /**
     * 获取电子邮箱
     *
     * @return email - 电子邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置电子邮箱
     *
     * @param email 电子邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取会员开始时间
     *
     * @return worktime - 会员开始时间
     */
    public Date getWorktime() {
        return worktime;
    }

    /**
     * 设置会员开始时间
     *
     * @param worktime 会员开始时间
     */
    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }

    /**
     * 获取会员续费时长/月
     *
     * @return MemberLong - 会员续费时长/月
     */
    public Integer getMemberLong() {
        return memberLong;
    }

    /**
     * 设置会员续费时长/月
     *
     * @param memberLong 会员续费时长/月
     */
    public void setMemberLong(Integer memberLong) {
        this.memberLong = memberLong;
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}