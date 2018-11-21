package fr.alasdiablo.azbrs.network;

import fr.alasdiablo.azbrs.capabilities.GenderProvider;
import fr.alasdiablo.azbrs.capabilities.IGender;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class PacketSendGender implements IMessage {

    private int genderId;

    @Override
    public void fromBytes(ByteBuf buf) {
        genderId = buf.readInt();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(genderId);
    }

    public PacketSendGender(int id) {
        this.genderId = id;
    }

    public PacketSendGender() {

    }

    public static class Handler implements IMessageHandler<PacketSendGender, IMessage> {
        @Override
        public IMessage onMessage(PacketSendGender message, MessageContext ctx) {
            FMLCommonHandler.instance().getWorldThread(ctx.netHandler).addScheduledTask(() -> handle(message, ctx));
            return null;
        }

        private void handle(PacketSendGender message, MessageContext ctx) {
            EntityPlayerSP player = Minecraft.getMinecraft().player;
            IGender gender = player.getCapability(GenderProvider.GENDER_CAPABILITY, null);
            gender.setGender(message.genderId);
        }
    }
}
