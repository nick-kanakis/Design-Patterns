# Flyweight Pattern

## Definition
Use the Flyweight Pattern when one instance of a class
can be used to provide many “virtual instances.”

## When to use it ?
Flyweight pattern is used when we need to create a large number of similar objects (say 10^5)
and we want to reduce the memory footprint of the objects.
One important feature of flyweight objects is that they are immutable.
This means that they cannot be modified once they have been constructed.

## How to use it ?
1. Find the properties of the object that change most often (eg: in a Shape with
properties like color, coordinates, coordinates will change more frequent that color)
2. Create a Map that holds the variation of the object that do not change so often
(So in the Shape example, we need a Map with key the Color and value the Shape instance)
3. Inside a factory retrieve from the map the object you need (Shape with Color Red)
and on the fly update the value that changes most often (the coordinates)


## Visual
![flyweight](flyweight.png)

