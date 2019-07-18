package com.example.dcits.model;

import java.util.Date;
import javax.persistence.*;
@Table
public class Emp {
    @Id
    private Integer empno;

    private String ename;

    private String job;

    private Integer mgr;

    private Date hiredate;

    private Double sal;

    private Double comm;

    private Integer deptno;

    /**
     * @return empno
     */
    public Integer getEmpno() {
        return empno;
    }

    /**
     * @param empno
     */
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    /**
     * @return ename
     */
    public String getEname() {
        return ename;
    }

    /**
     * @param ename
     */
    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    /**
     * @return job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job
     */
    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    /**
     * @return mgr
     */
    public Integer getMgr() {
        return mgr;
    }

    /**
     * @param mgr
     */
    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    /**
     * @return hiredate
     */
    public Date getHiredate() {
        return hiredate;
    }

    /**
     * @param hiredate
     */
    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    /**
     * @return sal
     */
    public Double getSal() {
        return sal;
    }

    /**
     * @param sal
     */
    public void setSal(Double sal) {
        this.sal = sal;
    }

    /**
     * @return comm
     */
    public Double getComm() {
        return comm;
    }

    /**
     * @param comm
     */
    public void setComm(Double comm) {
        this.comm = comm;
    }

    /**
     * @return deptno
     */
    public Integer getDeptno() {
        return deptno;
    }

    /**
     * @param deptno
     */
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
}