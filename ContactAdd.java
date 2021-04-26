  package com.Day12;

  public interface AdressBookAdd {
	//abstract methods
	void display();
	void addContact();
	void editcontact(String firstName);
	void delete(String deletecontact);
	void searchPersonByCity(String firstname);
	void viewByCity(String city);
	void viewByState(String state);
  }
