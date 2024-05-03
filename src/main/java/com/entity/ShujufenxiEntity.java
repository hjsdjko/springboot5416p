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
 * 数据分析
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-06 10:34:32
 */
@TableName("shujufenxi")
public class ShujufenxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShujufenxiEntity() {
		
	}
	
	public ShujufenxiEntity(T t) {
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
	 * ID
	 */
					
	private String bianhao;
	
	/**
	 * 天数
	 */
					
	private String tianshu;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 身高
	 */
					
	private Integer shengao;
	
	/**
	 * 重量
	 */
					
	private Integer zhongliang;
	
	/**
	 * 血压
	 */
					
	private Integer xueya;
	
	/**
	 * 血糖
	 */
					
	private Integer xuetang;
	
	/**
	 * 胆固醇
	 */
					
	private String danguchun;
	
	/**
	 * 胰高血糖素
	 */
					
	private String yigaoxuetangsu;
	
	/**
	 * 是否吸烟
	 */
					
	private String shifouxiyan;
	
	/**
	 * 是否饮酒
	 */
					
	private String shifouyinjiu;
	
	/**
	 * 是否运动
	 */
					
	private String shifouyundong;
	
	/**
	 * 心脏功能是否良好
	 */
					
	private String xinzanggongnengshifoulianghao;
	
	
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
	 * 设置：ID
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：ID
	 */
	public String getBianhao() {
		return bianhao;
	}
	/**
	 * 设置：天数
	 */
	public void setTianshu(String tianshu) {
		this.tianshu = tianshu;
	}
	/**
	 * 获取：天数
	 */
	public String getTianshu() {
		return tianshu;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：身高
	 */
	public void setShengao(Integer shengao) {
		this.shengao = shengao;
	}
	/**
	 * 获取：身高
	 */
	public Integer getShengao() {
		return shengao;
	}
	/**
	 * 设置：重量
	 */
	public void setZhongliang(Integer zhongliang) {
		this.zhongliang = zhongliang;
	}
	/**
	 * 获取：重量
	 */
	public Integer getZhongliang() {
		return zhongliang;
	}
	/**
	 * 设置：血压
	 */
	public void setXueya(Integer xueya) {
		this.xueya = xueya;
	}
	/**
	 * 获取：血压
	 */
	public Integer getXueya() {
		return xueya;
	}
	/**
	 * 设置：血糖
	 */
	public void setXuetang(Integer xuetang) {
		this.xuetang = xuetang;
	}
	/**
	 * 获取：血糖
	 */
	public Integer getXuetang() {
		return xuetang;
	}
	/**
	 * 设置：胆固醇
	 */
	public void setDanguchun(String danguchun) {
		this.danguchun = danguchun;
	}
	/**
	 * 获取：胆固醇
	 */
	public String getDanguchun() {
		return danguchun;
	}
	/**
	 * 设置：胰高血糖素
	 */
	public void setYigaoxuetangsu(String yigaoxuetangsu) {
		this.yigaoxuetangsu = yigaoxuetangsu;
	}
	/**
	 * 获取：胰高血糖素
	 */
	public String getYigaoxuetangsu() {
		return yigaoxuetangsu;
	}
	/**
	 * 设置：是否吸烟
	 */
	public void setShifouxiyan(String shifouxiyan) {
		this.shifouxiyan = shifouxiyan;
	}
	/**
	 * 获取：是否吸烟
	 */
	public String getShifouxiyan() {
		return shifouxiyan;
	}
	/**
	 * 设置：是否饮酒
	 */
	public void setShifouyinjiu(String shifouyinjiu) {
		this.shifouyinjiu = shifouyinjiu;
	}
	/**
	 * 获取：是否饮酒
	 */
	public String getShifouyinjiu() {
		return shifouyinjiu;
	}
	/**
	 * 设置：是否运动
	 */
	public void setShifouyundong(String shifouyundong) {
		this.shifouyundong = shifouyundong;
	}
	/**
	 * 获取：是否运动
	 */
	public String getShifouyundong() {
		return shifouyundong;
	}
	/**
	 * 设置：心脏功能是否良好
	 */
	public void setXinzanggongnengshifoulianghao(String xinzanggongnengshifoulianghao) {
		this.xinzanggongnengshifoulianghao = xinzanggongnengshifoulianghao;
	}
	/**
	 * 获取：心脏功能是否良好
	 */
	public String getXinzanggongnengshifoulianghao() {
		return xinzanggongnengshifoulianghao;
	}

}
