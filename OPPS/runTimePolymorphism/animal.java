package OPPS.runTimePolymorphism;

public class animal {
    void sound(){
        System.out.println("makes some sound :");
    }
}
class  dog extends animal{
    @Override
    void sound(){
        System.out.println("bark");
    }
}

class  cat extends  animal{
    @Override
    void sound(){
        System.out.println("meow");
    }
}
