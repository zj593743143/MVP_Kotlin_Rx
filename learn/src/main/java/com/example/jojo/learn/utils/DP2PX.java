package com.example.jojo.learn.utils;

import android.content.Context;
import android.util.TypedValue;

/**
 * Created by zj on 2017/1/4.
 * 邮箱：zjuan@yonyou.com
 */
public class DP2PX {
	/**
	* 根据手机的分辨率从 dp 的单位 转成为 px(像素)
	*/
	public static int dip2px(Context context, float dpValue) {
	  final float scale = context.getResources().getDisplayMetrics().density;
	  return (int) (dpValue * scale + 0.5f);
	}

	/**
	* 根据手机的分辨率从 px(像素) 的单位 转成为 dp
	*/
	public static int px2dip(Context context, float pxValue) {
	  final float scale = context.getResources().getDisplayMetrics().density;
	  return (int) (pxValue / scale + 0.5f);
	}
	/**
	 * 将sp转换成px
	 *
	 * @param sp
	 * @return
	 */
	private static int sp2px(Context context,int sp) {
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp,
				context.getResources().getDisplayMetrics());
	}
}
