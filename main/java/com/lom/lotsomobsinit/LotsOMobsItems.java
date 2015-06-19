package com.lom.lotsomobsinit;

import static com.lom.lotsomobscore.LotsOMobs.modid;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSword;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobscore.LotsOMobsProxy;
import com.lom.lotsomobscore.handler.ConfigHandler;
import com.lom.lotsomobscrops.ItemMyFoodSeed;
import com.lom.lotsomobsitems.IceTimeTraveler;
import com.lom.lotsomobsitems.Item3DArmor;
import com.lom.lotsomobsitems.ItemAncientSpawner;
import com.lom.lotsomobsitems.ItemCactiOnAStick;
import com.lom.lotsomobsitems.ItemCreatureEgg;
import com.lom.lotsomobsitems.ItemDNA;
import com.lom.lotsomobsitems.ItemEasterCake;
import com.lom.lotsomobsitems.ItemFlintAndFossil;
import com.lom.lotsomobsitems.ItemKnife;
import com.lom.lotsomobsitems.ItemMaterials;
import com.lom.lotsomobsitems.ItemMyAxe;
import com.lom.lotsomobsitems.ItemMyPickaxe;
import com.lom.lotsomobsitems.ItemMyShovel;
import com.lom.lotsomobsitems.ItemTimeTraveler;
import com.lom.lotsomobsitems.MyFood;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;

public class LotsOMobsItems 
{
	
	@SidedProxy(clientSide = "com.lom.lotsomobscore.LotsOMobsClient",serverSide = "com.lom.lotsomobscore.LotsOMobsProxy")
	public static LotsOMobsProxy proxy;
	//Items
		public static Item DeerHide;
		public static Item DeerHideDirty;
		public static Item DeerHideSalted;
		public static Item ElephantHide;
		public static Item ElephantHideDirty;
		public static Item ElephantHideSalted;
		public static Item Horn;
		public static Item Venison;
		public static Item RawVenison;
		public static Item BoarMeat;
		public static Item RawBoar;
		public static Item Ivory;
		public static Item IvoryBlade;
		public static Item ReptileMeat;
		public static Item RawReptile;
		public static Item WhaleMeat;
		public static Item RawWhale;
		public static Item SmashedBug;
		public static Item CamelMeat;
		public static Item RawCamel;
		public static Item CactiOnAStick;
		public static Item LionMeat;
		public static Item RawLion;
		public static Item WildStew;
		public static Item CookedFrog;
		public static Item RawFrog;
		public static Item Honey;
		public static Item Tomato;
		public static Item PineApple;
		public static Item PenguinMeat;
		public static Item RawPenguin;
		public static Item AngoraWool;
		public static Item FlintAndFossil;
		public static Item DinoBone;
		public static Item DinoFur;
		public static Item TimeTraveler;
		public static Item IceTimeTraveler;
		public static Item PortalPlacer;
		public static Item Amber;
		public static Item EasterCake1;
		public static Item EasterCake2;
		public static Item EasterCake3;
		public static Item EasterCake4;
		public static Item EasterCake5;
		public static Item IcemintuimBar;
		public static Item MammothMeat;
		public static Item RawMammoth;
		public static Item WoolyFur;
		public static Item Knife;
		public static Item Rope;
		public static Item Wheel;
		public static Item Salt;
		public static Item RawCrab;
		public static Item CookedCrab;
		public static Item RawShark;
		public static Item CookedShark;
		public static Item CocoMilk;
		
		public static Item TRex;
		public static Item Triceratops;
		public static Item Brontosaurus;
		public static Item Pterosaurus;
		public static Item Raptor;
		public static Item Ichtyosaurus;
		public static Item Mammoth;
		public static Item SaberTooth;
		public static Item MuskOx;
		public static Item Ammonite;

		public static Item HornSword;	
		public static Item AmberPickaxe;
		public static Item AmberAxe;
		public static Item AmberShovel;
		public static Item AmberSword;
		public static Item AmberHoe;
		public static Item IvoryPickaxe;
		public static Item IvoryAxe;
		public static Item IvoryShovel;
		public static Item IvorySword;
		public static Item IvoryHoe;
		public static Item IcemintuimPickaxe;
		public static Item IcemintuimAxe;
		public static Item IcemintuimShovel;
		public static Item IcemintuimSword;
		public static Item IcemintuimHoe;
		
		public static Item FurHelmet1;
		public static Item FurHelmet;
		public static Item FurChestplate;
		public static Item FurLeggings;
		public static Item FurBoots;
		
		public static Item ElephantHelmet;
		public static Item ElephantChestplate;
		public static Item ElephantLeggings;
		public static Item ElephantBoots;
		//Christmas Special
		public static Item SantaHelmet;
		public static Item SantaChestplate;
		public static Item SantaLeggings;
		public static Item SantaBoots;
		
		public static Item AmberHelmet;
		public static Item AmberChestplate;
		public static Item AmberLeggings;
		public static Item AmberBoots;
		
