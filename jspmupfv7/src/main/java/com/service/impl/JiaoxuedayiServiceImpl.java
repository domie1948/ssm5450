package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaoxuedayiDao;
import com.entity.JiaoxuedayiEntity;
import com.service.JiaoxuedayiService;
import com.entity.vo.JiaoxuedayiVO;
import com.entity.view.JiaoxuedayiView;

@Service("jiaoxuedayiService")
public class JiaoxuedayiServiceImpl extends ServiceImpl<JiaoxuedayiDao, JiaoxuedayiEntity> implements JiaoxuedayiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoxuedayiEntity> page = this.selectPage(
                new Query<JiaoxuedayiEntity>(params).getPage(),
                new EntityWrapper<JiaoxuedayiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoxuedayiEntity> wrapper) {
		  Page<JiaoxuedayiView> page =new Query<JiaoxuedayiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoxuedayiVO> selectListVO(Wrapper<JiaoxuedayiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoxuedayiVO selectVO(Wrapper<JiaoxuedayiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoxuedayiView> selectListView(Wrapper<JiaoxuedayiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoxuedayiView selectView(Wrapper<JiaoxuedayiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
