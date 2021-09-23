package com.day9;

public class MedicalCollege implements Doctor,Surgeon{

	
		@Override
		public void doCure() {
			System.out.println("alopathy cure is implemented here..");
		}
	@Override
		public void doSurgery() {
			System.out.println("surgery done as per alopathy medicine...");
		}
	}
	
	
	


