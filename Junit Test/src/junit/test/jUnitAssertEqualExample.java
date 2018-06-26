/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
/**
 *
 * @author mikeg
 */
public class jUnitAssertEqualExample {

    private JUnitAssertEqualsServiceExample junitAssertEqualsServiceSample;

    private ServiceObject serviceObject;

    @Before

    public void setData() {

        serviceObject = new ServiceObject();

        junitAssertEqualsServiceSample = new JUnitAssertEqualsServiceExample();

        junitAssertEqualsServiceSample.initiateMetaData(serviceObject);

    }

    @Test

    public void testAssertEqualsFalse() {

        //  processed the item
        ServiceObject newServiceObject = new ServiceObject();

        junitAssertEqualsServiceSample.initiateMetaData(newServiceObject);

        junitAssertEqualsServiceSample.processObject(serviceObject);

        assertEquals(serviceObject, newServiceObject);

    }

    @Test

    public void testAssertEquals() {

        junitAssertEqualsServiceSample.processObject(serviceObject);

        assertEquals(serviceObject, this.serviceObject);

    }

    @Test

    public void testAssertEqualsWithMessage() {

        junitAssertEqualsServiceSample.processObject(serviceObject);

        assertEquals(
                "Same Object",
                serviceObject, serviceObject);

    }

    @Test

    public void testAssertEqualsFalseWithMessage() {

        ServiceObject newServiceObject = new ServiceObject();

        junitAssertEqualsServiceSample.postProcessing(serviceObject);

        assertEquals(
                "Not the Same Object",
                newServiceObject, serviceObject);

    }

}

}
