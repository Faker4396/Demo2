package com.offcn.service;

public class App {
	public static void main(String[] args) {
		PhoneService p = new PhoneServiceImplService().getPort(PhoneService.class);
		Phone phone = p.findByNumber("15361854615");
		System.out.println(phone.getArea()+phone.getType());
	}
}
