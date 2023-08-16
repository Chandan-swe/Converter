
package converterongui;


public class Converter {
    
    double fahrenheit;
    double celcius;
    double taka;
    double dollar;
    double meter;
    double centemeter;
    static final double SELLINGUSD=78.322;
    static final double BUYINGUSD=79.934;
    
    
    
    
    public  double celsiusToFahrenheit(double tempreture){
        
    return (fahrenheit=(1.8*tempreture)+32);
        
    }
    
    public double fahrenheitToCelsius(double tempreture){
        
       return (celcius=(tempreture-32)/1.8);
    }
    
     public double takaToDollar(double currency){
         
        return( taka=currency/BUYINGUSD);
     }
     
     public double dollarToTaka(double currency){
         
       return  (dollar=currency*SELLINGUSD);
     }
     
     public double meterToCentemeter(double distance){
         
       return  (meter=distance*100);
         
     }
     
     public double centemeterToMeter(double distance){
         
      return   (centemeter=distance/100);
     }
     
}
