//0.25pt non-sealed + 0.25pt extends
non-sealed class Warrior extends Character {
    private int armor;

    public Warrior(String name, int healthPoints, int armor) {
        //0.75pt
        super(name, healthPoints);
        //0.25pt
        this.armor = armor;
    }


    //0.5pt
    @Override
    public void attack() {
        System.out.println(name + " swings a sword!");
    }

    //0.5pt
    public int getArmor() {
        return armor;
    }

    //0.5pt
    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return super.toString() + " Armor: " + armor;
    }

    public void dayDaily(Jour jour) {
        switch (jour) {
            case LUNDI:
                System.out.println("fi9 bekri");
                break;
            case SAMEDI:
                System.out.println("samedi soire");
                break;
            default:
                System.out.println("mahouch nharek");
                break;

        }


    }

}
