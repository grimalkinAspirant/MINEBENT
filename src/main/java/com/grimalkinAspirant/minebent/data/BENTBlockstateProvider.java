package com.grimalkinAspirant.minebent.data;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.grimalkinAspirant.minebent.items.MINEBENTBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.*;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Supplier;

import static net.minecraft.client.gui.components.ImageWidget.texture;

public class BENTBlockstateProvider extends BlockStateProvider {
    public BENTBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MINEBENT.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {

        simpleBlock(MINEBENTBlocks.RUBY_BLOCK.get());
        simpleBlock(MINEBENTBlocks.FELTSTONE.get());
//      simpleBlock(MINEBENTBlocks.CARNIVAL_GROUND.get());

        simpleBlock(MINEBENTBlocks.COBBLED_TROLLSTONE.get());
        stairsWithItem(MINEBENTBlocks.COBBLED_TROLLSTONE_STAIRS, MINEBENTBlocks.COBBLED_TROLLSTONE);
        slabWithItem(MINEBENTBlocks.COBBLED_TROLLSTONE_SLAB, MINEBENTBlocks.COBBLED_TROLLSTONE);
        wallWithItem(MINEBENTBlocks.COBBLED_TROLLSTONE_WALL, MINEBENTBlocks.COBBLED_TROLLSTONE);

        simpleBlock(MINEBENTBlocks.TROLLSTONE.get());
        stairsWithItem(MINEBENTBlocks.TROLLSTONE_STAIRS, MINEBENTBlocks.TROLLSTONE);
        slabWithItem(MINEBENTBlocks.TROLLSTONE_SLAB, MINEBENTBlocks.TROLLSTONE);
        buttonWithItem(MINEBENTBlocks.TROLLSTONE_BUTTON, MINEBENTBlocks.TROLLSTONE);
        pressurePlateWithItem(MINEBENTBlocks.TROLLSTONE_PRESSURE_PLATE, MINEBENTBlocks.TROLLSTONE);

        simpleBlock(MINEBENTBlocks.TROLLSTONE_BRICKS.get());
        stairsWithItem(MINEBENTBlocks.TROLLSTONE_BRICK_STAIRS, MINEBENTBlocks.TROLLSTONE_BRICKS);
        slabWithItem(MINEBENTBlocks.TROLLSTONE_BRICK_SLAB, MINEBENTBlocks.TROLLSTONE_BRICKS);
        wallWithItem(MINEBENTBlocks.TROLLSTONE_BRICK_WALL, MINEBENTBlocks.TROLLSTONE_BRICKS);

        simpleBlock(MINEBENTBlocks.CRACKED_TROLLSTONE_BRICKS.get());
        simpleBlock(MINEBENTBlocks.CHISELED_TROLLSTONE_BRICKS.get());
        simpleBlock(MINEBENTBlocks.MOSSY_COBBLED_TROLLSTONE.get());
        simpleBlock(MINEBENTBlocks.MOSSY_TROLLSTONE_BRICKS.get());

        logBlock(MINEBENTBlocks.TROLLSLATE.get());
        stairsWithItem(MINEBENTBlocks.TROLLSLATE_STAIRS, MINEBENTBlocks.TROLLSLATE);
        slabWithItem(MINEBENTBlocks.TROLLSLATE_SLAB, MINEBENTBlocks.TROLLSLATE);
        buttonWithItem(MINEBENTBlocks.TROLLSLATE_BUTTON, MINEBENTBlocks.TROLLSLATE);
        pressurePlateWithItem(MINEBENTBlocks.TROLLSLATE_PRESSURE_PLATE, MINEBENTBlocks.TROLLSLATE);

        simpleBlock(MINEBENTBlocks.POLISHED_TROLLSLATE.get());
        stairsWithItem(MINEBENTBlocks.POLISHED_TROLLSLATE_STAIRS, MINEBENTBlocks.POLISHED_TROLLSLATE);
        slabWithItem(MINEBENTBlocks.POLISHED_TROLLSLATE_SLAB, MINEBENTBlocks.POLISHED_TROLLSLATE);
        wallWithItem(MINEBENTBlocks.POLISHED_TROLLSLATE_WALL, MINEBENTBlocks.POLISHED_TROLLSLATE);

        simpleBlock(MINEBENTBlocks.COBBLED_TROLLSLATE.get());
        stairsWithItem(MINEBENTBlocks.COBBLED_TROLLSLATE_STAIRS, MINEBENTBlocks.COBBLED_TROLLSLATE);
        slabWithItem(MINEBENTBlocks.COBBLED_TROLLSLATE_SLAB, MINEBENTBlocks.COBBLED_TROLLSLATE);
        wallWithItem(MINEBENTBlocks.COBBLED_TROLLSLATE_WALL, MINEBENTBlocks.COBBLED_TROLLSLATE);

        simpleBlock(MINEBENTBlocks.TROLLSLATE_BRICKS.get());
        stairsWithItem(MINEBENTBlocks.TROLLSLATE_BRICK_STAIRS, MINEBENTBlocks.TROLLSLATE_BRICKS);
        slabWithItem(MINEBENTBlocks.TROLLSLATE_BRICK_SLAB, MINEBENTBlocks.TROLLSLATE_BRICKS);
        wallWithItem(MINEBENTBlocks.TROLLSLATE_BRICK_WALL, MINEBENTBlocks.TROLLSLATE_BRICKS);

        simpleBlock(MINEBENTBlocks.TROLLSLATE_TILES.get());
        stairsWithItem(MINEBENTBlocks.TROLLSLATE_TILE_STAIRS, MINEBENTBlocks.TROLLSLATE_TILES);
        slabWithItem(MINEBENTBlocks.TROLLSLATE_TILE_SLAB, MINEBENTBlocks.TROLLSLATE_TILES);
        wallWithItem(MINEBENTBlocks.TROLLSLATE_TILE_WALL, MINEBENTBlocks.TROLLSLATE_TILES);

        simpleBlock(MINEBENTBlocks.CRACKED_TROLLSLATE_BRICKS.get());
        simpleBlock(MINEBENTBlocks.CRACKED_TROLLSLATE_TILES.get());
        simpleBlock(MINEBENTBlocks.CHISELED_TROLLSLATE.get());

        simpleBlock(MINEBENTBlocks.BROODSTONE.get());
        stairsWithItem(MINEBENTBlocks.BROODSTONE_STAIRS, MINEBENTBlocks.BROODSTONE);
        slabWithItem(MINEBENTBlocks.BROODSTONE_SLAB, MINEBENTBlocks.BROODSTONE);
        wallWithItem(MINEBENTBlocks.BROODSTONE_WALL, MINEBENTBlocks.BROODSTONE);

        simpleBlock(MINEBENTBlocks.BROODSTONE_BRICKS.get());
        stairsWithItem(MINEBENTBlocks.BROODSTONE_BRICK_STAIRS, MINEBENTBlocks.BROODSTONE_BRICKS);
        slabWithItem(MINEBENTBlocks.BROODSTONE_BRICK_SLAB, MINEBENTBlocks.BROODSTONE_BRICKS);
        wallWithItem(MINEBENTBlocks.BROODSTONE_BRICK_WALL, MINEBENTBlocks.BROODSTONE_BRICKS);

        simpleBlock(MINEBENTBlocks.FLUSHDESITE.get());
        stairsWithItem(MINEBENTBlocks.FLUSHDESITE_STAIRS, MINEBENTBlocks.FLUSHDESITE);
        slabWithItem(MINEBENTBlocks.FLUSHDESITE_SLAB, MINEBENTBlocks.FLUSHDESITE);
        wallWithItem(MINEBENTBlocks.FLUSHDESITE_WALL, MINEBENTBlocks.FLUSHDESITE);

        simpleBlock(MINEBENTBlocks.POLISHED_FLUSHDESITE.get());
        stairsWithItem(MINEBENTBlocks.POLISHED_FLUSHDESITE_STAIRS, MINEBENTBlocks.POLISHED_FLUSHDESITE);
        slabWithItem(MINEBENTBlocks.POLISHED_FLUSHDESITE_SLAB, MINEBENTBlocks.POLISHED_FLUSHDESITE);

        simpleBlock(MINEBENTBlocks.PALEORITE.get());
        stairsWithItem(MINEBENTBlocks.PALEORITE_STAIRS, MINEBENTBlocks.PALEORITE);
        slabWithItem(MINEBENTBlocks.PALEORITE_SLAB, MINEBENTBlocks.PALEORITE);
        wallWithItem(MINEBENTBlocks.PALEORITE_WALL, MINEBENTBlocks.PALEORITE);

        simpleBlock(MINEBENTBlocks.POLISHED_PALEORITE.get());
        stairsWithItem(MINEBENTBlocks.POLISHED_PALEORITE_STAIRS, MINEBENTBlocks.POLISHED_PALEORITE);
        slabWithItem(MINEBENTBlocks.POLISHED_PALEORITE_SLAB, MINEBENTBlocks.POLISHED_PALEORITE);

        simpleBlock(MINEBENTBlocks.ASHENITE.get());
        stairsWithItem(MINEBENTBlocks.ASHENITE_STAIRS, MINEBENTBlocks.ASHENITE);
        slabWithItem(MINEBENTBlocks.ASHENITE_SLAB, MINEBENTBlocks.ASHENITE);
        wallWithItem(MINEBENTBlocks.ASHENITE_WALL, MINEBENTBlocks.ASHENITE);

        simpleBlock(MINEBENTBlocks.POLISHED_ASHENITE.get());
        stairsWithItem(MINEBENTBlocks.POLISHED_ASHENITE_STAIRS, MINEBENTBlocks.POLISHED_ASHENITE);
        slabWithItem(MINEBENTBlocks.POLISHED_ASHENITE_SLAB, MINEBENTBlocks.POLISHED_ASHENITE);

        simpleBlock(MINEBENTBlocks.RED_STONE.get());
        wallWithItem(MINEBENTBlocks.RED_STONE_WALL, MINEBENTBlocks.RED_STONE);
        buttonWithItem(MINEBENTBlocks.RED_STONE_BUTTON, MINEBENTBlocks.RED_STONE);
        pressurePlateWithItem(MINEBENTBlocks.RED_STONE_PRESSURE_PLATE, MINEBENTBlocks.RED_STONE);

        simpleBlock(MINEBENTBlocks.POLISHED_RED_STONE.get());
        stairsWithItem(MINEBENTBlocks.POLISHED_RED_STONE_STAIRS, MINEBENTBlocks.POLISHED_RED_STONE);
        slabWithItem(MINEBENTBlocks.POLISHED_RED_STONE_SLAB, MINEBENTBlocks.POLISHED_RED_STONE);
        wallWithItem(MINEBENTBlocks.POLISHED_RED_STONE_WALL, MINEBENTBlocks.POLISHED_RED_STONE);

        simpleBlock(MINEBENTBlocks.RED_STONE_BRICKS.get());
        wallWithItem(MINEBENTBlocks.RED_STONE_BRICK_WALL, MINEBENTBlocks.RED_STONE_BRICKS);

        logBlock(MINEBENTBlocks.RED_STONE_COLUMN.get());
        simpleBlock(MINEBENTBlocks.CHISELED_RED_STONE_BRICKS.get());

        simpleBlock(MINEBENTBlocks.HORIZONTAL_RED_STONE_BRICKS.get());
        stairsWithItem(MINEBENTBlocks.HORIZONTAL_RED_STONE_BRICK_STAIRS, MINEBENTBlocks.HORIZONTAL_RED_STONE_BRICKS);
        slabWithItem(MINEBENTBlocks.HORIZONTAL_RED_STONE_BRICK_SLAB, MINEBENTBlocks.HORIZONTAL_RED_STONE_BRICKS);
        wallWithItem(MINEBENTBlocks.HORIZONTAL_RED_STONE_BRICK_WALL, MINEBENTBlocks.HORIZONTAL_RED_STONE_BRICKS);

        simpleBlock(MINEBENTBlocks.VERTICAL_RED_STONE_BRICKS.get());
        stairsWithItem(MINEBENTBlocks.VERTICAL_RED_STONE_BRICK_STAIRS, MINEBENTBlocks.VERTICAL_RED_STONE_BRICKS);
        slabWithItem(MINEBENTBlocks.VERTICAL_RED_STONE_BRICK_SLAB, MINEBENTBlocks.VERTICAL_RED_STONE_BRICKS);
        wallWithItem(MINEBENTBlocks.VERTICAL_RED_STONE_BRICK_WALL, MINEBENTBlocks.VERTICAL_RED_STONE_BRICKS);

//        simpleHorizontalWithItem(MINEBENTBlocks.RED_STONE_BRICK_EMBEDDED_LADDER,
//                id -> models().getExistingFile(id));
//        trimWithItem(MINEBENTBlocks.RED_STONE_BRICK_TRIM,
//                id -> models().cubeColumn(
//                        id.getPath(),
//                        texture(id),
//                        texture("red_stone_bricks")),
//                id -> models().cubeColumn(
//                        id.withSuffix("_flipped").getPath(),
//                        texture(id.withSuffix("_flipped")),
//                        texture("red_stone_bricks")));

        simpleBlock(MINEBENTBlocks.RED_STONE_BRICK_FROG.get());
        simpleBlock(MINEBENTBlocks.RED_STONE_BRICK_IGUANA_LEFT.get());
        simpleBlock(MINEBENTBlocks.RED_STONE_BRICK_IGUANA_RIGHT.get());
        simpleBlock(MINEBENTBlocks.RED_STONE_BRICK_LOTUS.get());
        simpleBlock(MINEBENTBlocks.RED_STONE_BRICK_NAK_LEFT.get());
        simpleBlock(MINEBENTBlocks.RED_STONE_BRICK_NAK_RIGHT.get());
        simpleBlock(MINEBENTBlocks.RED_STONE_BRICK_SALAMANDER_LEFT.get());
        simpleBlock(MINEBENTBlocks.RED_STONE_BRICK_SALAMANDER_RIGHT.get());
        simpleBlock(MINEBENTBlocks.RED_STONE_BRICK_SKAIA.get());
        simpleBlock(MINEBENTBlocks.RED_STONE_BRICK_TURTLE.get());

        simpleBlock(MINEBENTBlocks.BLUE_STONE.get());
        wallWithItem(MINEBENTBlocks.BLUE_STONE_WALL, MINEBENTBlocks.BLUE_STONE);
        buttonWithItem(MINEBENTBlocks.BLUE_STONE_BUTTON, MINEBENTBlocks.BLUE_STONE);
        pressurePlateWithItem(MINEBENTBlocks.BLUE_STONE_PRESSURE_PLATE, MINEBENTBlocks.BLUE_STONE);

        simpleBlock(MINEBENTBlocks.POLISHED_BLUE_STONE.get());
        stairsWithItem(MINEBENTBlocks.POLISHED_BLUE_STONE_STAIRS, MINEBENTBlocks.POLISHED_BLUE_STONE);
        slabWithItem(MINEBENTBlocks.POLISHED_BLUE_STONE_SLAB, MINEBENTBlocks.POLISHED_BLUE_STONE);
        wallWithItem(MINEBENTBlocks.POLISHED_BLUE_STONE_WALL, MINEBENTBlocks.POLISHED_BLUE_STONE);

        simpleBlock(MINEBENTBlocks.BLUE_STONE_BRICKS.get());
        wallWithItem(MINEBENTBlocks.BLUE_STONE_BRICK_WALL, MINEBENTBlocks.BLUE_STONE_BRICKS);

        logBlock(MINEBENTBlocks.BLUE_STONE_COLUMN.get());
        simpleBlock(MINEBENTBlocks.CHISELED_BLUE_STONE_BRICKS.get());

        simpleBlock(MINEBENTBlocks.HORIZONTAL_BLUE_STONE_BRICKS.get());
        stairsWithItem(MINEBENTBlocks.HORIZONTAL_BLUE_STONE_BRICK_STAIRS, MINEBENTBlocks.HORIZONTAL_BLUE_STONE_BRICKS);
        slabWithItem(MINEBENTBlocks.HORIZONTAL_BLUE_STONE_BRICK_SLAB, MINEBENTBlocks.HORIZONTAL_BLUE_STONE_BRICKS);
        wallWithItem(MINEBENTBlocks.HORIZONTAL_BLUE_STONE_BRICK_WALL, MINEBENTBlocks.HORIZONTAL_BLUE_STONE_BRICKS);

        simpleBlock(MINEBENTBlocks.VERTICAL_BLUE_STONE_BRICKS.get());
        stairsWithItem(MINEBENTBlocks.VERTICAL_BLUE_STONE_BRICK_STAIRS, MINEBENTBlocks.VERTICAL_BLUE_STONE_BRICKS);
        slabWithItem(MINEBENTBlocks.VERTICAL_BLUE_STONE_BRICK_SLAB, MINEBENTBlocks.VERTICAL_BLUE_STONE_BRICKS);
        wallWithItem(MINEBENTBlocks.VERTICAL_BLUE_STONE_BRICK_WALL, MINEBENTBlocks.VERTICAL_BLUE_STONE_BRICKS);

//        simpleHorizontalWithItem(MINEBENTBlocks.BLUE_STONE_BRICK_EMBEDDED_LADDER,
//                id -> models().getExistingFile(id));
//        trimWithItem(MINEBENTBlocks.BLUE_STONE_BRICK_TRIM,
//                id -> models().cubeColumn(
//                        id.getPath(),
//                        texture(id),
//                        texture("blue_stone_bricks")),
//                id -> models().cubeColumn(
//                        id.withSuffix("_flipped").getPath(),
//                        texture(id.withSuffix("_flipped")),
//                        texture("blue_stone_bricks")));
        simpleBlock(MINEBENTBlocks.BLUE_STONE_BRICK_FROG.get());
        simpleBlock(MINEBENTBlocks.BLUE_STONE_BRICK_IGUANA_LEFT.get());
        simpleBlock(MINEBENTBlocks.BLUE_STONE_BRICK_IGUANA_RIGHT.get());
        simpleBlock(MINEBENTBlocks.BLUE_STONE_BRICK_LOTUS.get());
        simpleBlock(MINEBENTBlocks.BLUE_STONE_BRICK_NAK_LEFT.get());
        simpleBlock(MINEBENTBlocks.BLUE_STONE_BRICK_NAK_RIGHT.get());
        simpleBlock(MINEBENTBlocks.BLUE_STONE_BRICK_SALAMANDER_LEFT.get());
        simpleBlock(MINEBENTBlocks.BLUE_STONE_BRICK_SALAMANDER_RIGHT.get());
        simpleBlock(MINEBENTBlocks.BLUE_STONE_BRICK_SKAIA.get());
        simpleBlock(MINEBENTBlocks.BLUE_STONE_BRICK_TURTLE.get());

    }

