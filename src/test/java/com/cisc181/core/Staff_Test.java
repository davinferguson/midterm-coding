package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

import java.util.Date;

public class Staff_Test {

	private static ArrayList<Staff> staff = new ArrayList<Staff>();
	//private static ArrayList<Staff> staff2 = new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup() {
		double d = 100000;
		for(int x = 0; x < 5; x++) {
			
			staff.add(new Staff("Jimmy", "H", "Janks", new Date(1980, 04, 26), "167 Wallaby Way", "8889997777", "Killerboi@gmail.com", 
					"6-9", 7, d, new Date(2000, 10, 17), eTitle.MR));
			d += 10000;
		}
		//staff2.add(new Staff("Jimmy", "H", "Janks", new Date(1980, 04, 26), "167 Wallaby Way", "888999777", "Killerboi@gmail.com", 
		//		"6-9", 7, d, new Date(2000, 10, 17), eTitle.MR));
	}
	
	@Test
	public void test() {
		double total = 0;
		for(Staff x : staff) {
			total += x.getSalary();
		}
		total /= 5;
		assertEquals(total, 120000.0,.00001);
	}	

}
