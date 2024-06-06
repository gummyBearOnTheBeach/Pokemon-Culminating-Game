public class DefenceItem extends Item {

public void useItem(Pokemon p) {
  p.defenceStat = (p.defenceStat*this.modifier);
}
} 
