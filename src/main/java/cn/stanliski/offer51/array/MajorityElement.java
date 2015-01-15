package cn.stanliski.offer51.array;

/**
 * 
 * Majority Element.
 * 
 * @author stanley_hwang
 *
 */
public class MajorityElement {
	
	/**
	 * Find Majority Element.
	 * @param num
	 * @return
	 */
	public int majorityElement(int[] num) {
		if(num == null || num.length == 0)
			return -1;
		int count = 1;
		int majorityElement = num[0];
		for(int i = 1; i < num.length; i++){
			
			if(majorityElement == num[i])
				count++;
			else{
				count--;
				if(count == 0){
					majorityElement = num[i];
					count = 1;
				}
			}
		}
		return majorityElement;
	}
	
	public static void main(String args[]){
		char c = 'A';
		System.out.println(Integer.valueOf(c));
	}
	
}
