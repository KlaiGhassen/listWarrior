public class Guild {
    // 0.5pt final + 0.5pt static
    public static final int MAX_MEMBERS = 10;
    private Character[] members;
    private int level;
    private int nbrMembers;

    public Guild() {
        //0.5pt
        members = new Character[MAX_MEMBERS];
    }

    public void addMember(Character member) {
        // 1pt
        if (nbrMembers >= MAX_MEMBERS || searchMember(member)) {
            return;
        }

        // 0.25pt
        members[nbrMembers] = member;
        // 0.25pt
        nbrMembers++;
    }

    //1pt Accepter seulement equals
    public boolean searchMember(Character character) {
        for (int i = 0; i < nbrMembers; i++) {
            if (members[i].equals(character))
                return true;
        }
        return false;
    }

    public void levelUp() {
        //condition optionelle
        if (nbrMembers < 2) return;

        //1 pt comptage des mages et des guerriers
        int mages = 0;
        int warriors = 0;
        for (int i = 0; i < nbrMembers; i++) {
            if (members[i] instanceof Mage)
                mages++;
            else
                warriors++;
        }

        //0.5pt vérification et incrémentation
        if (mages < 2 || warriors < 4) {
            System.out.println("Not enough members!");
            return;
        }
        level++;

        //1pt
        for (int i = 0; i < nbrMembers; i++) {
            if(members[i] instanceof Mage mage)
                mage.setMana(mage.getMana() + 100);
            else if(members[i] instanceof Warrior warrior)
                warrior.setArmor(warrior.getArmor() + 50);
        }
    }
}






