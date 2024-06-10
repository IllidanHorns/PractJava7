package net.pakhtusov.magicmod.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pakhtusov.magicmod.MagicMod;
import net.pakhtusov.magicmod.item.custom.MagicSword;
import net.minecraft.world.item.SwordItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MagicMod.MOD_ID);

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> BLUEAPPLE = ITEMS.register("blueapple",
            () -> new Item(new Item.Properties()
                    .food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.7f)
                            .build()).tab(ModCreativeModeTab.MAGIC_TAB)));

    public static final RegistryObject<Item> POWERRING = ITEMS.register("powerring",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> SANTACLAUS = ITEMS.register("santaclauslollipop",
            () -> new Item(new Item.Properties()
                    .food((new FoodProperties.Builder()).nutrition(9).fast().alwaysEat().saturationMod(0.08f)
                            .build()).tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> SWORD = ITEMS.register("jumpsword",
            () -> new MagicSword(Tiers.NETHERITE, 1, 1f,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

/*    public static final RegistryObject<Item> MAGIC = ITEMS.register("blueapple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGIC_TAB)));*/
}
