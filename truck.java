//inheritance from class vehicle
public class truck extends vehicle{
    int max;
    public truck(String brand, int max){
        super(brand, null);
        this.setMax(max);
    }
    
    //setter
    public void setMax(int max){
        this.max=max;
    }
    //getter
    public int getMax(){
        return max;
    }
    
    @Override
    public void result(){
        System.out.println("Brand : "+getBrand()+ "\nMax Capacity : "+getMax());
    }
    

}