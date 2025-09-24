//================================================================
//PROGRAMMER:    Ryan Derby
//PANTHER ID:    6288220
//
//CLASS:         COP2210
//SECTION:       U02C
//SEMESTER:      Summer 2025
//
//Project:       Project 1
//DUE:
//
//CERTIFICATION: I understand FIU's academic policies, and I certify that this work is my
//               own and that none of it is the work of any other person.
//
//================================================================

package app;

import machine.Register;
import food.Apple;
import food.Sandwich;
import transactions.Payment;


public class Controller {

    public static void main(String[] args) {
//enter you info here
        System.out.println("===============================================");
        System.out.println("COP 2210 - Project 1 Output");
        System.out.println("Ryan Derby");
        System.out.println("6288220");
        System.out.println("UO2C");
        System.out.println("===============================================");
        System.out.println("\n");


// create a Register variable named register with
// 15 dollars
// 20 quarters
// 10 dimes
// 20 nickels
// 50 pennies
        Register register = new Register(15, 20, 10, 20, 50);

// check register cash as a "Manager"
// call the cashInfo method on the register object with input "Manager"
        register.cashInfo("Manager");
// check register cash as a "Staff"
// call the cashInfo method on the register object with input "Staff"
        register.cashInfo("Staff");

// create an Apple variable named grannySmith with
// type = "Granny Smith"
// weight = 1.51
// pricePreUnitWeight = 140
        Apple grannySmith = new Apple("Granny Smith", 1.51, 140);
// call displayInfo() on the grannySmith object
        grannySmith.displayInfo();
// create an Payment variable named applePayment1 with
// 10 dollars
// 0 quarters
// 0 dimes
// 0 nickels
// 47 pennies
        Payment applePayment1 = new Payment(10,0,0,0,47);
// call displayInfo() on the applePayment1 object
        applePayment1.displayInfo();
// call the buyApple method on the register object with
// inputs grannySmith, applePayment1
        register.buyApple(grannySmith, applePayment1);
// check register cash as a "Manager"
// call the cashInfo method on the register object with input "Manager"
        register.cashInfo("Manager");
// create an Apple variable named macintosh with
// type = "Macintosh"
// weight = 1.70
// pricePreUnitWeight = 150
        Apple macintosh = new Apple("Macintosh", 1.70, 150);
// call displayInfo() on the macintosh object
        macintosh.displayInfo();
// create a Payment variable named applePayment2 with
// 0 dollars
// 2 quarters
// 0 dimes
// 0 nickels
// 0 pennies
        Payment applePayment2 = new Payment(0,2,0,0,0);
// call displayInfo() on the applePayment2 object
        applePayment2.displayInfo();
// call the buyApple method on the register object with
// inputs macintosh, applePayment2
        register.buyApple(macintosh, applePayment2);
// check register cash as a "Manager"
// call the cashInfo method on the register object with input "Manager"
        register.cashInfo("Manager");
// create an Sandwich variable named sandwich with
// meat = true
// cheese = true
// veggies = true
        Sandwich sandwich = new Sandwich("White",true,true,true);
// call displayInfo() on the sandwich object
        sandwich.displayInfo();
// create an Payment variable named sandwichPayment1 with
// 5 dollars
// 2 quarters
// 1 dimes
// 1 nickels
// 2 pennies
        Payment sandwichPayment1 = new Payment(5,2,1,1,2);
// call displayInfo() on the sandwichPayment1 object
        sandwichPayment1.displayInfo();
// call the buySandwich method on the register object with
// inputs sandwich, sandwichPayment1
        register.buySandwich(sandwich,sandwichPayment1);
// check register cash as a "Manager"
// call the cashInfo method on the register object with input "Manager"
        register.cashInfo("Manager");
// create booleans
        System.out.println("");
// Create all type sandwichs combinations
// then buy each sandwich by creating a payment with
// 10 dollars
// 0 quarters
// 0 dimes
// 0 nickels
// 0 pennies
// YOU MUST USE A FOR LOOP AND IF ELSE STATMENTS

        for(int i = 1 ; i <= 8 ; i++) {

            boolean meat = true;
            boolean cheese = true;
            boolean veggies = true;

            System.out.println("=======================================================================");
            System.out.println();
            System.out.println("=======================================================================");

           if(i <= 4) {

               meat = true;

           }
           else {

               meat = false;

           }
           if(i == 1 || i == 2 || i == 5 || i == 6) {

               cheese = true;

           }
           else {

               cheese = false;

           }
           if(i % 2 == 1) {

               veggies = true;

           }
           else {

               veggies = false;

           }



           Sandwich s = new Sandwich(meat, cheese, veggies);
           Payment p = new Payment(10,0,0,0,0);
           s.displayInfo();
           p.displayInfo();
           register.buySandwich(s, p);
           register.cashInfo("Manager");




            System.out.println("=======================================================================");
            System.out.println();
            System.out.println("=======================================================================");

        }
    }//end main
}