		public static Item DinoFurHelmet;
		public static Item DinoFurChestplate;
		public static Item DinoFurLeggings;
		public static Item DinoFurBoots;
		
		public static Item EskimoHelmet;
		public static Item EskimoChestplate;
		public static Item EskimoLeggings;
		public static Item EskimoBoots;
		
		public static Item IcemintuimHelmet;
		public static Item IcemintuimChestplate;
		public static Item IcemintuimLeggings;
		public static Item IcemintuimBoots;
	//Fossils and shit
		//Fossils and DNAs
		public static Item FossilTri;
		public static Item FossilBro;
		public static Item FossilRap;
		public static Item FossilRex;
		public static Item FossilPte;
		public static Item FossilMam;
		public static Item FossilSab;
		public static Item FossilIch;
		public static Item FossilMsk;
		public static Item FossilAmt;
		public static Item DNATri;
		public static Item DNABro;
		public static Item DNARap;
		public static Item DNARex;
		public static Item DNAPte;
		public static Item DNAMam;
		public static Item DNASab;
		public static Item DNAIch;
		public static Item DNAMsk;
		public static Item DNAAmt;

		public static Item DNASolvent;

		public static void Init()
		{
		 
		 DeerHide = new ItemMaterials().setTextureName(modid + ":DeerFur").setUnlocalizedName("DeerFur");
		 DeerHideDirty = new ItemMaterials().setTextureName(modid + ":DeerFurDirty").setUnlocalizedName("DeerFurDirty");
		 DeerHideSalted = new ItemMaterials().setTextureName(modid + ":DeerFurSalted").setUnlocalizedName("DeerFurSalted");
		 ElephantHideDirty = new ItemMaterials().setTextureName(modid + ":ElephantHideDirty").setUnlocalizedName("ElephantHideDirty");
		 ElephantHideSalted = new ItemMaterials().setTextureName(modid + ":ElephantHideSalted").setUnlocalizedName("ElephantHideSalted");
		 ElephantHide = new ItemMaterials().setTextureName(modid + ":ElephantHide").setUnlocalizedName("ElephantHide");
		 Horn = new ItemMaterials().setTextureName(modid + ":Horn").setUnlocalizedName("Horn");
		 AngoraWool = new ItemMaterials().setTextureName(modid + ":AngoraWool").setUnlocalizedName("AngoraWool");
		 Ivory = new ItemMaterials().setTextureName(modid + ":Ivory").setUnlocalizedName("Ivory");
		 IvoryBlade = new ItemMaterials().setTextureName(modid + ":IvoryBlade").setUnlocalizedName("IvoryBlade");
		 RawVenison = new MyFood(3, 1F, false).setTextureName(modid + ":" + "RawVenison").setUnlocalizedName("RawVenison");
		 SmashedBug = new ItemMaterials().setTextureName(modid + ":SmashedBug").setUnlocalizedName("SmashedBug");
		 CactiOnAStick = new ItemCactiOnAStick().setTextureName(modid + ":CactiOnAStick").setUnlocalizedName("CactiOnAStick");
		 DinoBone = new ItemMaterials().setTextureName(modid + ":DinoBone").setUnlocalizedName("DinoBone");
		 DinoFur = new ItemMaterials().setTextureName(modid + ":DinoFur").setUnlocalizedName("DinoFur");
		 if(ConfigHandler.newDimensions)
		 {
		 TimeTraveler = new ItemTimeTraveler().setTextureName(modid + ":TimeTraveler").setUnlocalizedName("TimeTraveler");
		 IceTimeTraveler = new IceTimeTraveler().setTextureName(modid + ":IcePortal").setUnlocalizedName("IceTimeTraveler");
		 FlintAndFossil = new ItemFlintAndFossil(0).setTextureName(modid + ":FlintAndFossil").setUnlocalizedName("FlintAndFossil");

		 GameRegistry.registerItem(TimeTraveler, "TimeTraveler", modid);
		 GameRegistry.registerItem(IceTimeTraveler, "IceTimeTraveler", modid);
		 GameRegistry.registerItem(FlintAndFossil, "FlintAndFossil", modid);

		 }
		 //PortalPlacer = new ItemPortalPlacer().setTextureName(modid + ":PortalPlacer").setUnlocalizedName("PortalPlacer");		 
		 Amber = new ItemMaterials().setTextureName(modid + ":Amber").setUnlocalizedName("Amber");		 
		 IcemintuimBar = new ItemMaterials().setTextureName(modid + ":IcemintuimBar").setUnlocalizedName("IcemintuimBar");		 
		 WoolyFur = new ItemMaterials().setTextureName(modid + ":WoolyFur").setUnlocalizedName("WoolyFur");
		 Knife = new ItemKnife().setTextureName(modid + ":Knife").setUnlocalizedName("Knife");
		 Rope = new ItemMaterials().setTextureName(modid + ":Rope").setUnlocalizedName("Rope");
		 Wheel = new ItemMaterials().setTextureName(modid + ":Wheel").setUnlocalizedName("Wheel");
		 Salt = new ItemMaterials().setTextureName(modid + ":Salt").setUnlocalizedName("Salt");
		 
		 TRex = new ItemAncientSpawner(1).setTextureName(modid + ":TRex").setUnlocalizedName("TRex");
		 Triceratops = new ItemAncientSpawner(2).setTextureName(modid + ":Triceratops").setUnlocalizedName("Triceratops");
		 Brontosaurus = new ItemAncientSpawner(3).setTextureName(modid + ":Brontosaurus").setUnlocalizedName("Brontosaurus");
		 Pterosaurus = new ItemAncientSpawner(4).setTextureName(modid + ":Pterosaurus").setUnlocalizedName("Pterosaurus");
		 Raptor = new ItemAncientSpawner(5).setTextureName(modid + ":Raptor").setUnlocalizedName("Raptor");
		 Ichtyosaurus = new ItemAncientSpawner(6).setTextureName(modid + ":Ichtyosaurus").setUnlocalizedName("Ichtyosaurus");
		 Mammoth = new ItemAncientSpawner(7).setTextureName(modid + ":Mammoth").setUnlocalizedName("Mammoth");
		 SaberTooth = new ItemAncientSpawner(8).setTextureName(modid + ":SaberTooth").setUnlocalizedName("SaberTooth");
		 MuskOx = new ItemAncientSpawner(9).setTextureName(modid + ":MuskOx").setUnlocalizedName("MuskOx");
		 Ammonite = new ItemAncientSpawner(10).setTextureName(modid + ":Ammonite").setUnlocalizedName("Ammonite");
		 
		 Venison = new MyFood(6, 1F, false).setTextureName(modid + ":Venison").setUnlocalizedName("Venison");
		 RawVenison = new MyFood(2, 1F, false).setTextureName(modid + ":RawVenison").setUnlocalizedName("RawVenison");
		 RawBoar = new MyFood(3, 1F, false).setUnlocalizedName("RawBoar").setTextureName(modid + ":RawBoar");
		 BoarMeat = new MyFood(7, 1F, false).setUnlocalizedName("BoarMeat").setTextureName(modid + ":BoarMeat");
		 RawReptile = new MyFood(1, 1F, false).setUnlocalizedName("RawReptile").setTextureName(modid + ":RawReptile");
		 ReptileMeat = new MyFood(3, 1F, false).setUnlocalizedName("ReptileMeat").setTextureName(modid + ":ReptileMeat");
		 RawCrab = new MyFood(1, 1F, false).setUnlocalizedName("RawCrab").setTextureName(modid + ":Crab");
		 CookedCrab = new MyFood(3, 1F, false).setUnlocalizedName("CrabMeat").setTextureName(modid + ":CookedCrab");
		 RawWhale = new MyFood(3, 1F, false).setUnlocalizedName("RawWhale").setTextureName(modid + ":RawWhale");
		 WhaleMeat = new MyFood(6, 1F, false).setUnlocalizedName("WhaleMeat").setTextureName(modid + ":WhaleMeat");
		 RawCamel = new MyFood(2, 1F, false).setUnlocalizedName("RawCamel").setTextureName(modid + ":RawCamel");
		 CamelMeat = new MyFood(5, 1F, false).setUnlocalizedName("CamelMeat").setTextureName(modid + ":CamelMeat");
		 RawLion = new MyFood(4, 1F, false).setUnlocalizedName("RawLion").setTextureName(modid + ":RawLion");
		 LionMeat = new MyFood(8, 1F, false).setUnlocalizedName("LionMeat").setTextureName(modid + ":LionMeat");
		 RawShark = new MyFood(4, 1F, false).setUnlocalizedName("RawShark").setTextureName(modid + ":RawShark");
		 CookedShark = new MyFood(8, 1F, false).setUnlocalizedName("SharkMeat").setTextureName(modid + ":CookedShark");
		 WildStew = new MyFood(15, 1F, false).setUnlocalizedName("WildStew").setTextureName(modid + ":WildStew");
		 RawFrog = new MyFood(3, 1F, false).setUnlocalizedName("RawFrog").setTextureName(modid + ":RawFrog");
		 CookedFrog = new MyFood(5, 1F, false).setUnlocalizedName("CookedFrog").setTextureName(modid + ":CookedFrog");
		 Honey = new MyFood(3, 1F, false).setUnlocalizedName("Honey").setTextureName(modid + ":Honey");
		 PineApple = new ItemMyFoodSeed(5, 0.6F, LotsOMobsBlocks.PineAppleBlock, Blocks.farmland).setUnlocalizedName("PineApple").setTextureName(modid + ":PineApple").setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
		 Tomato = new ItemMyFoodSeed(5, 0.6F, LotsOMobsBlocks.TomatoBlock, Blocks.farmland).setUnlocalizedName("Tomato").setTextureName(modid + ":Tomato").setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
		 RawPenguin = new MyFood(3, 1F, false).setUnlocalizedName("RawPenguin").setTextureName(modid + ":RawPenguin");
		 PenguinMeat = new MyFood(7, 1F, false).setUnlocalizedName("PenguinMeat").setTextureName(modid + ":PenguinMeat");
		 EasterCake1 = new ItemEasterCake(LotsOMobsBlocks.EasterCake1Block).setMaxStackSize(1).setUnlocalizedName("EasterCake").setCreativeTab(LotsOMobs.LotsOMobsItemsTab).setTextureName("EasterCake1");
		 EasterCake2 = new ItemEasterCake(LotsOMobsBlocks.EasterCake2Block).setMaxStackSize(1).setUnlocalizedName("EasterCake").setCreativeTab(LotsOMobs.LotsOMobsItemsTab).setTextureName("EasterCake2");
		 EasterCake3 = new ItemEasterCake(LotsOMobsBlocks.EasterCake3Block).setMaxStackSize(1).setUnlocalizedName("EasterCake").setCreativeTab(LotsOMobs.LotsOMobsItemsTab).setTextureName("EasterCake3");
		 EasterCake4 = new ItemEasterCake(LotsOMobsBlocks.EasterCake4Block).setMaxStackSize(1).setUnlocalizedName("EasterCake").setCreativeTab(LotsOMobs.LotsOMobsItemsTab).setTextureName("EasterCake4");
		 EasterCake5 = new ItemEasterCake(LotsOMobsBlocks.EasterCake5Block).setMaxStackSize(1).setUnlocalizedName("EasterCake").setCreativeTab(LotsOMobs.LotsOMobsItemsTab).setTextureName("EasterCake5");
		 RawMammoth = new MyFood(3, 1F, false).setUnlocalizedName("RawMammoth").setTextureName(modid + ":RawMammoth");
		 MammothMeat = new MyFood(7, 1F, false).setUnlocalizedName("MammothMeat").setTextureName(modid + ":MammothMeat");
		 CocoMilk = new MyFood(4, 1F, false).setTextureName(modid + ":CocoMilk").setUnlocalizedName("CocoMilk");

//Fossils and Shit
		//Fossils and DNAs
		 FossilTri = new ItemDNA().setUnlocalizedName("FossilTri").setTextureName(modid + ":Fossil");
		 FossilBro = new ItemDNA().setUnlocalizedName("FossilBro").setTextureName(modid + ":Fossil");
		 FossilRap = new ItemDNA().setUnlocalizedName("FossilRap").setTextureName(modid + ":Fossil");
		 FossilRex = new ItemDNA().setUnlocalizedName("FossilRex").setTextureName(modid + ":Fossil");
		 FossilPte = new ItemDNA().setUnlocalizedName("FossilPte").setTextureName(modid + ":Fossil");
		 FossilMam = new ItemDNA().setUnlocalizedName("FossilMam").setTextureName(modid + ":Fossil");
		 FossilSab = new ItemDNA().setUnlocalizedName("FossilSab").setTextureName(modid + ":Fossil");
		 FossilIch = new ItemDNA().setUnlocalizedName("FossilIch").setTextureName(modid + ":Fossil");
		 FossilMsk = new ItemDNA().setUnlocalizedName("FossilMsk").setTextureName(modid + ":Fossil");
		 FossilAmt = new ItemDNA().setUnlocalizedName("FossilAmt").setTextureName(modid + ":Fossil");
		 DNATri = new ItemDNA().setUnlocalizedName("DNATri").setTextureName(modid + ":DNATri");
		 DNABro = new ItemDNA().setUnlocalizedName("DNABro").setTextureName(modid + ":DNABro");
		 DNARap = new ItemDNA().setUnlocalizedName("DNARap").setTextureName(modid + ":DNARap");
		 DNARex = new ItemDNA().setUnlocalizedName("DNARex").setTextureName(modid + ":DNARex");
		 DNAPte = new ItemDNA().setUnlocalizedName("DNAPte").setTextureName(modid + ":DNAPte");
		 DNAMam = new ItemDNA().setUnlocalizedName("DNAMam").setTextureName(modid + ":DNAMam");
		 DNASab = new ItemDNA().setUnlocalizedName("DNASab").setTextureName(modid + ":DNASab");
		 DNAIch = new ItemDNA().setUnlocalizedName("DNAIch").setTextureName(modid + ":DNAIch");
		 DNAMsk = new ItemDNA().setUnlocalizedName("DNAMsk").setTextureName(modid + ":DNAMsk");
		 DNAAmt = new ItemDNA().setUnlocalizedName("DNAAmt").setTextureName(modid + ":DNAAmt");

		 DNASolvent = new ItemDNA().setUnlocalizedName("DNASolvent").setTextureName(modid + ":DNASolvent");

		 HornSword = (new ItemSword(LotsOMobs.EnumToolMaterialHorn)).setUnlocalizedName("HornSword").setTextureName(modid + ":HornSword").setCreativeTab(LotsOMobs.LotsOMobsCombatTab);
		 AmberPickaxe = (new ItemMyPickaxe(LotsOMobs.EnumToolMaterialAmber)).setUnlocalizedName("AmberPickaxe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberPickaxe"); ;
		 AmberAxe = (new ItemMyAxe(LotsOMobs.EnumToolMaterialAmber)).setUnlocalizedName("AmberAxe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberAxe"); ;
		 AmberShovel = (new ItemMyShovel(LotsOMobs.EnumToolMaterialAmber)).setUnlocalizedName("AmberShovel").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberShovel"); ;
		 AmberSword = (new ItemSword(LotsOMobs.EnumToolMaterialAmber)).setUnlocalizedName("AmberSword").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberSword"); ;
		 AmberHoe = (new ItemHoe( LotsOMobs.EnumToolMaterialAmber)).setUnlocalizedName("AmberHoe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberHoe"); ;
		 
		 IvoryPickaxe = (new ItemMyPickaxe(LotsOMobs.EnumToolMaterialIvory)).setUnlocalizedName("IvoryPickaxe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IvoryPickaxe"); ;
		 IvoryAxe = (new ItemMyAxe(LotsOMobs.EnumToolMaterialIvory)).setUnlocalizedName("IvoryAxe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IvoryAxe"); ;
		 IvoryShovel = (new ItemMyShovel(LotsOMobs.EnumToolMaterialIvory)).setUnlocalizedName("IvoryShovel").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IvoryShovel"); ;
		 IvorySword = (new ItemSword(LotsOMobs.EnumToolMaterialIvory)).setUnlocalizedName("IvorySword").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IvorySword"); ;
		 IvoryHoe = (new ItemHoe( LotsOMobs.EnumToolMaterialIvory)).setUnlocalizedName("IvoryHoe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IvoryHoe"); ;		 
		 
		 FurHelmet1 = new ItemArmor(LotsOMobs.Fur, proxy.addArmor("FurArmor"), 0).setUnlocalizedName("FurHelmet1").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":FurHelmet1");;
		 FurHelmet = new Item3DArmor(LotsOMobs.Fur, proxy.addArmor("FurArmor"), 0).setUnlocalizedName("FurHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":FurHelmet");;
		 FurChestplate = new Item3DArmor( LotsOMobs.Fur, proxy.addArmor("FurArmor"), 1).setUnlocalizedName("FurChest").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":FurChest");;
		 FurLeggings = new Item3DArmor(LotsOMobs.Fur, proxy.addArmor("FurArmor"), 2).setUnlocalizedName("FurLeggings").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":FurLeggings");;
		 FurBoots = new Item3DArmor(LotsOMobs.Fur, proxy.addArmor("FurArmor"), 3).setUnlocalizedName("FurBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":FurBoots");;
		 
		 ElephantHelmet = new Item3DArmor(LotsOMobs.Elephant, proxy.addArmor("ElephantArmor"), 0).setUnlocalizedName("ElephantHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":ElephantHelmet");;
		 ElephantChestplate = new ItemArmor(LotsOMobs.Elephant, proxy.addArmor("ElephantArmor"), 1).setUnlocalizedName("ElephantChest").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":ElephantChest");
		 ElephantLeggings = new ItemArmor(LotsOMobs.Elephant, proxy.addArmor("ElephantArmor"), 2).setUnlocalizedName("ElephantLegging").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":ElephantLegging");
		 ElephantBoots = new ItemArmor(LotsOMobs.Elephant, proxy.addArmor("ElephantArmor"), 3).setUnlocalizedName("ElephantBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":ElephantBoots");
		 
		 //Christmas Special
		 SantaHelmet = new ItemArmor(LotsOMobs.Santa, proxy.addArmor("SantaArmor"), 0).setUnlocalizedName("SantaHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":SantaHelmet");
		 SantaChestplate = new ItemArmor(LotsOMobs.Santa, proxy.addArmor("SantaArmor"), 1).setUnlocalizedName("SantaChest").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":SantaChest");
		 SantaLeggings = new ItemArmor(LotsOMobs.Santa, proxy.addArmor("SantaArmor"), 2).setUnlocalizedName("SantaLegging").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":SantaLegging");
		 SantaBoots = new ItemArmor(LotsOMobs.Santa, proxy.addArmor("SantaArmor"), 3).setUnlocalizedName("SantaBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":SantaBoots");
		 
		 AmberHelmet = new ItemArmor(LotsOMobs.AmberA, proxy.addArmor("Amber"), 0).setUnlocalizedName("AmberHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberHelmet");
		 AmberChestplate = new ItemArmor(LotsOMobs.AmberA, proxy.addArmor("Amber"), 1).setUnlocalizedName("AmberChest").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberChest");
		 AmberLeggings = new ItemArmor(LotsOMobs.AmberA, proxy.addArmor("Amber"), 2).setUnlocalizedName("AmberLeggings").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberLeggings");
		 AmberBoots = new ItemArmor(LotsOMobs.AmberA, proxy.addArmor("Amber"), 3).setUnlocalizedName("AmberBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":AmberBoots");

		 DinoFurHelmet = new ItemArmor(LotsOMobs.Dino, proxy.addArmor("DinoFurArmor"), 0).setUnlocalizedName("DinoHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":DinoHelmet");;
		 DinoFurChestplate = new ItemArmor(LotsOMobs.Dino, proxy.addArmor("DinoFurArmor"), 1).setUnlocalizedName("DinoChest").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":DinoChest");;
		 DinoFurLeggings = new ItemArmor(LotsOMobs.Dino, proxy.addArmor("DinoFurArmor"), 2).setUnlocalizedName("DinoLeggings").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":DinoLeggings");;
		 DinoFurBoots = new ItemArmor(LotsOMobs.Dino, proxy.addArmor("DinoFurArmor"), 3).setUnlocalizedName("DinoBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":DinoBoots");;

		 IcemintuimPickaxe = (new ItemMyPickaxe(LotsOMobs.EnumToolMaterialIcemintuim)).setUnlocalizedName("IcemintuimPickaxe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IcemintuimPickaxe"); ;
		 IcemintuimAxe = (new ItemMyAxe(LotsOMobs.EnumToolMaterialIcemintuim)).setUnlocalizedName("IcemintuimAxe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IcemintuimAxe"); ;
		 IcemintuimShovel = (new ItemMyShovel(LotsOMobs.EnumToolMaterialIcemintuim)).setUnlocalizedName("IcemintuimShovel").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IcemintuimShovel"); ;
		 IcemintuimSword = (new ItemSword(LotsOMobs.EnumToolMaterialIcemintuim)).setUnlocalizedName("IcemintuimSword").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IcemintuimSword"); ;
		 IcemintuimHoe = (new ItemHoe( LotsOMobs.EnumToolMaterialIcemintuim)).setUnlocalizedName("IcemintuimHoe").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IcemintuimHoe"); ;

		 IcemintuimHelmet = new ItemArmor(LotsOMobs.IcemintuimA, proxy.addArmor("IcemintuimArmor"), 0).setUnlocalizedName("IcemintuimHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IcemintuimHelmet");;
		 IcemintuimChestplate = new ItemArmor( LotsOMobs.IcemintuimA, proxy.addArmor("IcemintuimArmor"), 1).setUnlocalizedName("IcemintuimChest").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IcemintuimChest");;
		 IcemintuimLeggings = new ItemArmor(LotsOMobs.IcemintuimA, proxy.addArmor("IcemintuimArmor"), 2).setUnlocalizedName("IcemintuimLeggings").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IcemintuimLeggings");;
		 IcemintuimBoots = new ItemArmor(LotsOMobs.IcemintuimA, proxy.addArmor("IcemintuimArmor"), 3).setUnlocalizedName("IcemintuimBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":IcemintuimBoots");;
		 
		 EskimoHelmet = new ItemArmor(LotsOMobs.Eskimo, proxy.addArmor("EskimoArmor"), 0).setUnlocalizedName("EskimoHelmet").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":EskimoHelmet");;
		 EskimoChestplate = new ItemArmor( LotsOMobs.Eskimo, proxy.addArmor("EskimoArmor"), 1).setUnlocalizedName("EskimoChest").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":EskimoChest");;
		 EskimoLeggings = new ItemArmor(LotsOMobs.Eskimo, proxy.addArmor("EskimoArmor"), 2).setUnlocalizedName("EskimoLeggings").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":EskimoLeggings");;
		 EskimoBoots = new ItemArmor(LotsOMobs.Eskimo, proxy.addArmor("EskimoArmor"), 3).setUnlocalizedName("EskimoBoots").setCreativeTab(LotsOMobs.LotsOMobsCombatTab).setTextureName(modid + ":EskimoBoots");;
		
		 
		 
		 //The Eggs:
			String mobid = "lom_";

		 Item itemSpawnEgg = new ItemCreatureEgg(mobid + "Deer", 0x7D3B0C, 0xB37346).setUnlocalizedName("Egg_Deer");
		 
