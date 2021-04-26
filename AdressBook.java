  package com.Day12;

  import java.util.ArrayList;
  import java.util.List;	
  import java.util.Map;
  import java.util.Scanner;	
  import java.util.stream.Collectors;

  public class AdressBook implements AdressBookAdd {
	
	List<Contact> contacts = new ArrayList<Contact>();
	Scanner sc;
        Scanner scanner = new Scanner(System.in);
    
	public void display() {
	     System.out.println("Existing Contact details:");
	     Contact person1 = new Contact("Vinayak","Naik","Honavar","Banglore","Karnataka",561334,"9591626394");
	     Contact person2 = new Contact("Vijay","Ketan","Kumta","Banglore","Karnataka",571364,"7597626394");
	     System.out.println("FirstName:"+person1.firstname+"\n"+"Last Name:"+person1.lastname+"\n"+"Adress:"+person1.address+"\n"+"City:"+person1.city+"\n"+"State:"+person1.state+"\n"+"ZipCode:"+person1.zipcode+"\n"+"Mobile:"+person1.phoneNumber);
	     contacts.add(person1);
	     contacts.add(person2);
	}
	
	/**
	* the below method is for adding the contacts into the address book
	*/
        public void addContact() {
	      sc = new Scanner(System.in);
	      System.out.println("Enter a firstName:");
	      String firstName = sc.nextLine();
		
	      for(int i=0;i<contacts.size();i++) {
		  if(contacts.get(i).getFirstname().equals(firstName)) {
			System.out.println("Name already exists");
		  }
	       }
		
		System.out.println("Enter a lastName:");
		String lastName = sc.nextLine();
		System.out.println("Enter an adress");
		String adress = sc.nextLine();
		System.out.println("Enter a city:");
		String city = sc.nextLine();
		System.out.println("Enter a State");
		String state = sc.nextLine();
		System.out.println("Enter a zip:");
		int zipcode = sc.nextInt();
		System.out.println("Enter a PhoneNumber");
		String phoneNumber = scanner.nextLine();
		
		Contact person1 = new Contact(firstName, lastName, adress, city, state ,zipcode ,phoneNumber );
		contacts.add(person1);
		System.out.println("FirstName:"+person1.firstname+"\n"+"LastName:"+person1.lastname+"\n"+"Adress:"+person1.address+"\n"+"City:"+person1.city+"\n"+"State:"+person1.state+"\n"+"Zip:"+person1.zipcode+"\n"+"MobileNumber:"+person1.phoneNumber);
		System.out.println("Contact added successfully");
	}
    
        /**
	 * the below method is for editing the contacts from the address book
	 * 
	 * @param firstName
	 */
        @Override
	public void editcontact(String firstName) {
    	
    	/**
         * UC6: refactor the add contact function
         * to check no duplicate first name exists.
         */
	    for(int i = 0; i < contacts.size(); i++) {
		if(contacts.get(i).getFirstname().equals(firstName)) {
			System.out.println("Do you wants to edit ");
			System.out.println( " press 1 to Edit LastName:"+"\n press 2 to Edit Adress:" +"\n press 3 to Edit City" +
                                        "\n press 4 to State " + "\n press 5 to Edit ZipCode"+ "\n press 6 to Edit Phone-Number");
			Contact updateContact = contacts.get(i);
			Scanner userInput = new Scanner(System.in);
			sc = new Scanner(System.in);
			
                        switch(sc.nextInt()) {
				    
			     case 1:System.out.println("Edit your LastName:");
	                            updateContact.setLastname(userInput.nextLine());
	                            break;
			     case 2:System.out.println("Edit your Adress:");
				    updateContact.setAddress(userInput.nextLine());
	                            break;
			     case 3:System.out.println("Edit your City:");
				    updateContact.setCity(userInput.nextLine());
	                            break;
			     case 4:System.out.println("Edit your State:");
				    updateContact.setState(userInput.nextLine());
	                            break;
			     case 5:System.out.println("Edit your ZipCode:");
				    updateContact.setZipcode(userInput.nextInt());
	                            break;
			     case 6:System.out.println("Edit your Phone-Number:");
				    updateContact.setPhoneNumber(userInput.nextLine());
	                            break; 
	             }
		 }
		 else {
			System.out.println("Contact doesn't exits");
		 }
	  }		
	}
    
        /**
	 * the below method is for deleting the contacts from the address book
	 */
        @Override
	public void delete(String firstName) {
	    for(int i =0; i< contacts.size(); i++ ) {
		Contact contact = contacts.get(i);
		if(contacts.get(i).getFirstname().equals(firstName)) {
		     contacts.remove(contact);
		     System.out.println("Contact deleted successfully");
		}
		else {
		     System.out.println("Contact doesn't exists");
		}
	    }
	}
    
        /**
        * UC8: Search a person in a city or state accross the multiple AddressBook
        *
        * @param firstname
        */
        @Override
	public void searchPersonByCity(String firstname) {
		List<Contact> personList = contacts.stream().filter(person1 -> person1.getFirstname().equalsIgnoreCase(firstname)).collect(Collectors.toList());
        personList.stream().forEach(System.out::println);
		
	}
    
      /**
      * UC9: View a person by city or state across the multiple AddressBook
      *
      * @param city and state
      */
      @Override
      public void viewByCity(String city) {
		 List<Contact> personList = contacts.stream().filter(person1 -> person1.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
	        personList.stream().forEach(System.out::println);
	        Map<String, Contact> map = personList.stream().collect(Collectors.toMap(Contact::getFirstname, personDetail -> personDetail));
	        System.out.println();
	}

	@Override
	public void viewByState(String state) {
		 List<Contact> personList = contacts.stream().filter(person1 -> person1.getState().equalsIgnoreCase(state)).collect(Collectors.toList());
	        personList.stream().forEach(System.out::println);
	        Map<String, Contact> map = personList.stream().collect(Collectors.toMap(Contact::getFirstname, personDetail -> personDetail));
	        System.out.println();
	}
  }
