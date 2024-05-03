package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangjianyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangjianyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangjianyiView;


/**
 * 健康建议
 *
 * @author 
 * @email 
 * @date 2023-05-06 10:34:32
 */
public interface JiankangjianyiService extends IService<JiankangjianyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangjianyiVO> selectListVO(Wrapper<JiankangjianyiEntity> wrapper);
   	
   	JiankangjianyiVO selectVO(@Param("ew") Wrapper<JiankangjianyiEntity> wrapper);
   	
   	List<JiankangjianyiView> selectListView(Wrapper<JiankangjianyiEntity> wrapper);
   	
   	JiankangjianyiView selectView(@Param("ew") Wrapper<JiankangjianyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangjianyiEntity> wrapper);
   	

}

