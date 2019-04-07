# Project 3 - Bridge
COMP 373/473 - Project 3 - Bridge Pattern - Joseph Conroy and Nigel Castelino

Our other Project 3 program, using the Observer Pattern, can be found [here.](https://github.com/jconroy5/Project-3-Observer)

The complete documentation on both programs can be found [here.](https://docs.google.com/document/d/1h8DvUw8eyynGfdUJAZmWxN4lpiHAYNyYbFiqmiuQmQM/edit?usp=sharing)

# To run the client:
Run Driver.java, found in 
```
src/com/bridge/client
```

# Project Description:
For our Bridge pattern, we created a program which connects two hierarchies (Vehicle and Engine) that are used by the Driver client to create a vehicle based on type and engine size, and then reports the speed of said vehicle when it is driving. The Bridge pattern is used by means of connecting the Vehicle abstraction class and its subclasses (contained in the vehicle package) and the Engine interface and its implementers (contained in the engine package). The Driver client imports both the engine and vehicle packages and contains the main method used to execute the program.

Engine.java is the interface whose implementers are the engine sizes that can be used by a given vehicle. The engine implementers are named “SmallEngine”, “MediumEngine”, “LargeEngine”, and “SuperEngine”. Each engine implementer has a specific value for horsepower, as well as a run() function which returns the horsepower value.

Vehicle.java is an abstract class used to create various types of Vehicle subclasses. These subclasses are named “Sedan”, “SUV”, and “Bus”. Each of these has a set weight in U.S. pounds and a function called drive(), which is the abstract method pulled from Vehicle.java. This function tells a vehicle’s engine to run and report the speed of the vehicle. Each Vehicle subclass imports the predefined implementers of Engine.java. This allows the Driver client to use setEngine() as an argument when creating a new Vehicle, thus defining it’s engine size. This way, the client can call the reportSpeed() function to calculate the speed of a vehicle based on its type and engine size.

Vehicle.java contains the reportSpeed() function. It is used to print a description of a vehicle’s speed, based on it’s type and engine size, to the console. The function uses a ratio of vehicle weight to engine horsepower to determine the relative speed description (weight divided by horsepower). The reportSpeed() method contains conditional statements which determine the most accurate speed description to print using the aforementioned speed ratio.

# Project Rubric:

Project 3: Implementing Patterns I

Project Description:

In this project, we will practice the implementation of design patterns.
You need to design and implement:

– Bridge Pattern

– Observer Pattern

You can implement both patterns in the same implementation or separately.

Supporting documents:

- Class notes and examples as well as links for patterns

- Design Patterns book by Gamma

- Search on the web to get more information on the patterns

Project Expectation:

- Group executed project

- Submission of Design and Code

Project Submission and Grading:

- 10% of total grade

- Email

- Complete documentation on what problem you solved with the patterns

- Your code OR the location of your solution for the implementation

Project Due Date:

- Submission of the Implementation: EOD 04/07/2019 
