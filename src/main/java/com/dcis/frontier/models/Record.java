package com.dcis.frontier.models;

import javax.persistence.*;

@Table(name = "record")
public class Record {
    /**
     * 备案序号
     */
    @Id
    private Integer recordNo;

    /**
     * 备案类型
     */
    private String type;

    /**
     * 备注名称
     */
    private String recordName;

    /**
     * 规格型号
     */
    private String goodsModel;

    /**
     * 外观型号
     */
    private String appearModel;

    /**
     * 计量单位
     */
    private String unit;

    /**
     * 币制
     */
    private String curr;

    /**
     * 审核状态
     */
    private String status;

    /**
     * 备注
     */
    private String note;

    public Integer getRecordNo() {
        return recordNo;
    }

    public void setRecordNo(Integer recordNo) {
        this.recordNo = recordNo;
    }

    /**
     * 获取备案类型
     *
     * @return type - 备案类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置备案类型
     *
     * @param type 备案类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取备注名称
     *
     * @return recordName - 备注名称
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * 设置备注名称
     *
     * @param recordName 备注名称
     */
    public void setRecordName(String recordName) {
        this.recordName = recordName == null ? null : recordName.trim();
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
     * 获取外观型号
     *
     * @return appearModel - 外观型号
     */
    public String getAppearModel() {
        return appearModel;
    }

    /**
     * 设置外观型号
     *
     * @param appearModel 外观型号
     */
    public void setAppearModel(String appearModel) {
        this.appearModel = appearModel == null ? null : appearModel.trim();
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
     * 获取审核状态
     *
     * @return status - 审核状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置审核状态
     *
     * @param status 审核状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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