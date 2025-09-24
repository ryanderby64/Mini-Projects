package food;

public class Sandwich {

    private String bread = "White";
    private boolean meat;
    private boolean cheese;
    private boolean veggies;
    private double price;

    public Sandwich(boolean meat, boolean cheese, boolean veggies) {

        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;

    }

    public Sandwich(String bread, boolean meat, boolean cheese, boolean veggies) {

        this(meat,cheese,veggies);
        this.bread = bread;

    }

    public String getBread() {

        return bread;

    }

    public void setBread(String bread) {

        this.bread = bread;

    }

    public boolean isMeat() {

        return meat;

    }

    public void setMeat(boolean meat) {

        this.meat = meat;

    }

    public boolean isCheese() {

        return cheese;

    }

    public void setCheese(boolean cheese) {

        this.cheese = cheese;

    }

    public boolean isVeggies() {

        return veggies;

    }

    public void setVeggies(boolean veggies) {

        this.veggies = veggies;

    }

    public double getPrice() {

        if(meat) {

            if(cheese) {

                if(veggies) {

                    price = 7.99;
                    return price;

                }
                else {

                    price = 7.59;
                    return price;

                }
            }
            else {

                if(veggies) {

                    price = 7.09;
                    return price;

                }
                else {

                    price = 6.89;
                    return price;

                }
            }

        }
        else {

            if(cheese) {

                if(veggies) {

                    price = 5.99;
                    return price;

                }
                else {

                    price = 5.59;
                    return price;

                }
            }
            else {

                if(veggies) {

                    price = 5.09;
                    return price;

                }
                else {

                    price = 4.99;
                    return price;

                }
            }
        }
    }

    public void displayInfo() {

        System.out.println("============================================");
        System.out.println("Sandwich Info");
        System.out.println("============================================");
        System.out.printf("Bread:\t\t\t\t\t %-15s\n", bread);
        System.out.printf("Meat:\t\t\t\t\t %-15b \n", meat);
        System.out.printf("Cheese:\t\t\t\t\t %-15b \n", cheese);
        System.out.printf("Veggies:\t\t\t\t %-15b \n", veggies);
        System.out.printf("Price:\t\t\t\t\t %-10.2f\n", getPrice());

    }
}
