package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

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
    public void TestHashMap(){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"One");
        Assert.assertTrue(map.containsKey(1));
        Assert.assertTrue(map.containsValue("One"));

    }
    @Test
    public void TestArrayList(){
        ArrayList<String> arraytest = new ArrayList<>();
        arraytest.add("yer");
        String expected = "[yer]";
        String actual = arraytest.toString();
        Assert.assertEquals(expected, actual);
    }

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
    @Test
    public void TestLinkedList(){
        LinkedList<String>link= new LinkedList<>();
        link.add("first");
        link.add("second");
        String expected= "second";
        String actual= link.get(1);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void TestArrayDeque(){
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("fir");
        deque.add("las");
        deque.addFirst("first");
        deque.addLast("last");
        deque.removeLast();
        String expected = "first";
        String actual = deque.getFirst();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TestVector() {
        Vector<String> vector = new Vector<>();
        vector.add("first");
        vector.add("second");
        vector.add("last");
        vector.remove("last");
        String expected = "[first, second]";
        String actual = vector.toString();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TestTreeMap(){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2, "second");
        treeMap.put(3, "last");
        treeMap.put(1, "first");

        String expected = "{1=first, 2=second, 3=last}";
        String actual = treeMap.toString();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TestIterator(){
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("banana")) {
                iterator.remove();
            }
        }
        String expected = "[apple, orange]";
        String actual = list.toString();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TestPriorityQueue(){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(0);
        queue.offer(1);
        queue.offer(2);

        Integer expected = 0;
        Integer actual = queue.peek();
        Assert.assertEquals(expected, actual);
    }
}
