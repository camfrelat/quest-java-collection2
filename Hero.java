
public class Hero  implements Comparable<Hero>{

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    
    }
    
    // Compare two heros based on their name and class them by alphabetical order
    
    @Override
    public int compareTo(Hero hero) {
    	
    	return this.getName().compareTo(hero.getName());
    }

    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}