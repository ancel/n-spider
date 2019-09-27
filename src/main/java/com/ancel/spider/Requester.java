package com.ancel.spider;

import com.ancel.spider.data.UrlNode;
import com.ancel.spider.data.UrlResponse;
import com.ancel.spider.exception.RequestException;

public interface Requester {
	UrlResponse request(UrlNode urlNode) throws RequestException; 
}
