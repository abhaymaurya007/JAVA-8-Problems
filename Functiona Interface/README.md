Working with predefined functional interfaces :
------------------------------------------------------
In order to help the java programmer to write concise  java code in day to day programming java software people has provided the following predefined functional interfaces

1) Predicate<T>          boolean test(T x);
2) Consumer<T>           void accept(T x); 
3) Function<T,R>         R apply(T x);
4) Supplier<T>           T get();
5) BiPredicate<T,U>      boolean test(T x, U y);
6) BiConsumer<T, U>      void accept(T x, U y);
7) BiFunction<T,U,R>     R apply(T x, U y);
8) UnaryOperator<T>      T apply(T x)
9) BinaryOperator<T>     T apply(T x, T y)

Note :-
-------
All these predefined functional interfaces are provided as a part of java.util.function sub package.