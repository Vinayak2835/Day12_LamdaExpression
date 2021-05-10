     package com.Day12;

     public class Contact {
	    public String firstname;
	    public String lastname;
	    public String address;
	    public String city;
	    public String state;
	    public int zipcode;
	    public String phoneNumber;
	    
	      /**
	      * Initialize variables using constructor approach
	      */
	      public Contact(String firstname, String lastname, String address, String city, String state, int zipcode, String phoneNumber) {
			this.firstname = firstname;
			this.lastname = lastname;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zipcode = zipcode;
			this.phoneNumber = phoneNumber;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
			System.out.println("Contact details updated successfully");
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
			System.out.println("Contact details updated successfully");
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
			System.out.println("Contact details updated successfully");
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
			System.out.println("Contact details updated successfully");
		}

		public int getZipcode() {
			return zipcode;
		}

		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
			System.out.println("Contact details updated successfully");
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			System.out.println("Contact details updated successfully");
		}
		
		@Override
		public String toString() {
			return "PersonDetail [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
					+ ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", phoneNumber=" + phoneNumber
					+ "]";
		 }
      }
