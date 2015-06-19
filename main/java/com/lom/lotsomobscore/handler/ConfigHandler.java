package com.lom.lotsomobscore.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ConfigHandler 
{
	
	public static Configuration config;
	
	//All Mobs On/Off
	public static boolean DeerOn = true;
	public static boolean BoarOn = true;
	public static boolean WinterDeerOn = true;
	public static boolean BearOn = true;
	public static boolean GorillaOn = true;
	public static boolean WhaleOn = true;
	public static boolean NarwalOn = true;
	public static boolean FishyOn = true;
	public static boolean CamelOn = true;
	public static boolean BirdOn = true;
	public static boolean PenguinOn = true;
	public static boolean IceBearOn = true;
	public static boolean SnakeOn = true;
	public static boolean ButterFlyOn = true;
	public static boolean GiraffeOn = true;
	public static boolean ElephantOn = true;
	public static boolean VultureOn = true;
	public static boolean AntOn = true;
	public static boolean TurtleOn = true;
	public static boolean LizardOn = true;
	public static boolean GekkoOn = true;
	public static boolean SantaOn = true;
	public static boolean CrocoOn = true;
	public static boolean TriceratopsOn = true;
	public static boolean BrontosaurusOn = true;
	public static boolean RaptorOn = true;
	public static boolean TRexOn = true;
	public static boolean PterosaurusOn = true;
	public static boolean MammothOn = true;
	public static boolean SaberToothOn = true;
	public static boolean LionOn = true;
	public static boolean EskimoOn = true;
	public static boolean CavemanOn = true;
	public static boolean BunnyOn = true;
	public static boolean EasterFeaturesOn = true;
	public static boolean SquirrelOn = true;
	public static boolean EmpirosaurusOn = true;
	public static boolean BirdyOn = true;
	public static boolean KakkerlakOn = true;
	public static boolean MuskOxOn = true;
	public static boolean PDFrogOn = true;
	public static boolean FrogOn = true;
	public static boolean FlyOn = true;
	public static boolean FireFlyOn = true;
	public static boolean BullFrogOn = true;
	public static boolean BeeOn = true;
	public static boolean WormOn = true;
	public static boolean HermitCrabOn = true;
	public static boolean SwordFishOn = true;
	public static boolean IchtyosaurusOn = true;
	public static boolean EasterBunnyOn = true;
	public static boolean GoatOn = true;
	public static boolean GazelleOn = true;
	public static boolean SharkOn = true;
	public static boolean CrabOn = true;
	public static boolean MoleOn = true;
	public static boolean BisonOn = true;
	public static boolean AmmoniteOn = true;

	//Disable biomes
	public static boolean newBiomes = true;
	public static boolean newDimensions = true;
	
	//Spawn Rates
	public static float DeerRate = 2.0F;
	public static float BoarRate = 2.0F;
	public static float BirdRate = 2.0F;
	public static float SquirrelRate = 1.0F;
	public static float BunnyRate = 1.0F;
	public static float LizardRate = 5.0F;
	public static float GiraffeRate = 1.5F;
	public static float ElephantRate = 2.5F;
	public static float FishyRate = 5.0F;
	public static float WhaleRate = .9F;
	public static float BearRate = 1.5F;
	public static float GorillaRate = 5.0F;
	public static float SnakeRate = 5.0F;
	public static float ButterFlyRate = 5.0F;
	public static float AntRate = 5.0F;
	public static float TurtleRate = 5.0F;
	public static float GekkoRate = 5.0F;
	public static float CrocoRate = 4.5F;
	public static float LionRate = 1.0F;
	public static float PDFrogRate = 10.0F;
	public static float FrogRate = 1.5F;
	public static float FlyRate = 1.5F;
	public static float FireFlyRate = 1.5F;
	public static float BullFrogRate = 1.5F;
	public static float BeeRate = 1.5F;
	public static float EasterBunnyRate = 1.5F;
	public static float NarwhaleRate = .5F;
	public static float PenguinRate = 1.0F;
	public static float IceBearRate = 1.5F;
	public static float VultureRate = 4.0F;
	public static float SantaRate = .5F;
	public static float CockroachRate = 5.0F;
	public static float WormRate = 1.5F;
	public static float HermitCrabRate = 3.5F;
	public static float GoatRate = 5.0F;
	public static float TriceratopsRate = 2.5F;
	public static float BrontosaurusRate = 2.5F;
	public static float TRexRate = .5F;
	public static float PterosaurRate = 1.0F;
	public static float IchtyosaurusRate = 1.5F;
	public static float RaptorRate = 1.5F;
	public static float EasterChickRate = 2.5F;
	public static float MammothRate = 1.0F;
	public static float SaberToothRate = 1.0F;
	public static float MuskOxRate = 1.4F;
	public static float CamelRate = 2.4F;
	public static float GazelleRate = 2.4F;
	public static float SharkRate = 3F;
	public static float CrabRate = 3F;
	public static float MoleRate = 3F;
	public static float BisonRate = 3.2F;
	public static float AmmoniteRate = 8F;

	
	//Dimension IDs
	public static int dimension = -24;
	public static int dimension2 = -25;
	
	//Biome IDs
	public static int ArcticOceanID = 40;
	public static int AntarticaID = 41;
	public static int DinoTerrainID = 42;
	public static int IceAgeTerrainID = 47;
	public static int TropicBeachID = 55;
	
	//Other Configs
	public static int knifeDamage = 100;
	public static int modEntityID = 1;
	
	public static void LoadFile(File configFile)
	{
		config = new Configuration(configFile);
		
		config.load();
		syncConfig();
		
		FMLCommonHandler.instance().bus().register(new ConfigChanger());
	}
	
	public static void syncConfig()
	{
		/**Here are all the Configuration settings for the mobs**/
		DeerOn = config.getBoolean("Deer", "mobs", DeerOn, "Turn the Deer on/off");
		BoarOn = config.getBoolean("Boar", "mobs", BoarOn, "Turn the Boar on/off");
		WinterDeerOn = config.getBoolean("WinterDeer", "mobs", WinterDeerOn, "Turn the WinterDeer on/off");
		BearOn = config.getBoolean("Bear", "mobs", BearOn, "Turn the Bear on/off");
		GorillaOn = config.getBoolean("Gorilla", "mobs", GorillaOn, "Turn the Bear on/off");
		WhaleOn = config.getBoolean("Whale", "mobs", WhaleOn, "Turn the Whale on/off");
		NarwalOn = config.getBoolean("Narwhale", "mobs", NarwalOn, "Turn the Narwhale on/off");
		FishyOn = config.getBoolean("Fishy", "mobs", FishyOn, "Turn the Fishy on/off");
		CamelOn = config.getBoolean("Camel", "mobs", CamelOn, "Turn the Camel on/off");
		BirdOn = config.getBoolean("Bird", "mobs", BirdOn, "Turn the Bird on/off");		
		
		PenguinOn = config.getBoolean("Penguin", "mobs", PenguinOn, "Turn the Penguin on/off");
		IceBearOn = config.getBoolean("Polar Bear", "mobs", IceBearOn, "Turn the Polar Bear on/off");
		SnakeOn = config.getBoolean("Snake", "mobs", SnakeOn, "Turn the Snake on/off");
		ButterFlyOn = config.getBoolean("ButterFly", "mobs", ButterFlyOn, "Turn the ButterFly on/off");
		GiraffeOn = config.getBoolean("Giraffe", "mobs", GiraffeOn, "Turn the Giraffe on/off");
		ElephantOn = config.getBoolean("Elephant", "mobs", ElephantOn, "Turn the Elephant on/off");
		VultureOn = config.getBoolean("Vulture", "mobs", VultureOn, "Turn the Vulture on/off");
		AntOn = config.getBoolean("Ant", "mobs", AntOn, "Turn the Ant on/off");
		TurtleOn = config.getBoolean("Turtle", "mobs", TurtleOn, "Turn the Turtle on/off");
		LizardOn = config.getBoolean("Lizard", "mobs", LizardOn, "Turn the Lizard on/off");		
		
		GekkoOn = config.getBoolean("Gekko", "mobs", GekkoOn, "Turn the Gekko on/off");
		SantaOn = config.getBoolean("Santa", "mobs", SantaOn, "Turn the Santa on/off");
		CrocoOn = config.getBoolean("Croco", "mobs", CrocoOn, "Turn the Croco on/off");
		TriceratopsOn = config.getBoolean("Triceratops", "mobs", TriceratopsOn, "Turn the Triceratops on/off");
		BrontosaurusOn = config.getBoolean("Brontosaurus", "mobs", BrontosaurusOn, "Turn the Brontosaurus on/off");
		RaptorOn = config.getBoolean("Raptor", "mobs", RaptorOn, "Turn the Raptor on/off");
		TRexOn = config.getBoolean("T-Rex", "mobs", TRexOn, "Turn the T-Rex on/off");
		PterosaurusOn = config.getBoolean("Pterosaur", "mobs", PterosaurusOn, "Turn the Pterosaur on/off");
		MammothOn = config.getBoolean("Mammoth", "mobs", MammothOn, "Turn the Mammoth on/off");
		SaberToothOn = config.getBoolean("SaberTooth", "mobs", SaberToothOn, "Turn the SaberTooth on/off");		
		
		LionOn = config.getBoolean("Lion", "mobs", LionOn, "Turn the Lion on/off");
		EskimoOn = config.getBoolean("Eskimo", "mobs", EskimoOn, "Turn the Eskimo on/off");
		CavemanOn = config.getBoolean("Caveman", "mobs", CavemanOn, "Turn the Caveman on/off");
		BunnyOn = config.getBoolean("Bunny", "mobs", BunnyOn, "Turn the Bunny on/off");
		EasterBunnyOn = config.getBoolean("EasterBunny", "mobs", EasterBunnyOn, "Turn the EasterBunny on/off");
		SquirrelOn = config.getBoolean("Squirrel", "mobs", SquirrelOn, "Turn the Squirrel on/off");
		KakkerlakOn = config.getBoolean("Cockroach", "mobs", KakkerlakOn, "Turn the Cockroach on/off");
		MuskOxOn = config.getBoolean("Musk Ox", "mobs", MuskOxOn, "Turn the Musk Ox on/off");
		PDFrogOn = config.getBoolean("Poison Dart Frog", "mobs", PDFrogOn, "Turn the Poison Dart Frog on/off");
		
		FrogOn = config.getBoolean("Frog", "mobs", FrogOn, "Turn the Frog on/off");
		FlyOn = config.getBoolean("Fly", "mobs", FlyOn, "Turn the Fly on/off");
		FireFlyOn = config.getBoolean("FireFly", "mobs", FireFlyOn, "Turn the FireFly on/off");
		BullFrogOn = config.getBoolean("BullFrog", "mobs", BullFrogOn, "Turn the BullFrog on/off");
		BeeOn = config.getBoolean("Bee", "mobs", BeeOn, "Turn the Bee on/off");
		WormOn = config.getBoolean("Worm", "mobs", WormOn, "Turn the Worm on/off");
		HermitCrabOn = config.getBoolean("Hermit Crab", "mobs", HermitCrabOn, "Turn the Hermit Crab on/off");
		EmpirosaurusOn = config.getBoolean("Empirosaurus", "mobs", EmpirosaurusOn, "Turn the Empirosaurus on/off");
		GoatOn = config.getBoolean("Goat", "mobs", GoatOn, "Turn the Goat on/off");
		IchtyosaurusOn = config.getBoolean("Ichtyosaurus", "mobs", IchtyosaurusOn, "Turn the Ichtyosaurus on/off");	
		GazelleOn = config.getBoolean("Gazelle", "mobs", GazelleOn, "Turn the Gazelle on/off");	
		SharkOn = config.getBoolean("Shark", "mobs", SharkOn, "Turn the Shark on/off");	
		CrabOn = config.getBoolean("Crab", "mobs", CrabOn, "Turn the Crab on/off");	
		MoleOn = config.getBoolean("Mole", "mobs", MoleOn, "Turn the Mole on/off");	
		BisonOn = config.getBoolean("Bison", "mobs", BisonOn, "Turn the Bison on/off");	
		AmmoniteOn = config.getBoolean("Ammonite", "mobs", AmmoniteOn, "Turn the Ammonite on/off");	

		newBiomes = config.getBoolean("Biomes", "general", newBiomes, "Turn biomes on/off");	
		newDimensions = config.getBoolean("Dimensions", "general", newDimensions, "Turn dimensions on/off");	
		knifeDamage = config.getInt("KnifeDamage", "general", knifeDamage, 0, 1000, "Set the damage for the knife.");

		
		DeerRate = config.getFloat("Deer spawn rate", "spawn", DeerRate, -1, 10, "Set Deer spawn rate");
		BoarRate = config.getFloat("Boar spawn rate", "spawn", BoarRate, -1, 10, "Set Boar spawn rate");
		BirdRate = config.getFloat("Bird spawn rate", "spawn", BirdRate, -1, 10, "Set Bird spawn rate");
		SquirrelRate = config.getFloat("Squirrel spawn rate", "spawn", SquirrelRate, -1, 10, "Set Squirrel spawn rate");
		BunnyRate = config.getFloat("Bunny spawn rate", "spawn", BunnyRate, -1, 10, "Set Bunny spawn rate");
		LizardRate = config.getFloat("Lizard spawn rate", "spawn", LizardRate, -1, 10, "Set Lizard spawn rate");
		GiraffeRate = config.getFloat("Giraffe spawn rate", "spawn", GiraffeRate, -1, 10, "Set Giraffe spawn rate");
		ElephantRate = config.getFloat("Elephant spawn rate", "spawn", ElephantRate, -1, 10, "Set Elephant spawn rate");
		FishyRate = config.getFloat("Fishy spawn rate", "spawn", FishyRate, -1, 10, "Set Fishy spawn rate");
		WhaleRate = config.getFloat("Whale spawn rate", "spawn", WhaleRate, -1, 10, "Set Whale spawn rate");
		NarwhaleRate = config.getFloat("Narwhale spawn rate", "spawn", NarwhaleRate, -1, 10, "Set Narwhale spawn rate");
		BearRate = config.getFloat("Bear spawn rate", "spawn", BearRate, -1, 10, "Set Bear spawn rate");
		GorillaRate = config.getFloat("Gorilla spawn rate", "spawn", GorillaRate, -1, 10, "Set Gorilla spawn rate");
		CamelRate = config.getFloat("Camel spawn rate", "spawn", CamelRate, -1, 10, "Set Camel spawn rate");
		SnakeRate = config.getFloat("Snake spawn rate", "spawn", SnakeRate, -1, 10, "Set Snake spawn rate");
		ButterFlyRate = config.getFloat("ButterFly spawn rate", "spawn", ButterFlyRate, -1, 10, "Set ButterFly spawn rate");
		AntRate = config.getFloat("Ant spawn rate", "spawn", AntRate, -1, 10, "Set Ant spawn rate");
		TurtleRate = config.getFloat("Turtle spawn rate", "spawn", TurtleRate, -1, 10, "Set Turtle spawn rate");
		CrocoRate = config.getFloat("Croco spawn rate", "spawn", CrocoRate, -1, 10, "Set Croco spawn rate");
		GekkoRate = config.getFloat("Gekko spawn rate", "spawn", GekkoRate, -1, 10, "Set Gekko spawn rate");
		LionRate = config.getFloat("Lion spawn rate", "spawn", LionRate, -1, 10, "Set Lion spawn rate");
		PDFrogRate = config.getFloat("Poison Dart Frog spawn rate", "spawn", PDFrogRate, -1, 10, "Set Poison Dart Frog spawn rate");
		FrogRate = config.getFloat("Frog spawn rate", "spawn", FrogRate, -1, 10, "Set Frog spawn rate");
		FlyRate = config.getFloat("Fly spawn rate", "spawn", FlyRate, -1, 10, "Set Fly spawn rate");
		FireFlyRate = config.getFloat("Firefly spawn rate", "spawn", FireFlyRate, -1, 10, "Set Firefly spawn rate");
		BullFrogRate = config.getFloat("Bull Frog spawn rate", "spawn", BullFrogRate, -1, 10, "Set Bull Frog spawn rate");
		BeeRate = config.getFloat("Bee spawn rate", "spawn", BeeRate, -1, 10, "Set Bee spawn rate");
		PenguinRate = config.getFloat("Penguin spawn rate", "spawn", PenguinRate, -1, 10, "Set Penguin spawn rate");
		IceBearRate = config.getFloat("Polar Bear spawn rate", "spawn", IceBearRate, -1, 10, "Set Polar Bear spawn rate");
		VultureRate = config.getFloat("Vulture spawn rate", "spawn", VultureRate, -1, 10, "Set Vulture spawn rate");
		SantaRate = config.getFloat("Santa Claus spawn rate", "spawn", SantaRate, -1, 10, "Set Santa Claus spawn rate");
		CockroachRate = config.getFloat("Cockroach spawn rate", "spawn", CockroachRate, -1, 10, "Set Cockroach spawn rate");
		WormRate = config.getFloat("Worm spawn rate", "spawn", WormRate, -1, 10, "Set Worm spawn rate");
		HermitCrabRate = config.getFloat("Hermit Crab spawn rate", "spawn", HermitCrabRate, -1, 10, "Set Hermit Crab spawn rate");
		GoatRate = config.getFloat("Goat spawn rate", "spawn", GoatRate, -1, 10, "Set Goat spawn rate");
		TriceratopsRate = config.getFloat("Triceratops spawn rate", "spawn", TriceratopsRate, -1, 10, "Set Triceratops spawn rate");
		BrontosaurusRate = config.getFloat("Brontosaurus spawn rate", "spawn", BrontosaurusRate, -1, 10, "Set Brontosaurus spawn rate");
		TRexRate = config.getFloat("T-Rex spawn rate", "spawn", TRexRate, -1, 10, "Set T-Rex spawn rate");
		RaptorRate = config.getFloat("Raptor spawn rate", "spawn", RaptorRate, -1, 10, "Set Raptor spawn rate");
		PterosaurRate = config.getFloat("Pterosaur spawn rate", "spawn", PterosaurRate, -1, 10, "Set Pterosaur spawn rate");
		IchtyosaurusRate = config.getFloat("Ichtyosaurus spawn rate", "spawn", IchtyosaurusRate, -1, 10, "Set Ichtyosaurus spawn rate");
		MammothRate = config.getFloat("Mammoth spawn rate", "spawn", MammothRate, -1, 10, "Set Mammoth spawn rate");
		SaberToothRate = config.getFloat("Saber Tooth Tiger spawn rate", "spawn", SaberToothRate, -1, 10, "Set Saber Tooth Tiger spawn rate");
		MuskOxRate = config.getFloat("Musk Ox spawn rate", "spawn", MuskOxRate, -1, 10, "Set Musk Ox spawn rate");
		EasterChickRate = config.getFloat("Easter Chick spawn rate", "spawn", EasterChickRate, -1, 10, "Set Easter Chick spawn rate");
		EasterBunnyRate = config.getFloat("Easter Bunny spawn rate", "spawn", EasterBunnyRate, -1, 10, "Set Easter Bunny spawn rate");
		GazelleRate = config.getFloat("Gazelle spawn rate", "spawn", GazelleRate, -1, 10, "Set Gazelle spawn rate");
		SharkRate = config.getFloat("Shark spawn rate", "spawn", SharkRate, -1, 10, "Set Shark spawn rate");
		CrabRate = config.getFloat("Crab spawn rate", "spawn", CrabRate, -1, 10, "Set Crab spawn rate");
		MoleRate = config.getFloat("Mole spawn rate", "spawn", MoleRate, -1, 10, "Set Mole spawn rate");
		BisonRate = config.getFloat("Bison spawn rate", "spawn", BisonRate, -1, 10, "Set Bison spawn rate");
		AmmoniteRate = config.getFloat("Ammonite spawn rate", "spawn", AmmoniteRate, -1, 10, "Set Ammonite spawn rate");

		AntarticaID = config.getInt("AntarticaID", "biome", AntarticaID, 0, Integer.MAX_VALUE, "Antartica ID");
		ArcticOceanID = config.getInt("ArcticOceanID", "biome", ArcticOceanID, 0, Integer.MAX_VALUE, "ArcticOcean ID");
		DinoTerrainID = config.getInt("DinoTerrainID", "biome", DinoTerrainID, 0, Integer.MAX_VALUE, "DinoTerrain ID, remember to keep the next 4 IDs "
				+ "empty as well since LotsOMobs adds 5 Dino Biomes");
		IceAgeTerrainID = config.getInt("IceAgeTerrainID", "biome", IceAgeTerrainID, 0, Integer.MAX_VALUE, "IceAgeTerrain ID, also keep 3 IDs empty after this one");
		TropicBeachID = config.getInt("TropicBeachID", "biome", TropicBeachID, 0, Integer.MAX_VALUE, "TropicBeach ID");

		dimension = config.getInt("Dino Dimension ID", "dimension", dimension, -100, Integer.MAX_VALUE, "Dino ID");
		dimension2 = config.getInt("Ice Dimension ID", "dimension", dimension2, -100, Integer.MAX_VALUE, "Ice Age ID");

		
		if(config.hasChanged())	
		config.save();
	}

	public static class ConfigChanger {

		@SubscribeEvent
		public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
			if(eventArgs.modID.equals("lom"))
				syncConfig();
		}
	}
}
