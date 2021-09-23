package com.day9;

import malik.MoleculeFramework;

public class ClassessAndObjects19 {

	public static void main(String[] args) {
Object shoiab=new Human();
		
		//Two medical colleges
		MedicalCollege alopathy=new MedicalCollege();
		AyurvedMedicalCollege ayush=new AyurvedMedicalCollege();
		
		//One pilot academy
		
		JetAirAcademy jet=new JetAirAcademy();
		
		//Doctor doctorShoiab=(Doctor)shoiab;
	//	doctorShoiab.doCure();
		
		//I need to do SUBJECTION NOW....
		//This Molecure  Framework is a code written for interface subjection by Shoiab
		
		//step1
		MoleculeFramework.setInterface(Doctor.class);
		shoiab=MoleculeFramework.getObject(new Object[] {shoiab,ayush});
		
		Doctor doctorShoiab=(Doctor)shoiab;
		doctorShoiab.doCure();
		
		MoleculeFramework.setInterface(Surgeon.class);
		shoiab=MoleculeFramework.getObject(new Object[] {shoiab,ayush});
		Surgeon surgeonShoiab=(Surgeon)shoiab;
		surgeonShoiab.doCure();
		surgeonShoiab.doSurgery();
		
		MoleculeFramework.setInterface(Pilot.class);
		shoiab=MoleculeFramework.getObject(new Object[] {shoiab,jet});
		
		Pilot pilotShoiab=(Pilot)shoiab;
		pilotShoiab.doFly();
		
		surgeonShoiab=(Surgeon)shoiab;
		surgeonShoiab.doCure();
		surgeonShoiab.doSurgery();
		
		doctorShoiab=(Doctor)shoiab;
		doctorShoiab.doCure();
		
	}

	}


