package com.dao;

import com.entity.ShujufenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShujufenxiVO;
import com.entity.view.ShujufenxiView;


/**
 * 数据分析
 * 
 * @author 
 * @email 
 * @date 2023-05-06 10:34:32
 */
public interface ShujufenxiDao extends BaseMapper<ShujufenxiEntity> {
	
	List<ShujufenxiVO> selectListVO(@Param("ew") Wrapper<ShujufenxiEntity> wrapper);
	
	ShujufenxiVO selectVO(@Param("ew") Wrapper<ShujufenxiEntity> wrapper);
	
	List<ShujufenxiView> selectListView(@Param("ew") Wrapper<ShujufenxiEntity> wrapper);

	List<ShujufenxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShujufenxiEntity> wrapper);
	
	ShujufenxiView selectView(@Param("ew") Wrapper<ShujufenxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShujufenxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShujufenxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShujufenxiEntity> wrapper);



}
