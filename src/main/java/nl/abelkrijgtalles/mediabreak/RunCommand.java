package nl.abelkrijgtalles.mediabreak;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import org.apache.commons.lang3.StringUtils;

public class RunCommand extends CommandBase {

    @Override
    public String getCommandName() {
        return "run";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/run";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) {

        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(Shell.execCommandOutput(StringUtils.join(args, " "))));

    }

    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
}
