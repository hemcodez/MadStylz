public class MadStylz {

    //create a greeting message
    public String getGreeting()
    {
        return "Welcome to the Mad Stylz bonus calculator!";
    } // end getGreeting

    public static void main(String[] args){

        //Display getGreeting as output to user
        MadStylz mad = new MadStylz();
        System.out.println(mad.getGreeting());

        //Declare an array for total sales
        String[] salesPerson = {"Mark", "Roxy", "Blinky", "Sri", "Tane"};

        //Declare an array called totalSales and populate it
        double[] totalSales = new double[5];
        totalSales[0] = 123.0;
        totalSales[1] = 452.32;
        totalSales[2] = 620.99;
        totalSales[3] = 980.0;
        totalSales[4] = 1320.32;

        //Use a for loop to display the content of the array to the user
        for (int i=0; i<=4; i++) {

            //If the sales amount is 200 or less, the bonus is $25
            if (totalSales[i] <= 200.00) {
                        System.out.println(salesPerson[i] + " -> Total Sales:  $" + totalSales[i] + "  ||  " + " Bonus: $25.0");


                        //If the sales amount is over 200, and less than 500, the bonus is $50
                    } else if (totalSales[i] > 200.00 && totalSales[i] < 500.00) {
                        System.out.println(salesPerson[i] + " -> Total Sales:  $" + totalSales[i] + "  ||  " + " Bonus: $50.0");


                        //If the sales amount is 500 or more, and less than 1000, the bonus is $100
                    } else if (totalSales[i] > 500.00 && totalSales[i] < 1000.00) {
                        System.out.println(salesPerson[i] + " -> Total Sales:  $" + totalSales[i] + "  ||  " + " Bonus: $100.0");


                        //If the sales amount is 1000 or higher, the bonus is $200.
                    } else if (totalSales[i] >= 1000.00) {
                        System.out.println(salesPerson[i] + " -> Total Sales:  $" + totalSales[i] +"  ||  " + " Bonus: $200.0");
                    }

            } //end for loop

    } // end main
} // end class