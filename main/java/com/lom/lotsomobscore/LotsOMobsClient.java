package com.lom.lotsomobscore;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

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
import com.lom.lotsomobsinit.LotsOMobsBlocks;
import com.lom.lotsomobsmodels.ModelAmmonite;
import com.lom.lotsomobsmodels.ModelAnt;
import com.lom.lotsomobsmodels.ModelBear;
import com.lom.lotsomobsmodels.ModelBird;
import com.lom.lotsomobsmodels.ModelBison;
import com.lom.lotsomobsmodels.ModelBoar;
import com.lom.lotsomobsmodels.ModelBrontosaurus;
import com.lom.lotsomobsmodels.ModelBullFrog;
import com.lom.lotsomobsmodels.ModelBunny;
import com.lom.lotsomobsmodels.ModelButterfly;
import com.lom.lotsomobsmodels.ModelCamel;
import com.lom.lotsomobsmodels.ModelCrab;
import com.lom.lotsomobsmodels.ModelDeer;
import com.lom.lotsomobsmodels.ModelDeerArmor;
import com.lom.lotsomobsmodels.ModelDirtPile;
import com.lom.lotsomobsmodels.ModelEasterBunny;
import com.lom.lotsomobsmodels.ModelElephant;
import com.lom.lotsomobsmodels.ModelElephantHelmet;
import com.lom.lotsomobsmodels.ModelFishy;
import com.lom.lotsomobsmodels.ModelFly;
import com.lom.lotsomobsmodels.ModelFrog;
import com.lom.lotsomobsmodels.ModelGazelle;
import com.lom.lotsomobsmodels.ModelGiraffe;
import com.lom.lotsomobsmodels.ModelGoat;
import com.lom.lotsomobsmodels.ModelGorilla;
import com.lom.lotsomobsmodels.ModelHammerShark;
import com.lom.lotsomobsmodels.ModelHermitCrab;
import com.lom.lotsomobsmodels.ModelIchtyosaurus;
import com.lom.lotsomobsmodels.ModelKakkerlak;
import com.lom.lotsomobsmodels.ModelLion;
import com.lom.lotsomobsmodels.ModelLizard;
import com.lom.lotsomobsmodels.ModelMammoth;
import com.lom.lotsomobsmodels.ModelMole;
import com.lom.lotsomobsmodels.ModelMuskOx;
import com.lom.lotsomobsmodels.ModelNarwal;
import com.lom.lotsomobsmodels.ModelPenguin;
import com.lom.lotsomobsmodels.ModelPterosaurus;
import com.lom.lotsomobsmodels.ModelRaptor;
import com.lom.lotsomobsmodels.ModelSaberTooth;
import com.lom.lotsomobsmodels.ModelSanta;
import com.lom.lotsomobsmodels.ModelShark;
import com.lom.lotsomobsmodels.ModelShell;
import com.lom.lotsomobsmodels.ModelSnake;
import com.lom.lotsomobsmodels.ModelSquirrel;
import com.lom.lotsomobsmodels.ModelTRex;
import com.lom.lotsomobsmodels.ModelTriceratops;
import com.lom.lotsomobsmodels.ModelTurtle;
import com.lom.lotsomobsmodels.ModelVulture;
import com.lom.lotsomobsmodels.ModelWhale;
import com.lom.lotsomobsmodels.ModelWorm;
import com.lom.lotsomobsrender.RenderAmmonite;
import com.lom.lotsomobsrender.RenderAnt;
import com.lom.lotsomobsrender.RenderBear;
import com.lom.lotsomobsrender.RenderBee;
import com.lom.lotsomobsrender.RenderBird;
import com.lom.lotsomobsrender.RenderBison;
import com.lom.lotsomobsrender.RenderBoar;
import com.lom.lotsomobsrender.RenderBrontosaurus;
import com.lom.lotsomobsrender.RenderBullFrog;
import com.lom.lotsomobsrender.RenderBunny;
import com.lom.lotsomobsrender.RenderButterfly;
import com.lom.lotsomobsrender.RenderCamel;
import com.lom.lotsomobsrender.RenderCrab;
import com.lom.lotsomobsrender.RenderCroco;
import com.lom.lotsomobsrender.RenderDeer;
import com.lom.lotsomobsrender.RenderDirtPile;
import com.lom.lotsomobsrender.RenderEasterBunny;
import com.lom.lotsomobsrender.RenderEasterChick;
import com.lom.lotsomobsrender.RenderElephant;
import com.lom.lotsomobsrender.RenderFireFly;
import com.lom.lotsomobsrender.RenderFishy;
import com.lom.lotsomobsrender.RenderFly;
import com.lom.lotsomobsrender.RenderFrog;
import com.lom.lotsomobsrender.RenderGazelle;
import com.lom.lotsomobsrender.RenderGekko;
import com.lom.lotsomobsrender.RenderGiraffe;
import com.lom.lotsomobsrender.RenderGoat;
import com.lom.lotsomobsrender.RenderGorilla;
import com.lom.lotsomobsrender.RenderHammerShark;
import com.lom.lotsomobsrender.RenderHermitCrab;
import com.lom.lotsomobsrender.RenderIchtyosaurus;
import com.lom.lotsomobsrender.RenderKakkerlak;
import com.lom.lotsomobsrender.RenderLion;
import com.lom.lotsomobsrender.RenderLizard;
import com.lom.lotsomobsrender.RenderMammoth;
import com.lom.lotsomobsrender.RenderMole;
import com.lom.lotsomobsrender.RenderMuskOx;
import com.lom.lotsomobsrender.RenderNarwal;
import com.lom.lotsomobsrender.RenderPDFrog;
import com.lom.lotsomobsrender.RenderPenguin;
import com.lom.lotsomobsrender.RenderPolarBear;
import com.lom.lotsomobsrender.RenderPterosaurus;
import com.lom.lotsomobsrender.RenderRaptor;
import com.lom.lotsomobsrender.RenderSaberTooth;
import com.lom.lotsomobsrender.RenderSanta;
import com.lom.lotsomobsrender.RenderShark;
import com.lom.lotsomobsrender.RenderShell;
import com.lom.lotsomobsrender.RenderSnake;
import com.lom.lotsomobsrender.RenderSquirrel;
import com.lom.lotsomobsrender.RenderTRex;
import com.lom.lotsomobsrender.RenderTriceratops;
import com.lom.lotsomobsrender.RenderTropicalFishy;
import com.lom.lotsomobsrender.RenderTurtle;
import com.lom.lotsomobsrender.RenderVulture;
import com.lom.lotsomobsrender.RenderWhale;
import com.lom.lotsomobsrender.RenderWinterDeer;
import com.lom.lotsomobsrender.RenderWorm;
import com.lom.lotsomobstileentity.coconut.ItemRenderCoconut;
import com.lom.lotsomobstileentity.coconut.TileEntityCoconut;
import com.lom.lotsomobstileentity.coconut.TileEntityRendererCoconut;
import com.lom.lotsomobstileentity.saltbath.ItemRenderSaltBath;
import com.lom.lotsomobstileentity.saltbath.TileEntityRendererSaltBath;
import com.lom.lotsomobstileentity.saltbath.TileEntitySaltBath;
import com.lom.lotsomobstileentity.spinningwheel.ItemRenderSpinningWheel;
import com.lom.lotsomobstileentity.spinningwheel.TileEntityRendererSpinningWheel;
import com.lom.lotsomobstileentity.spinningwheel.TileEntitySpinningWheel;
import com.lom.lotsomobstileentity.tanningrack.ItemRenderTanningRack;
import com.lom.lotsomobstileentity.tanningrack.TileEntityRendererTanningRack;
import com.lom.lotsomobstileentity.tanningrack.TileEntityTanningRack;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class LotsOMobsClient extends LotsOMobsProxy
{

    private static final ModelDeerArmor Chest = new ModelDeerArmor(0.5F);
    private static final ModelDeerArmor Legs = new ModelDeerArmor(0.5F);
    private static final ModelElephantHelmet HelmetE = new ModelElephantHelmet(0.5F);
	
    @SideOnly(Side.CLIENT)
	public void registerRenderInformation()
        {
    	//Mobs
    	RenderingRegistry.registerEntityRenderingHandler(EntityDeer.class, new RenderDeer(new ModelDeer(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityBoar.class, new RenderBoar(new ModelBoar(), 0.5F));
    	RenderingRegistry.registerEntityRenderingHandler(EntityBird.class, new RenderBird(new ModelBird(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntitySquirrel.class,new RenderSquirrel(new ModelSquirrel(), 0.2F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityGiraffe.class, new RenderGiraffe(new ModelGiraffe(), 1.3F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityElephant.class, new RenderElephant(new ModelElephant(), 1.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityLizard.class, new RenderLizard(new ModelLizard(), 0.2F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityBunny.class, new RenderBunny(new ModelBunny(), 0.2F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityWhale.class, new RenderWhale(new ModelWhale(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityFishy.class, new RenderFishy(new ModelFishy(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityCamel.class, new RenderCamel(new ModelCamel(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityWinterDeer.class, new RenderWinterDeer(new ModelDeer(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityTurtle.class, new RenderTurtle(new ModelTurtle(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityButterfly.class, new RenderButterfly(new ModelButterfly(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityAnt.class, new RenderAnt(new ModelAnt(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityGekko.class, new RenderGekko(new ModelLizard(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityBear.class, new RenderBear(new ModelBear(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityGorilla.class, new RenderGorilla(new ModelGorilla(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntitySnake.class, new RenderSnake(new ModelSnake(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityCroco.class, new RenderCroco(new ModelLizard(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityLion.class, new RenderLion(new ModelLion(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityFly.class, new RenderFly(new ModelFly(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityBee.class, new RenderBee(new ModelFly(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityFireFly.class, new RenderFireFly(new ModelFly(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityPDFrog.class, new RenderPDFrog(new ModelFrog(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityFrog.class, new RenderFrog(new ModelFrog(), 0.5F));
   		RenderingRegistry.registerEntityRenderingHandler(EntityBullFrog.class, new RenderBullFrog(new ModelBullFrog(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityEasterBunny.class, new RenderEasterBunny(new ModelEasterBunny(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityPenguin.class, new RenderPenguin(new ModelPenguin(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityKakkerlak.class, new RenderKakkerlak(new ModelKakkerlak(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityVulture.class, new RenderVulture(new ModelVulture(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityPolarBear.class, new RenderPolarBear(new ModelBear(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityNarwal.class, new RenderNarwal(new ModelNarwal(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntitySanta.class, new RenderSanta(new ModelSanta(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityWorm.class, new RenderWorm(new ModelWorm(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityHermitCrab.class, new RenderHermitCrab(new ModelHermitCrab(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityShell.class, new RenderShell(new ModelShell(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityTropicalFishy.class, new RenderTropicalFishy(new ModelFishy(), 0.0F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityGoat.class, new RenderGoat(new ModelGoat(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityTriceratops.class, new RenderTriceratops(new ModelTriceratops(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityBrontosaurus.class, new RenderBrontosaurus(new ModelBrontosaurus(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityTRex.class, new RenderTRex(new ModelTRex(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityPterosaurus.class, new RenderPterosaurus(new ModelPterosaurus(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityIchtyosaurus.class, new RenderIchtyosaurus(new ModelIchtyosaurus(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityRaptor.class, new RenderRaptor(new ModelRaptor(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityEasterChick.class, new RenderEasterChick(new ModelChicken(), 0.05F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityMammoth.class, new RenderMammoth(new ModelMammoth(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntitySaberTooth.class, new RenderSaberTooth(new ModelSaberTooth(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityMuskOx.class, new RenderMuskOx(new ModelMuskOx(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityGazelle.class, new RenderGazelle(new ModelGazelle(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityHammerShark.class, new RenderHammerShark(new ModelHammerShark(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityShark.class, new RenderShark(new ModelShark(), 0.5F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityCrab.class, new RenderCrab(new ModelCrab(), 0.2F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityMole.class, new RenderMole(new ModelMole(), 0.2F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityDirtPile.class, new RenderDirtPile(new ModelDirtPile(), 0.2F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityBison.class, new RenderBison(new ModelBison(), 1F));
  		RenderingRegistry.registerEntityRenderingHandler(EntityAmmonite.class, new RenderAmmonite(new ModelAmmonite(), 1F));
 
  		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTanningRack.class, new TileEntityRendererTanningRack());
  		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(LotsOMobsBlocks.TanningRack), (new ItemRenderTanningRack()));

  		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySaltBath.class, new TileEntityRendererSaltBath());
  		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(LotsOMobsBlocks.SaltBath), (new ItemRenderSaltBath()));
  		
  		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySpinningWheel.class, new TileEntityRendererSpinningWheel());
  		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(LotsOMobsBlocks.SpinningWheel), (new ItemRenderSpinningWheel()));

  		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCoconut.class, new TileEntityRendererCoconut());
  		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(LotsOMobsBlocks.Coconut), (new ItemRenderCoconut()));

        }
    /*
    public void registerSound() {
    	MinecraftForge.EVENT_BUS.register(new LotsOMobs_EventSounds());
    }*/
    
    public int addArmor(String armor){
    	return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
    
    public ModelBiped getArmorModel(int id)
    {
    	switch (id) {
    	case 0:
    	return Chest;
    	case 1:
    	return Legs;
    	case 2:
    	return HelmetE;
    	default:
    	break;
    	}
    	return Chest;
    }
    
    @Override
    public World getClientWorld()
    {
        return FMLClientHandler.instance().getClient().theWorld;
    }
}
