package com.fw.test;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebServiceSever webservice = new WebServiceSeverService().getPort(WebServiceSever.class);
		//String str = webservice.myPrint("java");
		
		MobileCodeWSSoap mobile = new MobileCodeWS().getPort(MobileCodeWSSoap.class);
		String str = mobile.getMobileCodeInfo("14761854615", null);
		System.out.println(str);
	}

}
