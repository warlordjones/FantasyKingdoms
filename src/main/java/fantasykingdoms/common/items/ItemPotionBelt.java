package fantasykingdoms.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import baubles.api.BaubleType;
import baubles.api.IBauble;

public class ItemPotionBelt extends Item implements IBauble
{
	int potionid;

	public ItemPotionBelt(int potionid)
	{
		this.potionid = potionid;
		setCreativeTab(CreativeTabs.tabMisc);
	}
	@Override
	public BaubleType getBaubleType(ItemStack itemstack)
	{
		return BaubleType.BELT;
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player)
	{
		player.addPotionEffect(new PotionEffect(potionid, 0, 2, true));
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player)
	{

	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player)
	{

	}

	@Override
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player)
	{
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player)
	{
		return true;
	}

}
