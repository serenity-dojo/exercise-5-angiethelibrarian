package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class WhenCreatingObjects {

   @Test
   public void creating_a_cat() {

       Cat felix = new Cat("Felix", "Yarn", 4);

       Assert.assertEquals(felix.getName(), "Felix");
       Assert.assertEquals(felix.getFavoriteToy(), "Yarn");
       Assert.assertEquals(felix.getAge(), 4);


   }
   @Test
   public void creating_a_hamster() {

       Hamster dot = new Hamster("Dot", "Wheel", 2);

       Assert.assertEquals(dot.getName(), "Dot");
       Assert.assertEquals(dot.getFavoriteGame(), "Wheel");
       Assert.assertEquals(dot.getAge(), 2);
   }


    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void whenADogBarks() {
        Dog fido = new Dog("Fido","Bone", 5);

        String dogSound = fido.makeNoise();

        Assert.assertEquals(dogSound, "Woof");
    }

    @Test
    public void whenADogGetsFed() {
        Dog fido = new Dog("Fido","Bone", 5);

         fido.feed();

        Assert.assertTrue(fido.isFed());

    }

    @Test
    public void whenAnimalsPlay() {
       Pet fido = new Dog("Fido", "Bone", 5);
       Pet spot = new Cat("Felix", "String", 5);
       Pet dot = new Hamster("Dot", "Wheel", 1);

       assertThat(fido.play(), equalTo("plays with bone"));
       assertThat(spot.play(), equalTo("plays with string"));
       assertThat(dot.play(), equalTo("runs in wheel"));

   }
    }
