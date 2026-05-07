package c08_oop;

import c08_oop.AccessModifiersE.*;
import c08_oop.AccessModifiersE.Person;

public class AccessModifiersExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        var p1 = new Person("Gabriela", 28);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        p1.setAge(68);
        p1.setName("Gabriel");

        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        var pro1 = new Product(1000);
        var pro2 = new Product(2000);

        pro1.setPrice(2000);
        pro2.setPrice(1000);

        System.out.println(pro1.getPrice());
        System.out.println(pro2.getPrice());

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        var ct1 = new BankAccount(500);

        ct1.desposit(1000);
        ct1.withdraw(500);
        ct1.withdraw(5000);

        System.out.println("Nuevo balance: $" + ct1.getBalance());

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        var title1 = new Book("Cien años de soledad");
        System.out.println(title1.getTitle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        var temp1 = new Temperature(0);

        temp1.setCelsius(80);
        temp1.setCelsius(-200);
        temp1.setCelsius(50);

        System.out.println(temp1.getCelsius());

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        var user1 = new User("gaby", "123456789");

        user1.checkPassword("123456789");
        user1.checkPassword("123456788");

        user1.setPassword("1234567891");
        user1.checkPassword("1234567891");

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        var emp1 = new Employee();
        emp1.raiseSalary(56);
        emp1.raiseSalary(-60);

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        var rect1 = new Rectangle(10,2);
        rect1.calculateArea();
        rect1.setWidth(2);
        rect1.calculateArea();

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        var st1 = new Student(55);
        System.out.println(st1.isPassed());
        st1.setGrade(70);
        System.out.println(st1.isPassed());

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        var car1 = new Car(50);

        car1.accelerate(30);
        car1.accelerate(100);
        car1.brake(50);
        car1.brake(100);
    }


}
