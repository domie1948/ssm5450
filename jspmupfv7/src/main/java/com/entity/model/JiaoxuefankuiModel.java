package com.entity.model;

import com.entity.JiaoxuefankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教学反馈
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-25 22:52:24
 */
public class JiaoxuefankuiModel  implements Serializable {
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
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 教师性别
	 */
	
	private String jiaoshixingbie;
		
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
	 * 反馈日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fankuiriqi;
				
	
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
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：教师性别
	 */
	 
	public void setJiaoshixingbie(String jiaoshixingbie) {
		this.jiaoshixingbie = jiaoshixingbie;
	}
	
	/**
	 * 获取：教师性别
	 */
	public String getJiaoshixingbie() {
		return jiaoshixingbie;
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
	 * 设置：反馈日期
	 */
	 
	public void setFankuiriqi(Date fankuiriqi) {
		this.fankuiriqi = fankuiriqi;
	}
	
	/**
	 * 获取：反馈日期
	 */
	public Date getFankuiriqi() {
		return fankuiriqi;
	}
			
}
