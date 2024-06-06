public class DefenceItem extends Item {

public void useItem(Pokemon p) {
  p.defenceStat *= this.modifier;
}
} 
