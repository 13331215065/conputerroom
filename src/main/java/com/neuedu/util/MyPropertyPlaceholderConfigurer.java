package com.neuedu.util;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class MyPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
		// TODO Auto-generated method stub
		String result=propertyValue;
		if(propertyName.equals("username")||propertyName.equals("password")){
			result=DESUtils.decode(propertyValue);
		}
		return result;
	}
}
