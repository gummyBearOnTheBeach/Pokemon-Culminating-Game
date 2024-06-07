public abstract class Condition{
   private int conditionID;
   private int turnsRemaining;
   
   public Condition(conditionID){
      
   }

}

Fields:
conditionID
Purpose: Stores the ID of the condition for ease of reference
Data type: int
Structure: private non-static variable
turnsRemaining
Purpose: Stores the turns of battle remaining until the condition is removed
Data type: int
Structure: private non-static variable

Contains all accessors, constructors, and mutators

Methods:
Apply() (abstract):
Parameters: Pokemon that the condition will be applied to
Returns: nothing
Method Description: Abstract method that calls corresponding method depending on the type of condition

(noteworthy that in the pokemon class, currentCondition would become null once turnsRemaining reaches 0).
