public class Hero {
    private int health;
    private int damage;
    private String defenceType;

    public Hero(int health,int damage,String defenceType){
        this.health=health;
        this.damage=damage;
        this.defenceType=defenceType;
    }
    public  Hero(int health,int damage){
        this.health=health;
        this.damage=damage;
    }
    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
    public String getDefenceType() {
        return defenceType;
    }
}