    public void pressurePlateWithItem(Supplier<PressurePlateBlock> block, DeferredBlock<?> sourceBlock)
    {
        pressurePlateWithItem(block, sourceBlock.getId().getPath(), blockTexture(sourceBlock.get()));
    }

    public void pressurePlateWithItem(Supplier<PressurePlateBlock> block, String baseName, ResourceLocation texture)
    {
        ModelFile pressurePlateInventory = models().pressurePlate(baseName + "_pressure_plate", texture);
        pressurePlateBlock(block.get(), texture);
        simpleBlockItem(block.get(), pressurePlateInventory);
    }

    public void buttonWithItem(Supplier<ButtonBlock> block, DeferredBlock<?> sourceBlock)
    {
        buttonWithItem(block, sourceBlock.getId().getPath(), blockTexture(sourceBlock.get()));
    }

    public void buttonWithItem(Supplier<ButtonBlock> block, String baseName, ResourceLocation texture)
    {
        ModelFile buttonInventory = models().buttonInventory(baseName + "_button_inventory", texture);
        buttonBlock(block.get(), texture);
        simpleBlockItem(block.get(), buttonInventory);
    }

    public void wallWithItem(Supplier<WallBlock> block, DeferredBlock<?> sourceBlock){
        wallWithItem(block, sourceBlock.getId().getPath(), blockTexture(sourceBlock.get()));
    }

