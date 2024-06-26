public class DamageMove extends Move{
   private int basePower;
   
   public DamageMove(String objectID, String moveName, int moveType, int moveID, int basePower){
      super(objectID, moveName, moveType, moveID);
      this.basePower = basePower;
   }
   
   public void useMove(Pokemon p1, Pokemon p2){
      p2.setHPStat(0.2*(p1.getAtkStat()*basePower)/p2.getDefStat());
   }
   
   public String toString(){
      String damageMoveInfo = "Move Type: Damage\nMove Name: " + getMoveName() + "\nType: " + getMoveTypeName(typeID) + "\nMove ID: " + getMoveID() + "\nBase Power: " + getBasePower(); 
      return damageMoveInfo;
   }

}