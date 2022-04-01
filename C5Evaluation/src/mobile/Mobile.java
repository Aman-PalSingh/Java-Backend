package mobile;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Mobile {
	Map<String, List> hs = new HashMap<>();

	public String addMobile(String company, String model) {

		// this method will take a string as a company name and its model as an
		// //argument.
		// ex: "apple", "Iphone13"
		// add the company as key and its model as an element of ArrayList in the above
		// //mobiles HashMap.
		// if the company name already exists then their model should be added to the
		// //existing list.
		// This method should return a message "Mobile added successfully" after
		// //adding a mobile.
		if (hs.containsKey(company)) {
			List<String> list = hs.get(company);
			list.add(model);
			hs.put(company, list);
		} else {
			List<String> arraylist = new ArrayList<String>();
			arraylist.add(model);
			hs.put(company, arraylist);
		}
		String output = "Mobile addition successful";
		return output;
	}

	public ArrayList<String> getModels(String company){ 
		//This method return the list of all the models of the supplied company 
		//if we supply any invalid company name then it should return null value 
	if(hs.containsKey(company))
	{   
		ArrayList<String> retrivalList =  (ArrayList<String>) hs.get(company);
		return retrivalList;
	}else
	{
		return null;
	}
	}

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		Scanner scan = new Scanner(System.in);
		System.out.println("If you want to add products press A else press B");
		String choiceToAdd = scan.next();
		if(choiceToAdd.equalsIgnoreCase("A"))
		{
		while (true) {
			System.out.println("Enter The Company Name");
			String company = scan.next();
			System.out.println("Enter The Model Name");
			String Model = scan.next();
			System.out.println(mobile.addMobile(company, Model));
			System.out.println("Do you want to add more If YES write Y else N");
			String choice = scan.next();

			if (choice.equalsIgnoreCase("n")) {
				break;
			}
		}
		System.out.println(mobile.hs);
		}
			
			System.out.println("Enter the company name to get its models");
			String cmp = scan.next();
			ArrayList listOfModels =mobile.getModels(cmp);
			System.out.println(listOfModels);
		
	}

}