    public void wallWithItem(Supplier<WallBlock> block, String baseName, ResourceLocation texture){
        wallBlock(block.get(), texture);
        ModelFile wallInventory = models().wallInventory(baseName + "_wall_inventory", texture);
        simpleBlockItem(block.get(), wallInventory);
    }

    public void slabWithItem(Supplier<SlabBlock> block, DeferredBlock<?> sourceBlock){
        slabWithItem(block, sourceBlock.getId().getPath(), blockTexture(sourceBlock.get()));
    }

    void slabWithItem(Supplier<SlabBlock> block, String baseName, ResourceLocation texture){
        slabWithItem(block, baseName, texture, texture);
    }

    void slabWithItem(Supplier<SlabBlock> block, String baseName, ResourceLocation side, ResourceLocation topBottom){
        ModelFile slabBottom = models().slab(baseName + "_slab",side, topBottom, topBottom);
        ModelFile slabTop = models().slabTop(baseName + "_slab_top",side, topBottom, topBottom);
        ModelFile doubleSlab = models().getExistingFile(id(baseName));
        slabBlock(block.get(), slabBottom, slabTop, doubleSlab);
        simpleBlockItem(block.get(), slabBottom);
    }



    public void stairsWithItem(Supplier<StairBlock> block, DeferredBlock<?> sourceBlock){
        stairsWithItem(block, sourceBlock.getId().getPath(), blockTexture(sourceBlock.get()));
    }

    void stairsWithItem(Supplier<StairBlock> block, String baseName, ResourceLocation texture){
        stairsWithItem(block, baseName, texture, texture, texture);
    }

    private void stairsWithItem(Supplier<StairBlock> block, String baseName, ResourceLocation side, ResourceLocation bottom, ResourceLocation top){
        ModelFile stairs = models().stairs(baseName +"_stairs", side, bottom, top);
        ModelFile stairsInner = models().stairsInner(baseName +"_inner_stairs", side, bottom, top);
        ModelFile stairsOuter = models().stairsOuter(baseName +"_outer_stairs", side, bottom, top);
        stairsBlock(block.get(), stairs, stairsInner, stairsOuter);
        simpleBlockItem(block.get(), stairs);
    }

    public static ResourceLocation id(String path)
    {
        return ResourceLocation.fromNamespaceAndPath(MINEBENT.MODID, path);
    }
}
