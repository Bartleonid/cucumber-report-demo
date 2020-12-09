package com.demo.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.UUID;
import java.util.logging.Level;

public class Utility {

	private static final Logger logger = Logger.getLogger(Utility.class.getName());

	public static String extractValueByRegex(String html, String pattern) {
		String value = null;
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(html);
		if (m.find()) {
			value = m.group(1);
			return value;
		}
		return null;
	}
	
	public static UUID randomId() {
		return java.util.UUID.randomUUID();
	}
	
	public static void main(String[] args) {
		System.out.println(Utility.randomId());
	}
}