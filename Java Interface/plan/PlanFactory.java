package plan;

public class PlanFactory {
    Plan p;  

    public PlanFactory(){
        p = new BasePlan();
    }

    //use getPlan method to get object of type Plan   
    public void getPlan(String planType, int units){  
        switch(planType.toUpperCase()) {
            case "DOMESTICPLAN":
                p = new DomesticPlan(units); 
                break;
            case "COMMERCIALPLAN":  
                p = new CommercialPlan(units);  
                break;
            case "INSTITUTIONALPLAN": 
                p = new InstitutionalPlan(units); 
                break;
        }
    }

    public String getPlanCalculation(){
        return "Bill amount for "+ p.getPlanName() + " of " + String.valueOf(p.getUnits()) + " units is: " + String.valueOf(p.calculateBill());
    }
}
