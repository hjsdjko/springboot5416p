package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JiankangjianyiEntity;
import com.entity.view.JiankangjianyiView;

import com.service.JiankangjianyiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.JavaPairRDD;
import scala.Tuple2;

/**
 * 健康建议
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-06 10:34:32
 */
@RestController
@RequestMapping("/jiankangjianyi")
public class JiankangjianyiController {
    @Autowired
    private JiankangjianyiService jiankangjianyiService;
    @Autowired
    private JavaSparkContext javaSparkContext;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiankangjianyiEntity jiankangjianyi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiankangjianyi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiankangjianyiEntity> ew = new EntityWrapper<JiankangjianyiEntity>();

		PageUtils page = jiankangjianyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangjianyi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiankangjianyiEntity jiankangjianyi, 
		HttpServletRequest request){
        EntityWrapper<JiankangjianyiEntity> ew = new EntityWrapper<JiankangjianyiEntity>();

		PageUtils page = jiankangjianyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangjianyi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiankangjianyiEntity jiankangjianyi){
       	EntityWrapper<JiankangjianyiEntity> ew = new EntityWrapper<JiankangjianyiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiankangjianyi, "jiankangjianyi")); 
        return R.ok().put("data", jiankangjianyiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiankangjianyiEntity jiankangjianyi){
        EntityWrapper< JiankangjianyiEntity> ew = new EntityWrapper< JiankangjianyiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiankangjianyi, "jiankangjianyi")); 
		JiankangjianyiView jiankangjianyiView =  jiankangjianyiService.selectView(ew);
		return R.ok("查询健康建议成功").put("data", jiankangjianyiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiankangjianyiEntity jiankangjianyi = jiankangjianyiService.selectById(id);
        return R.ok().put("data", jiankangjianyi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiankangjianyiEntity jiankangjianyi = jiankangjianyiService.selectById(id);
        return R.ok().put("data", jiankangjianyi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiankangjianyiEntity jiankangjianyi, HttpServletRequest request){
    	jiankangjianyi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiankangjianyi);
        jiankangjianyiService.insert(jiankangjianyi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiankangjianyiEntity jiankangjianyi, HttpServletRequest request){
    	jiankangjianyi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiankangjianyi);
        jiankangjianyiService.insert(jiankangjianyi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiankangjianyiEntity jiankangjianyi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiankangjianyi);
        jiankangjianyiService.updateById(jiankangjianyi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiankangjianyiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
