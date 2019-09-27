package com.ancel.spider;

import com.ancel.spider.data.UrlNode;

public interface UrlManager{
	UrlNode next();
	boolean add(UrlNode urlNode);
	boolean delete(UrlNode urlNode);
}
