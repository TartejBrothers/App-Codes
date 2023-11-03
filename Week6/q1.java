class Person {
    int a = 0;
    String name;

    public Person(int b, String na) {
        this.a = b;
        this.name = na;
    }

}

class q1 {

    public static void main(String[] args) {
        Person p = new Person(10, "Taranjeet");

        System.out.println(p.a + " " + p.name);
        Person q = new Person(20, "Taran");

        System.out.println(q.a + " " + q.name);

    }

}