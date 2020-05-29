package org.example.modelTest;

import org.example.model.Drink;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 public class DrinkTest {

    private Drink testObjectDrink;

    @Before
    public void setUp() throws Exception {
        testObjectDrink = new Drink(1,"Test drink",2,30,600);

    }

    @Test
    public void test_check_Fruit_class_fields_are_correct() {
        Assert.assertEquals(1,testObjectDrink.getProductId());
        Assert.assertEquals("Test drink",testObjectDrink.getProductName());
        Assert.assertEquals(25, testObjectDrink.getPrice());
        Assert.assertEquals(200,testObjectDrink.getCalories());
        Assert.assertEquals(500,testObjectDrink.getSize());
    }
}


