# Mobile_app

---Part 1.0 Description---

Mobile app that uses Unit test to (Add, Delete, Update)
contact objects within the app.

It would use (In-Memory) data structure, (No-Data-Base)
No (User-interface)

The app 1.0v is composed of (Contact class, Contact Service)

--- requirements ---

->> Contact Class
	+ 1) Object should have required a UNIQUE contact ID (String)[no longer than 10 char ] [Not null]
	+ 2) Object should have requiered firstName (string)[no longer than 10 char][not null]
	+ 3) Obj should have requiered lastName (string)[no longer than 10 char][not null]
	+ 4) Obj should have required  phone string field with [EXACTLY 10 digits][not null]
	+ 5) Obj should requiered address field [that must be no longer than 30 char][not null]



->> Contact Service
	1) service should [add contacts with a unique ID]
	2) service should [delete contacts per contact ID]
	3) service should [update contact fields per contact ID]:
					   firstName, lastName, Number, Address

---END requirements ---

<<----Plan Execution ---->>

==========Contact.java========== 

+) Declare all the variables:

	* contactID
	* firstName
	* lastName
	* phoneNumber
	* address

+) initialize all the variables:

	+Set variables to a placeholder

+) Define the Contact class

+)update the contact class

+)setup getters fpr the contact class elements:
	* getcontactID
	* getfirstName
	* getlastName
	* getphoneNumber
	* getaddress

+) setup the update functions
	* updateContactID
	* updateFirstName
	* updateLastName
	* updatePhoneNumber
	* updateAddress

==========ContactService.java========== 

)Set up the services:
	*Add new contact  						C
	*Get contact list,search for contact	R
	*Update contact   						U
	*Delete contact   						D

	Methods:
		*newContact
		*deleteContact
		*updateFirstName
		*updateLastName
		*updatePhoneNumber
		*updateAddress
		*getContactList
		*searchForContact
		*newUniqueId
