public class HealthItem extends Item {

public void useItem(Pokemon p) {
  //checks if the pokemon's hp will overflow after taking the item
  if (p.currentHp + modifier <= p.maxHpStat) {
    p.currentHp += this.modifier); //heals the pokemon 
}
  else {
    p.currentHp = p.maxHpStat; //brings the pokemon to full health instead of overflowing
  }
}

}
