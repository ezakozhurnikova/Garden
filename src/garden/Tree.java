package garden;

public class Tree extends Plant {
    static int Tree_GROW_PER_SEASON=5;

    public Tree(int height,int age,String displayName){
        super(height,age,displayName);
    }

    @Override
    void doSpring() {
        height=height+Tree_GROW_PER_SEASON;
        System.out.println(getDisplayName()+" tree has grown in Spring "+"height is: "+getHeight()+" age is "+getAge());
    }
    @Override
    void doSummer() {
        height=height+Tree_GROW_PER_SEASON;
        System.out.println(getDisplayName()+" tree has grown in Summer "+"height is: "+getHeight()+" age is "+getAge());

    }

    @Override
    void doAutumn() {
        System.out.println(getDisplayName()+" tree is not growing  in Autumn "+"height is: "+getHeight()+" age is "+getAge());
    }

    @Override
    void doWinter() {
        //age=age+1;
        System.out.println(getDisplayName()+" tree is not growing  in Winter "+"height is: "+getHeight()+" age is "+getAge());

    }


}
