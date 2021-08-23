package OOPS;

public  class MovieTicketTester {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(111, 7);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + Math.round(amount*100)/100.0);
    }
}