//Register Items
		 GameRegistry.registerItem(DeerHide, "DeerFur", modid);
		 GameRegistry.registerItem(DeerHideDirty, "DeerHideDirty", modid);
		 GameRegistry.registerItem(DeerHideSalted, "DeerHideSalted", modid);
		 GameRegistry.registerItem(ElephantHide, "ElephantHide", modid);
		 GameRegistry.registerItem(ElephantHideSalted, "ElephantHideSalted", modid);
		 GameRegistry.registerItem(ElephantHideDirty, "ElephantHideDirty", modid);
		 GameRegistry.registerItem(Horn, "Horn", modid);
		 GameRegistry.registerItem(AngoraWool, "AngoraWool", modid);
		 GameRegistry.registerItem(Ivory, "Ivory", modid);
		 GameRegistry.registerItem(IvoryBlade, "IvoryBlade", modid);
		 GameRegistry.registerItem(SmashedBug, "SmashedBug", modid);
		 GameRegistry.registerItem(CactiOnAStick, "CactiOnAStick", modid);
		 GameRegistry.registerItem(DinoBone, "DinoBone", modid);
		 GameRegistry.registerItem(DinoFur, "DinoFur", modid);

		 //GameRegistry.registerItem(PortalPlacer, "PortalPlacer", modid);
		 GameRegistry.registerItem(Amber, "Amber", modid);
		 GameRegistry.registerItem(EasterCake1, "EasterCake1", modid);
		 GameRegistry.registerItem(EasterCake2, "EasterCake2", modid);
		 GameRegistry.registerItem(EasterCake3, "EasterCake3", modid);
		 GameRegistry.registerItem(EasterCake4, "EasterCake4", modid);
		 GameRegistry.registerItem(EasterCake5, "EasterCake5", modid);
		 GameRegistry.registerItem(IcemintuimBar, "IcemintuimBar", modid);
		 GameRegistry.registerItem(WoolyFur, "WoolyFur", modid);
		 GameRegistry.registerItem(Knife, "Knife", modid);
		 GameRegistry.registerItem(Rope, "Rope", modid);
		 GameRegistry.registerItem(Wheel, "Wheel", modid);
		 GameRegistry.registerItem(Salt, "Salt", modid);
		 GameRegistry.registerItem(RawCrab, "RawCrab", modid);
		 GameRegistry.registerItem(CookedCrab, "CookedCrab", modid);
		 GameRegistry.registerItem(RawShark, "RawShark", modid);
		 GameRegistry.registerItem(CookedShark, "CookedShark", modid);
		 GameRegistry.registerItem(CocoMilk, "CocoMilk", modid);

		 GameRegistry.registerItem(TRex, "TRex", modid);
		 GameRegistry.registerItem(Triceratops, "Triceratops", modid);
		 GameRegistry.registerItem(Brontosaurus, "Brontosaurus", modid);
		 GameRegistry.registerItem(Pterosaurus, "Pterosaurus", modid);
		 GameRegistry.registerItem(Raptor, "Raptor", modid);
		 GameRegistry.registerItem(Ichtyosaurus, "Ichtyosaurus", modid);
		 GameRegistry.registerItem(Mammoth, "Mammoth", modid);
		 GameRegistry.registerItem(SaberTooth, "SaberTooth", modid);
		 GameRegistry.registerItem(MuskOx, "MuskOx", modid);
		 GameRegistry.registerItem(Ammonite, "Ammonite", modid);

