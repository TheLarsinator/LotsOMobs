package com.lom.lotsomobsinit;

import static com.lom.lotsomobsinit.LotsOMobsBlocks.*;
import static com.lom.lotsomobsinit.LotsOMobsBlocks.DinoPortal;
import static com.lom.lotsomobsinit.LotsOMobsBlocks.DinoWoodPlanks;
import static com.lom.lotsomobsinit.LotsOMobsBlocks.DinoWoodStairs;
import static com.lom.lotsomobsinit.LotsOMobsBlocks.EasterEgg1;
import static com.lom.lotsomobsinit.LotsOMobsBlocks.EasterEgg2;
import static com.lom.lotsomobsinit.LotsOMobsBlocks.EasterEgg3;
import static com.lom.lotsomobsinit.LotsOMobsBlocks.EasterEgg4;
import static com.lom.lotsomobsinit.LotsOMobsBlocks.EasterEgg5;
import static com.lom.lotsomobsinit.LotsOMobsBlocks.IceIron;
import static com.lom.lotsomobsinit.LotsOMobsBlocks.IcemintuimOre;
import static com.lom.lotsomobsinit.LotsOMobsBlocks.SaltBath;
import static com.lom.lotsomobsinit.LotsOMobsBlocks.SpinningWheel;
import static com.lom.lotsomobsinit.LotsOMobsBlocks.TanningRack;
import static com.lom.lotsomobsinit.LotsOMobsItems.*;
import static com.lom.lotsomobsinit.LotsOMobsItems.AmberAxe;
import static com.lom.lotsomobsinit.LotsOMobsItems.AmberBoots;
import static com.lom.lotsomobsinit.LotsOMobsItems.AmberChestplate;
import static com.lom.lotsomobsinit.LotsOMobsItems.AmberHelmet;
import static com.lom.lotsomobsinit.LotsOMobsItems.AmberHoe;
import static com.lom.lotsomobsinit.LotsOMobsItems.AmberLeggings;
import static com.lom.lotsomobsinit.LotsOMobsItems.AmberPickaxe;
import static com.lom.lotsomobsinit.LotsOMobsItems.AmberShovel;
import static com.lom.lotsomobsinit.LotsOMobsItems.AmberSword;
import static com.lom.lotsomobsinit.LotsOMobsItems.BoarMeat;
import static com.lom.lotsomobsinit.LotsOMobsItems.CactiOnAStick;
import static com.lom.lotsomobsinit.LotsOMobsItems.CamelMeat;
import static com.lom.lotsomobsinit.LotsOMobsItems.CookedFrog;
import static com.lom.lotsomobsinit.LotsOMobsItems.DNABro;
import static com.lom.lotsomobsinit.LotsOMobsItems.DNAIch;
import static com.lom.lotsomobsinit.LotsOMobsItems.DNAMam;
import static com.lom.lotsomobsinit.LotsOMobsItems.DNAPte;
import static com.lom.lotsomobsinit.LotsOMobsItems.DNARap;
import static com.lom.lotsomobsinit.LotsOMobsItems.DNARex;
import static com.lom.lotsomobsinit.LotsOMobsItems.DNASab;
import static com.lom.lotsomobsinit.LotsOMobsItems.DNASolvent;
import static com.lom.lotsomobsinit.LotsOMobsItems.DNATri;
import static com.lom.lotsomobsinit.LotsOMobsItems.DeerHide;
import static com.lom.lotsomobsinit.LotsOMobsItems.DinoBone;
import static com.lom.lotsomobsinit.LotsOMobsItems.DinoFur;
import static com.lom.lotsomobsinit.LotsOMobsItems.DinoFurBoots;
import static com.lom.lotsomobsinit.LotsOMobsItems.DinoFurChestplate;
import static com.lom.lotsomobsinit.LotsOMobsItems.DinoFurHelmet;
import static com.lom.lotsomobsinit.LotsOMobsItems.DinoFurLeggings;
import static com.lom.lotsomobsinit.LotsOMobsItems.EasterCake1;
import static com.lom.lotsomobsinit.LotsOMobsItems.EasterCake2;
import static com.lom.lotsomobsinit.LotsOMobsItems.EasterCake3;
import static com.lom.lotsomobsinit.LotsOMobsItems.EasterCake4;
import static com.lom.lotsomobsinit.LotsOMobsItems.EasterCake5;
import static com.lom.lotsomobsinit.LotsOMobsItems.ElephantBoots;
import static com.lom.lotsomobsinit.LotsOMobsItems.ElephantChestplate;
import static com.lom.lotsomobsinit.LotsOMobsItems.ElephantHelmet;
import static com.lom.lotsomobsinit.LotsOMobsItems.ElephantHide;
import static com.lom.lotsomobsinit.LotsOMobsItems.ElephantLeggings;
import static com.lom.lotsomobsinit.LotsOMobsItems.EskimoBoots;
import static com.lom.lotsomobsinit.LotsOMobsItems.EskimoChestplate;
import static com.lom.lotsomobsinit.LotsOMobsItems.EskimoHelmet;
import static com.lom.lotsomobsinit.LotsOMobsItems.EskimoLeggings;
import static com.lom.lotsomobsinit.LotsOMobsItems.FlintAndFossil;
import static com.lom.lotsomobsinit.LotsOMobsItems.FossilBro;
import static com.lom.lotsomobsinit.LotsOMobsItems.FossilIch;
import static com.lom.lotsomobsinit.LotsOMobsItems.FossilMam;
import static com.lom.lotsomobsinit.LotsOMobsItems.FossilPte;
import static com.lom.lotsomobsinit.LotsOMobsItems.FossilRap;
import static com.lom.lotsomobsinit.LotsOMobsItems.FossilRex;
import static com.lom.lotsomobsinit.LotsOMobsItems.FossilSab;
import static com.lom.lotsomobsinit.LotsOMobsItems.FossilTri;
import static com.lom.lotsomobsinit.LotsOMobsItems.FurBoots;
import static com.lom.lotsomobsinit.LotsOMobsItems.FurChestplate;
import static com.lom.lotsomobsinit.LotsOMobsItems.FurHelmet;
import static com.lom.lotsomobsinit.LotsOMobsItems.FurHelmet1;
import static com.lom.lotsomobsinit.LotsOMobsItems.FurLeggings;
import static com.lom.lotsomobsinit.LotsOMobsItems.Horn;
import static com.lom.lotsomobsinit.LotsOMobsItems.HornSword;
import static com.lom.lotsomobsinit.LotsOMobsItems.IcemintuimAxe;
import static com.lom.lotsomobsinit.LotsOMobsItems.IcemintuimBar;
import static com.lom.lotsomobsinit.LotsOMobsItems.IcemintuimBoots;
import static com.lom.lotsomobsinit.LotsOMobsItems.IcemintuimChestplate;
import static com.lom.lotsomobsinit.LotsOMobsItems.IcemintuimHelmet;
import static com.lom.lotsomobsinit.LotsOMobsItems.IcemintuimHoe;
import static com.lom.lotsomobsinit.LotsOMobsItems.IcemintuimLeggings;
import static com.lom.lotsomobsinit.LotsOMobsItems.IcemintuimPickaxe;
import static com.lom.lotsomobsinit.LotsOMobsItems.IcemintuimShovel;
import static com.lom.lotsomobsinit.LotsOMobsItems.IcemintuimSword;
import static com.lom.lotsomobsinit.LotsOMobsItems.Ivory;
import static com.lom.lotsomobsinit.LotsOMobsItems.IvoryAxe;
import static com.lom.lotsomobsinit.LotsOMobsItems.IvoryBlade;
import static com.lom.lotsomobsinit.LotsOMobsItems.IvoryHoe;
import static com.lom.lotsomobsinit.LotsOMobsItems.IvoryPickaxe;
import static com.lom.lotsomobsinit.LotsOMobsItems.IvoryShovel;
import static com.lom.lotsomobsinit.LotsOMobsItems.IvorySword;
import static com.lom.lotsomobsinit.LotsOMobsItems.Knife;
import static com.lom.lotsomobsinit.LotsOMobsItems.LionMeat;
import static com.lom.lotsomobsinit.LotsOMobsItems.RawBoar;
import static com.lom.lotsomobsinit.LotsOMobsItems.RawCamel;
import static com.lom.lotsomobsinit.LotsOMobsItems.RawFrog;
import static com.lom.lotsomobsinit.LotsOMobsItems.RawLion;
import static com.lom.lotsomobsinit.LotsOMobsItems.RawReptile;
import static com.lom.lotsomobsinit.LotsOMobsItems.RawVenison;
import static com.lom.lotsomobsinit.LotsOMobsItems.RawWhale;
import static com.lom.lotsomobsinit.LotsOMobsItems.ReptileMeat;
import static com.lom.lotsomobsinit.LotsOMobsItems.Rope;
import static com.lom.lotsomobsinit.LotsOMobsItems.TimeTraveler;
import static com.lom.lotsomobsinit.LotsOMobsItems.Venison;
import static com.lom.lotsomobsinit.LotsOMobsItems.WhaleMeat;
import static com.lom.lotsomobsinit.LotsOMobsItems.Wheel;
import static com.lom.lotsomobsinit.LotsOMobsItems.WildStew;
import static com.lom.lotsomobsinit.LotsOMobsItems.WoolyFur;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.lom.lotsomobscore.handler.ConfigHandler;

