/* BloodSort by Kevin Glenn
Description: defines the comparators for BloodSort
*/
import java.util.*;

class IdNumComparator implements Comparator<BloodDonor>
{
	public int compare (BloodDonor b1, BloodDonor b2)
	{
		int id1 = b1.idNum;
		int id2 = b2.idNum;
		return id1-id2;
	}
}

class LastNameComparator implements Comparator<BloodDonor>
{
	public int compare (BloodDonor b1, BloodDonor b2)
	{
		String l1 = b1.lastName;
		String l2 = b2.lastName;
		int cval = l1.compareTo(l2);
		return cval;
	}
}

class FirstNameComparator implements Comparator<BloodDonor>
{
	public int compare (BloodDonor b1, BloodDonor b2)
	{
		String f1 = b1.firstName;
		String f2 = b2.firstName;
		int cval = f1.compareTo(f2);
		return cval;
	}
}


class TypeComparator implements Comparator<BloodDonor>
{
	public int compare (BloodDonor b1, BloodDonor b2)
	{
		String t1 = b1.type;
		String t2 = b2.type;
		int cval = t1.compareTo(t2);
		return cval;
	}
}

class DonationTimeComparator implements Comparator<BloodDonor>
{
	public int compare (BloodDonor b1, BloodDonor b2)
	{
		Double dt1 = b1.donationTime;
		Double dt2 = b2.donationTime;
		int cval = dt1.compareTo(dt2);
		return cval;
		
	}
}

public class BloodDonor
{
	public int idNum;
	public String lastName;
	public String firstName;
	public String type;
	public double donationTime;

	public BloodDonor (int id, String l, String f, String t, double dt)
	{
		idNum = id;
		lastName = l;
		firstName = f;
		type = t;
		donationTime = dt;
	}

	public String toString()
	{
		return idNum + ", " + lastName + ", " + firstName + ", " + type + ", " + donationTime;
	}
}
