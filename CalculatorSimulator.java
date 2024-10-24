package com.apj;

// Custom exception for invalid country
class CountryNotValidException extends Exception{
    public CountryNotValidException(String msg){
        super(msg);
    }
}

// Custom exception for invalid employee name
class EmployeeNameInvalidException extends Exception{
    public EmployeeNameInvalidException(String msg){
        super(msg);
    }
}

// Custom exception for employees who need not to pay the tax
class TaxNotEligibleException extends Exception{
    public TaxNotEligibleException(String msg){
        super(msg);
    }
}


//class to calculate tax
class TaxCalculator{

    //method
    public double calculateTax(String empName, boolean isIndian, double empSal)
        throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException{

            //Checks country is valid or not
            if(!isIndian){
                throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
            }

            //checks if employee name is not empty
            if(empName==null || empName.trim().isEmpty()){
                throw new EmployeeNameInvalidException("The employee name cannot be empty.");
            }

            //calculate tax based on salary
            if(empSal>100000){
                return (empSal*8/100);
            }
            else if(empSal>=50000 && empSal<=100000){
                 return (empSal*6/100);   
            }
            else if(empSal>=30000 && empSal<50000){
                return (empSal*5/100);   
            }
            else if(empSal>=10000 && empSal<30000){
                return (empSal*4/100);   
            }
            else{
                throw new TaxNotEligibleException("The employee does not need to pay tax.");
            }

        }
    
}

public class CalculatorSimulator{
    public static void main(String[] args) {
        //instnce for taxcalculator
        TaxCalculator calc= new TaxCalculator();

        //testcases
        String[] empNames= {"Ron", "Tim", "Jack",null};
        boolean[] country= {false,true,true,true};
        double[] salaries={34000,1000,55000,30000};

        //loop through testcases
        for(int i=0;i<empNames.length;i++){
            try{
                double tax= calc.calculateTax(empNames[i],country[i],salaries[i]);
                System.out.println("Tax amount for "+empNames[i]+ " is " +tax);
            }
            catch(CountryNotValidException e){
                System.err.println(e.getMessage());
            }
            catch(EmployeeNameInvalidException e){
                System.err.println(e.getMessage());
            }
            catch(TaxNotEligibleException e){
                System.err.println(e.getMessage());
            }
        }
    }
}