package game.items;


import game.characters.BodyPart;

public class Armor extends InventoryObject{

    private ArmorPart head;
    private ArmorPart leftArm;
    private ArmorPart rightArm;
    private ArmorPart leftLeg;
    private ArmorPart rightLeg;
    private ArmorPart torso;

    public Armor(String name, double weigth, int count, ArmorPart head, ArmorPart leftArm, ArmorPart rightArm, ArmorPart leftLeg, ArmorPart rightLeg, ArmorPart torso) {
        super(name, weigth, count);
        this.head = head;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.torso = torso;
    }

    public Armor(String name, double weigth, ArmorPart head, ArmorPart leftArm, ArmorPart rightArm, ArmorPart leftLeg, ArmorPart rightLeg, ArmorPart torso) {
        super(name, weigth);
        this.head = head;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.torso = torso;
    }

    public ArmorPart putOnArmor(){


        return null;
    }


}
  //  Zbroja powinna implementować metodę umożliwiającą
//  przydzielenie dowolnego elemetentu do odpowiedniej części ciała.
//  Jeśli dana część ciała jest już zajęta, wcześniej wykorzystywany
//  element zwracany jest z metody na zewnątrz