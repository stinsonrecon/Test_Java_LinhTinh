interface Animal{
    void bark();
}

public class AnnomynousInnerClass {
    public static void main(String[] args) {
        Animal animal = new Animal() { // lớp trìu tượng (cái này cũng chả dùng bao giờ vì nó cũng khó hiểu khó dùng vl)

            @Override
            public void bark() {
                System.out.println("Gâu gâu?");
            }
        };

        animal.bark();
    }
}
