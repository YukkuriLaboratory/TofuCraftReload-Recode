package baguchan.tofucraft.data;

import baguchan.tofucraft.TofuCraftReload;
import baguchan.tofucraft.registry.TofuBlocks;
import baguchan.tofucraft.registry.TofuTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagGenerator extends BlockTagsProvider {
	public BlockTagGenerator(DataGenerator generator, ExistingFileHelper exFileHelper) {
		super(generator, TofuCraftReload.MODID, exFileHelper);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void addTags() {
		tag(BlockTags.MINEABLE_WITH_SHOVEL)
				.add(TofuBlocks.KINUTOFU, TofuBlocks.MOMENTOFU, TofuBlocks.HELLTOFU, TofuBlocks.SOULTOFU);
		tag(BlockTags.MINEABLE_WITH_PICKAXE)
				.add(TofuBlocks.ISHITOFU, TofuBlocks.METALTOFU, TofuBlocks.DIAMONDTOFU
						, TofuBlocks.HELLTOFU_BRICK, TofuBlocks.HELLTOFU_SMOOTH_BRICK
						, TofuBlocks.SOULTOFU_BRICK, TofuBlocks.SOULTOFU_SMOOTH_BRICK);

		tag(BlockTags.NEEDS_STONE_TOOL)
				.add(TofuBlocks.METALTOFU);
		tag(BlockTags.NEEDS_IRON_TOOL)
				.add(TofuBlocks.DIAMONDTOFU);
		tag(BlockTags.PIGLIN_REPELLENTS).add(TofuBlocks.SOYBEAN_SOUL);

		tag(TofuTags.Blocks.SOFT_TOFU).add(TofuBlocks.KINUTOFU, TofuBlocks.MOMENTOFU, TofuBlocks.HELLTOFU, TofuBlocks.SOULTOFU);
	}
}