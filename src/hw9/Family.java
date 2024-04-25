package hw9;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;


    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        Human[] children = new Human[]{};
    }
    public void addChild(Human child) {
        if (children == null) {
            children = new Human[1];
            children[0] = child;
        } else {
            Human[] temp = new Human[children.length + 1];
            for (int i = 0; i < children.length; i++) {
                temp[i] = children[i];
            }
            temp[temp.length - 1] = child;
            children = temp;
        }
    }

    public boolean deleteChild(int index) {
        boolean isDeleted = true;
        index = getIdOfChild();
        if (!(index == -1)) {
            children[index] = null;
            Human[] temp = new Human[children.length - 1];
            int counter = 0;
            for (int i = 0; i < children.length; i++) {
                if (children[i] == null) {
                    continue;
                }
                temp[counter] = children[i];
                counter++;
            }
            children = temp;
        }
        return isDeleted;
    }
    private int getIdOfChild() {
        int idOfChild = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].getName().equals(this.getChildren())) {
                idOfChild = i;
                break;
            }
        }
        return idOfChild;
    }
    public void countFamily() {

    }
    @Override
    public String toString() {
        return "Family {" +
                "mother = " + mother +
                ", father = " + father +
                ", children = " + Arrays.toString(children) +
                ", pet = " + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father);
    }
}
