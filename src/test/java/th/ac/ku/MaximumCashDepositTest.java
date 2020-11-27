package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumCashDepositTest {

    @Test
    void deposit_Cash_Less_Than_Maximum_Amount_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 30000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaximumDepositPerDay(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_Cash_Equal_To_Maximum_Amount_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositCash = 50000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaximumDepositPerDay(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_Cash_More_Than_Maximum_Amount_Result_Should_Be_False(){
        boolean expectedResult = false;
        float depositCash = 55000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaximumDepositPerDay(depositCash);

        assertEquals(expectedResult, actualResult);
    }

}
