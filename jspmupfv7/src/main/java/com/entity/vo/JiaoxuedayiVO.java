package com.entity.vo;

import com.entity.JiaoxuedayiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 教学答疑
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-25 22:52:24
 */
public class JiaoxuedayiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教学项目
	 */
	
	private String jiaoxuexiangmu;
		
	/**
	 * 教学内容
	 */
	
	private String jiaoxueneirong;
		
	/**
	 * 日期
	 */
	
	private String riqi;
		
	/**
	 * 学生账号
	 */
	
	private String xueshengzhanghao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 身份证号码
	 */
	
	private String shenfenzhenghaoma;
		
	/**
	 * 反馈标题
	 */
	
	private String fankuibiaoti;
		
	/**
	 * 反馈内容
	 */
	
	private String fankuineirong;
		
	/**
	 * 答疑信息
	 */
	
	private String dayixinxi;
		
	/**
	 * 答疑内容
	 */
	
	private String dayineirong;
				
	
	/**
	 * 设置：教学项目
	 */
	 
	public void setJiaoxuexiangmu(String jiaoxuexiangmu) {
		this.jiaoxuexiangmu = jiaoxuexiangmu;
	}
	
	/**
	 * 获取：教学项目
	 */
	public String getJiaoxuexiangmu() {
		return jiaoxuexiangmu;
	}
				
	
	/**
	 * 设置：教学内容
	 */
	 
	public void setJiaoxueneirong(String jiaoxueneirong) {
		this.jiaoxueneirong = jiaoxueneirong;
	}
	
	/**
	 * 获取：教学内容
	 */
	public String getJiaoxueneirong() {
		return jiaoxueneirong;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(String riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public String getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：学生账号
	 */
	 
	public void setXueshengzhanghao(String xueshengzhanghao) {
		this.xueshengzhanghao = xueshengzhanghao;
	}
	
	/**
	 * 获取：学生账号
	 */
	public String getXueshengzhanghao() {
		return xueshengzhanghao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：身份证号码
	 */
	 
	public void setShenfenzhenghaoma(String shenfenzhenghaoma) {
		this.shenfenzhenghaoma = shenfenzhenghaoma;
	}
	
	/**
	 * 获取：身份证号码
	 */
	public String getShenfenzhenghaoma() {
		return shenfenzhenghaoma;
	}
				
	
	/**
	 * 设置：反馈标题
	 */
	 
	public void setFankuibiaoti(String fankuibiaoti) {
		this.fankuibiaoti = fankuibiaoti;
	}
	
	/**
	 * 获取：反馈标题
	 */
	public String getFankuibiaoti() {
		return fankuibiaoti;
	}
				
	
	/**
	 * 设置：反馈内容
	 */
	 
	public void setFankuineirong(String fankuineirong) {
		this.fankuineirong = fankuineirong;
	}
	
	/**
	 * 获取：反馈内容
	 */
	public String getFankuineirong() {
		return fankuineirong;
	}
				
	
	/**
	 * 设置：答疑信息
	 */
	 
	public void setDayixinxi(String dayixinxi) {
		this.dayixinxi = dayixinxi;
	}
	
	/**
	 * 获取：答疑信息
	 */
	public String getDayixinxi() {
		return dayixinxi;
	}
				
	
	/**
	 * 设置：答疑内容
	 */
	 
	public void setDayineirong(String dayineirong) {
		this.dayineirong = dayineirong;
	}
	
	/**
	 * 获取：答疑内容
	 */
	public String getDayineirong() {
		return dayineirong;
	}
			
}
