package com.xworkz.colllections.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collection;

public class WeponDtoRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<WeponDto> wepon = new ArrayList<WeponDto>();
		wepon.add(new WeponDto("Ak-47 gun", "ram", "india", 10000, Type.Handgun));
		wepon.add(new WeponDto("Ak-47 gun", "ram", "india", 10000, Type.Handgun));
		wepon.add(new WeponDto("Ak-47 gun", "ram", "india", 10000, Type.Handgun));
		wepon.add(new WeponDto("Ak-47 gun", "ram", "india", 10000, Type.Handgun));
		wepon.add(new WeponDto("Ak-47 gun", "ram", "india", 10000, Type.Handgun));
		wepon.add(new WeponDto("Ak-47 gun", "ram", "india", 10000, Type.Handgun));
		wepon.add(new WeponDto("Ak-47 gun", "ram", "india", 10000, Type.Handgun));
		wepon.add(new WeponDto("Ak-47 gun", "ram", "india", 10000, Type.Handgun));

		System.out.println(wepon);
	}

}
