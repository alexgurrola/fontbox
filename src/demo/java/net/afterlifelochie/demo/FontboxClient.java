package net.afterlifelochie.demo;

import net.afterlifelochie.fontbox.Fontbox;
import net.afterlifelochie.fontbox.api.PrintOutputTracer;
import net.afterlifelochie.fontbox.font.FontException;
import net.afterlifelochie.fontbox.font.GLFont;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class FontboxClient extends FontboxServer {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		ModelLoader.setCustomModelResourceLocation(book, 0, new ModelResourceLocation(new ResourceLocation("book"), "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent e) {
		try {
			Fontbox.setTracer(new PrintOutputTracer());
			GLFont.fromTTF(Fontbox.tracer(), 22.0f, new ResourceLocation("fontbox", "fonts/daniel.ttf"));
			GLFont.fromTTF(Fontbox.tracer(), 22.0f, new ResourceLocation("fontbox", "fonts/notethis.ttf"));
			GLFont.fromTTF(Fontbox.tracer(), 22.0f, new ResourceLocation("fontbox", "fonts/ampersand.ttf"));
		} catch (FontException f0) {
			f0.printStackTrace();
		}
	}

}
