package com.lom.lotsomobscore;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

import com.lom.lotsomobscore.handler.ConfigHandler;

import cpw.mods.fml.client.config.DummyConfigElement.DummyCategoryElement;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.GuiConfigEntries;
import cpw.mods.fml.client.config.GuiConfigEntries.CategoryEntry;
import cpw.mods.fml.client.config.GuiConfigEntries.NumberSliderEntry;
import cpw.mods.fml.client.config.IConfigElement;

public class LotsOMobsConfigGUI extends GuiConfig 
{
    public LotsOMobsConfigGUI(GuiScreen parent) 
    {
    	super(parent, getConfigElements(), "lom", false, false, "LotsOMobs Config");
    }
    
    private static List<IConfigElement> getConfigElements()
    {
        List<IConfigElement> list = new ArrayList<IConfigElement>();
        list.add(new DummyCategoryElement("LotsOMobs Mobs", "LotsOMobsMobs", LotsOMobsMobConfig.class));
        list.add(new DummyCategoryElement("LotsOMobs Mob Spawn Rates", "LotsOMobsSpawnRates", LotsOMobsSpawnConfig.class));
        list.add(new DummyCategoryElement("LotsOMobs Dino IDs", "LotsOMobsDinos", LotsOMobsDinoConfig.class));        
        list.add(new DummyCategoryElement("LotsOMobs Biome IDs", "LotsOMobsBiomes", LotsOMobsBiomeConfig.class));
        list.add(new DummyCategoryElement("LotsOMobs Dimension IDs", "LotsOMobsDimensions", LotsOMobsDimensionConfig.class));
        list.add(new DummyCategoryElement("LotsOMobs General Settings", "LotsOMobsSettings", LotsOMobsGeneralConfig.class));
        return list;
    }
    
    public static class LotsOMobsMobConfig extends CategoryEntry
    {
        public LotsOMobsMobConfig(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }
        
        @Override
        protected GuiScreen buildChildScreen()
        {
            // This GuiConfig object specifies the configID of the object and as such will force-save when it is closed. The parent
            // GuiConfig object's entryList will also be refreshed to reflect the changes.
            return new GuiConfig(this.owningScreen, 
                    new ConfigElement(ConfigHandler.config.getCategory("mobs")).getChildElements(), "lom", false, false, "LotsOMobs Config", GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
        }
    }
    
    public static class LotsOMobsDinoConfig extends CategoryEntry
    {
        public LotsOMobsDinoConfig(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }
        
        @Override
        protected GuiScreen buildChildScreen()
        {
            // This GuiConfig object specifies the configID of the object and as such will force-save when it is closed. The parent
            // GuiConfig object's entryList will also be refreshed to reflect the changes.
            return new GuiConfig(this.owningScreen, 
                    new ConfigElement(ConfigHandler.config.getCategory("dinoid")).getChildElements(), "lom", false, false, "LotsOMobs Config", GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
        }
    }
    
    public static class LotsOMobsBiomeConfig extends CategoryEntry
    {
        public LotsOMobsBiomeConfig(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }
        
        @Override
        protected GuiScreen buildChildScreen()
        {
            // This GuiConfig object specifies the configID of the object and as such will force-save when it is closed. The parent
            // GuiConfig object's entryList will also be refreshed to reflect the changes.
            return new GuiConfig(this.owningScreen, 
                    new ConfigElement(ConfigHandler.config.getCategory("biome")).getChildElements(), "lom", false, false, "LotsOMobs Config", GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
        }
    }
    
    public static class LotsOMobsDimensionConfig extends CategoryEntry
    {
        public LotsOMobsDimensionConfig(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }
        
        @Override
        protected GuiScreen buildChildScreen()
        {
            // This GuiConfig object specifies the configID of the object and as such will force-save when it is closed. The parent
            // GuiConfig object's entryList will also be refreshed to reflect the changes.
            return new GuiConfig(this.owningScreen, 
                    new ConfigElement(ConfigHandler.config.getCategory("dimension")).getChildElements(), "lom", false, false, "LotsOMobs Config", GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
        }
    }
    public static class LotsOMobsSpawnConfig extends CategoryEntry
    {
        public LotsOMobsSpawnConfig(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }
        
        @Override
        protected GuiScreen buildChildScreen()
        {
            // This GuiConfig object specifies the configID of the object and as such will force-save when it is closed. The parent
            // GuiConfig object's entryList will also be refreshed to reflect the changes.
            return new GuiConfig(this.owningScreen, 
                    new ConfigElement(ConfigHandler.config.getCategory("spawn")).getChildElements(), "lom", false, false, "LotsOMobs Config", GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
        }
    }
    
    public static class LotsOMobsGeneralConfig extends CategoryEntry
    {
        public LotsOMobsGeneralConfig(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }
        
        @Override
        protected GuiScreen buildChildScreen()
        {
            // This GuiConfig object specifies the configID of the object and as such will force-save when it is closed. The parent
            // GuiConfig object's entryList will also be refreshed to reflect the changes.
            return new GuiConfig(this.owningScreen, 
                    new ConfigElement(ConfigHandler.config.getCategory("general")).getChildElements(), "lom", false, false, "LotsOMobs Config", GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
        }
    }
}