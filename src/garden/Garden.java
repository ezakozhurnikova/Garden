package garden;


import java.util.List;

public class Garden {
    public static void main(String[] args) {
        List<Plant> plants = List.of(
                new Tree(90, 2, "Pine"),
                new Tree(110, 5, "Oak"),


                new Flower(25, 4, "Rose"),
                new Flower(15, 3, "Iris"));

        growPlants(plants,2);
    }


public static void growPlants(List<Plant> plants, int numberOfYears) {
    for (Plant plant : plants) {
        for (int age = 0; age < numberOfYears; age++) {
            plant.doSpring();
            plant.doSummer();
            plant.doAutumn();
            plant.doWinter();
            plant.setAge(plant.getAge() + 1);
        }
        System.out.println("*******************************************");
        System.out.println();
        System.out.println(plant.getDisplayName()+ " has height: "+plant.getHeight()+" and is "+plant.getAge()+" years old");
        System.out.println("*******************************************");
        System.out.println();
    }
}

}
/*Pine tree has grown in Spring height is: 95 age is 2
Pine tree has grown in Summer height is: 100 age is 2
Pine tree is not growing  in Autumn height is: 100 age is 2
Pine tree is not growing  in Winter height is: 100 age is 2
Pine tree has grown in Spring height is: 105 age is 3
Pine tree has grown in Summer height is: 110 age is 3
Pine tree is not growing  in Autumn height is: 110 age is 3
Pine tree is not growing  in Winter height is: 110 age is 3
*******************************************

Pine has height: 110 and is 4 years old
*******************************************

Oak tree has grown in Spring height is: 115 age is 5
Oak tree has grown in Summer height is: 120 age is 5
Oak tree is not growing  in Autumn height is: 120 age is 5
Oak tree is not growing  in Winter height is: 120 age is 5
Oak tree has grown in Spring height is: 125 age is 6
Oak tree has grown in Summer height is: 130 age is 6
Oak tree is not growing  in Autumn height is: 130 age is 6
Oak tree is not growing  in Winter height is: 130 age is 6
*******************************************

Oak has height: 130 and is 7 years old
*******************************************

Rose starts to grow in Spring height is: 28 age is 4
Rose is blooming at Summer height is: 28 age is 4
Rose is cut in autumn height is: 0 age is 4
Rose is not growing during winter height is: 0 age is 4
Rose starts to grow in Spring height is: 3 age is 5
Rose is blooming at Summer height is: 3 age is 5
Rose is cut in autumn height is: 0 age is 5
Rose is not growing during winter height is: 0 age is 5
*******************************************

Rose has height: 0 and is 6 years old
*******************************************

Iris starts to grow in Spring height is: 18 age is 3
Iris is blooming at Summer height is: 18 age is 3
Iris is cut in autumn height is: 0 age is 3
Iris is not growing during winter height is: 0 age is 3
Iris starts to grow in Spring height is: 3 age is 4
Iris is blooming at Summer height is: 3 age is 4
Iris is cut in autumn height is: 0 age is 4
Iris is not growing during winter height is: 0 age is 4
*******************************************

Iris has height: 0 and is 5 years old
********************************************/