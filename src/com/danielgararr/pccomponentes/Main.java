package com.danielgararr.pccomponentes;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando...");
        Procesador amd = new Procesador();

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */
        amd.setId(1);
        amd.setMarca("Ryzen 6400");
        amd.setFabricante("AMD");

        System.out.println(amd.getId());
        System.out.println(amd.getMarca());
        System.out.println(amd.getFabricante());

        Procesador pentium = new Procesador();
        pentium.setId(2);
        pentium.setMarca("i7");
        pentium.setFabricante("Intel");

        System.out.println(pentium.getId());
        System.out.println(pentium.getMarca());
        System.out.println(pentium.getFabricante());


        PlacaBase motherboard = new PlacaBase();

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de placas base.
         */
        motherboard.setId(1);
        motherboard.setMarca("B450M PRO VDH MAX");
        motherboard.setFabricante("MSI");

        System.out.println(motherboard.getId());
        System.out.println(motherboard.getMarca());
        System.out.println(motherboard.getFabricante());
    }
}