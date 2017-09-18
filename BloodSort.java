/* BloodSort by Kevin Glenn
Description: program to sort through a list of donors
*/
import java.io.*;
import java.util.*;


public class BloodSort
{
	public static void main(String[] args)
	{

		//probably a better way to do this
		String id = "Id num";
		String last = "Last";
		String first = "First";
		String bType = "Type";
		String time = "Time";
		//System.out.printf("%-15s %-15s %-15s %-15s %-15s",
		//				id, last, first, bType, time);
		//System.out.println("\n");

		try
		{
			ArrayList<BloodDonor> bloodType = new ArrayList<BloodDonor>();
			// 0			1		  2			    3		4
			// ["idNum", "lastName", "firstName", "type", "donationTime"]

			Scanner scan = new Scanner(new File (args[0]));
			while (scan.hasNext())
			{
				String line = scan.nextLine();
				String[] tokens = line.split(",");
				BloodDonor b = new BloodDonor(
					Integer.parseInt(tokens[0]),	//idNum
					tokens[1],	//lastName
					tokens[2], //firstName
					tokens[3], //type
					Double.parseDouble(tokens[4]) //donationTime
					);
					bloodType.add(b);
			}

			if (args[1].equals("id"))
			{
				IdNumComparator comparator = new IdNumComparator();
				Collections.sort(bloodType, comparator);
				System.out.print("\nBlood donor sorting program by Kevin Glenn\n\n");
				System.out.printf("%-15s %-20s %-20s %-20s %-20s%n%n",
						id, last, first, bType, time);
			}
			else if (args[1].equals("last"))
			{
				LastNameComparator comparator = new LastNameComparator();
				Collections.sort(bloodType, comparator);
				System.out.print("\nBlood donor sorting program by Kevin Glenn\n\n");
				System.out.printf("%-15s %-20s %-20s %-20s %-20s%n%n",
						id, last, first, bType, time);
			}
			else if (args[1].equals("first"))
			{
				FirstNameComparator comparator = new FirstNameComparator();
				Collections.sort(bloodType, comparator);
				System.out.print("\nBlood donor sorting program by Kevin Glenn\n\n");
				System.out.printf("%-15s %-20s %-20s %-20s %-20s%n%n",
						id, last, first, bType, time);
			}
			else if (args[1].equals("type"))
			{
				TypeComparator comparator = new TypeComparator();
				Collections.sort(bloodType, comparator);
				System.out.print("\nBlood donor sorting program by Kevin Glenn\n\n");
				System.out.printf("%-15s %-20s %-20s %-20s %-20s%n%n",
						id, last, first, bType, time);
			}
			else if (args[1].equals("time"))
			{
				DonationTimeComparator comparator = new DonationTimeComparator();
				Collections.sort(bloodType, comparator);
				System.out.print("\nBlood donor sorting program by Kevin Glenn\n\n");
				System.out.printf("%-15s %-20s %-20s %-20s %-20s%n%n",
						id, last, first, bType, time);
			}
			else 
			{
				System.out.println("Please enter a valid argument.\nUsage is as follows: java BloodSort <filename> <category>\nExample: java BloodSort donors.txt first");
				System.exit(0);
			}


			for (BloodDonor b : bloodType)
			{
				System.out.printf("%6d		%-20s %-20s %-20s %6.1f%n",
					b.idNum, b.lastName, b.firstName, b.type, b.donationTime);
				     //int     //string     //string  //string 		//double
			}
			

		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Please enter the name of a valid file.");
			//ex.printStackTrace();
		}
	}
}