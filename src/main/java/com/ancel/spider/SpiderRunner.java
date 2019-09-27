package com.ancel.spider;

import com.ancel.spider.data.UrlNode;

public abstract class SpiderRunner {
	protected UrlManager urlManager;
	protected Requester requester;
	protected ResponseParser responseParser;
	protected Store<UrlNode> urlNodeStore;
	
	public abstract boolean run();
}
