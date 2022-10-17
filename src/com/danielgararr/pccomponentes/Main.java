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


        TarjetaGrafica gpu = new TarjetaGrafica();

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de tarjetas graficas.
         */
        gpu.setId(1);
        gpu.setMarca("RTX 3090 Ti");
        gpu.setFabricante("NVIDIA");

        System.out.println(gpu.getId());
        System.out.println(gpu.getMarca());
        System.out.println(gpu.getFabricante());


        MemoriaRam ram = new MemoriaRam();

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de las memorias ram.
         */
        ram.setId(1);
        ram.setMarca("Vengeance LPX DDR4 3200Mhz PC4-25600 16GB 2X8GB CL16");
        ram.setFabricante("Corsair");

        System.out.println(ram.getId());
        System.out.println(ram.getMarca());
        System.out.println(ram.getFabricante());


        Torre tower = new Torre();

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de las cajas/torres.
         */
        tower.setId(1);
        tower.setMarca("Krater Cristal Templado USB 3.0 ARGB");
        tower.setFabricante("Nfortec");

        System.out.println(tower.getId());
        System.out.println(tower.getMarca());
        System.out.println(tower.getFabricante());


        VentiladorCpu fan = new VentiladorCpu();

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de los ventiladores para el procesador.
         */
        fan.setId(1);
        fan.setMarca("Liquid Cooler 120 RGB Kit de Refrigeración Líquida");
        fan.setFabricante("Tempest");

        System.out.println(fan.getId());
        System.out.println(fan.getMarca());
        System.out.println(fan.getFabricante());


        DiscoDuro hardisk = new DiscoDuro();

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de los discos duros.
         */
        hardisk.setId(1);
        hardisk.setMarca("A400 SSD 240GB");
        hardisk.setFabricante("Kingston");

        System.out.println(hardisk.getId());
        System.out.println(hardisk.getMarca());
        System.out.println(hardisk.getFabricante());


        FuenteAlimentacion sourcefeed = new FuenteAlimentacion();

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de los discos duros.
         */
        sourcefeed.setId(1);
        sourcefeed.setMarca("A400 SSD 240GB");
        sourcefeed.setFabricante("Kingston");

        System.out.println(sourcefeed.getId());
        System.out.println(sourcefeed.getMarca());
        System.out.println(sourcefeed.getFabricante());
    }
}