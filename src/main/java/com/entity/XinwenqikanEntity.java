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
 * 新闻期刊
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-06 10:34:32
 */
@TableName("xinwenqikan")
public class XinwenqikanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XinwenqikanEntity() {
		
	}
	
	public XinwenqikanEntity(T t) {
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
	 * 新闻标题
	 */
					
	private String xinwenbiaoti;
	
	/**
	 * 新闻类型
	 */
					
	private String xinwenleixing;
	
	/**
	 * 新闻来源
	 */
					
	private String xinwenlaiyuan;
	
	/**
	 * 新闻内容
	 */
					
	private String xinwenneirong;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 新闻封面
	 */
					
	private String xinwenfengmian;
	
	
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
	 * 设置：新闻标题
	 */
	public void setXinwenbiaoti(String xinwenbiaoti) {
		this.xinwenbiaoti = xinwenbiaoti;
	}
	/**
	 * 获取：新闻标题
	 */
	public String getXinwenbiaoti() {
		return xinwenbiaoti;
	}
	/**
	 * 设置：新闻类型
	 */
	public void setXinwenleixing(String xinwenleixing) {
		this.xinwenleixing = xinwenleixing;
	}
	/**
	 * 获取：新闻类型
	 */
	public String getXinwenleixing() {
		return xinwenleixing;
	}
	/**
	 * 设置：新闻来源
	 */
	public void setXinwenlaiyuan(String xinwenlaiyuan) {
		this.xinwenlaiyuan = xinwenlaiyuan;
	}
	/**
	 * 获取：新闻来源
	 */
	public String getXinwenlaiyuan() {
		return xinwenlaiyuan;
	}
	/**
	 * 设置：新闻内容
	 */
	public void setXinwenneirong(String xinwenneirong) {
		this.xinwenneirong = xinwenneirong;
	}
	/**
	 * 获取：新闻内容
	 */
	public String getXinwenneirong() {
		return xinwenneirong;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：新闻封面
	 */
	public void setXinwenfengmian(String xinwenfengmian) {
		this.xinwenfengmian = xinwenfengmian;
	}
	/**
	 * 获取：新闻封面
	 */
	public String getXinwenfengmian() {
		return xinwenfengmian;
	}

}
