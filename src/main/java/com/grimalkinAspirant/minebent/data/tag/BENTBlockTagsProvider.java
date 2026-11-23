package com.grimalkinAspirant.minebent.data.tag;

import com.grimalkinAspirant.minebent.MINEBENT;
import com.mraof.minestuck.block.AspectTreeBlocks;
import com.mraof.minestuck.block.MSBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;
import java.util.concurrent.CompletableFuture;

public class BENTBlockTagsProvider extends BlockTagsProvider {
    public BENTBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                 @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MINEBENT.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(@Nonnull HolderLookup.Provider provider) {

    }
}
