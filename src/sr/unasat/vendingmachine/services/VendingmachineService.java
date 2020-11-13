package sr.unasat.vendingmachine.services;

import sr.unasat.vendingmachine.entities.Beverage;

public class VendingmachineService {

    Beverage beverage = new Beverage();

    public VendingmachineService(String name, double price){
        beverage.setName(name);
        beverage.setPrice(price);
    }

    public void chosenSoftdrink(int itemnumber) {

        String message = "You choose: ";

        switch (itemnumber) {
            case 1: message += "Coca Cola, SRD10";
            break;
            case 2: message += "Parbo, SRD20";
            break;
            case 3: message += "Chocomel, SRD12";
            break;
            default: message = "Please choose option 1, 2 or 3";
        }
        System.out.println(message);
    }

    public void chosenSoftdrink2(int itemnumber) {

        String message = "You choose: ";

        switch (itemnumber) {
            case 1: message += beverage.getName() + ", " + beverage.getPrice();
            break;
            case 2: message += "Parbo, SRD20";
            break;
            case 3: message += "Chocomel, SRD12";
            break;
            default: message = "Please choose option 1, 2 or 3";
        }
        System.out.println(message);
    }

}
