import static org.junit.Assert.*;
import org.junit.*;
public class palindromoTest {
    //instanciar clase
    private palindromo palindromo1;

    @Before
    public void setUp() throws Exception {
        palindromo1 = new palindromo();
    }

    @After
    public void tearDown() throws Exception {
        palindromo1 = null;
    }

    @Test
    public void esPalindromo() {
        //palabra de prueba
        String palindromo = "solaalos";
        boolean esperado = true;
        assertEquals(esperado,palindromo1.esPalindromo(palindromo));
    }
}