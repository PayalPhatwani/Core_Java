package Generics;

public class genericClass<T> {
    
    T t ; 

    public void set(T t1){
        this.t = t1;
    }

    public T get(){
        return this.t;
    }

    public static void main(String[] args) {
        genericClass<String> gString = new genericClass<>();

        genericClass<Integer> gInteger = new genericClass<>();

        gString.set("Hello World !");

        System.out.println(gString.get());
        
        gInteger.set(1);

        System.out.println(gInteger.get());
    }
}
