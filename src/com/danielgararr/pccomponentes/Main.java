package com.danielgararr.pccomponentes;

public class Main {
    public static void main(String[] args) {

        System.out.println("Iniciando...");
        Procesador cpu = new Procesador();

        /**
         * Código para ejecutar por un administrativo de la empresa.
         * Código para introducir información de procesadores.
         */
        cpu.setId(1);
        cpu.setMarca("Ryzen 6400");
        cpu.setFabricante("AMD");

        System.out.println(cpu.getId());
        System.out.println(cpu.getMarca());
        System.out.println(cpu.getFabricante());

        Procesador cpu1 = new Procesador();
        cpu1.setId(2);
        cpu1.setMarca("i7");
        cpu1.setFabricante("Intel");

        System.out.println(cpu1.getId());
        System.out.println(cpu1.getMarca());
        System.out.println(cpu1.getFabricante());


        PlacaBase motherboard = new PlacaBase();

        motherboard.setId(1);
        motherboard.setMarca("B450M PRO VDH MAX");
        motherboard.setFabricante("MSI");

        System.out.println(motherboard.getId());
        System.out.println(motherboard.getMarca());
        System.out.println(motherboard.getFabricante());


        TarjetaGrafica gpu = new TarjetaGrafica();

        gpu.setId(1);
        gpu.setMarca("RTX 3090 Ti");
        gpu.setFabricante("NVIDIA");

        System.out.println(gpu.getId());
        System.out.println(gpu.getMarca());
        System.out.println(gpu.getFabricante());


        MemoriaRam ram = new MemoriaRam();

        ram.setId(1);
        ram.setMarca("Vengeance LPX DDR4 3200Mhz PC4-25600 16GB 2X8GB CL16");
        ram.setFabricante("Corsair");

        System.out.println(ram.getId());
        System.out.println(ram.getMarca());
        System.out.println(ram.getFabricante());


        Torre tower = new Torre();

        tower.setId(1);
        tower.setMarca("Krater Cristal Templado USB 3.0 ARGB");
        tower.setFabricante("Nfortec");

        System.out.println(tower.getId());
        System.out.println(tower.getMarca());
        System.out.println(tower.getFabricante());


        VentiladorCpu fan = new VentiladorCpu();

        fan.setId(1);
        fan.setMarca("Liquid Cooler 120 RGB Kit de Refrigeración Líquida");
        fan.setFabricante("Tempest");

        System.out.println(fan.getId());
        System.out.println(fan.getMarca());
        System.out.println(fan.getFabricante());


        DiscoDuro hardisk = new DiscoDuro();

        hardisk.setId(1);
        hardisk.setMarca("A400 SSD 240GB");
        hardisk.setFabricante("Kingston");

        System.out.println(hardisk.getId());
        System.out.println(hardisk.getMarca());
        System.out.println(hardisk.getFabricante());


        FuenteAlimentacion sourcefeed = new FuenteAlimentacion();

        sourcefeed.setId(1);
        sourcefeed.setMarca("MasterWatt Series 450W 80 Plus Bronze Semi Modular");
        sourcefeed.setFabricante("Cooler Master");

        System.out.println(sourcefeed.getId());
        System.out.println(sourcefeed.getMarca());
        System.out.println(sourcefeed.getFabricante());


        TarjetaSonido sound = new TarjetaSonido();

        sound.setId(1);
        sound.setMarca("Xonar SE Interno 5.1 Canales PCI-E");
        sound.setFabricante("Asus");

        System.out.println(sound.getId());
        System.out.println(sound.getMarca());
        System.out.println(sound.getFabricante());


        GrabadoraDvd dvd = new GrabadoraDvd();

        dvd.setId(1);
        dvd.setMarca("DRW-24D5MT Grabadora DVD 24X");
        dvd.setFabricante("Asus");

        System.out.println(dvd.getId());
        System.out.println(dvd.getMarca());
        System.out.println(dvd.getFabricante());


        Monitor screen = new Monitor();

        screen.setId(1);
        screen.setMarca("Optix G27C7 27 Pulgadas LED FullHD 165Hz FreeSync Premium Curva");
        screen.setFabricante("MSI");

        System.out.println(screen.getId());
        System.out.println(screen.getMarca());
        System.out.println(screen.getFabricante());


        Teclado keyboard = new Teclado();

        keyboard.setId(1);
        keyboard.setMarca("Huntsman Mini Teclado Gaming Red Switch");
        keyboard.setFabricante("Razer");

        System.out.println(keyboard.getId());
        System.out.println(keyboard.getMarca());
        System.out.println(keyboard.getFabricante());


        Raton mouse = new Raton();

        mouse.setId(1);
        mouse.setMarca("Pro X Superlight Ratón Gaming Inalámbrico 25.600DPI Rosa");
        mouse.setFabricante("Logitech");

        System.out.println(mouse.getId());
        System.out.println(mouse.getMarca());
        System.out.println(mouse.getFabricante());


        Altavoces speaker = new Altavoces();

        speaker.setId(1);
        speaker.setMarca("M10 RGB Hero 2.0 Gaming Speakers");
        speaker.setFabricante("Tempest");

        System.out.println(speaker.getId());
        System.out.println(speaker.getMarca());
        System.out.println(speaker.getFabricante());
    }
}