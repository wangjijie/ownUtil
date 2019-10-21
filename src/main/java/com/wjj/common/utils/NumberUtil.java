package com.wjj.common.utils;

import java.text.NumberFormat;

public class NumberUtil {
	/*
	* 百分比计算方法，返回值只要整数不需要小数。
	* 给一个当前数，和一个总数，计算当前数百分占比，例如参数为5和10，方法内部
	* 5除以10得0.5，再乘以100，返回50，注意四舍五入。页面就可以显示50%
	*/
	public static Integer getPercent(int current, int total){
		//定义数值精确类
		NumberFormat instance = NumberFormat.getInstance();
		//设置精确到小数点后几位
		instance.setMaximumFractionDigits(0);
		//计算百分比数值
		String result = instance.format(Math.round((float)current/(float)total*100));
		//返回计算结果将字符串强转成整数类型
		return Integer.parseInt(result);
	}

}
