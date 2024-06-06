public class AttackItem extends Item {

public void useItem(Pokemon p) {
  p.attackStat = (p.attackStat*this.modifier);
}
}  
