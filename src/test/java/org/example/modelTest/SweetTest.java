package org.example.modelTest;

import org.example.model.Sweet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SweetTest {
    private Sweet testObjectSweet;

    @Before
    public void setUp() throws Exception {
        testObjectSweet = new Sweet(1, "KitKat", 15, 300);


    }

    @Test
    public void test_to_check_whether_Sweet_class_fields_are_correct() {
        Assert.assertEquals(1, testObjectSweet.getProductId());
        Assert.assertEquals("KitKat", testObjectSweet.getProductName());
        Assert.assertEquals(15, testObjectSweet.getPrice());
        Assert.assertEquals(300, testObjectSweet.getCalories());
    }
}

