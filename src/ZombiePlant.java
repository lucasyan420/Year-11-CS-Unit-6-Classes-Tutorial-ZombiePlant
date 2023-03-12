public class ZombiePlant {
    private int maxPotency;
    private int successfulTreatments;

    public ZombiePlant(){

    }
    public ZombiePlant(int maxPotency, int successfulTreatments) {
        this.maxPotency = maxPotency;
        this.successfulTreatments = successfulTreatments;
    }

    public int getPotencyRequired(){
        return maxPotency;
    }
    public int treatmentsNeeded(){
        return successfulTreatments;
    }

    public boolean isDangerous(){
        if (successfulTreatments == 0){
            return false;
        }
        else{
            return true;
        }
    }

    public void treat(int treatment){
        System.out.println("Treatment" + treatment);
        System.out.println("Max potency" + maxPotency);
        if(treatment <= maxPotency && treatment > 0 && successfulTreatments > 0){
            successfulTreatments --;
        }
        else if(treatment > maxPotency){
            successfulTreatments ++;
        }
    }
}

