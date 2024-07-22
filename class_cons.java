class Parent {
    Parent() {
        System.out.println("Parent class Constructor");
    }
}
class Child extends Parent {
    Child() {
        super();// Invoke the parent class constructor
        System.out.println("Child class Constructor");
    }
}
class class_cons {
    public static void main(String[] args) {
        Child s = new Child();
    }
}