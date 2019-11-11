package simplesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SimpleSort {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = {-2,0,1,4,5,-8};

		ArrayList<Integer> numbersList =
				new ArrayList<Integer>();
			for(int n:numbers) {
				numbersList.add(n);
		}
			Comparator<Integer> c = (n1,n2)->n1-n2;//asc

			if(args.length>0) {
				switch(args[0]) {
				case "c1":
					c=(n1,n2)->n2-n1;//desc
					break;

				case "c2":
					c=(n1,n2)->n1*n1-n2*n2;
					break;

				case "c3":
					c=new Comparator<Integer>() {
					public int compare(Integer n1,Integer n2) {
						return n2-n1;
						}
					};
					break;

					default:
						break;
				}
			}
			Collections.sort(numbersList,c);
			for(int n:numbersList) {
				System.out.println(n+" ");
			}
			System.out.print("\n");
	}
}
