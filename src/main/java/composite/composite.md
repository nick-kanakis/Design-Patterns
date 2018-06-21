# Composite Pattern

## Definition
The composite pattern allows you to compose objects into tree structures
to represent a part-whole hierarchies. Composite lets clients treat individual
objects and compositions of objects uniformly

## When to use it ?
When you have a objects that might or might not contain similar objects
and you want to handle them in a uniform way. For example you may have a Menu
that contains menu items ( eg: bread, salad...) and also may contain submenus
and you want to treat the structure in a uniform way.

## How to use it ?
1. You need a Component interface that exposes methods that access and manage
it's child components.
2. The Component interface has 2 concrete classes that implement it:
    1. Leaf: is a class that contains behavior for primitive objects in the
       compositions, it has no sub-components
    2. Composition: it has reference to sub-components (children)


## Visual
![composite](composite.png)

