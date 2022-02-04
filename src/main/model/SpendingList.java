package model;

import java.util.ArrayList;
import java.util.List;


// Represents a list of spending
public class SpendingList {

    private List<Spending> listOfSpending;
    private double value = 0;

    // Constructs a spending list
    public SpendingList() {
        listOfSpending = new ArrayList<>();
    }

    // REQUIRES: only one spending is added each time
    // MODIFIES: this
    // EFFECTS: add spending to spending list
    public void addSpending(double amountSpent, String category, int date) {
        Spending spending = new Spending(amountSpent, category, date);
        listOfSpending.add(spending);
    }

    // REQUIRES: only one spending is removed each time
    // MODIFIES: this
    // EFFECTS: remove spending from spending list
    public void removeSpending(double amountSpent, String category, int date) {
        Spending spending = new Spending(amountSpent, category, date);
        listOfSpending.remove(spending);
    }

    // MODIFIES: this
    // EFFECT: calculate the total spending amount in the spending list
    //         If the list is empty, return 0
    public double calculateTotal() {
        if (listOfSpending.size() != 0) {
            for (Spending spending: listOfSpending) {
                value += spending.getAmount();
            }
            return value;
        }
        return 0;
    }

}
