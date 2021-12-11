package plan;

interface Plan{  
    public double getRate();
    public int getUnits();
    public String getPlanName();  
    public double calculateBill();
}  // end of Plan interface.  

class BasePlan implements Plan{  
    protected double rate;
    protected String name;
    protected int units;

    protected BasePlan(){
        this.name = "Base Plan";
        this.rate = 3.5;
        this.units = 1;
    }
    protected BasePlan(int units){
        this.units = units;
    }
    public double getRate(){  
        return rate;              
    } 
    public String getPlanName(){
        return name;
    }
    public int getUnits(){  
        return units;              
    }           
    public double calculateBill(){ 
        return this.rate * this.units;  
    }  
} // end of BasePlan class.

class DomesticPlan extends BasePlan{
    protected DomesticPlan() {}
    protected DomesticPlan(int units) {
        super.name = "Domestic Plan";
        super.rate = 5;
        super.units = units;
    } 
} // end of DomesticPlan class.  

class CommercialPlan extends BasePlan { 
    protected CommercialPlan() {}
    protected CommercialPlan(int units) {
        super.name = "Commercial Plan";
        super.rate = 10;
        super.units = units;
    } 
}//end of CommercialPlan class.  

class InstitutionalPlan extends BasePlan {
    protected InstitutionalPlan() {}
    protected InstitutionalPlan(int units) {
        super.name = "Institutional Plan";
        super.rate = 7.5;
        super.units = units;
    } 
} // end of InstitutionalPlan class.  