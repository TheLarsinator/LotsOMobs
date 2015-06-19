package com.lom.lotsomobscore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import com.lom.lotsomobscore.handler.ConfigHandler;
import com.lom.lotsomobscore.handler.GuiHandler;
import com.lom.lotsomobscore.handler.LotsOMobsEventHandler;
import com.lom.lotsomobsinit.LotsOMobsAchievementsBook;
import com.lom.lotsomobsinit.LotsOMobsBiomes;
import com.lom.lotsomobsinit.LotsOMobsBlocks;
import com.lom.lotsomobsinit.LotsOMobsItems;
import com.lom.lotsomobsinit.LotsOMobsMobs;
import com.lom.lotsomobsinit.LotsOMobsRecipes;
import com.lom.lotsomobstabs.MyBlockTab;
import com.lom.lotsomobstabs.MyCombatTab;
import com.lom.lotsomobstabs.MyEggTab;
import com.lom.lotsomobstabs.MyItemsTab;
import com.lom.lotsomobsworldgen.FossilOreGeneration;
import com.lom.lotsomobsworldgen.OreGeneration;
import com.lom.lotsomobsworldgen.WorldGenRegister;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod (modid = "lom", name = "LotsOMobs", version = "1.7.10-3.1.1B", guiFactory = "com.lom.lotsomobscore.LotsOMobsGUIFactory")
/**100.000 downloads!!!
 * http://prntscr.com/1hz9gd
 * http://prntscr.com/1hzais
 * @author Lars
 */
public class LotsOMobs
{
	public static String modid = "lom";	
	@SidedProxy(clientSide = "com.lom.lotsomobscore.LotsOMobsClient", serverSide = "com.lom.lotsomobscore.LotsOMobsProxy")
	public static LotsOMobsProxy proxy;

	@Mod.Instance("lom")
	public static LotsOMobs instance;	
		
//Enums
	public static ToolMaterial EnumToolMaterialHorn= EnumHelper.addToolMaterial("HORN", 1, 100, 2.1F, 1, 17);
	public static ToolMaterial EnumToolMaterialIvory= EnumHelper.addToolMaterial("IVORY", 1, 200, 5.0F, 2, 8);
	public static ToolMaterial EnumToolMaterialIcemintuim= EnumHelper.addToolMaterial("ICEMINTUIM", 2, 500, 8F, 4, 12);
	public static ToolMaterial EnumToolMaterialAmber= EnumHelper.addToolMaterial("AMBER", 5, 1800, 15F, 8, 24);

	public static final ArmorMaterial Fur = EnumHelper.addArmorMaterial("Fur",  6, new int[] {2, 4, 3, 2}, 17);
	public static final ArmorMaterial Elephant = EnumHelper.addArmorMaterial("Elephant",  7, new int[] {3, 5, 4, 3}, 19);
	public static final ArmorMaterial Santa = EnumHelper.addArmorMaterial("Santa",  7, new int[] {1, 3, 2, 1}, 15);
	public static final ArmorMaterial AmberA = EnumHelper.addArmorMaterial("Amber",  200, new int[] {5, 10, 8, 5}, 12);
	public static final ArmorMaterial Dino = EnumHelper.addArmorMaterial("Dino",  75, new int[] {3, 8, 6, 3}, 10);
	public static final ArmorMaterial Eskimo = EnumHelper.addArmorMaterial("Eskimo",  8, new int[] {3, 5, 4, 4}, 20);
	public static final ArmorMaterial IcemintuimA = EnumHelper.addArmorMaterial("Icemintuim", 90, new int[] {3, 6, 5, 3}, 12);
//Tabs
	public static CreativeTabs LotsOMobsItemsTab = new MyItemsTab(CreativeTabs.getNextID(),"LotsOMobsItems");
	public static CreativeTabs LotsOMobsCombatTab = new MyCombatTab(CreativeTabs.getNextID(),"LotsOMobsCombat");
	public static CreativeTabs LotsOMobsBlockTab = new MyBlockTab(CreativeTabs.getNextID(),"LotsOMobsBlock");
	public static CreativeTabs LotsOMobsEggTab = new MyEggTab(CreativeTabs.getNextID(), "LotsOMobsEgg");
	
	//PreInit
		@Mod.EventHandler
		public void preInit(FMLPreInitializationEvent event)
		{    
		 ConfigHandler.LoadFile(event.getSuggestedConfigurationFile());

	     LotsOMobsBlocks.Init();
	     LotsOMobsItems.Init();
	     LotsOMobsBiomes.Init();
	     LotsOMobsAchievementsBook.Init();

	     GameRegistry.registerWorldGenerator(new FossilOreGeneration(), 2);
	     if(ConfigHandler.newDimensions)
	     GameRegistry.registerWorldGenerator(new OreGeneration(), 2);
	     if(ConfigHandler.newBiomes)
	     GameRegistry.registerWorldGenerator(new WorldGenRegister(), 2);
		// proxy.registerSound();
		}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{	     	
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		LotsOMobsBlocks.TELoad();
		LotsOMobsMobs.Init();
		LotsOMobsRecipes.RecipeBook();	
     	
		proxy.registerRenderInformation();
     	
     	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(LotsOMobsItems.PineApple, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(LotsOMobsItems.PineApple, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(LotsOMobsItems.PineApple, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(LotsOMobsItems.PineApple, 0, 1, 4, 50));
     	
     	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(LotsOMobsItems.Tomato, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(LotsOMobsItems.Tomato, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(LotsOMobsItems.Tomato, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(LotsOMobsItems.Tomato, 0, 1, 4, 50));     	

     	MinecraftForge.EVENT_BUS.register(new LotsOMobsEventHandler());
     	FMLCommonHandler.instance().bus().register(new LotsOMobsEventHandler());

	}
}