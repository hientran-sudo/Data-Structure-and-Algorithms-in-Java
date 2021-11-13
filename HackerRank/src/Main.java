import java.util.ArrayList;
import java.util.List;

class Result {
	static int count = 0;

	public static void sockMerchant(List<Integer> arr) {
		List<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < arr.size(); i++) {
			if (temp.size() == 0) {
				temp.add(arr.get(i));

			}

			else {
				for (int j = 0; j < temp.size(); j++) {
					if (arr.get(i) == temp.get(j)) {
						temp.remove(j);
						count++;
						j = temp.size();

					} else if (j == (temp.size() - 1)) {
						temp.add(arr.get(i));
						j = temp.size();

					}
				}
			}

		}

		System.out.println(count);

	}
}

public class Main {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(2);

		Result.sockMerchant(arr);
	}
}
