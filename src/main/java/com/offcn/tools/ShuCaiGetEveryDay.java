package com.offcn.tools;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.offcn.pojo.ShuCai;

public class ShuCaiGetEveryDay {
	public static void main(String[] args) {
		List<ShuCai> nowDayShuCai = getNowDayShuCai("2018-03-27");
System.out.println("jieshu"+nowDayShuCai.size());
	}
	public static List<ShuCai> getNowDayShuCai(String date){
		
		List<ShuCai> list=new ArrayList<ShuCai>();
		ok:for(int i=1;true;i++){
			String url="http://www.xinfadi.com.cn/marketanalysis/1/list/"+i+".shtml";
			try {
				Document doc=Jsoup.connect(url).get();
				Element first = doc.getElementsByClass("hangqing").first();
				Element left= first.getElementsByClass("hangq_left").first();
				Element table = left.getElementsByTag("table").first();
				Elements trs = table.getElementsByTag("tr");
			
				trs.remove(0);
				try{
				for(Element tr:trs){
			
					Elements td = tr.getElementsByTag("td");
					System.out.println(td.get(6).text());
					System.out.println(td.get(6).text().equals(date));
					if(!td.get(6).text().equals(date)){
						break ok;
					}
					ShuCai noe=new ShuCai();
					noe.setSname(td.get(0).text());
					noe.setSminprice(Double.valueOf(td.get(1).text()));
					noe.setSavgprice(Double.valueOf(td.get(2).text()));
					noe.setSmaxprice(Double.valueOf(td.get(3).text()));
					noe.setStype(td.get(4).text());
					noe.setSunit(td.get(5).text());
					try {
						noe.setSdate(new SimpleDateFormat("yyyy-MM-dd").parse(td.get(6).text()));
					} catch (ParseException e) {
						System.out.println("抓取日期转换异常");
					}
				
					list.add(noe);
			
				}
				}catch (Exception e) {
					System.out.println("大转换异常");
					continue;
				}
			} catch (IOException e) {
				System.out.println("抓取连接地址异常");
			} 
	   }     
		return list;
	}
	
}
