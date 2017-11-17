package org.karen.wx.base.common.matcher;

import org.karen.wx.base.common.api.WxMessageMatcher;
import org.karen.wx.base.common.bean.WxXmlMessage;

/**
 * 示例：DemoMatcher匹配器
 * 目的：拦截“在吗”的消息
 * 
 * @author antgan
 * @date 2016/12/15
 *
 */
public class DemoMatcher implements WxMessageMatcher{

	@Override
	public boolean match(WxXmlMessage message) {
		//拦截“在吗”的消息，true通行；false拦截
		if("在吗".equals(message.getContent())){
			return false;
		}
		return true;
	}
}
