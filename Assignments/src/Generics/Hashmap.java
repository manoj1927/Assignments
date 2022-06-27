package Generics;

import java.util.HashMap;
import java.util.Random;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<Integer,Double> map= new HashMap();
//		map.put(1, 1000.00);
//		map.put(2, 2000.00);
//		map.put(3, 3000.00);
//		map.put(4, 4000.00);
//		map.put(5, 5000.00);
//		map.put(6, 6000.00);
//		map.put(7, 7000.00);
//		map.put(8, 8000.00);
//		map.put(9, 9000.00);
//		map.put(10,10000.00);
//		
//		System.out.println(map);
		Random r=new Random();
        int max=45;
        double range=8.76;
        double min=7;
        for (int i = 0; i < 10; i++) {
            int x=(int)(r.nextInt(max));
            double y=range+r.nextDouble()-min;
            //store.put(x,y);
            System.out.println(x+" "+y);
        }
        System.out.println(" ");
       // System.out.println(store);
	}

}
