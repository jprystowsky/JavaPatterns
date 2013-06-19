Motivation
==========

JavaPatterns is the project in which I practice, and demonstrate, software design patterns, as implemented in Java.

It presently contains implementations of the following patterns:

[Factory Method](https://en.wikipedia.org/wiki/Factory_method_pattern)
----------------------------------------------------------------------

The interface `Developer` defines a generic type of developer object, which is then implemented by the concrete
`ConcreteDeveloper` class.

The `JavaDeveloper` and `SQLDeveloper` classes both extend `ConcreteDeveloper` and are the specific types internally
used by the factory.

The `DeveloperFactory,` with a private constructor to prevent instantiation, contains two methods to return instances
of `Developer`s, `newJavaDeveloper()` and `newSQLDeveloper.` These methods return instances of the above two internal
classes, respectively, but do so as `ConcreteDeveloper`s to hide implementation details from consumers of the factory.