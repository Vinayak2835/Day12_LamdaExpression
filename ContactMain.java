   package com.Day12;

   import java.util.Scanner;

   public class ContactMain {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Option: "+ "\n press 1 to display details"+"\n press 2 to add new Contact" +
                "\n press 3 to Edit existing contacts" +"\n press 4 to delete a contact detail " + "\n press 5 to search person by city" +
                "\n press 6 to view person by city" + "\n press 7 to view person by state" +"\n press 0 to quit ");
                int option = input.nextInt();
                AdressBookAdd adressbook = new AdressBook();
                Scanner scanner= new Scanner(System.in);
      
                switch(option) {
                   case 1:adressbook.display();
                          break;
                   case 2:adressbook.display();
    	                  adressbook.addContact();
                          break;
                   case 3:adressbook.display();
    	                  System.out.println("Enter firstName to edit contact details:");
    	                  String firstName = scanner.nextLine();
                          adressbook.editcontact(firstName);
                          break;
                   case 4:adressbook.display();
        	          System.out.println("Enter a personName wants to delete");
                          String deletecontact = scanner.nextLine();
                          adressbook.delete(deletecontact);
                   case 5:adressbook.display();
        	          System.out.println("Enter Firstname to search person by city :");
                          String name = input.next();
                          adressbook.searchPersonByCity(name);
                          break;
                   case 6:adressbook.display();
        	          System.out.println("Enter the City Name: ");
                          String city = input.next();
                          adressbook.viewByCity(city);
                          break;
                  }
	  }
  }
