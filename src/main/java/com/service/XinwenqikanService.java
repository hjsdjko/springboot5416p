package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinwenqikanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinwenqikanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinwenqikanView;


/**
 * 新闻期刊
 *
 * @author 
 * @email 
 * @date 2023-05-06 10:34:32
 */
public interface XinwenqikanService extends IService<XinwenqikanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwenqikanVO> selectListVO(Wrapper<XinwenqikanEntity> wrapper);
   	
   	XinwenqikanVO selectVO(@Param("ew") Wrapper<XinwenqikanEntity> wrapper);
   	
   	List<XinwenqikanView> selectListView(Wrapper<XinwenqikanEntity> wrapper);
   	
   	XinwenqikanView selectView(@Param("ew") Wrapper<XinwenqikanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwenqikanEntity> wrapper);
   	

}

