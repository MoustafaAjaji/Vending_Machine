package org.example.modelTest;

import org.example.model.Fruit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoodTest {

    public class FruitTest {
        private Fruit testObjectFruit;

        @Before
        public void setUp() throws Exception {
            testObjectFruit = new Fruit(1,"Test field1",200,110);

        }

        @Test
        public void test_check_Fruit_class_fields_are_correct() {
            Assert.assertEquals(1,testObjectFruit.getProductId());
            Assert.assertEquals("Test field1",testObjectFruit.getProductName());
            Assert.assertEquals(200, testObjectFruit.getPrice ());
            Assert.assertEquals(110,testObjectFruit.getCalories());
        }
    }

}
