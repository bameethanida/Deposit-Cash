package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumCashDepositTest {

    @Test
    void deposit_Cash_Less_Than_Minimum_Amount_Result_Should_Be_False(){
        boolean expectedResult = false;
        float depositCash = 50.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMinimumCashPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_Cash_Equal_To_Minimum_Amount_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 100.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMinimumCashPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_Cash_More_Than_Minimum_Amount_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 150.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMinimumCashPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);
    }

}
