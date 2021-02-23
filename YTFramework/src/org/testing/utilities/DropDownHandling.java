package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling 
{
	public static void DropdownSelectionByIndex(WebElement element, int Index)
	{
		Select s = new Select(element);
		s.selectByIndex(Index);
	}
	public static void DropdownSelectionByVisibletext(WebElement element, String Visibletext)
	{
		Select s = new Select(element);
		s.selectByVisibleText(Visibletext);
	}
	public static void DropdownSelectionByValue(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}


}
