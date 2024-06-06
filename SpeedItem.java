public class SpeedItem extends Item {

public void useItem(Pokemon p) {
  p.speedStat *= this.modifier;
}
} 
