package org.example.modelTest;

import org.example.model.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ProductTest {


    private Product testObjectProduct;

    @Test
    public void Test_Product_Class_whether_fields_OK() {
        Assert.assertEquals(1,testObjectProduct.getProductId());
        Assert.assertEquals("Test field1",testObjectProduct.getProductName());
        Assert.assertEquals(200,testObjectProduct.getPrice());

    }

    @Before
    public void setUp() throws Exception {
        testObjectProduct = new Product(1,"Test field1",200) {
            @Override
            public String use() {
                return null;
            }

            @Override
            public String examine() {
                return null;
            }

            @Override
            public int getSize() {
                return 0;
            }

            @Override
            public int getCalories() {
                return 0;
            }
        };



    }
}

