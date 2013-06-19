Motivation
==========

JavaPatterns is the project in which I practice, and demonstrate, software design patterns, as implemented in Java.

It presently contains implementations of the following patterns:

* [Creational](#creational)
    * [Abstract Factory](#abstractfactory)
    * [Factory Method](#factorymethod)
* [Structural](#structural)
    * [Adapter](#adapter)

<a name="creational"></a>
Creational
----------

<a name="abstractfactory"></a>
### [Abstract Factory](https://en.wikipedia.org/wiki/Abstract_factory_pattern)

The interface `Developer` defines a generic type of developer object, which is then implemented by the concrete
`CSharpDeveloper` and `JavaDeveloper` classes.

The interface `DeveloperFactory` defines a factory object returning a `Developer.` It is implemented concretely
by the `CSharpDeveloperFactory` and `JavaDeveloperFactory` classes, which return the concrete `CSharpDeveloper`
and `JavaDeveloper` objects, respectively, as `Developer`s.

The `DeveloperFactoryTest` class tests that both `JavaDeveloperFactory` and `CSharpDeveloperFactory` return valid
`DeveloperFactory` objects, and that the `newDeveloper()` method, declared in the `DeveloperFactory` interface,
returns valid `Developer`s.

<a name="factorymethod"></a>
### [Factory Method](https://en.wikipedia.org/wiki/Factory_method_pattern)

The interface `Developer` defines a generic type of developer object, which is then implemented by the concrete
`ConcreteDeveloper` class.

The `JavaDeveloper` and `SQLDeveloper` classes both extend `ConcreteDeveloper` and are the specific types internally
used by the factory.

The `DeveloperFactory,` with a private constructor to prevent instantiation, contains two methods to return instances
of `Developer`s, `newJavaDeveloper()` and `newSQLDeveloper().` These methods return instances of the above two internal
classes, respectively, but do so as `ConcreteDeveloper`s to hide implementation details from consumers of the factory.

The `DeveloperFactoryTest` class tests the two factory methods by consuming the API through the `Developer` interface
and ensuring that the resulting object is not `null.`

<a name="structural"></a>
Structural
----------

<a name="adapter"></a>
### [Adapter](https://en.wikipedia.org/wiki/Adapter_pattern)

The `CoffeeCup` object contains a `drink()` method which returns a `Coffee` object.

The `Freezer` method expects a `CoffeeCup` object for its `freeze()` method, which returns a boolean (`true`).

The `CoffeeCupAdapterImpl` class implements the `CoffeeCupAdapter` interface, which declares a `freezeCup()` method.
This method takes a `CoffeeCup` object, on which it calls `drink()` to obtain a `Coffee` object. It passes the
`Coffee` object into a new `Freezer` that it instantiates. Finally, it returns the value of calling the `Freezer`'s
`freeze()` method on the `Coffee` object it obtained.

The `CoffeeCupAdapterImplTest` class tests that these classes return valid values, and that the adapter's boolean
return value matches the value obtained by performing the adapter pattern manually (i.e., calling `drink()` and
instantiating and using an outside `Freezer`).

