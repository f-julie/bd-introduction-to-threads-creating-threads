//package com.amazon.ata.introthreads.prework.creatingthreads;

//import com.amazon.ata.introthreads.prework.creatingthreads.resources.DeliveryTruck;
//import com.amazon.ata.introthreads.prework.creatingthreads.resources.WarehousePackage;

import java.util.List;

public class WarehouseApp {

    private static DeliveryManager deliveryWarehouse1;

    /**
     * Main method that starts the application.
     * @param args not used.
     */
    public static void main(String [] args) {
        System.out.println("WarehouseApp thread started.");

        startDeliveryThread(DeliveryTruck.deliverPackages());

        //deliveryWarehouse1 = new DeliveryManager(DeliveryTruck.deliverPackages());
        //deliveryWarehouse1.sortShipment();
        //deliveryWarehouse1.printInventory();
    }

    /**
     * Starts the delivery thread up. (Needs to be completed.)
     * @param packages Delivered packages.
     */
    public static void startDeliveryThread(List<WarehousePackage> packages) {
        deliveryWarehouse1 = new DeliveryManager(packages);
        Thread deliveryThread = new Thread(deliveryWarehouse1);
        deliveryThread.start();
    }

    public DeliveryManager getDeliveryWarehouse1() {
        return deliveryWarehouse1;
    }
}
