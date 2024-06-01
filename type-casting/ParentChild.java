class Parent {
    int x = 10;

    void show() {
        System.out.println("Parent-show()");
    }

    void OnlyParentShow() {
        System.out.println("OnlyParentShow");
    }
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println("Child-show()");
    }

    void OnlyChildShow() {
        System.out.println("OnlyChildShow");
    }
}

public class ParentChild {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
        p.OnlyParentShow();
        System.out.println(p.x);
    }
}
