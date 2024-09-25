import static org.junit.Assert.*;
import org.junit.Test;

public class GameTest {

    // Other test methods...

    @Test
    public void testIsUserWinner_UserWins() {
        // Test scenario where the user wins
        assertTrue(Game.isUserWinner("EKENABBEN", "VITTSJO"));
        assertTrue(Game.isUserWinner("VITTSJO", "OXBERG"));
        assertTrue(Game.isUserWinner("OXBERG", "FJALLBO"));
        assertTrue(Game.isUserWinner("FJALLBO", "JATTESTA"));
        assertTrue(Game.isUserWinner("JATTESTA", "EKENABBEN"));
    }

    @Test
    public void testIsUserWinner_ComputerWins() {
        // Test scenario where the computer wins
        assertFalse(Game.isUserWinner("VITTSJO", "EKENABBEN"));
        assertFalse(Game.isUserWinner("OXBERG", "VITTSJO"));
        assertFalse(Game.isUserWinner("FJALLBO", "OXBERG"));
        assertFalse(Game.isUserWinner("JATTESTA", "FJALLBO"));
        assertFalse(Game.isUserWinner("EKENABBEN", "JATTESTA"));
    }

    
}
