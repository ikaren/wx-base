package org.karen.wx.base.common.api;

import org.karen.wx.base.common.exception.WxErrorException;

/**
 * 微信异常处理器接口
 * 
 * @author antgan
 *
 */
public interface WxErrorExceptionHandler {

	public void handle(WxErrorException e);

}
