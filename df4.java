import java.util.*;
import java.io.*;

// warren hwhong@ucsd.edu 8589008245 revelle 6:00 
// elon musk@stanford.edu 8888888888 revelle 6:00 
// mark zukerburg@itm.edu 9999999999 revelle 6:00 
// cool beans@uuuuuuu.edu 9999999999 revelle 6:00

//System.out.println("1");

public class df4 {
	//keep track of people who are not matched yet 
    public static ArrayList<String> leftovers = new ArrayList<String>();
    public static int countRunTimes = 0;
	
	public static void main(String[] args) {

		StringBuffer data = new StringBuffer();
		String add;
		boolean fail = false;
		int countRunTimes = 0;

		//initial arraylist to put people in
        ArrayList<String> list = new ArrayList<String>();

        ArrayList<String> revelle = new ArrayList<String>();
        ArrayList<String> muir = new ArrayList<String>();
        ArrayList<String> warrenc = new ArrayList<String>();
        ArrayList<String> erc = new ArrayList<String>();
        ArrayList<String> village = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNextLine()){
			list.add(scanner.nextLine());
		}

		//sort them first by college of choice (eating place)
		for(int i = 0; i < list.size(); i++) {

			if(list.get(i).contains("revelle")) {

				revelle.add(list.get(i));

			} else if(list.get(i).contains("muir")) {

				muir.add(list.get(i));

			} else if(list.get(i).contains("warrenc")) {

				warrenc.add(list.get(i));

			} else if(list.get(i).contains("erc")) {

				erc.add(list.get(i));

			} else {
			//if the user chooses village 
				village.add(list.get(i));
		
			}
		}

		sort(revelle);
		sort(muir);
		sort(warrenc);
		sort(erc);
		sort(village);

		for(int x = 0; x < leftovers.size(); x++) {
			System.out.println(leftovers.get(x));
		}

	}

	//sort them based on the time they've chosen
	private static void sort(ArrayList<String> list) {

		ArrayList<String> fivethirty = new ArrayList<String>();
		ArrayList<String> six = new ArrayList<String>();
		ArrayList<String> sixthirty = new ArrayList<String>();

		for(int i = 0; i < list.size(); i++) {

			if(list.get(i).contains("5:30")) {

				fivethirty.add(list.get(i));

			} else if (list.get(i).contains("6:00")) {

				six.add(list.get(i));

			} else {
			//the user chose the time slot of 6:30
				sixthirty.add(list.get(i));
			}

		}

		countRunTimes++;

		//sort them based on the time they've chosen
		print(fivethirty);
		print(six);
		print(sixthirty);

	}

	//inputs the arraylist of people who choose that time slot 
	// i.e 5:30, 6:00, or 6:30
	public static void print(ArrayList<String> list) {

		for (int i = list.size() - (list.size() % 4); i < list.size(); i++){
			leftovers.add(list.get(i));
		}

		String[] names = new String[4];
		String[] emails = new String[4];
		String[] mobiles = new String[4];
	
		int counter = 0;

		for(int i = 0; i < list.size(); i++) {

			String[] parsed = list.get(i).split(" ");

			String name = parsed[0];
			String email = parsed[1];
			String mobile = parsed[2];
			String place = parsed[3];
			String time = parsed[4];

			names[counter] = name;
			emails[counter] = email;
			mobiles[counter] = mobile;

			counter++;

			if(counter == 4) {

				System.out.println("Hello!");
				System.out.println();
				System.out.println("Again, thank you for signing up. The group you are matched with is " + 
					names[0] + " , " + names[1] + ", " + names[2] + " and " + names[3]);
				System.out.println("You will be eating at " + place + ", at " + time );
				System.out.println();
				System.out.println("Here are the contact information of your friends:" );
				System.out.println();
				for(int y = 0; y < 4; y++) {
					System.out.println(names[y] + " : Email - " + emails[y] + ", Mobile number - " + mobiles[y]);
				}
				System.out.println();
				System.out.println("Here are some ways to reach your friends...");
				System.out.println("1. Set up a GroupMe chatroom");
				System.out.println("2. Contact each other via email");
				System.out.println("3. Locate each other by phone on Friday");
				System.out.println();
				System.out.println("I hope you have a wonderful time with your new friends! :)");
				System.out.println();
				System.out.println("All the best,");
				System.out.println("Dinner for Four");

				System.out.println("---------------------------------------------------------------------");

				counter = 0;
			}
		}
	}
}