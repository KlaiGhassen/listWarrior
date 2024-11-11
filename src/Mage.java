//0.25pt final + 0.25pt extends
final class Mage extends Character {
    private int mana;

    public Mage(String name, int healthPoints, int mana) {
        super(name, healthPoints);
        this.mana = mana;
    }

    //0.5pt
    @Override
    public void attack() {
        System.out.println(name + " casts a spell!");
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    //0.5pt
    @Override
    public String toString() {
        return super.toString() + " Mana: " + mana;
    }
}