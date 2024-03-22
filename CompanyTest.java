

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    
    private Company company1;
    private User client1, client2, seller1, seller2;
    private Property property1, property2;
    private Sell sell1, sell2;
    
    /**
     * Default constructor for test class CompanyTest
     */
    public CompanyTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        this.company1 = new Company();
        this.client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        this.client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        this.seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        this.seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        this.property1 = new Property("T1 Monte Feio", 130000.0);
        this.property2 = new Property("T2 Monte Lindo", 140000.0);
        this.sell1 = new Sell(client1, seller1, property1);
        this.sell2 = new Sell(client2, seller2, property2);
    }

    @Test
    public void testConstructor(){
        assertNotNull(company1.getClients());
        assertNotNull(company1.getSellers());
        assertNotNull(company1.getProperties());
        assertNotNull(company1.getSells());
    }
    @Test
    public void testRegisterClient(){
        assertEquals(true,company1.registerClient(client1));
    }
    @Test
    public void testRegisterClients(){
        assertEquals(true,company1.registerClient(client1));
        assertEquals(true,company1.registerClient(client2));
    }
    @Test
    public void testRegisterClientDuplicate(){
        company1.registerClient(client1);
        assertEquals(false,company1.registerClient(client1));
    }
    @Test
    public void testRegisterClientNull(){
        assertEquals(false,company1.registerClient(null));
    }
    
    @Test
    public void testRegisterSeller(){
        assertEquals(true,company1.registerSeller(seller1));
    }
    @Test
    public void testRegisterSellers(){
        assertEquals(true,company1.registerSeller(seller1));
        assertEquals(true,company1.registerSeller(seller2));
    }
    @Test
    public void testRegisterSellerDuplicate(){
        company1.registerSeller(seller1);
        assertEquals(false,company1.registerSeller(seller1));
    }
    @Test
    public void testRegisterSellerNull(){
        assertEquals(false,company1.registerSeller(null));
    }
    
    @Test
    public void testRegisterProperty(){
        assertEquals(true,company1.registerProperty(property1));
    }
    @Test
    public void testRegisterProperties(){
        assertEquals(true,company1.registerProperty(property1));
        assertEquals(true,company1.registerProperty(property2));
    }
    @Test
    public void testRegisterPropertyDuplicate(){
        company1.registerProperty(property1);
        assertEquals(false,company1.registerProperty(property1));
    }
    @Test
    public void testRegisterPropertyNull(){
        assertEquals(false,company1.registerProperty(null));
    }
    
    @Test
    public void testCreateSell(){
        company1.registerClient(client1);
        company1.registerSeller(seller1);
        company1.registerProperty(property1);
        assertEquals(true,company1.createSell(client1, seller1, property1));
    }
    @Test
    public void testCalculateSellsOfTheYear(){
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
