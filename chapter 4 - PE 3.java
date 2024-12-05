public class FatGram {
    private int calories;
    private int fatGrams;

    public FatGram(int calories, int fatGrams) {
        this.calories = calories;
        this.fatGrams = fatGrams;
    }

    public double getCaloriesFromFat() {
        return fatGrams * 9;
    }

    public double getPercentageCaloriesFromFat() {
        return (getCaloriesFromFat() / calories) * 100;
    }

    public boolean isLowFat() {
        return getPercentageCaloriesFromFat() < 30;
    }

    public boolean isValid() {
        return getCaloriesFromFat() <= calories;
    }
}
