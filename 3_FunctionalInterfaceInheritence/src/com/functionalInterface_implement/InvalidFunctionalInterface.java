package com.functionalInterface_implement;

interface FunctionalInterfaceCreate{
	void say();
}
//A functional interface can extends another interface ,
//only when it does not have any abstract method.
@FunctionalInterface
interface ImpFunctionalImplement extends FunctionalInterfaceCreate{
	void doIt();
}

@FunctionalInterface
interface ImpFunctionalImplementWork extends FunctionalInterfaceCreate{
}

public class InvalidFunctionalInterface {

}
