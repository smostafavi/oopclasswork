package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        // declaring and initating the class we created

         Human human= new Human();

        // delacre the variables in the main class

        String name=" ";
        String age =" " ;
        String height = " ";  // variables/attributes declared in the main class
        String gender= " ";
        boolean hasGlasses;
        String description;

        // we need to create an array list since we have 5 human here (all the classmates and teachers)
        ArrayList<Human> humanArray = new ArrayList<>();// array list created

//We need to create instance of overload consrtuctor for each person in the class// I set the valuse for each human
        Human human1 = new Human( "Betty", "25", "5.4",  "F", false, "description" );
        Human human2 = new Human( "Oona",  "25", "5.6",  "F",  false, "teaches here");
        Human human3 = new Human( "Shahla", "49","5.4",  "F",  true);
        Human human4 = new Human( "Hayle", "27", "5.7",  "M",  true);
        Human human5 = new Human( "Shafraw", "43", "5.7",  "M", true);
        Human human6 = new Human("Natalie", "49");

        // adding the vlaues to the array list

        humanArray.add(human1);  // adding valuse to human 1
        humanArray.add(human2);   // adding valuse to human 2
        humanArray.add(human3);     // adding valuse to human 3
        humanArray.add(human4);     // adding valuse to human 4
        humanArray.add(human5);     // adding valuse to human 5





        // we need to loop through the array statement and system print out only once since it applies to all objects(human1-5)
        for(Human x : humanArray){
            System.out.println(x.getName()+" "+x.getAge()+" " +x.getHight()+ " " +x.getGender()+ " "+ x.getHasGlasses());

            human.setDescription("This student goes to MC");
            System.out.println(human.getDescription());
            human2.setName("Oona");
            human2.setName("Betty");
            System.out.println(human2.getName() + " " + human2.getDescription());


        }

    }
}
