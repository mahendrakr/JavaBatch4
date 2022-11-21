package homework;

/**
Chef's computer has N GB of free space. He wants to save X files,
 each of size 1 GB and Y files, each of size 2 GB on his computer. Will he be able to do so?

Chef can save all the files on his computer only 
if the total size of the files is less than or equal to the space available on his computer.

-->Input Format
The first line contains an integer T, denoting the number of test cases. The T test cases then follow:

The first and only line of each test case contains three integers N, X,,Y, denoting the free-space in computer, the number of 1 and 2 GB files respectively.
-->Output Format
For each test case, print YES if Chef is able to save the files and NO otherwise.

1 5
1 6
1 1
1 2

 */
import java.util.*;
import java.util.Map.Entry;

public class LastDigit {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(2, "A");
		map.put(3, "B");
		map.put(4, "C");
		System.out.println(map);
		String value = map.get(2);
		System.out.println(value);
		System.out.println("*********************");
		Map<String, String> map1 = new HashMap<>();
		map1.put("A", "a");
		map1.put("B", "b");
		map1.put("C", "c");
		System.out.println(map1);
       System.out.println("********************");
       
	      Set<Entry<Integer,String>> set = map.entrySet();
	      //set.add()
	}

}
