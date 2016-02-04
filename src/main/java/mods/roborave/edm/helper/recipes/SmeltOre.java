package mods.roborave.edm.helper.recipes;

import mods.roborave.edm.init.Blocks;
import mods.roborave.edm.init.Items;
import mods.roborave.edm.tweaker.api.IObject;
import mods.roborave.edm.tweaker.api.RecipeAPI;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
public class SmeltOre extends IObject implements RecipeAPI
{
	public void addRecipes() 
	{
		GameRegistry.addSmelting(Blocks.BDO, new ItemStack(Items.BD ,1), 5);
		GameRegistry.addSmelting(Blocks.BLDO, new ItemStack(Items.BLD, 1), 5);
		GameRegistry.addSmelting(Blocks.GDO, new ItemStack(Items.GD, 1), 5);
		GameRegistry.addSmelting(Blocks.GRDO, new ItemStack(Items.GRD,1), 5);
		GameRegistry.addSmelting(Blocks.ODO, new ItemStack(Items.OD,1), 5);
		GameRegistry.addSmelting(Blocks.PDO, new ItemStack(Items.PD,1), 5);
		GameRegistry.addSmelting(Blocks.PUDO, new ItemStack(Items.PUD,1), 5);
		GameRegistry.addSmelting(Blocks.WDO, new ItemStack(Items.WD,1), 5);
		GameRegistry.addSmelting(Blocks.YDO, new ItemStack(Items.YD,1), 5);
		GameRegistry.addSmelting(Blocks.RDO, new ItemStack(Items.RD,2), 5);
	}

	@Override
	public void start() {
		addRecipes();
	}
	public void initialize()
    {
    	this.start();
    }
}
