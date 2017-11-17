package org.karen.wx.base.common.handler;

import java.util.Map;

import org.karen.wx.base.common.api.IService;
import org.karen.wx.base.common.api.WxMessageHandler;
import org.karen.wx.base.common.bean.WxXmlMessage;
import org.karen.wx.base.common.bean.WxXmlOutMessage;
import org.karen.wx.base.common.exception.WxErrorException;

/**
 * 示例：DemoHandler
 * 目的：返回用户 “你好”
 * @author antgan
 * @date 2016/12/15
 *
 */
public class DemoHandler implements WxMessageHandler{

	@Override
	public WxXmlOutMessage handle(WxXmlMessage wxMessage, Map<String, Object> context, IService iService)
			throws WxErrorException {
        //必须以build()作为结尾，否则不生效。
		WxXmlOutMessage xmlOutMsg = WxXmlOutMessage.TEXT().content("你好").toUser(wxMessage.getFromUserName()).fromUser(wxMessage.getToUserName()).build();
		return xmlOutMsg;
	}
	
}
