package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuspendedAccountTest {

    @Test
    void check_Suspended_Account_Should_Return_True(){
        boolean expectedResult = true;
        String accountNumber = "884029247175";
        Agent agent = new Agent();

        boolean actualResult = agent.checkSuspendedAccount(accountNumber);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void check_Valid_Account_Should_Return_False(){
        boolean expectedResult = false;
        String accountNumber = "212706340785";
        Agent agent = new Agent();

        boolean actualResult = agent.checkSuspendedAccount(accountNumber);

        assertEquals(expectedResult, actualResult);
    }

}
