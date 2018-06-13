# Command Pattern

## Definition
The command pattern encapsulates a request as an object, thereby letting
you parameterize other objects with different requests, queue or log requests
and support undoable operations.

## When to use it ?
When you have a variety of functionalities that you want to handle them
in a uniform way. You may have a set of vastly different operations and you
want to handle them in a certain way all of them.

## How to use it ?
1. Create an interface Command with a method execute()
2. For each class X we want to handle uniformly create a class YYYYCommand
 that implements Command interface and composes the an object of type X.
3. On the execute method write the functionality you want to do.


## Visual
![command](command.png)

