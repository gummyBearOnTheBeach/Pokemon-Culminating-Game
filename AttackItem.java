public class AttackItem extends Item {

public void useItem(Pokemon p) {
  p.attackStat *= this.modifier;
}
}  
