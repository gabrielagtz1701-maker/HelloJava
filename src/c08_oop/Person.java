package c08_oop;

public class Person {

    // Atributos
    protected String name;
    // protected String name;
    int age;
    final private String id; //(Poner al final y hacerlo constante para que no lo modifiquen)

    // Constructor
    public Person(String name, int age, String id) {
        this.name = name;
        this.setAge(age);
        this.id = id;
    }

    // Métodos
    public void sayHello() {

        System.out.println(String.format("Hola soy %s y tengo %d años y mi id es %s", name, age, id));

    }

    // Getter
    public int getAge() {
        return age;
    }

    public String getId() {
      return id;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad debe ser un número positivo");
        }
    }
}
