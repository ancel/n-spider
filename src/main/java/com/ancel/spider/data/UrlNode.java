package com.ancel.spider.data;

import java.util.List;
import java.util.Map;

public interface UrlNode {
	String getUrl();
	UrlNode getParent();
	List<UrlNode> getChildren();
	Map<String, Object> getData();
	boolean updateData(Map<String, Object> data);
}
