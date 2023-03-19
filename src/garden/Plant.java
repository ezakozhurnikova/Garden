package garden;

public abstract class Plant {
    int height;
    int age;
    String displayName;

    public Plant(int height, int age, String displayName) {
        this.height = height;
        this.age = age;
        this.displayName = displayName;
    }
    public void growPlant() {
        doSpring();
        doSummer();
        doAutumn();
        doWinter();
        setAge(this.age++);
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    abstract void doSummer();

    abstract void doSpring();

    abstract void doWinter();

    abstract void doAutumn();



    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", age=" + age +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}
