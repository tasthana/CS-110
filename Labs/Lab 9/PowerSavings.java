

public class PowerSavings extends SavingsAccount
{
   public int PENALTY = .025;
   public int rate = .05; 
   public int maturity = 4;
   public int elapsedMonth = 0; 
   
   public PoweSavings(String name, int initialAmount, int elapsedMonths) 
   {
      this.name = name;
      this.initialAmount = amount; 
      this.elapsedMonths = 0; 
   } 
   
   public void setBalance()
   {
     return amount * (rate/12);
   }
   
   
   public void getMaturity()
   {
      if elapsedMonths > maturity
         return maturity
      else 
         return elapsedMonths
    }
    
         
         
   public void withdraw(float amount) 
   {
		super.withdraw(amount - amount);
	}
}

         
   