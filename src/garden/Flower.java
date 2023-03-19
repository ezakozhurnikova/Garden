package garden;

public class Flower extends Plant{
    static int Flower_GROW_PER_SEASON=3;

    public Flower(int height,int age,String displayName){
        super(height,age,displayName);
    }
    @Override
    void doSpring() {
        height=height+Flower_GROW_PER_SEASON;
        System.out.println(getDisplayName()+" starts to grow in Spring "+"height is: "+getHeight()+" age is "+getAge());
    }

    @Override
    void doSummer() {
        System.out.println(getDisplayName()+" is blooming at Summer "+"height is: "+getHeight()+" age is "+getAge());

    }

    @Override
    void doAutumn() {
        height=0;

        System.out.println(getDisplayName()+" is cut in autumn "+"height is: "+getHeight()+" age is "+getAge());

    }

    @Override
    void doWinter() {
        System.out.println(getDisplayName()+" is not growing during winter "+"height is: "+getHeight()+" age is "+getAge());

    }


}
