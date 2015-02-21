package fantasykingdoms.common.blocks;

import java.util.Random;

import net.minecraft.item.Item;

import fantasykingdoms.common.init.InitBlocks;
import fantasykingdoms.common.init.InitItems;

/**
 * Created by Toby on 19/02/2015.
 */
public class blockRubyOre extends BlockGemstoneOre
{
    public blockRubyOre()
    {
        super();
        this.setBlockName("RubyOre");
        this.canSilkHarvest();
    }

    public Item getItemDropped(int i, Random random, int j)
    {
        return this == InitBlocks.RubyOre ? InitItems.itemRuby : Item.getItemFromBlock(this);
    }
}
