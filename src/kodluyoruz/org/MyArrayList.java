package kodluyoruz.org;

import java.util.Arrays;

public class MyArrayList<T>  {

    private final Object[] array = new Object[16];
    private final Object[] array2 = new Object[array.length*2];
    private  int count = 0;

    public void add(T eleman){
        if(count==16) {
            throw new ArrayIndexOutOfBoundsException("Liste Dolu!");
        }
            if (count>16){
                if (array2.length == 0) {
                    array2[count++] = eleman;
                }
            }

        array[count++] = eleman;
    }
    public void insert(int index, T item) {

        for (int i=0; i<array.length-1; i++){
            if(i == index){
                for (int j= array.length-1; j>=index; j--){
                    array[j] = j-1;
                }
                array[index] = item;
            }
        }

    }
    public void remove(){
        if(count == 0){
            throw new UnsupportedOperationException("Liste Boş");
        }
        array[--count] = 0;//en son elemanı çıkarır.
    }

    public int count(){ //listenin içinde kaç tane eleman olduğunu belirtir.

        return count;
    }

    public void contains(T nesne){
        for (int i=0; i<array.length; i++) {
            if(array[i] == nesne){
                System.out.println(nesne +" Bu eleman listede vardır.");
            }
        }
    }

    public int IndexOf(T item){
        for (int i=0; i<array.length; i++) {
            if (array[i] == item) {
                System.out.println(item + " in İndex Değeri " + i + "'dir.");
            } else {
                if(array[i] != item){
                    return -1;
                }
            }
        }
        return 0;
    }

    public T get(int index){
        return (T)array[index];
    }

    public void set(int index, T item){
        this.array[index] = item;
    }

    @Override
    public String toString() {
        return  Arrays.toString(array);
    }
}
