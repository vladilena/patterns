package template;

class B extends C{
    //void method (){
       // System.out.println(1); - вынесли в абстрактный класс
       // System.out.println(4); - убрали различающийся код в отдельный метод
       // System.out.println(3); - вынесли в абстрактный класс
    //}

    void differ() {
        System.out.println(4);
    }

    void differ2() {

    }
}
