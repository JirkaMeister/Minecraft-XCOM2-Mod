package net.jirkameister.xcom2mod.item;

import net.jirkameister.xcom2mod.Xcom2Mod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Xcom2Mod.MOD_ID);

    public static final RegistryObject<Item> ALIEN_ALLOYS = ITEMS.register("alien_alloys",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XCOM2_TAB)));
    public static final RegistryObject<Item> ELERIUM_CRYSTALS = ITEMS.register("elerium_crystals",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.XCOM2_TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
