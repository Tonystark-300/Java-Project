# Java-Project
Semester lV Project
Write a program to implement following scenario:
<h1>Create an interface Color having:</h1>
- default method: void showColor() -->  displays the color of object
- abstract methods: double area()--> will be used to return area of object
- double perimeter() --> will be used to return perimeter of object
<h1>Now, create a class Rectangle which inherits Color interface and has:</h1>
private attributes: length, width
Make setter and getter methods for these attributes.
Now, create a class Test having main() method in which you have to make “n” objects of
Rectangle class (where “n” is specified by user at run-time). Also, the required details about
the rectangle objects have to be taken as input from the user during run-time.
Make a method named: saveRecords() in the same class which will perform the task of
Serialization of only those rectangle-objects whose area exceeds value of 100.
Make another method named: showRecords() in the same class which will perform the task
of de-serialization and display complete information of all rectangle objects.
Note: Don’t make any separate instance variable other than the ones specified in above
scenario. Also, make use proper exception handling by using inbuilt exception-classes and 
also make your own custom exception class to deal with the exceptions such as user
entering a negative no.
