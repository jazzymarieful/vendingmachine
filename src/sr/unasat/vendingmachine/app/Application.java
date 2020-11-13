package sr.unasat.vendingmachine.app;

import sr.unasat.vendingmachine.services.VendingmachineService;

public class Application {

    public static void main(String[] args) {
        VendingmachineService vms = new VendingmachineService("Pepsi", 12);
        vms.chosenSoftdrink(1);
        vms.chosenSoftdrink2(1);
    }
}
