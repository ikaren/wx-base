package org.karen.wx.base.wxtools.util.http;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.impl.client.CloseableHttpClient;

import org.karen.wx.base.wxtools.exception.WxErrorException;

/**
 * http请求执行器
 *
 * @param <T>
 *            返回值类型
 * @param <E>
 *            请求参数类型
 */
public interface RequestExecutor<T, E> {

	/**
	 *
	 * @param httpclient
	 *            传入的httpClient
	 * @param uri
	 *            uri
	 * @param data
	 *            数据
	 * @return
	 * @throws WxErrorException
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public T execute(CloseableHttpClient httpclient, String uri, E data)
			throws WxErrorException, ClientProtocolException, IOException;

}
