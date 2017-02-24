package org.loblaw.project.model.config;

public class SetUp {

	String rootUrl;
	String browser;
	String breakPoint;
	String language;
	String headless;
	String mailosaur_mailbox = "51d281ef";
	String mailosaur_api_key = "9fb0fa4abdc7e67";
	String browserWidth;

	public String getRootUrl() {
		return rootUrl;
	}

	public void setRootUrl(String rootUrl) {
		this.rootUrl = rootUrl;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getBreakPoint() {
		return breakPoint;
	}

	public void setBreakPoint(String breakPoint) {
		this.breakPoint = breakPoint;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getHeadless() {
		return headless;
	}

	public void setHeadless(String headless) {
		this.headless = headless;
	}

	public String getBrowserWidth() {
		return browserWidth;
	}

	public void setBrowserWidth(String browserWidth) {
		this.browserWidth = browserWidth;
	}

	public int browserWidth(){
		
		String breakpoint = getBreakPoint();
		int width = 0;
		
		switch(breakpoint){
		
			case "mobile":
			 	width = 650;
			 	break;
			case "tablet":
				width = 950;
				break;
			case "desktop" :
				width = 1200;
				break;
		}
		
		return width;
		
	}

}
