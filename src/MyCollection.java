import java.util.*;

public class MyCollection<T> implements Iterable<T> {

    private List<T> arr = new ArrayList<>();
    private int i;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(1);
        list.add(43);
        list.add(122);
        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext())
            System.out.println(listIterator.next() + " ");
        System.out.println();
        while(listIterator.hasPrevious())
            System.out.println(listIterator.previous() + " ");
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    public boolean containsAll(MyCollection<String> m) {
        return arr.containsAll(arr);
    }

    int size(){
        return arr.size();
    }

    public class MyIterator implements Iterator<T>, ListIterator<T>{

        public MyIterator listIterator(){
            return new MyIterator();
        }

        @Override
        public boolean hasNext() {
            return i < arr.size();
        }

        @Override
        public T next() {
            return arr.get(i++);
        }

        @Override
        public T previous() {
            return arr.get(i--);
        }

        @Override
        public boolean hasPrevious() {
            return i > arr.size();
        }

        @Override
        public int nextIndex() {
            return ++i;
        }

        @Override
        public int previousIndex() {
            return --i;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(T t) {
            arr.remove(i);
            arr.add(i,t);
        }

        @Override
        public void add(T t) {
            arr.add(t);
        }
    }

    public void add(T t) {
        arr.add(t);
    }

}