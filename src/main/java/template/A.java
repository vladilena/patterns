package template;

class A extends C{
    //void method (){
        //System.out.println(1);- вынесли в абстрактный класс
        //System.out.println(2); - убрали различающийся код в отдельный метод
        //System.out.println(3);- вынесли в абстрактный класс
    //}

    void differ() {
        System.out.println(2);
    }

    void differ2() {
        System.out.println(5);
    }
}
