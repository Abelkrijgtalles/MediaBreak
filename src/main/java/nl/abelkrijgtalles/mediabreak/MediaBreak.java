package nl.abelkrijgtalles.mediabreak;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "mediabreak", useMetadata=true)
public class MediaBreak {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        System.out.println("Gemaakt door Abel");
        System.out.println("Licensed met de GNU Public License v3");

    }
}
