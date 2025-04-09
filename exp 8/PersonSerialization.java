import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class PersonSerialization {
    public static void main(String[] args) {
        String fileName = "person.txt";
        
        // Create and serialize Person object
        Person person = new Person("Alice", 25);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(person);
            System.out.println("Person object serialized successfully.");
        } catch (IOException e) {
            System.out.println("Error: Unable to serialize object.");
        }

        // Deserialize Person object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized Person: Name = " + deserializedPerson.getName() + ", Age = " + deserializedPerson.getAge());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: Unable to deserialize object.");
        }
    }
}
