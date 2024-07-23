package com.serenitydojo;

public class Cat extends Pet{
    private String favoriteToy;
    private int age;

    public static final String CAT_NOISE = "Meow";

    public static String usualToy() {return "Yarn";}

    public Cat(String name, int age) {
        super(name);
        this.age = age;
        this.favoriteToy = usualToy();
    }

    public Cat(String name, String favoriteToy, int age) {
        super(name);
        this.favoriteToy = favoriteToy;
        this.age = age;
    }


    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeNoise() {System.out.println(CAT_NOISE);}

    public void feed(String food) {System.out.println(getName() + "eats some" + food);}

    public void groom() {
        lickPaw();
        cleanFur();
    }

    private void cleanFur() {System.out.println(getName() + "cleans his fur");}

    private void lickPaw() {System.out.println(getName() + "licks his paws");}

    @Override
    public String play() {
        return "plays with string";
    }
}
