import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyCollectionTest<T> {
    private MyCollection<String> myCollection1 = new MyCollection<>();
    private MyCollection<String> myCollection2 = new MyCollection<>();
    private Iterator<String> iterator = myCollection1.iterator();

    @Before
    public void before(){
        myCollection1.add("Max");
        myCollection1.add("Vlad");
    }

    @Test
    public void iterator(){
        while (iterator.hasNext()) {
            myCollection2.add(iterator.next());
        }
        Assert.assertNotNull(myCollection1);
        Assert.assertNotNull(myCollection2);
        Assert.assertEquals(myCollection1.size(),myCollection2.size());
        Assert.assertTrue(myCollection1.containsAll(myCollection2));

    }

    @Test
    public void listIterator(){
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(12);
        list.add(44);
        list.add(55);
        List<Integer> list1 = new ArrayList<>();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            list1.add(listIterator.next());
        }
        Assert.assertEquals(list,list1);
    }
}
