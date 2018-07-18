# Overview

| Context      |  Problem    | Pattern     | Type  |
|--------------|-------------|-------------|-------------|
| Given 2 interfaces | Transform one interface to another | [Adapter](src/main/java/adapter) | Structural |
| Given a complex Object | Generate Variations or simplify instantiation | [Builder](src/main/java/builder) | Creational |
| A series of objects that can handle a request | Propagate the request to next level objects avoiding series of if..else statements | [Chain of Responsibility](src/main/java/chainOfResponsibility) | Behavioral |
| A variety of functinalities in different/same object | Handle all of them in a uniform way | Command | Behavioral |
| A objects that might or might not contain similar objects | Compose objects into tree structures to represent a part-whole hierarchies | [Composite](src/main/java/composite) | Structural |
| - | Attach additional functionalities to an object without altering it  | [Decorator](src/main/java/decorator) | Structural |
| Given a complex system | Simplify the system's API | [Facade](src/main/java/facade) | Structural |
| You have families of products | You want to be sure that the client creates product that belong together | [Abstract Factory](src/main/java/factory) | Creational |
| You instantiate an object | You want to decouple your code for the concrete class you want to instantiate | [Factory Method](src/main/java/factory) | Creational |
| You can a big number of mostly the same instances of an object | You want to reduce the memory footprint of the instances | [Flyweight](src/main/java/flyweight) | Structural |
| You have an aggregation of objects | You want to access sequentially the elements of the aggregation | [Iterator](src/main/java/iterator) | Behavioral |
| You have subscribers-publisher model | You want to notify observers when observable changes state | [Observer](src/main/java/observer) | Behavioral |
| You have an expensive to create/sensitive object | You want to control the access for that object | [Proxy](src/main/java/proxy) | Structural |
| - | You want to have only one instance of an object | [Singleton](src/main/java/singleton) | Creational |
| - | You have a system that changes it's behavior during runtime | [State](src/main/java/state) | Behavioral |
| - | You have behavior of a class that may change in the future, and you do not want to tight couple the implementations | [Strategy](src/main/java/strategy) | Behavioral |
| You have similar algorithms that differ in some steps | Handle the algorithms in a uniform way | [Template](src/main/java/template) | Behavioral |

**Structural :** Any pattern that let you compose classes or objects
into another and/or larger structures.

**Behavioral :** Any pattern that is concerned with how classes and
objects interact and distribute responsibility.

**Creational :** Any patter that involve object instantiation and provide a
 way to decouple a client from the objects it needs to instantiate.
