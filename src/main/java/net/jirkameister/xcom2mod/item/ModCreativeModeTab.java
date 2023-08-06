package net.jirkameister.xcom2mod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab XCOM2_TAB = new CreativeModeTab("xcom2tab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.ELERIUM_CRYSTALS.get());
        }
    };
}
