package com.lom.lotsomobsinit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.lom.lotsomobsblocks.BlockAmberOre;
import com.lom.lotsomobsblocks.BlockAncientFire;
import com.lom.lotsomobsblocks.BlockCoconut;
import com.lom.lotsomobsblocks.BlockCoral;
import com.lom.lotsomobsblocks.BlockDinoLeaves;
import com.lom.lotsomobsblocks.BlockDinoLog;
import com.lom.lotsomobsblocks.BlockDinoPortal;
import com.lom.lotsomobsblocks.BlockDinoWoodPlanks;
import com.lom.lotsomobsblocks.BlockDinoWoodStairs;
import com.lom.lotsomobsblocks.BlockEasterCake;
import com.lom.lotsomobsblocks.BlockEasterEgg;
import com.lom.lotsomobsblocks.BlockFossilOre;
import com.lom.lotsomobsblocks.BlockIceCoal;
import com.lom.lotsomobsblocks.BlockIceCobble;
import com.lom.lotsomobsblocks.BlockIceIron;
import com.lom.lotsomobsblocks.BlockIcePortal;
import com.lom.lotsomobsblocks.BlockIceStone;
import com.lom.lotsomobsblocks.BlockIcemintuimOre;
import com.lom.lotsomobsblocks.BlockMyFlower;
import com.lom.lotsomobsblocks.BlockPalmLeaves;
import com.lom.lotsomobsblocks.BlockPalmLog;
import com.lom.lotsomobsblocks.BlockSaltBath;
import com.lom.lotsomobsblocks.BlockSaltOre;
import com.lom.lotsomobsblocks.BlockSpinningWheel;
import com.lom.lotsomobsblocks.BlockTanningRack;
import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobscore.handler.ConfigHandler;
import com.lom.lotsomobscrops.BlockPineApple;
import com.lom.lotsomobscrops.BlockTomato;
import com.lom.lotsomobsdna.BlockDNAExtractor;
import com.lom.lotsomobsdna.TileEntityDNAExtractor;
import com.lom.lotsomobstileentity.coconut.TileEntityCoconut;
import com.lom.lotsomobstileentity.saltbath.TileEntitySaltBath;
import com.lom.lotsomobstileentity.spinningwheel.TileEntitySpinningWheel;
import com.lom.lotsomobstileentity.tanningrack.TileEntityTanningRack;

import cpw.mods.fml.common.registry.GameRegistry;

public class LotsOMobsBlocks 
{
	//Blocks
		public static Block PineAppleBlock;
		public static Block TomatoBlock;
		public static Block DinoPortal;
		public static Block DinoLeaves;
		public static Block DinoLog;
		public static Block AncientFire;
		public static Block FossilOre;
		public static Block AmberOre;
		public static Block DinoWoodPlanks;
		public static Block DinoWoodStairs;
		public static Block IceStone;
		public static Block IceCobble;
		public static Block IcePortal;
		public static Block EasterCake1Block;
		public static Block EasterCake2Block;
		public static Block EasterCake3Block;
		public static Block EasterCake4Block;
		public static Block EasterCake5Block;
		public static Block IcemintuimOre;
		public static Block IceCoal;
		public static Block IceIron;
		public static Block DNAExtractor;
		public static Block SaltOre;
		public static Block PalmLog;
		public static Block PalmLeaves;
		public static Block Coconut;
		public static Block Coral1;
		public static Block Coral2;
		public static Block Coral3;
		public static Block Coral4;
		public static Block PermaFrost;
		
		public static BlockMyFlower OrangeFlower;
		public static BlockMyFlower Flowers;
		public static BlockMyFlower PurpleFlower;
		public static BlockMyFlower WhiteFlower;
		public static BlockMyFlower BlueFlower;
		public static BlockMyFlower PinkFlower;
		public static BlockMyFlower YellowFlower;
		public static BlockMyFlower RedFlower;
		//EasterEggs
		public static Block EasterEgg1;
		public static Block EasterEgg2;
		public static Block EasterEgg3;
		public static Block EasterEgg4;
		public static Block EasterEgg5;
		
		public static Block TanningRack;
		public static Block SaltBath;
		public static Block SpinningWheel;

