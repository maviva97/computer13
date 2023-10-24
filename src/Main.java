public class Main {
    public static void main(String[] args) {

        CPU cpu=new CPU();
        CPU.Processor processor=cpu.new Processor();
        processor.AccesProcesor();

        CPU.RAM ram=cpu.new RAM();
        ram.accesRAM();

        MotherBoard motherBoard=new MotherBoard();
        MotherBoard.USB usb=new MotherBoard.USB();
        usb.accesUSB();
    }
}