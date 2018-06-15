# MVC Pattern

## Definition
This is not an official pattern.

## Explanation
MVC is a software architecture - the structure of the system -
that separates domain/application/business  logic from the rest of the user interface.
It does this by separating the application into three parts: the model, the view, and the controller

The model manages fundamental behaviors and data of the application.
It can respond to requests for information, respond to instructions
to change the state of its information, and even to notify observers (**Observer Pattern**)
in event-driven systems when information changes. This could be a database,
or any number of data structures or storage systems. In short,
it is the data and data-management of the application.

The view effectively provides the user interface element of the application.
It'll render data from the model into a form that is suitable for the user interface.
It may combine multiple levels fo interfaces inside (**Composite Pattern**)

The controller receives user input and makes calls to model objects
and the view to perform appropriate actions. It has a reference of the
View and the Model using composition (**Strategy Pattern**)


## Visual
![MVC](mvc.png)

