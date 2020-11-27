package th.ac.ku;

public class Agent {

    public static float DepositAmount = 30000.00f;

    public boolean checkDepositPerTransaction(float depositCash) {
        if (depositCash <= DepositAmount){
            return true;
        }
        return false;
    }

}
