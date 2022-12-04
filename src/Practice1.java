
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Practice1 {

	public static void main(String[] args) {
		System.out.println("ASda");
		List bis = List.of(234, "dfsd", 'd', "sf", "sdfsdf");
		List thise = new LinkedList<>(bis);
		thise.remove(Integer.valueOf(234));

		thise.sort(null);
		System.out.println(bis);
		List<String> arraybis = new ArrayList<>(bis);
		List<String> linkbis = new LinkedList<>(bis);
		List<String> vectorbis = new Vector<>(bis);
		linkbis.add("added at last:");
		linkbis.add(2, "added at seond");

		String[] sdf = { "Asda", "asda" };

		String qqq = "ASdsad";
		qqq.length();
		System.out.println(sdf.length);
		List<String> dsf = List.of(sdf);
		linkbis.addAll(dsf);

		System.out.println(linkbis);
		Iterator weWillDo = linkbis.iterator();
		while (weWillDo.hasNext()) {
			System.out.println(weWillDo.next());
		}
		linkbis.remove("sf");
		linkbis.remove(1);
		System.out.println(linkbis);

		System.out.println("ignoree..........\n \n\n\n");

		List<String> ddd = new LinkedList<String>(dsf);
		arraybis.add("sdsa");
		System.out.println(arraybis);
		String[] bizw = { "sfds", "Sfsf" };
		System.out.println(Arrays.toString(bizw));
		int i = 554;
		switch (i) {
		case 3:
			System.out.println("ffj");
		case 6:
			System.out.println(44 + i);

		}
	}

}
