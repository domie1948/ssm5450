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


import com.dao.DiscusszuoyefabuDao;
import com.entity.DiscusszuoyefabuEntity;
import com.service.DiscusszuoyefabuService;
import com.entity.vo.DiscusszuoyefabuVO;
import com.entity.view.DiscusszuoyefabuView;

@Service("discusszuoyefabuService")
public class DiscusszuoyefabuServiceImpl extends ServiceImpl<DiscusszuoyefabuDao, DiscusszuoyefabuEntity> implements DiscusszuoyefabuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszuoyefabuEntity> page = this.selectPage(
                new Query<DiscusszuoyefabuEntity>(params).getPage(),
                new EntityWrapper<DiscusszuoyefabuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszuoyefabuEntity> wrapper) {
		  Page<DiscusszuoyefabuView> page =new Query<DiscusszuoyefabuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszuoyefabuVO> selectListVO(Wrapper<DiscusszuoyefabuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszuoyefabuVO selectVO(Wrapper<DiscusszuoyefabuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszuoyefabuView> selectListView(Wrapper<DiscusszuoyefabuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszuoyefabuView selectView(Wrapper<DiscusszuoyefabuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
