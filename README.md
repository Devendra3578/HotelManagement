#Note: "Follow the order"
    hotelmanagement/
       1.Food.java
       2. Singleroom.java
       3.Doubleroom.java
       4.Notavailable.java
       5.Holder.java
       6.Hotel.java
       7.Write.java
       8.Main.java


       
**Hotel-Management-OOP-Project**


This Hotel Management System is a console-based tool designed to handle key operations such as:

Storing and managing customer details

Booking rooms across four different categories

Ordering food for specific rooms

Generating and displaying bills

Unbooking rooms and checking room availability

Viewing detailed room features

The application is menu-driven and continues running until explicitly exited by the user.

To ensure data persistence, file handling is used to save the current state of the hotel (customer details, booked rooms, food orders) when the program exits. When restarted, the application reads this file to restore the previous state, ensuring that no data is lost. Writing to the file is performed in a separate thread to allow parallel execution without interrupting the main program flow.

Additionally, a custom exception is thrown if an attempt is made to book an already-occupied room, and comprehensive exception handling ensures the program remains robust against unexpected runtime errors.

Key Topics Demonstrated

Classes and Objects

Inheritance

File Handling with Serialized Objects

Working with ArrayList

Implementing Interfaces

User-Defined Exceptions

Exception Handling
