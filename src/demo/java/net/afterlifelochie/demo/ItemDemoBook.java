package net.afterlifelochie.demo;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDemoBook extends Item {

	public ItemDemoBook() {
		super();
		setRegistryName("demo-book");
		setCreativeTab(CreativeTabs.MISC);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand)
	{
		if (world.isRemote)
			Minecraft.getMinecraft().displayGuiScreen(new GuiDemoBook());
		return ActionResult.newResult(EnumActionResult.SUCCESS, player.getHeldItem(hand));
	}

}
