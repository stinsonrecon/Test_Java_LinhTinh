interface Animal{
    void bark();
}

public class Example {
    public static void main(String[] args) {
        Animal animal = new Animal() {

            @Override
            public void bark() {
                System.out.println("Gâu gâu?");
            }
        };

        animal.bark();
    }
}
