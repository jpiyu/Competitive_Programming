import static java.lang.System.*;

import java.io.*;
import java.util.*;
public class PriorityQueueDemo {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the elements in one line only");
		String[] str = br.readLine().split(" ");
		int arr[] = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10,new MyComparator());
		for(int i=0;i<10;i++)
		{
			pq.offer(arr[i]);
		}
		while(pq.size() != 0)
		{
			System.out.println(pq.poll());
		}
	}
	static class MyComparator implements Comparator<Integer>
	{
		public int compare(Integer i1, Integer i2) {
			// TODO Auto-generated method stub
			return i2-i1;
		}
	}
}
