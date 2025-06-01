package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 다른 패키지라서 접근 불가이나, 상속 관계라 접근이 가능함
        // defaultValue = 1; // 다른 패키지라서 접근 불가
        // privateValue = 1;

        publicMethod();
        protectedMethod();
        // defaultMethod();
        // privateMethod();

        printParent();
    }
}
