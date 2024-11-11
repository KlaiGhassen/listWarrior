import java.util.Comparator;

// 0.5pt sealed + 0.5pt permits + 0.5pt abstract

public sealed class Character implements Comparable<Character> permits Warrior, Mage {
    // O.25pt protected
    protected String name;
    // O.25pt protected
    protected int healthPoints;

    // O.5pt
    public Character(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    // O.5pt
    //0pt si la méthode n'est pas abstraite ou si elle est abstraite mais contient un corps
    public void attack() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    //1
    @Override
    public String toString() {
        return name + " has " + healthPoints + " health points.";
    }

    //1pt Accepter toute autre variation
    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (this == obj) return true;

        if (obj instanceof Character other)
            return name.equals(other.name) && healthPoints == other.healthPoints;

        return false;
    }


    @Override
    public int compareTo(Character o) {
        return this.healthPoints - o.healthPoints;
    }
}

class NameCreteira implements Comparator<Character> {
    @Override
    public int compare(Character o1, Character o2) {
        return o1.name.compareTo(o2.name);
    }
}

class AgeCreteira implements Comparator<Character> {
    @Override
    public int compare(Character o1, Character o2) {
        return o1.getHealthPoints() - o2.getHealthPoints();
    }
}






