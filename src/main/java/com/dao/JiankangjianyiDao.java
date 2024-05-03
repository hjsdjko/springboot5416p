package com.dao;

import com.entity.JiankangjianyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangjianyiVO;
import com.entity.view.JiankangjianyiView;


/**
 * 健康建议
 * 
 * @author 
 * @email 
 * @date 2023-05-06 10:34:32
 */
public interface JiankangjianyiDao extends BaseMapper<JiankangjianyiEntity> {
	
	List<JiankangjianyiVO> selectListVO(@Param("ew") Wrapper<JiankangjianyiEntity> wrapper);
	
	JiankangjianyiVO selectVO(@Param("ew") Wrapper<JiankangjianyiEntity> wrapper);
	
	List<JiankangjianyiView> selectListView(@Param("ew") Wrapper<JiankangjianyiEntity> wrapper);

	List<JiankangjianyiView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangjianyiEntity> wrapper);
	
	JiankangjianyiView selectView(@Param("ew") Wrapper<JiankangjianyiEntity> wrapper);
	

}
