package org.loblaw.project.lib;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;

public class ElementMatcher {
	
	public String allElementNotPresent(ArrayList<WebElement> element){
		
		for(int i=0; i<element.size(); i++){
			element.get(i);
			System.out.println("Element is not present: "+ element.get(i));
		}
		
		return "All elements not present";
	}

	public String oneElementNotPresent(WebElement element){
		return "One of many elements is not present" + element.toString();
	}
	
	
	
}
