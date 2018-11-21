package fr.alasdiablo.azbrs;

import fr.alasdiablo.azbrs.capabilities.*;
import fr.alasdiablo.azbrs.data.Reference;
import fr.alasdiablo.azbrs.event.PacketSenderEventMP;
import fr.alasdiablo.azbrs.network.PacketHandler;
import fr.alasdiablo.azbrs.proxy.IProxy;
import fr.alasdiablo.azbrs.command.GenderCommand;
import fr.alasdiablo.azbrs.command.RaceCommand;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class Azbrs {

    public static Logger logger;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        PacketHandler.registerMessages(Reference.MOD_ID);
        CapabilityManager.INSTANCE.register(IRace.class, new RaceStorage(), Race::new);
        CapabilityManager.INSTANCE.register(IGender.class, new GenderStorage(), Gender::new);
        MinecraftForge.EVENT_BUS.register(new CapabilityHandler());
        MinecraftForge.EVENT_BUS.register(new PacketSenderEventMP());
        proxy.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        event.registerServerCommand(new RaceCommand());
        event.registerServerCommand(new GenderCommand());
    }
}
