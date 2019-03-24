package prototype;

class Main {
    public static void main(String[] args) {
        Human original = new Human("Sveta", 18);
        System.out.println(original);
        Human copy = (Human) original.copy();
        System.out.println(copy);

        HumanFactory factory = new HumanFactory(original);
        Human h1 = factory.makeCopy();
        Human h2 = factory.makeCopy();
        System.out.println(h1);
        System.out.println(h2);

        factory.setPrototype(new Human("Vasya", 20));
        Human h3 = factory.makeCopy();
        Human h4 = factory.makeCopy();
        System.out.println(h3);
        System.out.println(h4);
    }
}
