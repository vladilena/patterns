package template;


class Main {
    public static void main(String[] args) {
        C a = new A();
        a.templateMethod();

        System.out.println("----------");

        C b = new B();
        b.templateMethod();
    }
}
