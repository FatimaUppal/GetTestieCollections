package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TestStack {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }
    @Test
    public void HashMapTest(){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"One");
        Assert.assertTrue(map.containsKey(1));
        Assert.assertTrue(map.containsValue("One"));

    }
    @Test
    public

    // Make a bigger test exercising more Stack methods.....
    @Test
    public void TestStack2(){
        Stack<String>  stack= new Stack<>();
        String expected= "Hello World";
        stack.push(expected);
        stack.push("Goodbye");
        stack.pop();
        assertEquals(expected,stack.peek());


    }
}
