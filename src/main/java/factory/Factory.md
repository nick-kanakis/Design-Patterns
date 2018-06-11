## Abstract factory vs Factory method

The main difference between a "factory method" and an "abstract factory"
is that the factory method is a single method, and an abstract factory is an object.

The factory method is just a method, it can be overridden in a subclass:

> The Factory Method Pattern uses inheritance and relies on a subclass to handle
> the desired object instantiation.

The abstract factory is an object tht has multiple factory methods on it:

> In the Abstract Factory Pattern, a class delegates the responsibility of
> object instantiation to another object via composition

### Code examples

**Factory method**

```
class A {
    public void doSomething() {
        Foo f = makeFoo();
        f.whatever();
    }

    protected Foo makeFoo() {
        return new RegularFoo();
    }
}

class B extends A {
    protected Foo makeFoo() {
        //subclass is overriding the factory method
        //to return something different
        return new SpecialFoo();
    }
}
```

**Abstract factory**

```
class A {
    private Factory factory;

    public A(Factory factory) {
        this.factory = factory;
    }

    public void doSomething() {
        //The concrete class of "f" depends on the concrete class
        //of the factory passed into the constructor. If you provide a
        //different factory, you get a different Foo object.
        Foo f = factory.makeFoo();
        f.whatever();
    }
}

interface Factory {
    Foo makeFoo();
    Bar makeBar();
    Aycufcn makeAmbiguousYetCommonlyUsedFakeClassName();
}

//need to make concrete factories that implement the "Factory" interface here
```


