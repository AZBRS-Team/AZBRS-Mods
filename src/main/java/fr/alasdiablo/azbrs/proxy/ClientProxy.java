package fr.alasdiablo.azbrs.proxy;

import fr.alasdiablo.azbrs.event.RaceRenderEvent;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy implements IProxy {

    @Override
    public void preInit() {
    }

    @Override
    public void init() {
        MinecraftForge.EVENT_BUS.register(new RaceRenderEvent());
    }
}
