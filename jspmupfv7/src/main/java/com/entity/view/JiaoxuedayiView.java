package com.entity.view;

import com.entity.JiaoxuedayiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教学答疑
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-25 22:52:24
 */
@TableName("jiaoxuedayi")
public class JiaoxuedayiView  extends JiaoxuedayiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoxuedayiView(){
	}
 
 	public JiaoxuedayiView(JiaoxuedayiEntity jiaoxuedayiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoxuedayiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
