package com.ancel.spider.data;

import java.util.List;
import java.util.Map;

public interface ParseResult {
	Map<String, Object> getData();
	List<UrlNode> getUrlNodes();
}
