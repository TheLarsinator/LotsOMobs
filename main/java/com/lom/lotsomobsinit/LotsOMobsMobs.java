package com.lom.lotsomobsinit;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

import com.lom.lotsomobscore.LotsOMobs;
import com.lom.lotsomobscore.handler.ConfigHandler;
import com.lom.lotsomobsentity.EntityAmmonite;
import com.lom.lotsomobsentity.EntityAnt;
import com.lom.lotsomobsentity.EntityBear;
import com.lom.lotsomobsentity.EntityBee;
import com.lom.lotsomobsentity.EntityBird;
import com.lom.lotsomobsentity.EntityBison;
import com.lom.lotsomobsentity.EntityBoar;
import com.lom.lotsomobsentity.EntityBrontosaurus;
import com.lom.lotsomobsentity.EntityBullFrog;
import com.lom.lotsomobsentity.EntityBunny;
import com.lom.lotsomobsentity.EntityButterfly;
import com.lom.lotsomobsentity.EntityCamel;
import com.lom.lotsomobsentity.EntityCrab;
import com.lom.lotsomobsentity.EntityCroco;
import com.lom.lotsomobsentity.EntityDeer;
import com.lom.lotsomobsentity.EntityDirtPile;
import com.lom.lotsomobsentity.EntityEasterBunny;
import com.lom.lotsomobsentity.EntityEasterChick;
import com.lom.lotsomobsentity.EntityElephant;
import com.lom.lotsomobsentity.EntityFireFly;
import com.lom.lotsomobsentity.EntityFishy;
import com.lom.lotsomobsentity.EntityFly;
import com.lom.lotsomobsentity.EntityFrog;
import com.lom.lotsomobsentity.EntityGazelle;
import com.lom.lotsomobsentity.EntityGekko;
import com.lom.lotsomobsentity.EntityGiraffe;
import com.lom.lotsomobsentity.EntityGoat;
import com.lom.lotsomobsentity.EntityGorilla;
import com.lom.lotsomobsentity.EntityHammerShark;
import com.lom.lotsomobsentity.EntityHermitCrab;
import com.lom.lotsomobsentity.EntityIchtyosaurus;
import com.lom.lotsomobsentity.EntityKakkerlak;
import com.lom.lotsomobsentity.EntityLion;
import com.lom.lotsomobsentity.EntityLizard;
import com.lom.lotsomobsentity.EntityMammoth;
import com.lom.lotsomobsentity.EntityMole;
import com.lom.lotsomobsentity.EntityMuskOx;
import com.lom.lotsomobsentity.EntityNarwal;
import com.lom.lotsomobsentity.EntityPDFrog;
import com.lom.lotsomobsentity.EntityPenguin;
import com.lom.lotsomobsentity.EntityPolarBear;
import com.lom.lotsomobsentity.EntityPterosaurus;
import com.lom.lotsomobsentity.EntityRaptor;
import com.lom.lotsomobsentity.EntitySaberTooth;
import com.lom.lotsomobsentity.EntitySanta;
import com.lom.lotsomobsentity.EntityShark;
import com.lom.lotsomobsentity.EntityShell;
import com.lom.lotsomobsentity.EntitySnake;
import com.lom.lotsomobsentity.EntitySquirrel;
import com.lom.lotsomobsentity.EntityTRex;
import com.lom.lotsomobsentity.EntityTriceratops;
import com.lom.lotsomobsentity.EntityTropicalFishy;
import com.lom.lotsomobsentity.EntityTurtle;
import com.lom.lotsomobsentity.EntityVulture;
import com.lom.lotsomobsentity.EntityWhale;
import com.lom.lotsomobsentity.EntityWinterDeer;
import com.lom.lotsomobsentity.EntityWorm;
import com.lom.lotsomobsitems.ItemCreatureEgg;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class LotsOMobsMobs 
{
	protected static int modEntityID = 0;

	public static void Init()
	{
		String mobid = "";
		//Mobs
//Temporary fix for missing vanilla creature spawn:
        EntityRegistry.addSpawn(EntityCow.class, 20, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntityPig.class, 20, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntitySheep.class, 20, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntityHorse.class, 20, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.plains});


        
				if(ConfigHandler.DeerOn == true)
				{	
				registerModEntityWithEgg(EntityDeer.class, mobid + "Deer", 0x7D3B0C, 0xB37346);
		        EntityRegistry.addSpawn(EntityDeer.class, (int)ConfigHandler.DeerRate *10, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills});
		        EntityRegistry.addSpawn(EntityDeer.class, (int)ConfigHandler.DeerRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.FOREST));

				}
				
				if(ConfigHandler.BoarOn == true)
				{	
				registerModEntityWithEgg(EntityBoar.class, mobid + "Boar", 0x7D3B0C, 0x351f0a);
		        EntityRegistry.addSpawn(EntityBoar.class, (int)ConfigHandler.BoarRate *10, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.plains});
		        EntityRegistry.addSpawn(EntityBoar.class, (int)ConfigHandler.BoarRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
				if(ConfigHandler.BirdOn == true)
				{	
				registerModEntityWithEgg(EntityBird.class, mobid + "Bird", 0xFFFFFF, 0xFC7419);
		        EntityRegistry.addSpawn(EntityBird.class, (int)ConfigHandler.BirdRate *10, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.beach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.coldTaiga, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.iceMountains, BiomeGenBase.jungle, BiomeGenBase.icePlains, BiomeGenBase.plains, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.swampland});
		        EntityRegistry.addSpawn(EntityBird.class, (int)ConfigHandler.BirdRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				} 
				if(ConfigHandler.SquirrelOn == true)
				{    
			        registerModEntityWithEgg(EntitySquirrel.class,  mobid + "Squirrel", 0x634205, 0x633405);
			        EntityRegistry.addSpawn(EntitySquirrel.class,  (int)ConfigHandler.SquirrelRate *10,  1,  6,  EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest});
			        EntityRegistry.addSpawn(EntitySquirrel.class, (int)ConfigHandler.SquirrelRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.FOREST));
				}
				if(ConfigHandler.BunnyOn == true)
				{   
			        registerModEntityWithEgg(EntityBunny.class,  mobid + "Bunny", 0x634205, 0x633405);
			        EntityRegistry.addSpawn(EntityBunny.class,  (int)ConfigHandler.BunnyRate *10,  1,  6,  EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest});
			        EntityRegistry.addSpawn(EntityBunny.class, (int)ConfigHandler.BunnyRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.FOREST));

				}
				if(ConfigHandler.LizardOn == true)
				{
			    	registerModFastEntityWithEgg(EntityLizard.class,  mobid + "Lizard", 0xBA6B11, 0xEDCBA4);
			    	EntityRegistry.addSpawn(EntityLizard.class,  (int)ConfigHandler.LizardRate *10,  4,  5,  EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.desert});
			    	EntityRegistry.addSpawn(EntityLizard.class,  (int)ConfigHandler.LizardRate *10,  4,  5,  EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.DRY));
			        EntityRegistry.addSpawn(EntityLizard.class, (int)ConfigHandler.LizardRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.SANDY));

				}
				if(ConfigHandler.GiraffeOn == true)
				{  
			    	registerModEntityWithEgg(EntityGiraffe.class, mobid + "Giraffe", 0xFFD324, 0xA87C4A);
			 	  	EntityRegistry.addSpawn(EntityGiraffe.class, (int)ConfigHandler.GiraffeRate *10, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.savanna, BiomeGenBase.savannaPlateau});
			        EntityRegistry.addSpawn(EntityGiraffe.class, (int)ConfigHandler.GiraffeRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
				if(ConfigHandler.ElephantOn == true)
				{
			    	registerModEntityWithEgg(EntityElephant.class, mobid + "Elephant", 0x858585, 0xD6D6D6);
			 	  	EntityRegistry.addSpawn(EntityElephant.class, (int)ConfigHandler.ElephantRate *10, 2, 3, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.savanna, BiomeGenBase.savannaPlateau});
			        EntityRegistry.addSpawn(EntityElephant.class, (int)ConfigHandler.ElephantRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
				if(ConfigHandler.FishyOn == true)
				{    
			        registerModEntityWithEgg(EntityFishy.class, mobid + "Fishy", 0xF78A2A, 0xF78A2A);
			        EntityRegistry.addSpawn(EntityFishy.class, (int)ConfigHandler.FishyRate *10, 5, 15, EnumCreatureType.waterCreature, new BiomeGenBase[] { 
			        	 BiomeGenBase.beach,
			        	 BiomeGenBase.forest,
			        	 BiomeGenBase.forestHills,
			        	 BiomeGenBase.frozenRiver,
			        	 BiomeGenBase.jungle, 
			        	 BiomeGenBase.plains, 
			        	 BiomeGenBase.river,
			        	 BiomeGenBase.swampland, 
			        	 BiomeGenBase.taiga,
			        	 BiomeGenBase.ocean,
			        	 BiomeGenBase.extremeHills,
			        	 });
			        EntityRegistry.addSpawn(EntityFishy.class, (int)ConfigHandler.FishyRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.OCEAN));

				}
				if(ConfigHandler.WhaleOn == true)
				{ 
			    	registerModEntityWithEgg(EntityWhale.class, mobid + "Whale", 0x757C82, 0x97AEC4);
			        EntityRegistry.addSpawn(EntityWhale.class, (int)ConfigHandler.WhaleRate *10, 1, 12, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean, BiomeGenBase.frozenOcean});
			        EntityRegistry.addSpawn(EntityWhale.class, (int)ConfigHandler.WhaleRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.OCEAN));

				}
				if(ConfigHandler.WinterDeerOn == true)
				{	
				    registerModEntityWithEgg(EntityWinterDeer.class, mobid + "WinterDeer", 0x7D3B0C, 0xCFBDA9);
			        EntityRegistry.addSpawn(EntityWinterDeer.class, (int)ConfigHandler.DeerRate *10, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.taiga, BiomeGenBase.taigaHills});
			        EntityRegistry.addSpawn(EntityWinterDeer.class, (int)ConfigHandler.DeerRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.COLD));

				}
				if(ConfigHandler.BearOn == true)
				{	 
			     	registerModEntityWithEgg(EntityBear.class, mobid + "Bear", 0x4A2710, 0x85471D);
			 	 	EntityRegistry.addSpawn(EntityBear.class, (int)ConfigHandler.BearRate *10, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.icePlains, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills});
			        EntityRegistry.addSpawn(EntityBear.class, (int)ConfigHandler.BearRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));
				}
				if(ConfigHandler.GorillaOn == true)
				{  
					registerModEntityWithEgg(EntityGorilla.class, mobid + "Gorilla", 0x414447, 0xFFFFFF);
				  	EntityRegistry.addSpawn(EntityGorilla.class, (int)ConfigHandler.GorillaRate *10, 1, 7, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
				}
				if(ConfigHandler.CamelOn == true)
				{   
			        registerModEntityWithEgg(EntityCamel.class, mobid + "Camel", 0xFADFCD, 0xF5C9AB);
			     	EntityRegistry.addSpawn(EntityCamel.class, (int)ConfigHandler.CamelRate *10, 2, 6, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills});
			        EntityRegistry.addSpawn(EntityCamel.class, (int)ConfigHandler.CamelRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.SANDY));

				}
				if(ConfigHandler.SnakeOn == true)
				{
			      	registerModEntityWithEgg(EntitySnake.class, mobid + "Snake", 0xA2C981, 0x377306);
			 	  	EntityRegistry.addSpawn(EntitySnake.class, (int)ConfigHandler.SnakeRate *10, 4, 5, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.jungle});
			        EntityRegistry.addSpawn(EntitySnake.class, (int)ConfigHandler.SnakeRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
				if(ConfigHandler.ButterFlyOn == true)
				{
			    	registerModEntityWithEgg(EntityButterfly.class, mobid + "Butterfly", 0xF2AD96, 0xFF0000);
			        EntityRegistry.addSpawn(EntityButterfly.class, (int)ConfigHandler.ButterFlyRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));
			 	  	EntityRegistry.addSpawn(EntityButterfly.class, (int)ConfigHandler.ButterFlyRate *10, 4, 5, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.jungle});
				}
				if(ConfigHandler.AntOn == true)
				{
			    	registerModEntityWithEgg(EntityAnt.class, mobid + "Ant", 0x000000, 0xFF0000);
			     	EntityRegistry.addSpawn(EntityAnt.class, (int)ConfigHandler.AntRate *10, 15, 20, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest});
			        EntityRegistry.addSpawn(EntityAnt.class, (int)ConfigHandler.AntRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
				if(ConfigHandler.TurtleOn == true)
				{ 	
			     	registerModEntityWithEgg(EntityTurtle.class,  mobid + "Turtle", 0x506E21, 0xDEC2A2);
			     	EntityRegistry.addSpawn(EntityTurtle.class,  (int)ConfigHandler.TurtleRate *10,  4,  5,  EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.swampland, BiomeGenBase.plains});
			        EntityRegistry.addSpawn(EntityTurtle.class, (int)ConfigHandler.TurtleRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
				if(ConfigHandler.GekkoOn == true)
				{
			    	registerModEntityWithEgg(EntityGekko.class,  mobid + "Gekko", 0xDEC2A2, 0x506E21);
			    	EntityRegistry.addSpawn(EntityGekko.class,  (int)ConfigHandler.GekkoRate *10,  4,  5,  EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.swampland});
		        	EntityRegistry.addSpawn(EntityGekko.class, (int)ConfigHandler.GekkoRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.SWAMP));

				}
				if(ConfigHandler.CrocoOn == true)
				{ 
			        registerModEntityWithEgg(EntityCroco.class,  mobid + "Croco", 0xDEC2A2, 0x506E21);
			        EntityRegistry.addSpawn(EntityCroco.class,  (int)ConfigHandler.CrocoRate *10,  4,  5,  EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.swampland});
		        	EntityRegistry.addSpawn(EntityCroco.class, (int)ConfigHandler.CrocoRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.SWAMP));

				}
				if(ConfigHandler.LionOn == true)
				{    
			        registerModEntityWithEgg(EntityLion.class,  mobid + "Lion", 0x94734a, 0x99600F);
			        EntityRegistry.addSpawn(EntityLion.class,  (int)ConfigHandler.LionRate *10,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.savanna, BiomeGenBase.savannaPlateau});
			        EntityRegistry.addSpawn(EntityLion.class, (int)ConfigHandler.LionRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
				if(ConfigHandler.PDFrogOn == true)
				{  
			    	registerModEntityWithEgg(EntityPDFrog.class, mobid + "PDFrog", 0xFFAE00, 0xF2FF00);
			     	EntityRegistry.addSpawn(EntityPDFrog.class, (int)ConfigHandler.PDFrogRate *10, 2, 2, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
		        	EntityRegistry.addSpawn(EntityPDFrog.class, (int)ConfigHandler.PDFrogRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.SWAMP));

				}
					if(ConfigHandler.FrogOn == true)
				{  
			    	registerModEntityWithEgg(EntityFrog.class, mobid + "Frog", 0x1A8C0F, 0x75A807);
			     	EntityRegistry.addSpawn(EntityFrog.class, (int)ConfigHandler.FrogRate *10, 2, 2, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.swampland});
		        	EntityRegistry.addSpawn(EntityFrog.class, (int)ConfigHandler.FrogRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.SWAMP));

				}
					if(ConfigHandler.FlyOn == true)
				{  
			    	registerModEntityWithEgg(EntityFly.class, mobid + "Fly", 0x000000, 0x5ED0F2);
			     	EntityRegistry.addSpawn(EntityFly.class, (int)ConfigHandler.FlyRate *10, 2, 2, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.beach, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland, BiomeGenBase.mushroomIsland, BiomeGenBase.savanna});
			        EntityRegistry.addSpawn(EntityFly.class, (int)ConfigHandler.FlyRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
					if(ConfigHandler.FireFlyOn == true)
				{  
			    	registerModEntityWithEgg(EntityFireFly.class, mobid + "FireFly", 0x000000, 0xE08B1B);
			     	EntityRegistry.addSpawn(EntityFireFly.class, (int)ConfigHandler.FireFlyRate *10, 2, 2, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.beach, BiomeGenBase.jungle, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland, BiomeGenBase.mushroomIsland,BiomeGenBase.savanna});
			        EntityRegistry.addSpawn(EntityFireFly.class, (int)ConfigHandler.FireFlyRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
					if(ConfigHandler.BullFrogOn == true)
				{  
			    	registerModEntityWithEgg(EntityBullFrog.class, mobid + "BullFrog", 0x459E36, 0x6E4919);
			     	EntityRegistry.addSpawn(EntityBullFrog.class, (int)ConfigHandler.BullFrogRate *10, 3, 5, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.savanna});
			        EntityRegistry.addSpawn(EntityBullFrog.class, (int)ConfigHandler.BullFrogRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
					if(ConfigHandler.BeeOn == true)
				{  
			    	registerModEntityWithEgg(EntityBee.class, mobid + "Bee", 0xF6FF00, 0x000000);
			     	EntityRegistry.addSpawn(EntityBee.class, (int)ConfigHandler.BeeRate *10, 2, 2, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest});
			        EntityRegistry.addSpawn(EntityBee.class, (int)ConfigHandler.BeeRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
				if(ConfigHandler.EasterBunnyOn == true)
				{   
				    registerModEntityWithEgg(EntityEasterBunny.class,  mobid + "EasterBunny", 0xE0D01B, 0xE0741B);
				    EntityRegistry.addSpawn(EntityBunny.class,  (int)ConfigHandler.EasterBunnyRate *10,  1,  1,  EnumCreatureType.creature, new BiomeGenBase[] {            	 
				         BiomeGenBase.beach,
				       	 BiomeGenBase.forest,
				       	 BiomeGenBase.forestHills,
				       	 BiomeGenBase.frozenRiver,
				       	 BiomeGenBase.jungle, 
				       	 BiomeGenBase.plains, 
				       	 BiomeGenBase.river,
				       	 BiomeGenBase.swampland, 
				       	 BiomeGenBase.taiga,
				       	 BiomeGenBase.extremeHills,
				       	 BiomeGenBase.desert,});
				}
				if(ConfigHandler.NarwalOn == true)
				{
			        registerModEntityWithEgg(EntityNarwal.class, mobid + "Narwal", 0x000000, 0x43607D);
			    	if(ConfigHandler.newBiomes)
			    	{ 
			        EntityRegistry.addSpawn(EntityNarwal.class, (int)ConfigHandler.NarwhaleRate *10, 1, 12, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean, BiomeGenBase.frozenOcean, LotsOMobsBiomes.modBiomeArcticOcean});
			    	}
			        EntityRegistry.addSpawn(EntityNarwal.class, (int)ConfigHandler.NarwhaleRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.OCEAN));

				}
				if(ConfigHandler.PenguinOn == true)
				{ 
			        registerModEntityWithEgg(EntityPenguin.class, mobid + "Penguin", 0x000000, 0xFFFFFF);
			    	if(ConfigHandler.newBiomes)
			    	{ 
			     	EntityRegistry.addSpawn(EntityPenguin.class, (int)ConfigHandler.PenguinRate *10, 4, 12, EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeAntartica, LotsOMobsBiomes.modBiomeArcticOcean, BiomeGenBase.icePlains});
			    	}
			        EntityRegistry.addSpawn(EntityPenguin.class, (int)ConfigHandler.PenguinRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.SNOWY));

				}
				if(ConfigHandler.IceBearOn == true)
				{
			    	registerModEntityWithEgg(EntityPolarBear.class, mobid + "Icebear" , 0xFAF4F0, 0xFFFFFF);
			    	if(ConfigHandler.newBiomes)
			    	{ 
			    	EntityRegistry.addSpawn(EntityPolarBear.class, (int)ConfigHandler.IceBearRate *10, 4, 5, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.frozenOcean, LotsOMobsBiomes.modBiomeArcticOcean, BiomeGenBase.icePlains});
			    	}
			        EntityRegistry.addSpawn(EntityPolarBear.class, (int)ConfigHandler.IceBearRate *10, 1, 4, EnumCreatureType.monster, BiomeDictionary.getBiomesForType(Type.SNOWY));

				}
				if(ConfigHandler.VultureOn == true)
				{
			 	  	registerModEntityWithEgg(EntityVulture.class, mobid + "Vulture", 0xFFFFFF, 0xFC7419);
			     	EntityRegistry.addSpawn(EntityVulture.class, (int)ConfigHandler.VultureRate *10, 10, 11, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.savanna});
			        EntityRegistry.addSpawn(EntityVulture.class, (int)ConfigHandler.VultureRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
				if(ConfigHandler.SantaOn == true)
				{		//* Christmas Special*//
			        registerModEntityWithEgg(EntitySanta.class, mobid + "Santa", 0xE82525, 0xFFFFFF);
			        EntityRegistry.addSpawn(EntitySanta.class, (int)ConfigHandler.SantaRate *20, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {
			            	 BiomeGenBase.beach,
			            	 BiomeGenBase.forest,
			            	 BiomeGenBase.forestHills,
			            	 BiomeGenBase.frozenRiver,
			            	 BiomeGenBase.jungle, 
			            	 BiomeGenBase.plains, 
			            	 BiomeGenBase.river,
			            	 BiomeGenBase.swampland, 
			            	 BiomeGenBase.taiga,
			            	 BiomeGenBase.extremeHills,
			            	 });
				}
				if(ConfigHandler.KakkerlakOn == true)
				{  
			    	registerModEntityWithEgg(EntityKakkerlak.class, mobid + "Cockroach", 0x220a00, 0x000000);
			     	EntityRegistry.addSpawn(EntityKakkerlak.class, (int)ConfigHandler.CockroachRate *10, 15, 20, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.jungle, BiomeGenBase.swampland, BiomeGenBase.plains});
			        EntityRegistry.addSpawn(EntityKakkerlak.class, (int)ConfigHandler.CockroachRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));
		        	EntityRegistry.addSpawn(EntityKakkerlak.class, (int)ConfigHandler.CockroachRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.SWAMP));


				}
				if(ConfigHandler.WormOn == true)
				{  
					registerModEntityWithEgg(EntityWorm.class, mobid + "Worm", 0xF7ADCB, 0xFFFFFF);
					EntityRegistry.addSpawn(EntityWorm.class, (int)ConfigHandler.WormRate *10, 2, 2, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.plains});
			        EntityRegistry.addSpawn(EntityWorm.class, (int)ConfigHandler.WormRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
				if(ConfigHandler.HermitCrabOn == true)
				{  
					registerModEntityWithEgg(EntityHermitCrab.class, mobid + "HermitCrab", 0xF77F07, 0x875420);
					if(ConfigHandler.newBiomes)
					{ 
					EntityRegistry.addSpawn(EntityHermitCrab.class, (int)ConfigHandler.HermitCrabRate *10, 2, 6, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.beach, BiomeGenBase.ocean, LotsOMobsBiomes.modBiomeTropical});
					}
					registerModEntity(EntityShell.class, "Shell");		
		        	EntityRegistry.addSpawn(EntityHermitCrab.class, (int)ConfigHandler.HermitCrabRate *10, 1, 4, EnumCreatureType.monster, BiomeDictionary.getBiomesForType(Type.BEACH));
				}
				if(ConfigHandler.FishyOn == true)
				{    
			        registerModEntityWithEgg(EntityTropicalFishy.class, mobid + "TFishy", 0xF78A2A, 0x000000);
			    	if(ConfigHandler.newBiomes)
			    	{ 
			        EntityRegistry.addSpawn(EntityTropicalFishy.class, (int)ConfigHandler.FishyRate *30, 8, 20, EnumCreatureType.waterCreature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeTropical});
			    	}
			    }
				if(ConfigHandler.GoatOn == true)
				{    
			        registerModEntityWithEgg(EntityGoat.class, mobid + "Goat", 0xad9074, 0x938578);
			        EntityRegistry.addSpawn(EntityGoat.class, (int)ConfigHandler.GoatRate *10, 5, 15, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forestHills, BiomeGenBase.jungleHills, BiomeGenBase.iceMountains, BiomeGenBase.taigaHills});
				}
				if(ConfigHandler.TriceratopsOn == true)
				{  
			        //Dinosaurs
			        registerModEntityWithEgg(EntityTriceratops.class,  mobid + "Triceratops", 0x79B814, 0x416606);
					 if(ConfigHandler.newDimensions)
			        EntityRegistry.addSpawn(EntityTriceratops.class,  (int)ConfigHandler.TriceratopsRate *10,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeDinoPlains, LotsOMobsBiomes.modBiomeDinoIslands, LotsOMobsBiomes.modBiomeDinoJungle, LotsOMobsBiomes.modBiomeDinoMountains, LotsOMobsBiomes.modBiomeDinoOcean});
				}
				if(ConfigHandler.BrontosaurusOn == true)
				{   
			        registerModEntityWithEgg(EntityBrontosaurus.class,  mobid + "Brontosaurus", 0xADADAD, 0x7A797A);
					 if(ConfigHandler.newDimensions)
						 EntityRegistry.addSpawn(EntityBrontosaurus.class,  (int)ConfigHandler.BrontosaurusRate *10,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeDinoPlains, LotsOMobsBiomes.modBiomeDinoIslands, LotsOMobsBiomes.modBiomeDinoJungle, LotsOMobsBiomes.modBiomeDinoMountains, LotsOMobsBiomes.modBiomeDinoOcean});
			        }
				if(ConfigHandler.TRexOn == true)
				{  
			        registerModEntityWithEgg(EntityTRex.class, mobid +  "TRex", 0x2B6308, 0x182410);
					 if(ConfigHandler.newDimensions)
						 EntityRegistry.addSpawn(EntityTRex.class,  (int)ConfigHandler.TRexRate *10,  1,  1,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeDinoPlains, LotsOMobsBiomes.modBiomeDinoIslands, LotsOMobsBiomes.modBiomeDinoJungle, LotsOMobsBiomes.modBiomeDinoMountains, LotsOMobsBiomes.modBiomeDinoOcean});
				}
				if(ConfigHandler.PterosaurusOn == true)
				{  
			        registerModEntityWithEgg(EntityPterosaurus.class,  mobid + "Pterosaurus", 0xC3C99B, 0x2B6308);
					 if(ConfigHandler.newDimensions)
						 EntityRegistry.addSpawn(EntityPterosaurus.class,  (int)ConfigHandler.PterosaurRate *10,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeDinoPlains, LotsOMobsBiomes.modBiomeDinoIslands, LotsOMobsBiomes.modBiomeDinoJungle, LotsOMobsBiomes.modBiomeDinoMountains, LotsOMobsBiomes.modBiomeDinoOcean});
				}
				if(ConfigHandler.IchtyosaurusOn == true)
				{  
			        registerModEntityWithEgg(EntityIchtyosaurus.class,  mobid + "Ichtyosaurus", 0x374392, 0xe6d5b5);
					 if(ConfigHandler.newDimensions)
						 EntityRegistry.addSpawn(EntityIchtyosaurus.class,  (int)ConfigHandler.IchtyosaurusRate *10,  5, 8,  EnumCreatureType.waterCreature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeDinoOcean});
				}
				if(ConfigHandler.RaptorOn == true)
				{  
			        registerModEntityWithEgg(EntityRaptor.class,  mobid + "Raptor",  0xEDCBA4, 0xBA6B11);
					 if(ConfigHandler.newDimensions)
						 EntityRegistry.addSpawn(EntityRaptor.class,  (int)ConfigHandler.RaptorRate *10,  5, 8,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeDinoPlains, LotsOMobsBiomes.modBiomeDinoIslands, LotsOMobsBiomes.modBiomeDinoJungle, LotsOMobsBiomes.modBiomeDinoMountains, LotsOMobsBiomes.modBiomeDinoOcean});
				}
				if(ConfigHandler.EasterBunnyOn == true)
				{   
				    registerModEntityWithEgg(EntityEasterChick.class,mobid +   "EasterChick", 0xfff200, 0xf7ce00);
				    EntityRegistry.addSpawn(EntityBunny.class,  (int)ConfigHandler.EasterChickRate *10,  3,  5,  EnumCreatureType.creature, new BiomeGenBase[] {            	 
				         BiomeGenBase.beach,
				       	 BiomeGenBase.forest,
				       	 BiomeGenBase.forestHills,
				       	 BiomeGenBase.frozenRiver,
				       	 BiomeGenBase.jungle, 
				       	 BiomeGenBase.plains, 
				       	 BiomeGenBase.river,
				       	 BiomeGenBase.swampland, 
				       	 BiomeGenBase.taiga,
				       	 BiomeGenBase.extremeHills,
				       	 BiomeGenBase.desert,});
				}
				if(ConfigHandler.MammothOn == true)
				{    
			        registerModEntityWithEgg(EntityMammoth.class, mobid +  "Mammoth", 0x4A2710, 0x85471D);
					 if(ConfigHandler.newDimensions)
						 EntityRegistry.addSpawn(EntityMammoth.class,  (int)ConfigHandler.MammothRate *10,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeIcePlains, LotsOMobsBiomes.modBiomeIceMountains, LotsOMobsBiomes.modBiomeIceOcean, LotsOMobsBiomes.modBiomeIceIslands});
				}
				if(ConfigHandler.SaberToothOn == true)
				{   
			        registerModEntityWithEgg(EntitySaberTooth.class, mobid +  "SaberTooth", 0x6c4821, 0xcab7a0);
					 if(ConfigHandler.newDimensions)
						 EntityRegistry.addSpawn(EntitySaberTooth.class,  (int)ConfigHandler.SaberToothRate *10,  1,  2,  EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeIcePlains, LotsOMobsBiomes.modBiomeIceMountains, LotsOMobsBiomes.modBiomeIceOcean, LotsOMobsBiomes.modBiomeIceIslands});
				}
				if(ConfigHandler.MuskOxOn == true)
				{  
			    	registerModEntityWithEgg(EntityMuskOx.class, mobid + "MuskOx", 0x8b6a4e, 0x64493d);
					 if(ConfigHandler.newDimensions)
						 EntityRegistry.addSpawn(EntityMuskOx.class, (int)ConfigHandler.MuskOxRate *10, 6, 9, EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeIcePlains, LotsOMobsBiomes.modBiomeIceMountains, LotsOMobsBiomes.modBiomeIceOcean, LotsOMobsBiomes.modBiomeIceIslands});
				}
				if(ConfigHandler.GazelleOn == true)
				{  
			    	registerModEntityWithEgg(EntityGazelle.class, mobid + "Gazelle", 0xc8953b, 0xf9f9f9);
			     	EntityRegistry.addSpawn(EntityGazelle.class, (int) ConfigHandler.GazelleRate, 6, 9, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.savanna, BiomeGenBase.savannaPlateau});
			        EntityRegistry.addSpawn(EntityGazelle.class, (int)ConfigHandler.GazelleRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));

				}
				if(ConfigHandler.SharkOn == true)
				{
					registerModEntityWithEgg(EntityHammerShark.class, mobid + "HammerShark", 0x959595, 0x7d7d7d);
					if(ConfigHandler.newBiomes)
			        EntityRegistry.addSpawn(EntityHammerShark.class, (int)ConfigHandler.SharkRate *20, 3, 5, EnumCreatureType.waterCreature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeTropical});
			        EntityRegistry.addSpawn(EntityHammerShark.class, (int)ConfigHandler.SharkRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.OCEAN));
			        EntityRegistry.addSpawn(EntityShark.class, (int)ConfigHandler.SharkRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.OCEAN));

					registerModEntityWithEgg(EntityShark.class, mobid + "Shark", 0x959595, 0x7d7d7d);
			        EntityRegistry.addSpawn(EntityShark.class, (int)ConfigHandler.SharkRate *10, 3, 5, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean});
				}
				if(ConfigHandler.CrabOn == true)
				{
					registerModEntityWithEgg(EntityCrab.class, mobid + "Crab", 0xb1360a, 0xed5523);
					if(ConfigHandler.newBiomes)
				    EntityRegistry.addSpawn(EntityCrab.class, (int)ConfigHandler.CrabRate *10, 3, 5, EnumCreatureType.creature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeTropical});
			        EntityRegistry.addSpawn(EntityCrab.class, (int)ConfigHandler.CrabRate *10, 3, 5, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.beach});
					EntityRegistry.addSpawn(EntityCrab.class, (int)ConfigHandler.CrabRate *10, 1, 4, EnumCreatureType.monster, BiomeDictionary.getBiomesForType(Type.BEACH));

				}
				if(ConfigHandler.MoleOn == true)
				{	
					registerModEntityWithEgg(EntityMole.class, mobid + "Mole", 0x7D3B0C, 0x544842);
					registerModEntity(EntityDirtPile.class, mobid + "DirtPile");
					EntityRegistry.addSpawn(EntityMole.class, (int)ConfigHandler.MoleRate *10, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills,BiomeGenBase.plains});
					EntityRegistry.addSpawn(EntityMole.class, (int)ConfigHandler.MoleRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));
				}
				if(ConfigHandler.BisonOn == true)
				{  
			    	registerModEntityWithEgg(EntityBison.class, mobid + "Bison", 0xc8953b, 0x5f360d);
			     	EntityRegistry.addSpawn(EntityBison.class, (int) ConfigHandler.BisonRate * 10, 6, 9, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.savanna, BiomeGenBase.savannaPlateau});
			        EntityRegistry.addSpawn(EntityBison.class, (int)ConfigHandler.BisonRate *10, 1, 4, EnumCreatureType.creature, BiomeDictionary.getBiomesForType(Type.PLAINS));
				}
				if(ConfigHandler.AmmoniteOn == true)
				{  
			    	registerModEntityWithEgg(EntityAmmonite.class, mobid + "Ammonite", 0x8c6239, 0xec8c6f);
					 if(ConfigHandler.newDimensions)
						 EntityRegistry.addSpawn(EntityAmmonite.class, (int) ConfigHandler.AmmoniteRate * 10, 6, 9, EnumCreatureType.waterCreature, new BiomeGenBase[] {LotsOMobsBiomes.modBiomeDinoOcean});
				}
				
				
	}
	
    // can't use vanilla spawn eggs with entities registered with modEntityID, so use custom eggs.
    // name passed must match entity name string
    public static void registerSpawnEgg(String parSpawnName, int parEggColor, int parEggSpotsColor)
    {
      Item itemSpawnEgg = new ItemCreatureEgg(parSpawnName, parEggColor, parEggSpotsColor).setUnlocalizedName("spawn_egg_"+parSpawnName.toLowerCase()).setTextureName("lom:spawn_egg").setCreativeTab(LotsOMobs.LotsOMobsEggTab);
      GameRegistry.registerItem(itemSpawnEgg, "spawnEgg"+parSpawnName);
    }
    
    public static void registerModEntityWithEgg(Class parEntityClass, String parEntityName, int parEggColor, int parEggSpotsColor)
    {
        EntityRegistry.registerModEntity(parEntityClass, parEntityName, ++modEntityID, LotsOMobs.instance, 80, 3, false);
        registerSpawnEgg(parEntityName, parEggColor, parEggSpotsColor);
    }
    
    public static void registerModEntity(Class parEntityClass, String parEntityName)
    {
        EntityRegistry.registerModEntity(parEntityClass, parEntityName, ++modEntityID, LotsOMobs.instance, 80, 3, false);
    }
    
    public static void registerModFastEntityWithEgg(Class parEntityClass, String parEntityName, int parEggColor, int parEggSpotsColor)
    {
        EntityRegistry.registerModEntity(parEntityClass, parEntityName, ++modEntityID, LotsOMobs.instance, 100, 5, true);
        registerSpawnEgg(parEntityName, parEggColor, parEggSpotsColor);
    }

}
