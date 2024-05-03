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


import com.dao.XinwenqikanDao;
import com.entity.XinwenqikanEntity;
import com.service.XinwenqikanService;
import com.entity.vo.XinwenqikanVO;
import com.entity.view.XinwenqikanView;

@Service("xinwenqikanService")
public class XinwenqikanServiceImpl extends ServiceImpl<XinwenqikanDao, XinwenqikanEntity> implements XinwenqikanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwenqikanEntity> page = this.selectPage(
                new Query<XinwenqikanEntity>(params).getPage(),
                new EntityWrapper<XinwenqikanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwenqikanEntity> wrapper) {
		  Page<XinwenqikanView> page =new Query<XinwenqikanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinwenqikanVO> selectListVO(Wrapper<XinwenqikanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinwenqikanVO selectVO(Wrapper<XinwenqikanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinwenqikanView> selectListView(Wrapper<XinwenqikanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwenqikanView selectView(Wrapper<XinwenqikanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
