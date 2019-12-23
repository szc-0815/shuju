package com.shizhichao.bawei.pojo;

import java.io.Serializable;

public class Car implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String shijian;
	private String chepai;
	private String chexing;
	private Integer jingdu;
	private Integer weidu;
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
	public Integer getJingdu() {
		return jingdu;
	}
	public void setJingdu(Integer jingdu) {
		this.jingdu = jingdu;
	}
	public Integer getWeidu() {
		return weidu;
	}
	public void setWeidu(Integer weidu) {
		this.weidu = weidu;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Car(String shijian, String chepai, String chexing, Integer jingdu, Integer weidu) {
		super();
		this.shijian = shijian;
		this.chepai = chepai;
		this.chexing = chexing;
		this.jingdu = jingdu;
		this.weidu = weidu;
	}
	public Car() {
		super();
	}
	@Override
	public String toString() {
		return "Car [shijian=" + shijian + ", chepai=" + chepai + ", chexing=" + chexing + ", jingdu=" + jingdu
				+ ", weidu=" + weidu + "]";
	}
	
	
	
	
	
	
}
