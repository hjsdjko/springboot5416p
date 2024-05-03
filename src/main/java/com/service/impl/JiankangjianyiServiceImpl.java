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


import com.dao.JiankangjianyiDao;
import com.entity.JiankangjianyiEntity;
import com.service.JiankangjianyiService;
import com.entity.vo.JiankangjianyiVO;
import com.entity.view.JiankangjianyiView;

@Service("jiankangjianyiService")
public class JiankangjianyiServiceImpl extends ServiceImpl<JiankangjianyiDao, JiankangjianyiEntity> implements JiankangjianyiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangjianyiEntity> page = this.selectPage(
                new Query<JiankangjianyiEntity>(params).getPage(),
                new EntityWrapper<JiankangjianyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangjianyiEntity> wrapper) {
		  Page<JiankangjianyiView> page =new Query<JiankangjianyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangjianyiVO> selectListVO(Wrapper<JiankangjianyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangjianyiVO selectVO(Wrapper<JiankangjianyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangjianyiView> selectListView(Wrapper<JiankangjianyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangjianyiView selectView(Wrapper<JiankangjianyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
