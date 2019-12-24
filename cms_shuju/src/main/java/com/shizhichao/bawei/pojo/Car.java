package com.shizhichao.bawei.pojo;

import java.io.Serializable;

public class Car implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String shijian;
	private String chepai;
	private String chexing;
	private Double jingdu= 121.446014;
	private Double weidu= 31.215937;
	private double juli;
	
	
	public Double getJingdu() {
		return jingdu;
	}
	public void setJingdu(Double jingdu) {
		this.jingdu = jingdu;
	}
	public void setJuli(double juli) {
		this.juli = juli;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShijian() {
		return shijian;
	}
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}
	public String getChepai() {
		return chepai;
	}
	public void setChepai(String chepai) {
		this.chepai = chepai;
	}
	public String getChexing() {
		return chexing;
	}
	public void setChexing(String chexing) {
		this.chexing = chexing;
	}
	
	public Double getWeidu() {
		return weidu;
	}
	public void setWeidu(Double weidu) {
		this.weidu = weidu;
	}
	
	public double getJuli() {
		return juli;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Car(String id, String shijian, String chepai, String chexing, Double jingdu, Double weidu, Double juli) {
		super();
		this.id = id;
		this.shijian = shijian;
		this.chepai = chepai;
		this.chexing = chexing;
		this.jingdu = jingdu;
		this.weidu = weidu;
		this.juli = juli;
	}
	public Car() {
		super();
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", shijian=" + shijian + ", chepai=" + chepai + ", chexing=" + chexing + ", jingdu="
				+ jingdu + ", weidu=" + weidu + ", juli=" + juli + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
