package game.items;


public class Armor {

    private ArmorPart head;
    private ArmorPart leftArm;
    private ArmorPart rightArm;
    private ArmorPart leftLeg;
    private ArmorPart rightLeg;
    private ArmorPart torso;

    public Armor(ArmorPart head, ArmorPart leftArm, ArmorPart rightArm, ArmorPart leftLeg, ArmorPart rightLeg, ArmorPart torso) {
        this.head = head;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.torso = torso;
    }

    public ArmorPart getHead() {
        return head;
    }

    public void setHead(ArmorPart head) {
        this.head = head;
    }

    public ArmorPart getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(ArmorPart leftArm) {
        this.leftArm = leftArm;
    }

    public ArmorPart getRightArm() {
        return rightArm;
    }

    public void setRightArm(ArmorPart rightArm) {
        this.rightArm = rightArm;
    }

    public ArmorPart getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(ArmorPart leftLeg) {
        this.leftLeg = leftLeg;
    }

    public ArmorPart getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(ArmorPart rightLeg) {
        this.rightLeg = rightLeg;
    }

    public ArmorPart getTorso() {
        return torso;
    }

    public void setTorso(ArmorPart torso) {
        this.torso = torso;
    }

    public void putOnArmor(){



    }


}
  //  Zbroja powinna implementować metodę umożliwiającą
//  przydzielenie dowolnego elemetentu do odpowiedniej części ciała.
//  Jeśli dana część ciała jest już zajęta, wcześniej wykorzystywany
//  element zwracany jest z metody na zewnątrz