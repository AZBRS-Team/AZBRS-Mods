package fr.alasdiablo.azbrs.proxy;

public class ServerProxy implements IProxy {

    @Override
    public void preInit() {
        //MinecraftForge.EVENT_BUS.register(new PacketSenderEventMP());
    }

    @Override
    public void init() {
    }
}
