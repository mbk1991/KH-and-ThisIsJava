package com.kh.zoointerface;

public class ZooKeeper {
	public void feed() {
		System.out.println("feed meat");
	}
	
	public void feed(Predator predator) {
		System.out.println("feed" + predator.animalFood());
	}
//	
//	public void feed(Tiger tiger) {
//		System.out.println("feed beef");
//	}
//	
//	public void feed(Lion lion) {
//		System.out.println("feed chicken");
//	}
//	
//	public void feed(Bear bear) {
//		System.out.println("feed salmon");
//	}
//	
//	public void feed(Leopard leopard) {
//		System.out.println("feed gazel");
//	}
	
	public void feedAnimal() {
		System.out.println("feed vegetable");
	}
}
