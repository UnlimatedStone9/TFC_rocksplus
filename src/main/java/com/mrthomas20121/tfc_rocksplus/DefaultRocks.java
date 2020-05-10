package com.mrthomas20121.tfc_rocksplus;

import static com.mrthomas20121.tfc_rocksplus.TFC_RocksPlus.MODID;
import static net.dries007.tfc.types.DefaultRocks.METAMORPHIC;
import static net.dries007.tfc.types.DefaultRocks.SEDIMENTARY;
import static net.dries007.tfc.types.DefaultRocks.IGNEOUS_INTRUSIVE;
import static net.dries007.tfc.types.DefaultRocks.IGNEOUS_EXTRUSIVE;

import net.dries007.tfc.api.registries.TFCRegistryEvent;
import net.dries007.tfc.api.types.Rock;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = MODID)
public class DefaultRocks {
    
    //Igneous Extrusive Rocks
    public static final ResourceLocation BLAIMORITE = new ResourceLocation(MODID, "blaimorite");
    public static final ResourceLocation BONINITE = new ResourceLocation(MODID, "boninite");
    public static final ResourceLocation CARBONATITE = new ResourceLocation(MODID, "carbonatite");
    public static final ResourceLocation KIMBERLITE = new ResourceLocation(MODID, "kimberlite");
    public static final ResourceLocation KOMATIITE = new ResourceLocation(MODID, "komatiite");
    public static final ResourceLocation OBSIDIAN = new ResourceLocation(MODID, "obsidian");
    public static final ResourceLocation PUMICE = new ResourceLocation(MODID, "pumice");
    public static final ResourceLocation SCORIA = new ResourceLocation(MODID, "scoria");
    
    //Igneous Intrusive Rocks
    public static final ResourceLocation FOIDOLITE = new ResourceLocation(MODID, "foidolite");
    public static final ResourceLocation RED_GRANITE = new ResourceLocation(MODID, "red_granite");
    public static final ResourceLocation BLACK_GRANITE = new ResourceLocation(MODID, "black_granite");

    //Sedimentary Rocks
    public static final ResourceLocation ARKOSE = new ResourceLocation(MODID, "arkose");
    public static final ResourceLocation JASPILLITE = new ResourceLocation(MODID, "jaspillite");
    public static final ResourceLocation TRAVERTINE = new ResourceLocation(MODID, "travertine");
    public static final ResourceLocation WACKESTONE = new ResourceLocation(MODID, "wackestone");
    public static final ResourceLocation CLASTIC_ROCK = new ResourceLocation(MODID, "clastic_rock");
    public static final ResourceLocation FLINT = new ResourceLocation(MODID, "flint");
    public static final ResourceLocation CARBONATE_ROCK = new ResourceLocation(MODID, "carbonate_rock");
    public static final ResourceLocation SANDSTONE = new ResourceLocation(MODID, "sandstone");

    //Metamorphic Rocks
    public static final ResourceLocation BLUESCHIST = new ResourceLocation(MODID, "blueschist");
    public static final ResourceLocation GREENSCHIST = new ResourceLocation(MODID, "greenschist");
    public static final ResourceLocation CATACLASITE = new ResourceLocation(MODID, "cataclasite");
    public static final ResourceLocation MYLONITE = new ResourceLocation(MODID, "mylonite");
    public static final ResourceLocation GRAY_SLATE = new ResourceLocation(MODID, "gray_slate");
    public static final ResourceLocation BLUE_SLATE = new ResourceLocation(MODID, "blue_slate");
    public static final ResourceLocation GREEN_SLATE = new ResourceLocation(MODID, "green_slate");


    @SubscribeEvent
    public static void onPreRegisterRock(TFCRegistryEvent.RegisterPreBlock<Rock> event)
    {
        event.getRegistry().registerAll(
            
                //Igneous Extrusive Rocks
                new Rock(BLAIMORITE, IGNEOUS_EXTRUSIVE, false),
                new Rock(BONINITE, IGNEOUS_EXTRUSIVE, false),
                new Rock(CARBONATITE, IGNEOUS_EXTRUSIVE, false),
                new Rock(KIMBERLITE, IGNEOUS_EXTRUSIVE, false),
                new Rock(KOMATIITE, IGNEOUS_EXTRUSIVE, false),
                new Rock(OBSIDIAN, IGNEOUS_EXTRUSIVE, false),
                new Rock(PUMICE, IGNEOUS_EXTRUSIVE, false),
                new Rock(SCORIA, IGNEOUS_EXTRUSIVE, false),
            
                //Igneous Intrusive Rocks
                new Rock(FOIDOLITE, IGNEOUS_INTRUSIVE, false),
                new Rock(RED_GRANITE, IGNEOUS_INTRUSIVE, false),
                new Rock(BLACK_GRANITE, IGNEOUS_INTRUSIVE, false),
            
                //Sedimentary Rocks
                new Rock(ARKOSE, SEDIMENTARY, false),
                new Rock(JASPILLITE, SEDIMENTARY, false),
                new Rock(TRAVERTINE, SEDIMENTARY, false),
                new Rock(WACKESTONE, SEDIMENTARY, false),
                new Rock(CLASTIC_ROCK, SEDIMENTARY, false),
                new Rock(FLINT, SEDIMENTARY, false),
                new Rock(CARBONATE_ROCK, SEDIMENTARY, false),
                new Rock(SANDSTONE, SEDIMENTARY, false),
            
                //Metamorphic Rocks
                new Rock(BLUESCHIST, METAMORPHIC, false),
                new Rock(GREENSCHIST, METAMORPHIC, false),
                new Rock(CATACLASITE, METAMORPHIC, false),
                new Rock(MYLONITE, METAMORPHIC, false),
                new Rock(GRAY_SLATE, METAMORPHIC, false),
                new Rock(BLUE_SLATE, METAMORPHIC, false),
                new Rock(GREEN_SLATE, METAMORPHIC, false)
        );
    }
}
