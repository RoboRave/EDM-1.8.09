package mods.roborave.edm.tweaker.recipe;

import mods.roborave.edm.EDM;
import mods.roborave.edm.helper.recipes.SmeltOre;
import mods.roborave.edm.tweaker.register.RegistryManager;


public class RecipeManager 
{
	public static void load()
	{
		RegistryManager.registerAPIClass(RecipesBlocks.class);
		RegistryManager.registerAPIClass(SmeltOre.class);
		if(EDM.test==true)
		{
			RegistryManager.registerAPIClass(RecipeSword.class);
		}else{
			RegistryManager.registerAPIClass(RecipeEnchantments.class);
		}
	}
}
