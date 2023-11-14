class GenericClass<T, V, K> {
    private T ob1;
    private V ob2;
    private K ob3;

    public GenericClass(T variable1, V variable2, K variable3) {
        this.ob1 = variable1;
        this.ob2 = variable2;
        this.ob3 = variable3;
    }

    public T getVariable1() {
        return ob1;
    }

    public V getVariable2() {
        return ob2;
    }

    public K getVariable3() {
        return ob3;
    }

    public void printClassNames() {
        System.out.println("ob1 is of type " + ob1.getClass().getSimpleName());
        System.out.println("ob2 is of type " + ob2.getClass().getSimpleName());
        System.out.println("ob3 is of type " + ob3.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        GenericClass<Integer, String, Double> myGenericClass = new GenericClass<>(10, "Hello", 3.14);
        myGenericClass.printClassNames();
    }
}





