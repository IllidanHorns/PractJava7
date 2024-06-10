package net.pakhtusov.magicmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MAGIC_TAB = new CreativeModeTab("Magic Tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BLUEAPPLE.get());
        }
    };
}
