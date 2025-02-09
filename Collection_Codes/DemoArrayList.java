package Collection_Codes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DemoArrayList {
  public static void main(String[] args) throws Exception {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> city = new ArrayList<>();

		while (true) {
			System.out.println("Enter the city : ");
			String c = br.readLine();
			city.add(c);

			System.out.println("Do you want continue[Yes/No]: ");
			String option = br.readLine();

			option = option.toLowerCase(); // no
			if (option.equals("no")) {
				break;
			}else if(option.equals("yes")) {
				continue;
			}
		}
		System.out.println("Cities : " + city);
  }
}
