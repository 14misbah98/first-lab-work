package com.day8;

public class ClassesAndObjects17 {

	public static void main(String[] args) {
		DominoPizza domino=new TiwariDominoPizza();
		domino.getOrder();
	}
}
//Template method pattern
abstract class DominoPizza{
	final public void makeDough() {
		System.out.println("dominos way of making dough....");
	}
	final public void makeIngredients() {
		System.out.println("dominos way of making ingredients...");
	}
	final public void baking() {
		System.out.println("dominos way of baking pizza...");
	}
	final public void packing() {
		System.out.println("dominos way of packing.....");
	}
	final public void orderProcessing() {//template method
		makeDough();
		makeIngredients();
		baking();
		packing();
	}
	public abstract void getOrder();
	public abstract void getPayment();
	public abstract void delivery();
}
class TiwariDominoPizza extends DominoPizza{
	@Override
	public void getOrder() {
		getPayment();//by tiwari
		orderProcessing();//this is defined by domino
		delivery();//by tiwari
	}
	@Override
	public void getPayment() {
		System.out.println("tiwari implements payment methods as per the country tiwari lives in");
	}
	@Override
	public void delivery() {
		System.out.println("tiwari implement delivery methods as per the country tiwari lives in...");
	}
}	
	

