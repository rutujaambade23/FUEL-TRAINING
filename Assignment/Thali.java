//STEPS FOR IMPLEMENTING THE FACTORY INTERFACE

//Implementation. ...
//Create an interface. ...
//Create concrete classes implementing the same interface. ...
//Create a Factory to generate object of concrete class based on given information. ...
//Use the Factory to get object of concrete class by passing an information such as type. ...
//Verify the output.



public abstract class Thali {
    public abstract void addSabji();
    public abstract void addDal();
    public abstract void addRice();
    public abstract void addRoti();
  
    public void makeThali() {
        System.out.println("Veg Thali will be ready in 30 minutes.");
    }
}
 class GujaratiThali extends Thali {
     
    @Override
    public void addSabji() {
        System.out.println("Adding Sabji for Veg Gujarati Thali.");
    }
  
    @Override
    public void addDal() {
        System.out.println("Adding Dal for Veg Gujarati Thali.");
         
    }
  
    @Override
    public void addRice() {
        System.out.println("Adding Rice for Veg Gujarati Thali.");
         
    }
  
    @Override
    public void addRoti() {
        System.out.println("Adding Roti for Veg Gujarati Thali.");
         
    }
}

public class PunjabiThali extends Thali {
     
    @Override
    public void addSabji() {
        System.out.println("Adding Sabji for Veg Punjabi Thali.");
    }
  
    @Override
    public void addDal() {
        System.out.println("Adding Dal for Veg Punjabi Thali.");
         
    }
  
    @Override
    public void addRice() {
        System.out.println("Adding Rice for Veg Punjabi Thali.");
         
    }
  
    @Override
    public void addRoti() {
        System.out.println("Adding Roti for Veg Punjabi Thali.");
         
    }
}





public abstract class BaseThaliRestaurant {
     
    public abstract Thali createThali(String type);
}

public class ThaliRestaurant extends BaseThaliRestaurant{
    @Override
    public  Thali createThali(String type){
        Thali thali;
        switch (type.toLowerCase())
        {
            case "gujarati":
                thali = new GujaratiThali();
                break;
            case "punjabi":
                thali = new PunjabiThali();
                break;
     
            default: throw new IllegalArgumentException("No such Thali.");
        }
  
        thali.addSabji();
        thali.addRice();
        thali.addDal();
        thali.addRoti();
        thali.makeThali();
        return thali;
    }
}


public class FactoryDesignPattern {
     
    public static void main(String args[]){
    BaseThaliRestaurant thalirestaurant = new ThaliRestaurant();
        Thali gujaratiThali = thalirestaurant.createThali("gujarati");
        Thali punjabiThali = thalirestaurant.createThali("punjabi");
    }
}
