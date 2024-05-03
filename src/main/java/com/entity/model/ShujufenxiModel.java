package com.entity.model;

import com.entity.ShujufenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 数据分析
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-06 10:34:32
 */
public class ShujufenxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
