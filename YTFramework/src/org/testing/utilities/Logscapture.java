package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logscapture 
{
	public static void takelogs(String message, String classname)
	{
		DOMConfigurator.configure("../YTFramework/src/org/testing/utilities/layout.xml");
		Logger l = Logger.getLogger(classname);
		l.info(message);
	}

}
