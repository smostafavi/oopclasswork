package com.company;


public class Human {  //created a class of Human nit object of Human - Object of the Class Human will be created in the main class which is called "human"


    private String name;
    private String age;
    private String hight;
    private String gender;
    private Boolean hasGlasses;
    private String description;


    public Human() {   // main constructor is being created for the Human class

    }
    // we can create different constructor overloads to request more or less information for each instance. like 1, 2, and 3

  //1

    public Human(String name, String age) { //overload constructor is created
        this.name = name;
        this.age = age;

    }
// 2

    public Human(String name, String age, String hight, String gender, Boolean hasGlasses) { //overload constructor is created
        this.name = name;
        this.age = age;
        this.hight = hight;
        this.gender = gender;
        this.hasGlasses = hasGlasses;



    }

    //3.

    public Human(String name, String age, String hight, String gender, Boolean hasGlasses, String description) { //overload constructor is created
        this.name = name;
        this.age = age;
        this.hight = hight;
        this.gender = gender;
        this.hasGlasses = hasGlasses;
        this.description = description;


    }

    // getters and setters are creatd for the Human class.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getHasGlasses() {
        return hasGlasses;
    }

    public void setHasGlasses(Boolean hasGlasses) {
        this.hasGlasses = hasGlasses;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
    return description;
    }
}













