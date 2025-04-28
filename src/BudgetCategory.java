public class BudgetCategory {
  private String category;
  private double limit;
  private double spent;
  
  public BudgetCategory(String category, double limit , double spent){
    this.limit = limit;
    this.spent = spent;
    this.category = category;


  }

  public double getLimit() {
    return limit;
  }

  public double getSpent() {
    return spent;
  } 
  
  public String getCategory() {
    return category;
  }

  @Override
  public String toString() {
      return "Category: " + category + " spent: " + spent + " limit: " + limit;
  }
  
}