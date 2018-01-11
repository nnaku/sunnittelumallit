import parts.*;

public class PcBuilder {
	PartObject gpu;
    PartObject ram;
    PartObject cpu;
    PartObject psu;
    PartObject ssd;
    PartObject hdd;
    PartObject motherboard;
    PartObject chassis;

    public PcBuilder() {
    	chassis = new Chassis(120);
    	ssd = new Ssd(200);
        hdd = new Hdd(70);
        psu = new Psu(120);
        motherboard = new Motherboard(150);
        gpu = new Gpu(500);
        ram = new Ram(180);
        cpu = new Cpu(400);
        motherboard.addPart(cpu);
        motherboard.addPart(ram);
        motherboard.addPart(gpu);
        chassis.addPart(motherboard);
        chassis.addPart(psu);
        chassis.addPart(ssd);
        chassis.addPart(hdd);
    }
    
    
    public int getPrice() {
    	return chassis.getPrice();
	}
}
