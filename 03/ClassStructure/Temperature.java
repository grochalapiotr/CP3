public class Temperature
{   
    double celcius;
    double kelvin;
    double fahrenheit;
    void CelciusToKelvin(){
        kelvin = celcius + 273;
    }
    void KelvinToCelcius(){
        celcius = kelvin - 273;
    }
    void CelciusToFahrenheit(){
        fahrenheit = (celcius*1.8) + 32;
    }
    void FahrenheitToCelcius(){
        celcius = (fahrenheit - 32) * 0.55;
    }
    void KelvinToFahrenheit(){
        fahrenheit = kelvin * 5/9 - 459.67;
    }
    void FahrenheitToKelvin(){
        kelvin = (fahrenheit +459.67) * 5/9;
    }
}
