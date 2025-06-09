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
 * 教学答疑
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-25 22:52:24
 */
@TableName("jiaoxuedayi")
public class JiaoxuedayiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoxuedayiEntity() {
		
	}
	
	public JiaoxuedayiEntity(T t) {
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
	 * 资源编号
	 */
					
	private String ziyuanbianhao;
	
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
	 * 设置：资源编号
	 */
	public void setZiyuanbianhao(String ziyuanbianhao) {
		this.ziyuanbianhao = ziyuanbianhao;
	}
	/**
	 * 获取：资源编号
	 */
	public String getZiyuanbianhao() {
		return ziyuanbianhao;
	}
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
