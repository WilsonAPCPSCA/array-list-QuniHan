import java.util.ArrayList;
public class emperorsNewGrove {

	public static void main(String[] args) {
		ArrayList <String> emperorCast = new ArrayList<String>();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		System.out.print(emperorCast);
		emperorCast.add(3,"Chara");
		emperorCast.add(4,"Tipo");
		emperorCast.remove(1);
		emperorCast.add("Bucky");
		emperorCast.add("Pacha");
		System.out.print(emperorCast);

	}

}
