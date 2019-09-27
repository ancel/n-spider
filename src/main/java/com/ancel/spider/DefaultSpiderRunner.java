package com.ancel.spider;

import java.util.List;

import com.ancel.spider.data.ParseResult;
import com.ancel.spider.data.UrlNode;
import com.ancel.spider.data.UrlResponse;
import com.ancel.spider.exception.RequestException;
import com.ancel.spider.exception.ResponseParserException;

public class DefaultSpiderRunner extends SpiderRunner{

	@Override
	public boolean run() {
		UrlNode urlNode;
		while((urlNode=urlManager.next())!=null) {
			UrlResponse urlResponse = null;
			try {
				urlResponse = requester.request(urlNode);
			} catch (RequestException e) {
				throw new RuntimeException(e);
			}
			ParseResult parseResult = null;
			try {
				parseResult = responseParser.parse(urlResponse);
			} catch (ResponseParserException e) {
				throw new RuntimeException(e);
			}
			urlNode.updateData(parseResult.getData());
			List<UrlNode> childNodes =  parseResult.getUrlNodes();
			if(null==childNodes||childNodes.size()<=0) {
				urlNodeStore.save(urlNode);
				urlManager.delete(urlNode);
				continue;
			}
			for (UrlNode childNode : childNodes) {
				urlManager.add(childNode);
			}
		}
		return true;
	}

}
