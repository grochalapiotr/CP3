public class Beverage
{
    private String name;
    private float volume;
    private boolean alcohol;
    private String flavour;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setVolume(float volume){
        this.volume = volume;
    }
    public float getVolume(){
        return volume;
    }
    
    public void setAlcohol(boolean alcohol){
        this.alcohol = alcohol;
    }
    public boolean getAlcohol(){
        return alcohol;
    }
    
    public void setFlavour(String flavour){
        this.flavour = flavour;
    }
    public String getFlavour(){
        return flavour;
    }
    
}
