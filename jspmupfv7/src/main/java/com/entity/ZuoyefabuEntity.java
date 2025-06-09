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
 * 作业发布
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-25 22:52:24
 */
@TableName("zuoyefabu")
public class ZuoyefabuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuoyefabuEntity() {
		
	}
	
	public ZuoyefabuEntity(T t) {
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
	 * 作业编号
	 */
					
	private String zuoyebianhao;
	
	/**
	 * 作业标题
	 */
					
	private String zuoyebiaoti;
	
	/**
	 * 作业图片
	 */
					
	private String zuoyetupian;
	
	/**
	 * 作业内容
	 */
					
	private String zuoyeneirong;
	
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
	 * 身份证号码
	 */
					
	private String shenfenzhenghaoma;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
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
	 * 设置：作业编号
	 */
	public void setZuoyebianhao(String zuoyebianhao) {
		this.zuoyebianhao = zuoyebianhao;
	}
	/**
	 * 获取：作业编号
	 */
	public String getZuoyebianhao() {
		return zuoyebianhao;
	}
	/**
	 * 设置：作业标题
	 */
	public void setZuoyebiaoti(String zuoyebiaoti) {
		this.zuoyebiaoti = zuoyebiaoti;
	}
	/**
	 * 获取：作业标题
	 */
	public String getZuoyebiaoti() {
		return zuoyebiaoti;
	}
	/**
	 * 设置：作业图片
	 */
	public void setZuoyetupian(String zuoyetupian) {
		this.zuoyetupian = zuoyetupian;
	}
	/**
	 * 获取：作业图片
	 */
	public String getZuoyetupian() {
		return zuoyetupian;
	}
	/**
	 * 设置：作业内容
	 */
	public void setZuoyeneirong(String zuoyeneirong) {
		this.zuoyeneirong = zuoyeneirong;
	}
	/**
	 * 获取：作业内容
	 */
	public String getZuoyeneirong() {
		return zuoyeneirong;
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
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}
