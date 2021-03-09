# Java-Project
Semester lV Project
Write a program to implement following scenario:
<h4><b>Create an interface Color having:</b></h4>
- default method: void showColor() -->  displays the color of object<br>
- abstract methods: double area()--> will be used to return area of object<br>
- double perimeter() --> will be used to return perimeter of object
- 
<h4><b>Now, create a class Rectangle which inherits Color interface and has:</b></h4>
 - private attributes: length, width<br>
 - Make setter and getter methods for these attributes.


<b><h4>Now, create a class Test having main() </h4></b> method in which you have to make “n” objects of
Rectangle class (where “n” is specified by user at run-time). Also, the required details about
  the rectangle objects have to be taken as input from the user during run-time.
  
<b><h4>Make a method named: saveRecords() in the same class which will perform the task of
  Serialization of only those rectangle-objects whose area exceeds value of 100.</h4></b>
  
<b><h4>Make another method named: showRecords()</h4></b> in the same class which will perform the task
of de-serialization and display complete information of all rectangle objects.
<br>
Note: Don’t make any separate instance variable other than the ones specified in above
scenario. Also, make use proper exception handling by using inbuilt exception-classes and 
also make your own custom exception class to deal with the exceptions such as user
entering a negative no.
