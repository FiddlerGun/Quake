package com.Geekpower14.Quake.Stuff.Hoe;

import com.Geekpower14.Quake.Arena.APlayer;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class PotatoHoe extends HoeBasic{

	public PotatoHoe()
	{
		super("potatohoe",
				ChatColor.BLUE + "PatatoGun",
				1L,
				FireworkEffect.builder().withColor(Color.WHITE).with(FireworkEffect.Type.STAR).build());
        //this.aim = 2;
	}

	public ItemStack getItem() {
		ItemStack coucou = setItemNameAndLore(new ItemStack(Material.POTATO_ITEM), ChatColor.BLUE + "FritoGun", new String[]{
			ChatColor.DARK_GRAY + "Recharge en " + ChatColor.GOLD +"0.1" + ChatColor.DARK_GRAY + " secondes.",
			ChatColor.DARK_GRAY + "Précision cheaté à " + ChatColor.GOLD +"2" + ChatColor.DARK_GRAY +" blocks.",
			ChatColor.RED + "Geekpower14's friends only !"
		}, true);

		return coucou;
	}

	public void leftAction(APlayer p) {
		return;		
	}

	public void rightAction(APlayer ap) {
		basicShot(ap.getP());		
	}

}
