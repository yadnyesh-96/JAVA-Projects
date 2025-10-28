package ProfitMarginApplication;
/*
 5. Company Profit Margin
Task:
 Create a Company class with fields: companyName, revenue, and expenses.
 In the main method:
Create a Company object.
Calculate the profit margin (profit/revenue) and display the result.
Explanation:
 This introduces basic mathematical operations and accessing object fields.

 */

public class ProfitMargin {
	public static void main(String x[]) {
		Company c1=new Company();
		
		c1.setCompanyName("TCS");
		c1.setRevenue(100000);
		c1.setExpenses(70000);
		
		float profit=(c1.getRevenue()-c1.getExpenses());
		float PM=(profit/c1.getRevenue())*100f;
		
		System.out.printf(
			    "\n Company Name: %s" +
			    "\n Expenses: %d Rs." +
			    "\n Revenue: %d Rs." +
			    "\n Profit Margin: %.2f %% Rs.\n",
			    c1.getCompanyName(), c1.getExpenses(), c1.getRevenue(), PM
			);
	}
}
