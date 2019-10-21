package com.wjj.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberUtilTest {

	@Test
	public void testGetPercent() {
		//测试百分比方法
		Integer result = NumberUtil.getPercent(1, 3);
		//输出结果
		System.out.println(result);
	}

}
