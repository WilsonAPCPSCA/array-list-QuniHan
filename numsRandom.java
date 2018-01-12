import java.util.ArrayList;
public class numsRandom {

	public static void main(String[] args) {
		ArrayList <Integer> ran = new ArrayList <Integer>();
		for (int i = 0; i<(int)(Math.random()*50)+10;i++){
			ran.add((int)(Math.random()*100)+1);
		}
		System.out.println(ran);
		System.out.println("the size of the array list is: "+ ran.size());
		for (int i = 0; i< ran.size();i++){
			ran.set(i,0);
		}
		System.out.print(ran);
	}

}
