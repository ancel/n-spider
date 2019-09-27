package com.ancel.spider;

import com.ancel.spider.data.ParseResult;
import com.ancel.spider.data.UrlResponse;
import com.ancel.spider.exception.ResponseParserException;

public interface ResponseParser {
	ParseResult parse(UrlResponse urlResponse) throws ResponseParserException;
}
