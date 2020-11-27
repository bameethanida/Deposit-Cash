package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumCashDepositTest {

    @Test
    void deposit_Maximum_Amount_Less_Than_50000_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositMaximumCash = 30000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaximumDepositPerDay(depositMaximumCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_Maximum_Amount_Equal_To_50000_Result_Should_Be_True(){
        boolean expectedResult = true;
        float depositMaximumCash = 50000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaximumDepositPerDay(depositMaximumCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_Maximum_Amount_More_Than_50000_Result_Should_Be_False(){
        boolean expectedResult = false;
        float depositMaximumCash = 55000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkMaximumDepositPerDay(depositMaximumCash);

        assertEquals(expectedResult, actualResult);
    }

}
