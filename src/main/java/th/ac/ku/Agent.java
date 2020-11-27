package th.ac.ku;

import java.util.Arrays;
import java.util.List;

public class Agent {

    public static float DepositAmount = 30000.00f;
    public static float MaximumAmount = 50000.00f;
    public static float MinimumAmount = 100.00f;


    public boolean checkDepositPerTransaction(float depositCash) {
        if (depositCash <= DepositAmount){
            return true;
        }
        return false;
    }

    public List<String> getAllBankAccounts(){
        List<String> allBankAccounts = Arrays.asList("884029247175",
                                                    "212706340785",
                                                    "919122386612",
                                                    "155304868835",
                                                    "607728729536");
        return allBankAccounts;

    }

    public List<String> getAllSuspendedBankAccounts(){
        List<String> allSuspendedBankAccounts = Arrays.asList("884029247175",
                                                              "155304868835");
        return allSuspendedBankAccounts;

    }

    public boolean checkSuspendedAccount(String accountNumber) {
        return getAllBankAccounts().contains(accountNumber) && getAllSuspendedBankAccounts().contains(accountNumber);
    }


    public boolean checkMaximumDepositPerDay(float depositMaximumCash) {
        if (depositMaximumCash <= MaximumAmount){
            return true;
        }
        return false;
    }

    public boolean checkMinimumCashPerTransaction(float depositCash) {
        if (depositCash >= MinimumAmount){
            return true;
        }
        return false;
    }
}
