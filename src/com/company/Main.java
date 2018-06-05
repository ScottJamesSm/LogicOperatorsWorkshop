package com.company;

public class Main {

    public static void main(String[] args) {
	/*
	Relational Operators
	<- less than
	<= less than or equal to
	> - greater than
	>= greateer than or equal to
	== equals
	!= not equal to

	Logical Operatiors
	&& - AND
	|| - OR
	! - NOT
	 */
        int a = 2;
        int b = 4;
        int x = 6;
        int y = 1;

        System.out.println("a = 2");
        System.out.println("b = 4");
        System.out.println("x = 6");
        System.out.println("y = 1");
        if (a == x || y + y == a) {
//will this method run
            System.out.println("a == x || y + y == a");
            // it will not run
        }

        if (a == x && y + y == a) {
//will this method run
            System.out.println("a == x || y + y == a");
        } //
//yes this will run because of our conditions is true. all you need is a single true condition for an OR operator to be true


        // != operator
        if (a != x && y + y == a) {
//will this method run
            // yes it will run
            System.out.println("a != x && y + y == a");
        }
    }
}