package com.offcn.pojo;

import java.util.Date;

public class ShuCai {
private int sid;
private String sname;
private Double sminprice;
private Double savgprice;
private Double smaxprice;
private String stype;
private String sunit;
private Date sdate;

private ShuCai shucai;

public ShuCai getShucai() {
	return shucai;
}
public void setShucai(ShuCai shucai) {
	this.shucai = shucai;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Double getSminprice() {
	return sminprice;
}
public void setSminprice(Double sminprice) {
	this.sminprice = sminprice;
}
public Double getSavgprice() {
	return savgprice;
}
public void setSavgprice(Double savgprice) {
	this.savgprice = savgprice;
}
public Double getSmaxprice() {
	return smaxprice;
}
public void setSmaxprice(Double smaxprice) {
	this.smaxprice = smaxprice;
}
public String getStype() {
	return stype;
}
public void setStype(String stype) {
	this.stype = stype;
}
public String getSunit() {
	return sunit;
}
public void setSunit(String sunit) {
	this.sunit = sunit;
}
public Date getSdate() {
	return sdate;
}
public void setSdate(Date sdate) {
	this.sdate = sdate;
}
@Override
public String toString() {
	return "ShuCai [sid=" + sid + ", sname=" + sname + ", sminprice=" + sminprice + ", savgprice=" + savgprice
			+ ", smaxprice=" + smaxprice + ", stype=" + stype + ", sunit=" + sunit + ", sdate=" + sdate + ", shucai="
			+ shucai + "]";
}

}
