public class CommissionEmployee extends employee{                   
   protected static double grossSales; // gross weekly sales       
   protected static double commissionRate; // commission percentage

   // two-argument constructor
   public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, 
      double commissionRate) {
      super(firstName, lastName, socialSecurityNumber);
      // if grossSales is invalid throw exception
      if (grossSales < 0.0) {
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
      }

      // if commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }
   
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 


   // set gross sales amount
   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0) {
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
      }

      this.grossSales = grossSales;
   } 

   // return gross sales amount
   public double getGrossSales() {
      return grossSales;
   } 

   // set commission rate
   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }

      this.commissionRate = commissionRate;
   } 

   // return commission rate
   public double getCommissionRate() {
      return commissionRate;
   }

   // calculate earnings
   public double earnings() {
      return getCommissionRate() * getGrossSales();
   } 

   // return String representation of CommissionEmployee object
   @Override 
   public String toString() {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
         "commission employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber(), 
         "gross sales", getGrossSales(), 
         "commission rate", getCommissionRate());
   } 
}
