package com.mkyong.core.utlis;

import java.util.Date;

public class DateUtils {

	public static void main(String[] args) {

		System.out.println(getLocalCurrentDate());

	}

	private static Date getLocalCurrentDate() {
		return new Date();
	}

}