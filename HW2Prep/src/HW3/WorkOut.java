package HW3;

public class WorkOut {
    private int day;
    private  int cardioMin;
    private char cardioIntensity;
    private int weightMin;
    private char weightIntensity;

    public WorkOut(int day, int cardioMin, char cardioIntensity, int weightMin, char weightIntensity) {
        this.cardioMin = cardioMin;
        this.cardioIntensity = cardioIntensity;
        this.weightMin = weightMin;
        this.weightIntensity = weightIntensity;
        this.day = day;
    }

    public WorkOut(int cardioMin, int weightMin, int day) {
        this.cardioMin = cardioMin;
        this.weightMin = weightMin;
        this.day = day;
    }
    public int getCardioCalories() {
        final int LOW_MULT = 6;
        final int MED_MULT = 9;
        final int HI_MULT = 11;
        if ( cardioIntensity == 'H'){
            return cardioMin*HI_MULT;
        } else if ( cardioIntensity == 'M'){
            return cardioMin*MED_MULT;
        } else {
            return cardioMin*LOW_MULT;
        }
    }
    public int getWeightCalories() {
        final int LOW_MULT = 4;
        final int MED_MULT = 6;
        final int HI_MULT = 9;
        if ( weightIntensity == 'H'){
            return weightMin*HI_MULT;
        } else if ( weightIntensity == 'M'){
            return weightMin*MED_MULT;
        } else {
            return weightMin*LOW_MULT;
        }
    }


}
