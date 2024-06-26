
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

/**
 * Manage a company.
 *
 * @author POO
 * @version 03/2024
 */
public class Company {

    // Clients registry
    private ArrayList<User> clients;
    // Sellers registry
    private ArrayList<User> sellers;
    // Properties registry
    private ArrayList<Property> properties;
    // Sells registry
    private ArrayList<Sell> sells;

    /**
     * Constructor of class Company
     */
    public Company() {
        this.clients = new ArrayList<>();
        this.sellers = new ArrayList<>();
        this.properties = new ArrayList<>();
        this.sells = new ArrayList<>();
    }

    /**
     * Get the list of clients.
     *
     * @return This company clients.
     */
    public List<User> getClients() {
        return clients;
    }

    /**
     * Get the list of sellers.
     *
     * @return This company sellers.
     */
    public List<User> getSellers() {
        return sellers;        
    }

    /**
     * Get the list of properties.
     *
     * @return This company's properties.
     */
    public List<Property> getProperties() {
        return properties;        
    }

    /**
     * Get the list of sells.
     *
     * @return This company sells.
     */
    public List<Sell> getSells() {
        return sells;         
    }

    /**
     * Register a client.
     *
     * @param client to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerClient(User client) {
        if(!clients.contains(client) && client != null){
            this.clients.add(client);
            return true;
        }
        return false;
    }

    /**
     * Register a seller.
     *
     * @param seller to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSeller(User seller) {
        if(!sellers.contains(seller) && seller != null){
            this.sellers.add(seller);
            return true;
        }
        return false;
    }

    /**
     * Register a property.
     *
     * @param property to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerProperty(Property property) {
        if(!properties.contains(property) && property != null){
            this.properties.add(property);
            return true;
        }
        return false;
    }

    /**
     * Register a sell.
     *
     * @param sell to register. Must not be null. Must not be registered.
     * @return true If the registration succeeds, false otherwise.
     */
    public boolean registerSell(Sell sell) {
        if(!sells.contains(sell) && sell != null){
            this.sells.add(sell);
            return true;
        }
        return false;
    }

    /**
     * Generate a new sell and register that sell.
     *
     * @param client Must be already registered.
     * @param seller Must be already registered.
     * @param property Must be already registered.
     * @return true If the request succeeds, false otherwise.
     */
    public boolean createSell(User client, User seller, Property property) {
        if(clients.contains(client) && sellers.contains(seller) && properties.contains(property)){
            Sell sell = new Sell(client, seller, property);
            return true;
        }
        return false;         
    }

    /**
     * Calculates the total number of sells within the provided year.
     *
     * @param year
     * @return The total number of sells in the year.
     */
    public int calculateSellsOfTheYear(int year) {
        int numberOfSells = 0;
        for(int i=0; i< sells.size(); i++){
            if(sells.get(i).getDate().getYear() == year){
                numberOfSells++;
            }
        }
        return numberOfSells;
    }

    /**
     * Find the seller with more sells within the provided year.
     *
     * @param year
     * @return The name of the seller of the year.
     */
    public String findSellerOfTheYear(int year) {
        /*
        int bestIndex = 0;
        //User bestSeller = null;
        for(int i=0; i< sells.size(); i++){
            if(sells.get(i).getDate().getYear() == year){
                
                if(sells.get(i).getSeller() > sells.get(bestIndex)){
                    bestSeller = sells.get(i).getSeller();
                }
                //.getSeller().getName()
            }
        }
        return numberOfSells;
        */
       return "";
    }


}