//Fossils and Shit
		 GameRegistry.registerItem(FossilTri, "FossilTri", modid);
		 GameRegistry.registerItem(FossilBro, "FossilBro", modid);
		 GameRegistry.registerItem(FossilRap, "FossilRap", modid);
		 GameRegistry.registerItem(FossilRex, "FossilRex", modid);
		 GameRegistry.registerItem(FossilMam, "FossilMam", modid);
		 GameRegistry.registerItem(FossilSab, "FossilSab", modid);
		 GameRegistry.registerItem(FossilPte, "FossilPte", modid);
		 GameRegistry.registerItem(FossilIch, "FossilIch", modid);
		 GameRegistry.registerItem(FossilMsk, "FossilMsk", modid);
		 GameRegistry.registerItem(FossilAmt, "FossilAmt", modid);
		 GameRegistry.registerItem(DNATri, "DNATri", modid);
		 GameRegistry.registerItem(DNABro, "DNABro", modid);
		 GameRegistry.registerItem(DNARap, "DNARap", modid);
		 GameRegistry.registerItem(DNARex, "DNARex", modid);
		 GameRegistry.registerItem(DNAPte, "DNAPte", modid);
		 GameRegistry.registerItem(DNAMam, "DNAMam", modid);
		 GameRegistry.registerItem(DNASab, "DNASab", modid);
		 GameRegistry.registerItem(DNAIch, "DNAIch", modid);
		 GameRegistry.registerItem(DNAMsk, "DNAMsk", modid);
		 GameRegistry.registerItem(DNAAmt, "DNAAmt", modid);
		 GameRegistry.registerItem(DNASolvent, "DNASolvent", modid);
		  
		 GameRegistry.registerItem(RawVenison, "Raw_Venison", modid);
		 GameRegistry.registerItem(Venison, "Venison", modid);
		 GameRegistry.registerItem(RawBoar, "Raw_Boar", modid);
		 GameRegistry.registerItem(BoarMeat, "BoarMeat", modid);
		 GameRegistry.registerItem(RawReptile, "Raw_Reptile", modid);
		 GameRegistry.registerItem(ReptileMeat, "ReptileMeat", modid);
		 GameRegistry.registerItem(RawWhale, "Raw_Whale", modid);
		 GameRegistry.registerItem(WhaleMeat, "WhaleMeat", modid);
		 GameRegistry.registerItem(RawCamel, "Raw_Camel", modid);
		 GameRegistry.registerItem(CamelMeat, "CamelMeat", modid);
		 GameRegistry.registerItem(RawLion, "RawLion", modid);
		 GameRegistry.registerItem(LionMeat, "LionMeat", modid);
		 GameRegistry.registerItem(WildStew, "WildStew", modid);
		 GameRegistry.registerItem(RawFrog, "Raw_Frog", modid);
		 GameRegistry.registerItem(CookedFrog, "CookedFrog", modid);
		 GameRegistry.registerItem(Honey, "Honey", modid);
		 GameRegistry.registerItem(Tomato, "Tomato", modid);
		 GameRegistry.registerItem(PineApple, "PineApple", modid);
		 GameRegistry.registerItem(RawPenguin, "Raw_Penguin", modid);
		 GameRegistry.registerItem(PenguinMeat, "PenguinMeat", modid);
		 GameRegistry.registerItem(RawMammoth, "Raw_Mammoth", modid);
		 GameRegistry.registerItem(MammothMeat, "MammothMeat", modid);

		 GameRegistry.registerItem(HornSword, "HornSword", modid);
		 GameRegistry.registerItem(AmberSword, "AmberSword", modid);
		 GameRegistry.registerItem(AmberPickaxe, "AmberPickaxe", modid);
		 GameRegistry.registerItem(AmberAxe, "AmberAxe", modid);
		 GameRegistry.registerItem(AmberShovel, "AmberShovel", modid);
		 GameRegistry.registerItem(AmberHoe, "AmberHoe", modid);
		 GameRegistry.registerItem(IvorySword, "IvorySword", modid);
		 GameRegistry.registerItem(IvoryPickaxe, "IvoryPickaxe", modid);
		 GameRegistry.registerItem(IvoryAxe, "IvoryAxe", modid);
		 GameRegistry.registerItem(IvoryShovel, "IvoryShovel", modid);
		 GameRegistry.registerItem(IvoryHoe, "IvoryHoe", modid);
		 
		 GameRegistry.registerItem(FurHelmet, "FurHelmet", modid);
		 GameRegistry.registerItem(FurHelmet1, "FurHelmet1", modid);
		 GameRegistry.registerItem(FurChestplate, "FurChestplate", modid);
		 GameRegistry.registerItem(FurLeggings, "FurLeggings", modid);
		 GameRegistry.registerItem(FurBoots, "FurBoots", modid);
		 
		 GameRegistry.registerItem(ElephantHelmet, "ElephantHelmet", modid);
		 GameRegistry.registerItem(ElephantChestplate, "ElephantChestplate", modid);
		 GameRegistry.registerItem(ElephantLeggings, "ElephantLeggings", modid);
		 GameRegistry.registerItem(ElephantBoots, "ElephantBoots", modid);
		 
		 GameRegistry.registerItem(SantaHelmet, "SantaHelmet", modid);
		 GameRegistry.registerItem(SantaChestplate, "SantaChestplate", modid);
		 GameRegistry.registerItem(SantaLeggings, "SantaLeggings", modid);
		 GameRegistry.registerItem(SantaBoots, "SantaBoots", modid);
		 GameRegistry.registerItem(AmberHelmet, "AmberHelmet", modid);
		 GameRegistry.registerItem(AmberChestplate, "AmberChestplate", modid);
		 GameRegistry.registerItem(AmberLeggings, "AmberLeggings", modid);
		 GameRegistry.registerItem(AmberBoots, "AmberBoots", modid);
		 GameRegistry.registerItem(DinoFurHelmet, "DinoFurHelmet", modid);
		 GameRegistry.registerItem(DinoFurChestplate, "DinoFurChestplate", modid);
		 GameRegistry.registerItem(DinoFurLeggings, "DinoFurLeggings", modid);
		 GameRegistry.registerItem(DinoFurBoots, "DinoFurBoots", modid);
		 GameRegistry.registerItem(IcemintuimSword, "IcemintuimSword", modid);
		 GameRegistry.registerItem(IcemintuimPickaxe, "IcemintuimPickaxe", modid);
		 GameRegistry.registerItem(IcemintuimAxe, "IcemintuimAxe", modid);
		 GameRegistry.registerItem(IcemintuimShovel, "IcemintuimShovel", modid);
		 GameRegistry.registerItem(IcemintuimHoe, "IcemintuimHoe", modid);
		 
		 GameRegistry.registerItem(IcemintuimHelmet, "IcemintuimHelmet", modid);
		 GameRegistry.registerItem(IcemintuimChestplate, "IcemintuimChestplate", modid);
		 GameRegistry.registerItem(IcemintuimLeggings, "IcemintuimLeggings", modid);
		 GameRegistry.registerItem(IcemintuimBoots, "IcemintuimBoots", modid);
		 GameRegistry.registerItem(EskimoHelmet, "EskimoHelmet", modid);
		 GameRegistry.registerItem(EskimoChestplate, "EskimoChestplate", modid);
		 GameRegistry.registerItem(EskimoLeggings, "EskimoLeggings", modid);
		 GameRegistry.registerItem(EskimoBoots, "EskimoBoots", modid);

	}
}
