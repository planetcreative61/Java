public class WorkWithAnimals {

    int justANum = 10;

    public static void main(String[] args) {

        Dog fido = new Dog();

        fido.setName("Fido");
        System.out.println(fido.getName());

        fido.digHole();

        fido.setWeight(-1);
        changeObjectName(fido);
        System.out.println("DOG name after method call: ");
        System.out.println(fido.getName());
    }

    public static void changeObjectName(Dog dog) {
        dog.setName("new-name");
    }
}