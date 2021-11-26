//abstract class
public abstract class vehicle{
    private String brand, year;

    public vehicle(String brand, String year){
        this.setBrand(brand);
        this.setYear(year);
    }
    
    //setter 
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setYear(String year){
        this.year=year;
    }
       
    //getter
    public String getBrand(){
        return brand;
    }
    public String getYear(){
        return year;
    }
   
    
    public void result(){
        System.out.println("Brand : "+brand+ "\nYear : "+year);
    }
}