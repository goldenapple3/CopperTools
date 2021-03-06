package com.goldenapple.coppertools.item.special;

import com.goldenapple.coppertools.init.EquipMaterial;
import com.goldenapple.coppertools.item.ItemSickleCommon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemSickleSteeleaf extends ItemSickleCommon {
    public static EquipMaterial material = new EquipMaterial("steeleaf", "steeleaf", EquipMaterial.STEELEAF_MATERIAL, null, null, null, false, false, true);

    public ItemSickleSteeleaf(){
        super(material);
        this.setHasSubtypes(true);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        ItemStack itemStack = new ItemStack(item);
        itemStack.addEnchantment(Enchantment.unbreaking, 2);
        list.add(itemStack);
    }
}
