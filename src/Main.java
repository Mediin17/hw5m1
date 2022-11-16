public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(200);
        boss.setDamage(25);
        boss.setDefenceType("Magical");
        System.out.println("Health of boss:" + boss.getHealth() + "\n Damage of boss:" +
                boss.getDamage() + "\n Defence Type of boss:" + boss.getDefenceType());
        CreateHeroes();
        for (int i = 0; i < CreateHeroes().length; i++) {
            System.out.println( "Health of hero:"+CreateHeroes()[i].getHealth());
            System.out.println("Damage of hero:"+CreateHeroes()[i].getDamage());
            System.out.println("Defence type of hero:"+CreateHeroes()[i].getDefenceType());

        }
    }
    
    public static Hero[] CreateHeroes() {
        Hero crystal = new Hero(200, 25, "clean like a water");
        Hero mag = new Hero(150, 30, "illusion of deception");
        Hero archer = new Hero(100, 20, "archery from bow");
        Hero allHeroes[] = new Hero[]{crystal, mag, archer};
        return allHeroes;

    }
}
