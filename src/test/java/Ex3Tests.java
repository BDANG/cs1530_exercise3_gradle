import static org.junit.Assert.*;
import org.junit.*;
//import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.mockito.*;

public class Ex3Tests{
    Ex3 program = new Ex3();

    @Test
    public void zeroCutCaterer(){
        assertEquals(1, program.call_lazy_caterer(0));
    }

    @Test
    public void zeroTriangle(){
        assertEquals(0, program.call_triangle(0));
    }

    @Test
    public void threeCutCaterer(){
        assertEquals(program.call_lazy_caterer(3), 7);
    }

    @Test
    public void threeTriangle(){
        assertEquals(program.call_triangle(3), 6);
    }

    @Test
    public void tenCutCaterer(){
        assertEquals(56, program.call_lazy_caterer(10));
    }

    @Test
    public void tenTriangle(){
        assertEquals(55, program.call_triangle(10));
    }
}