		public static void Init()
		{
		//Blocks
		PineAppleBlock = new BlockPineApple().setHardness(0.1F).setBlockName("PineApple");
		TomatoBlock = new BlockTomato().setHardness(0.1F).setBlockName("Tomato");
		 if(ConfigHandler.newDimensions)
		 {
		DinoPortal = new BlockDinoPortal(0).setHardness(0.1F).setBlockName("DinoPortal");
		IcePortal = new BlockIcePortal(0).setHardness(0.1F).setBlockName("IcePortal");
		DinoLeaves = new BlockDinoLeaves().setHardness(0.1F).setBlockName("DinoLeaves");
		DinoLog = new BlockDinoLog(Material.wood).setHardness(8.3F).setBlockName("DinoLog");
		AncientFire = new BlockAncientFire().setHardness(0.0F).setBlockName("AncientFire");
		AmberOre = new BlockAmberOre(2, 0).setBlockName("AmberOre").setHardness(10.9F);
		IceStone= new BlockIceStone(0, null).setBlockName("IceStone").setHardness(10.9F);
		IceCobble = new BlockIceCobble(0, null).setBlockName("IceCobble").setHardness(10.9F);
		DinoWoodPlanks = new BlockDinoWoodPlanks(Material.wood).setBlockName("DinoWoodPlanks").setHardness(2F).setResistance(8F);
		DinoWoodStairs = new BlockDinoWoodStairs().setBlockName("DinoWoodStairs").setHardness(2F).setResistance(8F);
		IcemintuimOre = new BlockIcemintuimOre(2, 0).setBlockName("IcemintuimOre").setHardness(10.9F).setBlockName("IcemintuimOre");
		IceCoal = new BlockIceCoal(2, 0).setBlockName("IceCoal").setHardness(10.9F).setBlockName("IceCoal");
		IceIron = new BlockIceIron(2, 0).setBlockName("IceIron").setHardness(10.9F).setBlockName("IceIron");
		 }
			FossilOre = new BlockFossilOre(2, 0).setBlockName("FossilOre").setHardness(1.3F);

		SaltOre = new BlockSaltOre(2, 0).setBlockName("SaltOre").setHardness(10.9F);
		EasterCake1Block = new BlockEasterCake().setHardness(0.1F).setBlockName("EasterCake1").setBlockTextureName("EasterCake1");
		EasterCake2Block = new BlockEasterCake().setHardness(0.1F).setBlockName("EasterCake2").setBlockTextureName("EasterCake2");
		EasterCake3Block = new BlockEasterCake().setHardness(0.1F).setBlockName("EasterCake3").setBlockTextureName("EasterCake3");
		EasterCake4Block = new BlockEasterCake().setHardness(0.1F).setBlockName("EasterCake4").setBlockTextureName("EasterCake4");
		EasterCake5Block = new BlockEasterCake().setHardness(0.1F).setBlockName("EasterCake5").setBlockTextureName("EasterCake5");

		PalmLog = new BlockPalmLog(Material.wood).setHardness(8.3F).setBlockName("PalmLog");
		PalmLeaves = new BlockPalmLeaves().setHardness(0.1F).setBlockName("PalmLeaves");
		Coral1 = new BlockCoral(Material.water, 1).setHardness(0.1F).setBlockName("Coral1");
		Coral2 = new BlockCoral(Material.water, 2).setHardness(0.1F).setBlockName("Coral2");
		Coral3 = new BlockCoral(Material.water, 3).setHardness(0.1F).setBlockName("Coral3");
		Coral4 = new BlockCoral(Material.water, 4).setHardness(0.1F).setBlockName("Coral4");
		
		PermaFrost = new BlockIceCobble(0, Material.sand).setHardness(1.0F).setBlockName("PermaFrost").setBlockTextureName("PermaFrost");
		
		//EasterEggs
		EasterEgg1 = (new BlockEasterEgg().setBlockName("EasterEgg1").setHardness(0.5F).setResistance(0F));
		EasterEgg2 = (new BlockEasterEgg().setBlockName("EasterEgg2").setHardness(0.5F).setResistance(0F));
		EasterEgg3 = (new BlockEasterEgg().setBlockName("EasterEgg3").setHardness(0.5F).setResistance(0F));
		EasterEgg4 = (new BlockEasterEgg().setBlockName("EasterEgg4").setHardness(0.5F).setResistance(0F));
		EasterEgg5 = (new BlockEasterEgg().setBlockName("EasterEgg5").setHardness(0.5F).setResistance(0F));
		DNAExtractor = new BlockDNAExtractor(0, Material.iron, false).setBlockName("DNAExtractor").setHardness(5.0F).setResistance(10.0F).setCreativeTab(LotsOMobs.LotsOMobsBlockTab);;
		
		TanningRack = new BlockTanningRack(0, Material.wood).setBlockName("TanningRack").setHardness(0.5F).setResistance(0F).setBlockTextureName("lom:Wood");
		SaltBath = new BlockSaltBath(Material.wood).setBlockName("SaltBath").setHardness(0.5F).setResistance(0F).setBlockTextureName("lom:Wood");
		SpinningWheel = new BlockSpinningWheel(Material.wood).setBlockName("SpinningWheel").setHardness(0.5F).setResistance(0F).setBlockTextureName("lom:Wood");
		
		Coconut = new BlockCoconut(Material.wood).setBlockName("Coconut").setHardness(0.5F).setResistance(0F).setBlockTextureName("lom:Coconut");
		
		//Register Blocks
		GameRegistry.registerBlock(PineAppleBlock, "PineAppleBlock");
		GameRegistry.registerBlock(TomatoBlock, "TomatoBlock");
		 if(ConfigHandler.newDimensions)
		 {
		GameRegistry.registerBlock(DinoPortal, "DinoPortal");
		GameRegistry.registerBlock(DinoLeaves, "DinoLeaves");
		GameRegistry.registerBlock(DinoLog, "DinoLog");
		GameRegistry.registerBlock(AncientFire, "AncientFire");
		GameRegistry.registerBlock(FossilOre, "FossilOre");
		GameRegistry.registerBlock(AmberOre, "AmberOre");
		GameRegistry.registerBlock(IceStone, "IceStone");
		GameRegistry.registerBlock(IceCobble, "IceCobble");
		GameRegistry.registerBlock(IcePortal, "IcePortal");
		GameRegistry.registerBlock(DinoWoodPlanks, "DinoPlanks");
		GameRegistry.registerBlock(DinoWoodStairs, "DinoStairs");
		GameRegistry.registerBlock(IceCoal, "IceCoal");
		GameRegistry.registerBlock(IceIron, "IceIron");
		GameRegistry.registerBlock(IcemintuimOre, "IcemintuimOre");
		 }
		GameRegistry.registerBlock(SaltOre, "SaltOre");
		GameRegistry.registerBlock(EasterCake1Block, "EasterCake1Block");
		GameRegistry.registerBlock(EasterCake2Block, "EasterCake2Block");
		GameRegistry.registerBlock(EasterCake3Block, "EasterCake3Block");
		GameRegistry.registerBlock(EasterCake4Block, "EasterCake4Block");
		GameRegistry.registerBlock(EasterCake5Block, "EasterCake5Block");

		GameRegistry.registerBlock(PalmLog, "PalmLog");
		GameRegistry.registerBlock(PalmLeaves, "PalmLeaves");
		GameRegistry.registerBlock(Coral1, "Coral1");
		GameRegistry.registerBlock(Coral2, "Coral2");
		GameRegistry.registerBlock(Coral3, "Coral3");
		GameRegistry.registerBlock(Coral4, "Coral4");
		
		GameRegistry.registerBlock(PermaFrost, "PermaFrost");

	    GameRegistry.registerBlock(DNAExtractor, "DNA Extractor");
	    
	    GameRegistry.registerBlock(TanningRack, "TanningRack");
	    
	    GameRegistry.registerBlock(SaltBath, "SaltBath");
	    
	    GameRegistry.registerBlock(SpinningWheel, "SpinningWheel");
	    
	    GameRegistry.registerBlock(Coconut, "Coconut");

		//Flowers
		/*GameRegistry.registerBlock(OrangeFlower, "Orange Flower");
		GameRegistry.registerBlock(Flowers, "Flowers");
		GameRegistry.registerBlock(PurpleFlower, "Purple Flowers");
		GameRegistry.registerBlock(WhiteFlower, "White Flowers");
		GameRegistry.registerBlock(BlueFlower, "Blue Flower");
		GameRegistry.registerBlock(PinkFlower, "Pink Flower");
		GameRegistry.registerBlock(YellowFlower, "Yellow Flower");
		GameRegistry.registerBlock(RedFlower, "Red Flowers");*/
		//EasterEggs
		GameRegistry.registerBlock(EasterEgg1, "EasterEgg1");
		GameRegistry.registerBlock(EasterEgg2, "EasterEgg2");
		GameRegistry.registerBlock(EasterEgg3, "EasterEgg3");
		GameRegistry.registerBlock(EasterEgg4, "EasterEgg4");
		GameRegistry.registerBlock(EasterEgg5, "EasterEgg5");
}
		public static void TELoad()
		{
		    GameRegistry.registerTileEntity(TileEntityDNAExtractor.class, "DNAExtractorTE");
		    GameRegistry.registerTileEntity(TileEntityTanningRack.class, "TanningRackTE");
		    GameRegistry.registerTileEntity(TileEntitySaltBath.class, "SaltBathTE");
		    GameRegistry.registerTileEntity(TileEntitySpinningWheel.class, "SpinningWheelTE");
		    GameRegistry.registerTileEntity(TileEntityCoconut.class, "CoconutTE");

		}
}
