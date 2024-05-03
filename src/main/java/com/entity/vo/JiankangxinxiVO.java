package com.entity.vo;

import com.entity.JiankangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-06 10:34:32
 */
public class JiankangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 肌钙蛋白
	 */
	
	private String jigaidanbai;
		
	/**
	 * 肌红蛋白
	 */
	
	private String jihongdanbai;
		
	/**
	 * 心肌酶
	 */
	
	private String xinjimei;
		
	/**
	 * 尿酸
	 */
	
	private String niaosuan;
		
	/**
	 * 血压
	 */
	
	private String xueya;
		
	/**
	 * 血糖
	 */
	
	private String xuetang;
		
	/**
	 * 血脂
	 */
	
	private String xuezhi;
		
	/**
	 * 心率
	 */
	
	private String xinlv;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：肌钙蛋白
	 */
	 
	public void setJigaidanbai(String jigaidanbai) {
		this.jigaidanbai = jigaidanbai;
	}
	
	/**
	 * 获取：肌钙蛋白
	 */
	public String getJigaidanbai() {
		return jigaidanbai;
	}
				
	
	/**
	 * 设置：肌红蛋白
	 */
	 
	public void setJihongdanbai(String jihongdanbai) {
		this.jihongdanbai = jihongdanbai;
	}
	
	/**
	 * 获取：肌红蛋白
	 */
	public String getJihongdanbai() {
		return jihongdanbai;
	}
				
	
	/**
	 * 设置：心肌酶
	 */
	 
	public void setXinjimei(String xinjimei) {
		this.xinjimei = xinjimei;
	}
	
	/**
	 * 获取：心肌酶
	 */
	public String getXinjimei() {
		return xinjimei;
	}
				
	
	/**
	 * 设置：尿酸
	 */
	 
	public void setNiaosuan(String niaosuan) {
		this.niaosuan = niaosuan;
	}
	
	/**
	 * 获取：尿酸
	 */
	public String getNiaosuan() {
		return niaosuan;
	}
				
	
	/**
	 * 设置：血压
	 */
	 
	public void setXueya(String xueya) {
		this.xueya = xueya;
	}
	
	/**
	 * 获取：血压
	 */
	public String getXueya() {
		return xueya;
	}
				
	
	/**
	 * 设置：血糖
	 */
	 
	public void setXuetang(String xuetang) {
		this.xuetang = xuetang;
	}
	
	/**
	 * 获取：血糖
	 */
	public String getXuetang() {
		return xuetang;
	}
				
	
	/**
	 * 设置：血脂
	 */
	 
	public void setXuezhi(String xuezhi) {
		this.xuezhi = xuezhi;
	}
	
	/**
	 * 获取：血脂
	 */
	public String getXuezhi() {
		return xuezhi;
	}
				
	
	/**
	 * 设置：心率
	 */
	 
	public void setXinlv(String xinlv) {
		this.xinlv = xinlv;
	}
	
	/**
	 * 获取：心率
	 */
	public String getXinlv() {
		return xinlv;
	}
			
}
