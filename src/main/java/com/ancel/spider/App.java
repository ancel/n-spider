package com.ancel.spider;

public class App {
	public static void main(String[] args) {
		AppTool appTool = new AppTool();
		boolean success = appTool.run(args);
		if(!success) {
			System.exit(1);
		}
	}
}
