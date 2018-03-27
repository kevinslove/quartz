package com.offcn.tools;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.offcn.mapper.ScMapper;
import com.offcn.pojo.ShuCai;

public class GetShuCai {
	
    @Autowired
    private ScMapper scMapper;
 
	public void getAllDate(){
		String str=String.format("%tF",new Date());
		System.out.println("定时器开始运行加载"+str+"的数据");
		List<ShuCai> nowDayShuCai = new ShuCaiGetEveryDay().getNowDayShuCai(str);
		System.out.println("shuju======="+nowDayShuCai);
		System.out.println("抓取完毕开始写入数据库");
		scMapper.SaveShuCai(nowDayShuCai);
		System.out.println("写入数据库完毕");
		System.out.println("定时器"+str+"运行完毕");
	}
	public static void main(String[] args) {
        		
	}
	
}
