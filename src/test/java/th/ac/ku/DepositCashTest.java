package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashTest {

    @Test
    void depositLessThan30000ResultShouldBeTrue(){
        boolean expectedResult = true;
        float depositCash = 5000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void depositEqualTo30000ResultShouldBeTrue(){
        boolean expectedResult = true;
        float depositCash = 30000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void depositMoreThan30000ResultShouldBeFalse(){
        boolean expectedResult = false;
        float depositCash = 32000.00f;
        Agent agent = new Agent();

        boolean actualResult = agent.checkDepositPerTransaction(depositCash);

        assertEquals(expectedResult, actualResult);
    }

}
