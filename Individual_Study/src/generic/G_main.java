package generic;

import individual_practice.C;

public class G_main {
	public static void main(String[] args) {
		
	Car<String> c1 = new Car<String>();
	Car<StringBuilder> c2 = new Car<StringBuilder>();
	Car<Long> c3 = new Car<Long>();
	Car<Short> c4 = new Car<Short>();
	Car<Float> c5 = new Car<Float>();
	Car<Integer> c6 = new Car<Integer>();
	Car<Double> c7 = new Car<Double>();
	Car<Character> c8 = new Car<Character>();
	// 자료형은 웬만하면 다 되는 듯 하다.
	
	CarInfo ci = new CarInfo(2);
	CarType ct = new CarType(ci);
	System.out.println("ci의 차는 " + ct.info.grade + "등급");
	/* 카타입의 카타입메서드의 매개변수가 카인포니까 카인포의 메서드를 그대로 참조?
	 * 해서 카타입의 info랑grade는 ci인스턴스의 매개변수를 그대로 갖고온다..? */
	
	BikeInfo bi = new BikeInfo(9);
	BikeType bt = new BikeType(bi);
	System.out.println("bt의 바이크는 " + bt.info.grade + "등급");
	}
	
}
