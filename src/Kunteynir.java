public class Kunteynir {
    private Object[] elem;
    private int size;
    private int capacity;

    public Kunteynir(int capacity) {                   //конструктор
        this.capacity = capacity;
        this.elem = new Object[capacity];
        this.size = 0;
    }

    public int getCapacity(){                          //вместимость контейнера(сколько элементов может находиться)
        return capacity;
    }

    public int getSize(){                              //размер контейнера(сколько элементов находится)
        return size;
    }
    private void expansionCapacity(int newCapacity) {  //увеличение контейнера
        Object[] newElem = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
           newElem[i] = elem[i];
        }
        elem = newElem;
        capacity = newCapacity;
    }

    public void add (Object element) {                //добавление
        if (size == capacity) {
            expansionCapacity(capacity*2);
        }
        elem[size] = element;
        size++;
    }

    public Object getElem(int index){                 //извлечение
        if(index < 0 || index > size) {
            return null;
        } else return elem[index];
    }

    public void remove (int index){                   //удаление
        if(index >0 || index < size){
            for(int i = index; i < size; i++){
                elem[index] = elem[index+1];
            }
            size--;
        }
    }
}
