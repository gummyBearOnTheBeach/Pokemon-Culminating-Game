public class SpeedItem extends Item {

public void useItem(Pokemon p) {
  p.speedStat = (p.speedStat*this.modifier);
}
} 
