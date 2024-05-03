package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 健康信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-06 10:34:32
 */
@TableName("jiankangxinxi")
public class JiankangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangxinxiEntity() {
		
	}
	
	public JiankangxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
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
