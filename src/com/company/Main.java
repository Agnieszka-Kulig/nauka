package com.company;

import javax.sql.rowset.serial.SQLOutputImpl;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	int a = 4;
	Animal dog = new Animal();
	dog.species = "dog";
	dog.name = "Hajko";
	dog.weight  = 22.0;
	System.out.println(dog.name);
	System.out.println(dog.species);
	Phone onePlus = new Phone();
	onePlus.producer = "1+";
	onePlus.model = "firstone";
	onePlus.sreenSize = 6.0;
	System.out.println(dog.weight();
	Human me = new Human();
	me.firstName = "Kacper";
	me.lastName = "Warda";
	me.pet = dog;
	System.out.println(me.firstName);
    System.out.println(me.pet.species);
    System.out.println(dog.weight();
    System.out.println(dog.weight null);

    }
}
