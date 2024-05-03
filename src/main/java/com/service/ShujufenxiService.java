package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShujufenxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShujufenxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShujufenxiView;


/**
 * 数据分析
 *
 * @author 
 * @email 
 * @date 2023-05-06 10:34:32
 */
public interface ShujufenxiService extends IService<ShujufenxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShujufenxiVO> selectListVO(Wrapper<ShujufenxiEntity> wrapper);
   	
   	ShujufenxiVO selectVO(@Param("ew") Wrapper<ShujufenxiEntity> wrapper);
   	
   	List<ShujufenxiView> selectListView(Wrapper<ShujufenxiEntity> wrapper);
   	
   	ShujufenxiView selectView(@Param("ew") Wrapper<ShujufenxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShujufenxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShujufenxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShujufenxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShujufenxiEntity> wrapper);



}

