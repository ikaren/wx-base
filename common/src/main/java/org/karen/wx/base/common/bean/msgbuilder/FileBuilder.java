package org.karen.wx.base.common.bean.msgbuilder;

import org.karen.wx.base.common.api.WxConsts;
import org.karen.wx.base.common.bean.WxMessage;

/**
 * 获得消息builder
 * 
 * <pre>
 * 用法: WxCustomMessage m = WxCustomMessage.FILE().mediaId(...).toUser(...).build();
 * </pre>
 * 
 * @author antgan
 *
 */
public final class FileBuilder extends BaseBuilder<FileBuilder> {
	private String mediaId;

	public FileBuilder() {
		this.msgType = WxConsts.CUSTOM_MSG_FILE;
	}

	public FileBuilder mediaId(String media_id) {
		this.mediaId = media_id;
		return this;
	}

	public WxMessage build() {
		WxMessage m = super.build();
		m.setMediaId(this.mediaId);
		return m;
	}
}
