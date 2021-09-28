import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        List<Hero> heroList = new ArrayList<>();
        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        Hero blackWidow = new Hero("Black Widow", 34);
        heroList.add(blackWidow);
        // name: Captain America, age: 100
        Hero captainAmerica = new Hero("Captain America",100);
        heroList.add(captainAmerica);
        // name: Vision, age: 3
        Hero vision = new Hero("Vision", 3);
        heroList.add(vision);
        // name: Iron Man, age: 48
        Hero ironMan = new Hero("Iron Man",48);
        heroList.add(ironMan);
        // name: Scarlet Witch, age: 29
        Hero scarletWitch = new Hero("Scarlet Witch",29);
        heroList.add(scarletWitch);
        // name: Thor, age: 1500
        Hero thor = new Hero("Thor", 1500);
        heroList.add(thor);
        // name: Hulk, age: 49
        Hero hulk = new Hero("Hulk", 49);
        heroList.add(hulk);
        // name: Doctor Strange, age: 42
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        heroList.add(doctorStrange);
        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(thor.getAge() + 1);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroList);
        // TODO 5 : Keep only the half of the list
        int range = heroList.size();
        for(int i = 0; i <  range / 2; i++){

            heroList.remove(i);
        }
        // TODO 6 : Loop throughout the list and display the name of the remaining heroes
        for (Hero hero : heroList){
            System.out.println(hero.getName());
        }
    }
}
