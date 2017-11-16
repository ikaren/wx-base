package org.karen.wx.base.wxtools.bean.msgbuilder;

import org.karen.wx.base.wxtools.api.WxConsts;
import org.karen.wx.base.wxtools.bean.WxMessage;

/**
 * 文本消息builder
 * 
 * <pre>
 * 用法: WxCustomMessage m = WxCustomMessage.TEXT().content(...).toUser(...).build();
 * </pre>
 * 
 * @author antgan
 *
 */
public final class TextBuilder extends BaseBuilder<TextBuilder> {
	private String content;

	public TextBuilder() {
		this.msgType = WxConsts.CUSTOM_MSG_TEXT;
	}

	public TextBuilder content(String content) {
		this.content = content;
		return this;
	}

	public WxMessage build() {
		WxMessage m = super.build();
		m.setContent(this.content);
		return m;
	}
}
