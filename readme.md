
# Insurance Management System

Imagine you are making software for an insurance company. The insurance company has two types of customer profiles: "Individual" and "Enterprise". Design an abstract class named "Account" for the customer profile. The Account class is the account information where all the information of the customer is kept after login to the system. Within the "Account" class is an object reference of type "User". (as an aggeration relationship)



The "User" class refers to the customer's contact information. Customer in "User" class



* name (String),


* last name (String),


* email (String),


* password (String),


* profession (String),


* age (int),


* address list (ArrayList Address),


* last login date (Date),


information is available. Also, the "User" class has a list of ArrayList type addresses. Address information is of two types. Design two classes: Home address ("HomeAddress") and Business address ("BusinessAddress"). These address classes will inherit from an interface named "Address". However, you decide what functions should be in this interface.



Design a class named "AddressManager" that is responsible for adding and removing customer addresses. In this class, define two static functions that can add or remove elements from the address list of the "User" object. You specify these function names.



In the "Account" class, define a "final" type function that prints the customer information on the screen, does not return a value, and whose name is "showUserInfo".



Keep the insurances of the customers in the "Account" class as a list. Design an abstract class named "Insurance" that represents insurance. In this abstract class



* name of the fuse (String),


* cost of insurance (double)


* start-end date of insurance (Date)


* will have variables such as In addition, an abstract function named "calculate" will be defined. This abstract function will be populated in the inherited classes below.



* Deriving from this abstract class



* "HealthInsurance" (private health insurance),


* "ResidenceInsurance" (home insurance),


* "TravelInsurance" (travel insurance),


* "CarInsurance" (auto insurance)


* Design 4 subclasses. Each subclass will calculate the insurance fee by overriding the abstract function called "calculate".



Considering the definitions above, the following should be included in the abstract class "Account".



* user's login status (AuthenticationStatus)


* user object (User)


* List of insurances that the user has taken out (ArrayList)


* Define an enum of type AuthenticationStatus. Define two constants in the enum named SUCCESS and FAIL. It will be used if the SUCCESS login is successful. FAIL will be used if there is no login.


* A function will be defined so that the user can login to his account. This function will receive email and password information and compare the incoming email password information with the email and password in the User class. If the entered information is correct, the login process will be successful. And the user's login status will be pulled to SUCCESS. If the login is unsuccessful, it will throw an "InvalidAuthenticationException" type error. You will have to write this error class by inheriting from the Java class named Exception.


* A non-abstract function will be defined that the user can add to its addresses. A non-abstract function will be defined, from which the user can extract addresses. A function that returns a value that gives the user's login status will be defined.


An abstract function will be defined so that the user can add an insurance policy. This abstract class will be populated by overriding subclasses named "Individual" and "Enterprise". Because the profit margin applied to the prices of the packages added by individual and corporate customers will be different.


The "Individual" and "Enterprise" classes will inherit from the "Account" class.



Design a class called AccountManager. Let this class maintain a data list of type TreeSet. Keep the individual and corporate accounts you have created in this list. In this class, define a function called login. This function will return the Account object to the place where it was called, if it retrieves the email and password information provided from outside and navigates through the Account list and finds a suitable login action. This function will call the "login" function on the Account object. Note that this function could throw an "InvalidAuthenticationException" type error. Therefore, do not forget to set up a try-catch mechanism here.



Note that it inherits from the "Comparable" interface, as we will keep objects from the "Account" class in the TreeSet. Also, don't forget to fill in the "hashCode" and "equals" functions of the "Account" class.



Design a class that retrieves email and password information from the keyboard. Call the "login" function in the AccountManager class with the email and password information obtained from the keyboard. If you are logged in with a valid user, this function will return you an Account type object.


## Kullanılan Teknolojiler


**Programming Language:** Java

  

  
