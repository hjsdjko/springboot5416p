package com.entity.vo;

import com.entity.JiankangjianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康建议
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-05-06 10:34:32
 */
public class JiankangjianyiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 健康分析
	 */
	
	private String jiankangfenxi;
		
	/**
	 * 健康建议
	 */
	
	private String jiankangjianyi;
				
	
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
	 * 设置：健康分析
	 */
	 
	public void setJiankangfenxi(String jiankangfenxi) {
		this.jiankangfenxi = jiankangfenxi;
	}
	
	/**
	 * 获取：健康分析
	 */
	public String getJiankangfenxi() {
		return jiankangfenxi;
	}
				
	
	/**
	 * 设置：健康建议
	 */
	 
	public void setJiankangjianyi(String jiankangjianyi) {
		this.jiankangjianyi = jiankangjianyi;
	}
	
	/**
	 * 获取：健康建议
	 */
	public String getJiankangjianyi() {
		return jiankangjianyi;
	}
			
}
