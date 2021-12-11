//  https://www.javatpoint.com/factory-method-design-pattern

import java.io.*;

import plan.PlanFactory;    
class GenerateBill{  
    public static void main(String args[])throws IOException{  
        // Plan jonPlan = new Plan();

        PlanFactory planFactory = new PlanFactory();  
        
        System.out.print("Enter the name of plan for which the bill will be generated: ");  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  

        String planName=br.readLine();  
        System.out.print("Enter the number of units for bill will be calculated: ");  
        int units = Integer.parseInt(br.readLine());  

        planFactory.getPlan(planName, units);  
        System.out.println(planFactory.getPlanCalculation());  
    }  
}  //  end of GenerateBill class.  