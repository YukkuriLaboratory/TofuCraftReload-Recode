package baguchan.tofucraft.client.render.entity.effect;

import baguchan.tofucraft.entity.effect.NattoCobWebEntity;
import baguchan.tofucraft.registry.TofuItems;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


@OnlyIn(Dist.CLIENT)
public class NattoCobWebRender extends EntityRenderer<NattoCobWebEntity> {
	private final ItemRenderer itemRenderer;

	public NattoCobWebRender(EntityRendererProvider.Context context) {
		super(context);

		this.itemRenderer = context.getItemRenderer();
	}

	@Override
	public void render(NattoCobWebEntity entity, float yaw, float delta, PoseStack stack, MultiBufferSource buffer, int packedLightIn) {
		boolean isSpawing = entity.isSpawing();
		if (isSpawing) {
			stack.pushPose();
			stack.scale(5.5F, 6.0F, 5.5F);
			stack.translate(0.0F, 0.0F, -0.125F);
			stack.mulPose(Vector3f.XP.rotationDegrees(90.0F));

			ItemStack itemStack = new ItemStack(TofuItems.NATTO_COBWEB.get());
			BakedModel bakedmodel = this.itemRenderer.getModel(itemStack, entity.level, (LivingEntity) null, entity.getId());

			this.itemRenderer.render(itemStack, ItemTransforms.TransformType.GROUND, false, stack, buffer, packedLightIn, OverlayTexture.NO_OVERLAY, bakedmodel);
			stack.popPose();
		} else {
			stack.pushPose();
			stack.scale(6.0F, 6.0F, 6.0F);
			stack.translate(0.0F, 0.0F, -0.125F);
			stack.mulPose(Vector3f.XP.rotationDegrees(90.0F));


			ItemStack itemStack = new ItemStack(TofuItems.NATTO_COBWEB.get());
			BakedModel bakedmodel = this.itemRenderer.getModel(itemStack, entity.level, (LivingEntity) null, entity.getId());

			this.itemRenderer.render(itemStack, ItemTransforms.TransformType.GROUND, false, stack, buffer, packedLightIn, OverlayTexture.NO_OVERLAY, bakedmodel);
			stack.popPose();
		}
		super.render(entity, yaw, delta, stack, buffer, packedLightIn);
	}

	public ResourceLocation getTextureLocation(NattoCobWebEntity p_116083_) {
		return TextureAtlas.LOCATION_BLOCKS;
	}
}
