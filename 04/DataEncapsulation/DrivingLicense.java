public class DrivingLicense
{
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private String number;
    private int year;
    private String category;
    
    /*public DrivingLicense(String name, String surname, String address, String postalCode, String city, String number,int year, String category){
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
        this.surname = surname.substring(0, 1).toUpperCase() + surname.substring(1);
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.number = number;
        this.year = year;
        this.category = category;
    }*/
    
    public void setName(String name){
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
    }    
    public String getName(){
        return name;
    }   
    public void setSurname(String surname){
        this.surname = surname;
    }    
    public String getSurname(){
        return surname;
    }    
    public void setAddress(String address){
        this.address = address;
    }   
    public String getAddress(){
        return address;
    }    
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }    
    public String getPostalCode(){
        return postalCode;
    }    
    public void setCity(String city){
        this.city = city;
    }    
    public String getCity(){
        return city;
    }    
    public void setNumber(String number){
        this.number = number;
    }    
    public String getNumber(){
        return number;
    }    
    public void setYear(int year){
        if(year>=1980 && year<=2021){
            this.year = year;
        }
    }   
    public int getYear(){
        return year;
    }
    public void setCategory(String category){
        this.category = category;
    }    
    public String getCategory(){
        return category;
    }
    
    public void displayInfo(){
       System.out.println("Name: "+getName()+
       "\nSurname: "+getSurname()+
       "\nAddress: "+getAddress()+
       "\nPostal Code: "+getPostalCode()+
       "\nCity: "+getCity()+
       "\nDriving licence number: "+getNumber()+
       "\nYear of issue: "+getYear()+
       "\nCategory: "+getCategory()); 
    }
    
    public String toString(){
        return ("Name: "+getName()+
       "\nSurname: "+getSurname()+
       "\nAddress: "+getAddress()+
       "\nPostal Code: "+getPostalCode()+
       "\nCity: "+getCity()+
       "\nDriving licence number: "+getNumber()+
       "\nYear of issue: "+getYear()+
       "\nCategory: "+getCategory());
    }
    
}
