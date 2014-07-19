package com.lom.lotsomobsinit;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class LotsOMobsAchievementsBook 
{
	//Achievements
		public static Achievement AchievementLogIn;
		public static Achievement AchievementDeer;
		public static Achievement AchievementBoar;
		public static Achievement AchievementCamel;
		public static Achievement AchievementReptile;
		public static Achievement AchievementWhale;
		public static Achievement AchievementLion;
		public static Achievement AchievementFrog;
		public static Achievement AchievementPenguin;
		public static Achievement AchievementFossil;
		public static Achievement AchievementDino;
		public static Achievement AchievementIceAge;
		public static Achievement AchievementDinosaur;
		public static Achievement AchievementIceCreature;
		public static Achievement AchievementAmber;
		public static Achievement AchievementIcemintuim;
		public static Achievement AchievementIceTool;
		public static Achievement AchievementIceArmor;
		public static Achievement AchievementEskimoArmor;
		public static Achievement AchievementDinoArmor;
		public static Achievement AchievementAmberArmor;
		public static Achievement AchievementAmberTool;
		public static Achievement AchievementCoral;
		public static Achievement AchievementKillShark;
		public static Achievement AchievementKillCrab;
		public static Achievement AchievementCoconut;
		
		public static void Init()
		{
			//Achievements
	        AchievementLogIn = new Achievement("achievement.login", "login", 0, 0, Items.map, (Achievement)null).registerStat();
	        AchievementDeer = new Achievement("achievement.killdeer", "killdeer", -2, 2, LotsOMobsItems.RawVenison, (Achievement)AchievementLogIn).initIndependentStat().registerStat();
	        AchievementBoar = new Achievement("achievement.killboar", "killboar", -5, 5, LotsOMobsItems.RawBoar, (Achievement)AchievementLogIn).registerStat();
	        AchievementCamel = new Achievement("achievement.killcamel", "killcamel", 3, 5, LotsOMobsItems.RawCamel, (Achievement)AchievementLogIn).registerStat();
	        AchievementReptile = new Achievement("achievement.killreptile", "killreptile", 1, 3, LotsOMobsItems.RawReptile, (Achievement)AchievementLogIn).registerStat();
	        AchievementWhale = new Achievement("achievement.killwhale", "killwhale", 3, -3, LotsOMobsItems.RawWhale, (Achievement)AchievementLogIn).registerStat();
	        AchievementLion = new Achievement("achievement.killlion", "killlion", 5, -6, LotsOMobsItems.RawLion, (Achievement)AchievementLogIn).registerStat();
	        AchievementFrog = new Achievement("achievement.killfrog", "killfrog", -4, -6, LotsOMobsItems.RawFrog, (Achievement)AchievementLogIn).registerStat();
	        AchievementPenguin = new Achievement("achievement.killpenguin", "killpenguin", -4, -2, LotsOMobsItems.RawPenguin, (Achievement)AchievementLogIn).registerStat();
	        AchievementFossil = new Achievement("achievement.minefossil", "minefossil", 4, 0, LotsOMobsItems.FossilBro, (Achievement)AchievementLogIn).registerStat();
	        AchievementDino = new Achievement("achievement.tpdino", "tpdino", 7, -2, LotsOMobsBlocks.DinoPortal, (Achievement)AchievementFossil).registerStat();
	        AchievementIceAge = new Achievement("achievement.tpiceage", "tpiceage", 7, 2, LotsOMobsBlocks.IcePortal, (Achievement)AchievementFossil).registerStat();
	        AchievementDinosaur = new Achievement("achievement.killdinosaur", "killdinosaur", 9, -4, LotsOMobsItems.DinoBone, (Achievement)AchievementDino).registerStat();
	        AchievementAmber = new Achievement("achievement.mineamber", "mineamber", 11, -2, LotsOMobsItems.Amber, (Achievement)AchievementDino).registerStat();
	        AchievementIcemintuim = new Achievement("achievement.mineicemintuim", "mineicemintuim", 11, 2, LotsOMobsItems.IcemintuimBar, (Achievement)AchievementIceAge).registerStat();
	        AchievementIceCreature = new Achievement("achievement.killicecreature", "killicecreature", 9, 4, LotsOMobsItems.WoolyFur, (Achievement)AchievementIceAge).registerStat();
	        AchievementIceTool = new Achievement("achievement.crafticetool", "crafticetool", 12, 4, LotsOMobsItems.IcemintuimPickaxe, (Achievement)AchievementIcemintuim).registerStat();
	        AchievementAmberTool = new Achievement("achievement.craftambertool", "craftambertool", 12, -4, LotsOMobsItems.AmberPickaxe, (Achievement)AchievementAmber).registerStat();
	        AchievementIceArmor = new Achievement("achievement.crafticearmor", "crafticearmor", 14, 3, LotsOMobsItems.IcemintuimHelmet, (Achievement)AchievementIcemintuim).registerStat();
	        AchievementAmberArmor = new Achievement("achievement.craftamberarmor", "craftamberarmor", 14, -3, LotsOMobsItems.AmberHelmet, (Achievement)AchievementAmber).registerStat();
	        AchievementEskimoArmor = new Achievement("achievement.crafteskimoarmor", "crafteskimoarmor", 9, 7, LotsOMobsItems.EskimoHelmet, (Achievement)AchievementIceCreature).registerStat();
	        AchievementDinoArmor = new Achievement("achievement.craftdinoarmor", "craftdinoarmor", 9, -7, LotsOMobsItems.DinoFurHelmet, (Achievement)AchievementDinosaur).registerStat();
	        AchievementCoral = new Achievement("achievement.breakcoral", "breakcoral",-2, 7, Item.getItemFromBlock(LotsOMobsBlocks.Coral1), (Achievement)AchievementLogIn).registerStat();
	        AchievementKillShark = new Achievement("achievement.killshark", "killshark", 2, 9, LotsOMobsItems.RawShark, (Achievement)AchievementLogIn).registerStat();
	        AchievementKillCrab = new Achievement("achievement.killcrab", "killcrab", 2, 7, LotsOMobsItems.RawCrab, (Achievement)AchievementLogIn).registerStat();
	        AchievementCoconut = new Achievement("achievement.breakcoconut", "breakcoconut", -2, 9, LotsOMobsItems.CocoMilk, (Achievement)AchievementLogIn).registerStat();
	        
	        
	        AchievementPage AchievementPageLotsOMobs = new AchievementPage("LotsOMobs", new Achievement[]
	        		{AchievementLogIn, 
	        		 AchievementDeer, 
	        		 AchievementBoar, 
	        		 AchievementCamel, 
	        		 AchievementReptile,
	        		 AchievementWhale,
	        		 AchievementLion,
	        		 AchievementFrog,
	        		 AchievementPenguin,
	        		 AchievementFossil,
	        		 AchievementDino,
	        		 AchievementIceAge,
	        		 AchievementDinosaur,
	        		 AchievementAmber,
	        		 AchievementIcemintuim,
	        		 AchievementIceCreature,
	        		 AchievementIceTool,
	        		 AchievementAmberTool,
	        		 AchievementIceArmor,
	        		 AchievementAmberArmor,
	        		 AchievementEskimoArmor,
	        		 AchievementDinoArmor,
	        		 AchievementCoral,
	        		 AchievementKillShark,
	        		 AchievementKillCrab,
	        		 AchievementCoconut});
	        AchievementPage.registerAchievementPage(AchievementPageLotsOMobs);
		}

}
