package mods.roborave.edm.items.tools;

import net.minecraft.item.ItemSpade;

public class ItemSpadeMain extends ItemSpade{

	public String Name;

	public ItemSpadeMain(ToolMaterial p_i45353_1_, String par1Str) {
		super(p_i45353_1_);
		this.Name=par1Str;
		this.setUnlocalizedName(par1Str);
	}

	public String getName()
	{
		return Name;
		
	}
}
