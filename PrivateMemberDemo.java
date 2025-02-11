class SuperClass {
    private int privateVar = 10;

    public int getPrivateVar() {
        return privateVar;
    }
}

class SubClass extends SuperClass {
    public void display() {

        System.out.println("Private Variable through Getter: " + getPrivateVar());
    }
}

public class PrivateMemberDemo {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
