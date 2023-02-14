package domain;
/**
 Standing enum will hold the standing names and their value
 @author Yovanny Moscoso
 */
public enum Standing{
    FRESHMAN(30),
    SOPHOMORE(60),
    JUNIOR(90),
    SENIOR(120);
    private final int numberOfCredits;
    Standing(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }
    public int numberOfCredits(){
        return this.numberOfCredits;
    }
    public int getNumberOfCredits(){
        return this.numberOfCredits;
    }


}
