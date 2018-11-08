import java.util.ArrayList;

public class Permutation {

	//ABC

	//ABC
	//ACB
	//BCA
	//BAC
	//CBA
	//CAB

	//""
	public static void main(String[] args) {
		for(String s: perm("abc")) System.out.println(s);
	}
	public static ArrayList<String> perm(String s){
		ArrayList<String> result = new ArrayList<String>();
		if(s.isEmpty()) result.add(s);
		else {
			for(int i = 0; i < s.length(); i++) {
				String shorter = s.substring(0, i)+s.substring(i+1);
				ArrayList<String> shortPerm = perm(shorter);
				for(String str: shortPerm) result.add(s.charAt(i)+str);
			}
		}
		return result;
	}
}
