package net.afterlifelochie.demo;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FontboxServer {

	public ItemDemoBook book;

	public void preInit(FMLPreInitializationEvent e) {
		book = new ItemDemoBook();
		GameRegistry.register(book);
	}

	public void init(FMLInitializationEvent e) {
	}

}
