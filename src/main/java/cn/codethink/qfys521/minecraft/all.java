package cn.codethink.qfys521.minecraft;


import cn.codethink.qfys521.minecraft.Biomes.Biomes;
import cn.codethink.qfys521.minecraft.Blocks.Blocks;
import cn.codethink.qfys521.minecraft.Blocks.Liquid;
import cn.codethink.qfys521.minecraft.Effects.Effects;
import cn.codethink.qfys521.minecraft.Enchantments.Enchantments;
import cn.codethink.qfys521.minecraft.Entitys.Entitys;
import cn.codethink.qfys521.minecraft.Entitys.Items;

public class all {


    public String getInformaction(String Name) {
        Biomes biomes = new Biomes();
        Blocks blocks = new Blocks();
        Liquid liquid = new Liquid();
        Effects effects = new Effects();
        Enchantments enchantments = new Enchantments();
        Entitys entitys = new Entitys();
        Items items = new Items();
        String returnName = null;
            if (blocks.getBlockName(Name) != null) {
            returnName = blocks.getBlockName(Name);
        } else
            if (blocks.getBlockChineseName(Name) != null) {
            returnName = blocks.getBlockChineseName(Name);
        } else
            if (liquid.getLiquidName(Name) != null) {
            returnName = liquid.getLiquidName(Name);
        } else
            if (liquid.getLiquidChineseName(Name) != null) {
            returnName = liquid.getLiquidChineseName(Name);
        } else
            if (effects.getEffectName(Name) != null) {
            returnName = effects.getEffectName(Name);
        } else
            if (effects.getEffectChineseName(Name) != null) {
            returnName = effects.getEffectChineseName(Name);
        } else
            if (enchantments.getEnchantmentName(Name) != null) {
            returnName = enchantments.getEnchantmentName(Name);
        } else
            if (enchantments.getEnchantmentChineseName(Name) != null) {
            returnName = enchantments.getEnchantmentChineseName(Name);
        } else
            if (entitys.getEntityName(Name) != null) {
            returnName = entitys.getEntityName(Name);
        } else
            if (entitys.getEntityChineseName(Name) != null) {
            returnName = entitys.getEntityChineseName(Name);
        } else
            if (items.getItemName(Name) != null) {
            returnName = items.getItemName(Name);
        } else
            if (items.getItemChineseName(Name) != null) {
            returnName = items.getItemChineseName(Name);
        } else
            if (biomes.getBiomeChineseName(Name) != null) {
            returnName = biomes.getBiomeChineseName(Name);
        } else {
            returnName = biomes.getBiomeName(Name);
        }
        return returnName;
    }
}