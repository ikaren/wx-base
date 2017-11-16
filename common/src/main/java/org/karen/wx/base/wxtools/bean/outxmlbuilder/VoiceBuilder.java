package org.karen.wx.base.wxtools.bean.outxmlbuilder;

import org.karen.wx.base.wxtools.bean.WxXmlOutVoiceMessage;

/**
 * 语音消息builder
 * 
 * @author antgan
 */
public final class VoiceBuilder extends BaseBuilder<VoiceBuilder, WxXmlOutVoiceMessage> {

	private String mediaId;

	public VoiceBuilder mediaId(String mediaId) {
		this.mediaId = mediaId;
		return this;
	}

	public WxXmlOutVoiceMessage build() {
		WxXmlOutVoiceMessage m = new WxXmlOutVoiceMessage();
		setCommon(m);
		m.setMediaId(mediaId);
		return m;
	}

}