import cpw.mods.fml.common.registry.GameRegistry;

public class LotsOMobsRecipes 
{
	public static void RecipeBook()
	{
		//Recipes
		 GameRegistry.addSmelting(RawVenison, new ItemStack(Venison, 1), 1.0F);
		 GameRegistry.addSmelting(RawBoar, new ItemStack(BoarMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawReptile, new ItemStack(ReptileMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawWhale, new ItemStack(WhaleMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawCamel, new ItemStack(CamelMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawLion, new ItemStack(LionMeat, 1), 1.0F);
		 GameRegistry.addSmelting(RawFrog, new ItemStack(CookedFrog, 1), 1.0F);
		 GameRegistry.addSmelting(RawShark, new ItemStack(CookedShark, 1), 1.0F);
		 GameRegistry.addSmelting(RawCrab, new ItemStack(CookedCrab, 1), 1.0F);
		 GameRegistry.addSmelting(IcemintuimOre, new ItemStack(IcemintuimBar, 1), 1.0F);
		 GameRegistry.addSmelting(IceIron, new ItemStack(Items.iron_ingot, 1), 1.0F);

		 
		 GameRegistry.addRecipe(new ItemStack(CactiOnAStick, 1), new Object [] {"#", "X", Character.valueOf('#'), Items.fishing_rod, Character.valueOf('X'), Blocks.cactus});
		 GameRegistry.addRecipe(new ItemStack(WildStew, 1), new Object [] {"@", "2", "&", Character.valueOf('@'), Venison, Character.valueOf('2'), BoarMeat, Character.valueOf('&'), Items.bowl});
		 GameRegistry.addRecipe(new ItemStack(WildStew, 1), new Object [] {"2", "@", "&", Character.valueOf('@'), Venison, Character.valueOf('2'), BoarMeat, Character.valueOf('&'), Items.bowl});
		 
		 GameRegistry.addRecipe(new ItemStack(HornSword, 1), new Object [] {"#", "#", "X", Character.valueOf('#'), Horn, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvoryPickaxe, 1), new Object [] {"###", " X ", " X ", Character.valueOf('#'), Ivory, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvoryShovel, 1), new Object [] {"#", "X", "X", Character.valueOf('#'), IvoryBlade, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvorySword, 1), new Object [] {"#", "#", "X", Character.valueOf('#'), Ivory, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvoryAxe, 1), new Object [] {"#X ", " X ", " X ", Character.valueOf('#'), IvoryBlade, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvoryAxe, 1), new Object [] {" X#", " X ", " X ", Character.valueOf('#'), IvoryBlade, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvoryHoe, 1), new Object [] {"##", " X", " X", Character.valueOf('#'), Ivory, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IvoryHoe, 1), new Object [] {"##", "X ", "X ", Character.valueOf('#'), Ivory, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(AmberPickaxe, 1), new Object [] {"###", " X ", " X ", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 GameRegistry.addRecipe(new ItemStack(AmberShovel, 1), new Object [] {"#", "X", "X", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 GameRegistry.addRecipe(new ItemStack(AmberSword, 1), new Object [] {"#", "#", "X", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 GameRegistry.addRecipe(new ItemStack(AmberAxe, 1), new Object [] {"##", "#X ", " X", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 GameRegistry.addRecipe(new ItemStack(AmberAxe, 1), new Object [] {"##", "X#", "X ", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 GameRegistry.addRecipe(new ItemStack(AmberHoe, 1), new Object [] {"##", " X", " X", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 GameRegistry.addRecipe(new ItemStack(AmberHoe, 1), new Object [] {"##", "X ", "X ", Character.valueOf('#'), Amber, Character.valueOf('X'), DinoBone});
		 if(ConfigHandler.newDimensions)
		 GameRegistry.addRecipe(new ItemStack(TimeTraveler, 1), new Object [] {"#P#", "RXR", "#A#", Character.valueOf('#'), Items.iron_ingot, Character.valueOf('P'), DinoPortal, Character.valueOf('R'), Items.redstone, Character.valueOf('X'), Blocks.stone_button, Character.valueOf('A'), Amber});
		 
		 if(ConfigHandler.newDimensions)
		 {
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ FlintAndFossil, FossilTri });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ FlintAndFossil, FossilBro });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ FlintAndFossil, FossilRap });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ FlintAndFossil, FossilRex });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ FlintAndFossil, FossilPte });
		 GameRegistry.addShapelessRecipe(new ItemStack(DinoPortal, 1), new Object[]{ FlintAndFossil, FossilIch });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilSab });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilTri });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilBro });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilRap });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilRex });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilPte });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilMam });
		 GameRegistry.addShapelessRecipe(new ItemStack(FlintAndFossil, 1), new Object[]{ Items.flint, FossilIch });
		 }
		 GameRegistry.addShapelessRecipe(new ItemStack(Triceratops, 1), new Object[]{ Items.egg, DNATri });
		 GameRegistry.addShapelessRecipe(new ItemStack(Brontosaurus, 1), new Object[]{ Items.egg, DNABro });
		 GameRegistry.addShapelessRecipe(new ItemStack(Raptor, 1), new Object[]{ Items.egg, DNARap });
		 GameRegistry.addShapelessRecipe(new ItemStack(TRex, 1), new Object[]{ Items.egg, DNARex });
		 GameRegistry.addShapelessRecipe(new ItemStack(Pterosaurus, 1), new Object[]{ Items.egg, DNAPte});
		 GameRegistry.addShapelessRecipe(new ItemStack(Ichtyosaurus, 1), new Object[]{ Items.egg, DNAIch });
		 GameRegistry.addShapelessRecipe(new ItemStack(Mammoth, 1), new Object[]{ Items.egg, DNAMam });
		 GameRegistry.addShapelessRecipe(new ItemStack(SaberTooth, 1), new Object[]{ Items.egg, DNASab });
		 GameRegistry.addShapelessRecipe(new ItemStack(MuskOx, 1), new Object[]{ Items.egg, DNAMsk });
		 GameRegistry.addShapelessRecipe(new ItemStack(Ammonite, 1), new Object[]{ Items.egg, DNAAmt });
		 
		 GameRegistry.addRecipe(new ItemStack(LotsOMobsBlocks.DNAExtractor, 1), new Object [] {"###", "XGA", "#C#", Character.valueOf('X'), IcemintuimBar,Character.valueOf('A'), Amber, Character.valueOf('G'), Blocks.glass, Character.valueOf('#'), Items.iron_ingot, Character.valueOf('C'), Items.cauldron});
		 GameRegistry.addRecipe(new ItemStack(LotsOMobsBlocks.DNAExtractor, 1), new Object [] {"###", "AGX", "#C#", Character.valueOf('X'), IcemintuimBar,Character.valueOf('A'), Amber, Character.valueOf('G'), Blocks.glass, Character.valueOf('#'), Items.iron_ingot, Character.valueOf('C'), Items.cauldron});
		 GameRegistry.addRecipe(new ItemStack(DNASolvent, 1), new Object [] {"#", "X", Character.valueOf('X'), Items.potionitem, Character.valueOf('#'), Blocks.tallgrass});

		 if(ConfigHandler.newDimensions)
		 {
		 GameRegistry.addRecipe(new ItemStack(Items.stick, 4), new Object [] {"#", "#", Character.valueOf('#'), DinoWoodPlanks});
		 GameRegistry.addRecipe(new ItemStack(DinoWoodPlanks, 4), new Object [] {"#", Character.valueOf('#'), DinoLog});	 
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_pickaxe, 1), new Object [] {"###", " X ", " X ", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_shovel, 1), new Object [] {"#", "X", "X", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_sword, 1), new Object [] {"#", "#", "X", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_axe, 1), new Object [] {"##", "#X ", " X", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_axe, 1), new Object [] {"##", "X#", "X ", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_hoe, 1), new Object [] {"##", " X", " X", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_hoe, 1), new Object [] {"##", "X ", "X ", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(DinoWoodStairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), DinoWoodPlanks});
		 GameRegistry.addRecipe(new ItemStack(Blocks.crafting_table, 1), new Object [] {"##", "##", Character.valueOf('#'), DinoWoodPlanks});
		 GameRegistry.addRecipe(new ItemStack(Items.wooden_door, 1), new Object [] {"##", "##", "##", Character.valueOf('#'), DinoWoodPlanks});
		 GameRegistry.addRecipe(new ItemStack(Blocks.chest, 1), new Object [] {"###", "# #","###",  Character.valueOf('#'), DinoWoodPlanks});
		 GameRegistry.addRecipe(new ItemStack(Items.sign, 1), new Object [] {"###", "###", " X ", Character.valueOf('#'), DinoWoodPlanks, Character.valueOf('X'), Items.stick});
		 }
		 GameRegistry.addRecipe(new ItemStack(EasterCake1, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), EasterEgg1, Character.valueOf('Z'), Items.wheat});
		 GameRegistry.addRecipe(new ItemStack(EasterCake2, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), EasterEgg2, Character.valueOf('Z'), Items.wheat});
		 GameRegistry.addRecipe(new ItemStack(EasterCake3, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), EasterEgg3, Character.valueOf('Z'), Items.wheat});
		 GameRegistry.addRecipe(new ItemStack(EasterCake4, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), EasterEgg4, Character.valueOf('Z'), Items.wheat});
		 GameRegistry.addRecipe(new ItemStack(EasterCake5, 1), new Object [] {"###", "XCX", "ZZZ", Character.valueOf('#'), Items.milk_bucket, Character.valueOf('X'), Items.sugar, Character.valueOf('C'), EasterEgg5, Character.valueOf('Z'), Items.wheat});

		 GameRegistry.addRecipe(new ItemStack(FurHelmet1, 1), new Object [] {"###", "# #", Character.valueOf('#'), DeerHide});
		 GameRegistry.addRecipe(new ItemStack(ElephantHelmet, 1), new Object [] {"###", "# #", "@#@", Character.valueOf('#'), ElephantHide, Character.valueOf('@'), Ivory});
		 GameRegistry.addRecipe(new ItemStack(ElephantChestplate, 1), new Object [] {"# #", "###", "###", Character.valueOf('#'), ElephantHide});
		 GameRegistry.addRecipe(new ItemStack(ElephantLeggings, 1), new Object [] {"###", "# #", "# #", Character.valueOf('#'), ElephantHide});
		 GameRegistry.addRecipe(new ItemStack(ElephantBoots, 1), new Object [] {"# #", "# #", Character.valueOf('#'), ElephantHide});
		 GameRegistry.addRecipe(new ItemStack(FurHelmet, 1), new Object [] {"# #", " Q ", Character.valueOf('#'), Horn, Character.valueOf('Q'), FurHelmet1});
		 GameRegistry.addRecipe(new ItemStack(FurChestplate, 1), new Object [] {"# #", "###", "###", Character.valueOf('#'), DeerHide});
		 GameRegistry.addRecipe(new ItemStack(FurLeggings, 1), new Object [] {"###", "# #", "# #", Character.valueOf('#'), DeerHide});
		 GameRegistry.addRecipe(new ItemStack(FurBoots, 1), new Object [] {"# #", "# #", Character.valueOf('#'), DeerHide});
		 GameRegistry.addRecipe(new ItemStack(AmberHelmet, 1), new Object [] {"###", "# #", Character.valueOf('#'), Amber});
		 GameRegistry.addRecipe(new ItemStack(AmberChestplate, 1), new Object [] {"# #", "###", "###", Character.valueOf('#'), Amber});
		 GameRegistry.addRecipe(new ItemStack(AmberLeggings, 1), new Object [] {"###", "# #", "# #", Character.valueOf('#'), Amber});
		 GameRegistry.addRecipe(new ItemStack(AmberBoots, 1), new Object [] {"# #", "# #", Character.valueOf('#'), Amber});
		 GameRegistry.addRecipe(new ItemStack(DinoFurHelmet, 1), new Object [] {"###", "# #", Character.valueOf('#'), DinoFur});
		 GameRegistry.addRecipe(new ItemStack(DinoFurChestplate, 1), new Object [] {"# #", "###", "###", Character.valueOf('#'), DinoFur});
		 GameRegistry.addRecipe(new ItemStack(DinoFurLeggings, 1), new Object [] {"###", "# #", "# #", Character.valueOf('#'), DinoFur});
		 GameRegistry.addRecipe(new ItemStack(DinoFurBoots, 1), new Object [] {"# #", "# #", Character.valueOf('#'), DinoFur});
		 
		 GameRegistry.addRecipe(new ItemStack(IcemintuimHelmet, 1), new Object [] {"###", "# #", Character.valueOf('#'), IcemintuimBar});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimChestplate, 1), new Object [] {"# #", "###", "###", Character.valueOf('#'), IcemintuimBar});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimLeggings, 1), new Object [] {"###", "# #", "# #", Character.valueOf('#'), IcemintuimBar});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimBoots, 1), new Object [] {"# #", "# #", Character.valueOf('#'), IcemintuimBar});
		 
		 GameRegistry.addRecipe(new ItemStack(EskimoHelmet, 1), new Object [] {"###", "# #", Character.valueOf('#'), WoolyFur});
		 GameRegistry.addRecipe(new ItemStack(EskimoChestplate, 1), new Object [] {"# #", "###", "###", Character.valueOf('#'), WoolyFur});
		 GameRegistry.addRecipe(new ItemStack(EskimoLeggings, 1), new Object [] {"###", "# #", "# #", Character.valueOf('#'), WoolyFur});
		 GameRegistry.addRecipe(new ItemStack(EskimoBoots, 1), new Object [] {"# #", "# #", Character.valueOf('#'), WoolyFur});
		 
		 GameRegistry.addRecipe(new ItemStack(IcemintuimPickaxe, 1), new Object [] {"###", " X ", " X ", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimShovel, 1), new Object [] {"#", "X", "X", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimSword, 1), new Object [] {"#", "#", "X", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimAxe, 1), new Object [] {"##", "#X ", " X", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimAxe, 1), new Object [] {"##", "X#", "X ", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimHoe, 1), new Object [] {"##", " X", " X", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(IcemintuimHoe, 1), new Object [] {"##", "X ", "X ", Character.valueOf('#'), IcemintuimBar, Character.valueOf('X'), Items.stick});
	
		 GameRegistry.addRecipe(new ItemStack(TanningRack, 1), new Object [] {"RSR", "SBS", "RSR", Character.valueOf('R'), Rope, Character.valueOf('S'), Items.stick, Character.valueOf('B'), SaltBath});
		 GameRegistry.addRecipe(new ItemStack(SaltBath, 1), new Object [] {"W W", "W W", "WWW", Character.valueOf('W'), Blocks.planks});
		 GameRegistry.addRecipe(new ItemStack(SpinningWheel, 1), new Object [] {"# R", "XXX", "# #", Character.valueOf('#'), Items.stick, Character.valueOf('X'), Blocks.wooden_slab, Character.valueOf('R'), Wheel});
		 GameRegistry.addRecipe(new ItemStack(Wheel, 1), new Object [] {"###", "# #", "###", Character.valueOf('#'), Items.stick});
		 GameRegistry.addRecipe(new ItemStack(Knife, 1), new Object [] {" I ", "#  ", Character.valueOf('#'), Items.stick, Character.valueOf('I'), Items.iron_ingot});
	}
}
