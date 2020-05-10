package com.mrthomas20121.tfc_rocksplus;

import com.mrthomas20121.tfc_rocksplus.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = TFC_RocksPlus.MODID, name = TFC_RocksPlus.NAME, version = TFC_RocksPlus.VERSION)
public class TFC_RocksPlus
{
    public static final String MODID = "tfe_tfc_rocksplus";
    public static final String NAME = "TFC Rocks+ TFE Fork";
    public static final String VERSION = "1.2";

    private static Logger logger;

    @SidedProxy(serverSide = "com.mrthomas20121.tfc_rocksplus.proxy.CommonProxy", clientSide = "com.mrthomas20121.tfc_rocksplus.proxy.ClientProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
