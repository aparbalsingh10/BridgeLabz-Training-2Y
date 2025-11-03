class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000;
    double totalCost;
    CarRental() {
        this("Unknown", "Basic", 1);
    }
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateCost();
    }
    void calculateCost() {
        totalCost = rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost);
        System.out.println();
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        CarRental c2 = new CarRental("Ritesh", "SUV", 4);

        c1.display();
        c2.display();
    }
}
