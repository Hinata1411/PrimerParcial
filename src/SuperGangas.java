import java.util.NoSuchElementException;
public class SuperGangas {

    private Object[] array;
    int size = 0;
    int head = 0;
    int tail = 0;

    public SuperGangas(int capacity){
        array = new Object[capacity];
    }

    //Agregar
    public void enqueue(Object item){
        if (size == array.length){
            throw new IllegalStateException("Cannot add to full queue");
        }
        array[tail] = item;
        tail = (tail + 1) % array.length;
        size++;
    }

    //Eliminar
    public Object dequeue(){
        if (size == 0){
            throw new NoSuchElementException("Cannot remove from empty queue");
        }
        Object item = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        size--;
        return item;
    }




}
