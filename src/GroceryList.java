import java.util.ArrayList;

public class GroceryList {

    ArrayList<Grocery> grocList = new ArrayList<Grocery>();

    public ArrayList<Grocery> getGrocList() {
        return grocList;
    }

    public void addGrocery(Grocery groc) {
        grocList.add(groc);
    } //Adds the given Grocery parameter to the grocList.

    /*
     * Student Self-Explanation:
     * In the method removeGrocery it needs to loop the grocList till the given grocName is found then remove that variable from the list.
     * To do this I should create an if statment that calls getName set and if it is equal to the grocName it will remove it from the list.
     *
     */
    public void removeGrocery(String grocName) { //Loops through the grocList until the given grocName is found then it is removed from the list. Grocery.getName() will prove useful.

        for(Grocery g: grocList) {
            if(g.getName().equals(grocName)) {
                grocList.remove(g);
                break;
            }
        }
    }

    public String toString() { //Loops through the grocList ArrayList and appends the toString() of each Grocery object to the strList variable. Using the Grocery.toString() method from the Grocery class will be handy for this method.

        String strList = "";
        for (Grocery g : grocList){
            strList = strList + g.toString() + "\n";
        }
        return strList;
    }

    public String getAisleGroceries(int aisle) { //Loops through the grocList and checks each Grocery object's aisle against the aisle parameter provided. Each Grocery that has the same aisle has its Grocery.toString() added to the aisleString variable, along with a newline character, '\n'.
        String aisleString = "";
        for (Grocery g : grocList) {
            if (g.getAisle() == aisle) {
                aisleString = aisleString + g.toString() + "\n";
            }
        }
        return aisleString;
    }

    public String getTotals() { //Gets the summation of all prices and calories contained in the GroceryList's Grocery objects.

        double priceSum = 0;
        int caloriesSum = 0;
        for(Grocery g: grocList) {
            priceSum += g.getPrice();
            caloriesSum += g.getCalories();
        }
        String rtn = "The total price of this Grocery Trip: $" + priceSum + '\n';
        rtn += "The total calories of this Grocery Trip: " + caloriesSum + "cal\n";
        return rtn;
    }
}