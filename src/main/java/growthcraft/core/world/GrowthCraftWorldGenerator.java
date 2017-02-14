/*
 * MIT License
 *
 * Copyright (c) 2017 Alatyami
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package growthcraft.core.world;

import growthcraft.core.init.Blocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class GrowthCraftWorldGenerator implements IWorldGenerator {

    //@formatter:off
    private WorldGenerator GEN_SALT_BLOCK;
    //@formatter:on

    public GrowthCraftWorldGenerator() {
        GEN_SALT_BLOCK = new WorldGenMinable(Blocks.SALT_BLOCK.getDefaultState(), 6, BlockMatcher.forBlock(net.minecraft.init.Blocks.STONE));
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()) {
            case 0: // Overworld
                runGenerator(GEN_SALT_BLOCK, world, random, chunkX, chunkZ, 16, 30, 128);
                break;
            case -1: // Nether
                break;
            case 1: // TheEnd
                break;
            default: // Any Custom Dimensions
                break;
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chancesToSpawn, int minHeight, int maxHeight) {
        if ( minHeight < 0 || maxHeight > 256 || minHeight > maxHeight ) {
            throw new IllegalArgumentException("Illegal height!");
        }

        int heightDiff = maxHeight - minHeight + 1;

        for ( int i = 0; i < chancesToSpawn; i++ ) {
            int x = chunkX * 16 + random.nextInt(16);
            int y = minHeight + random.nextInt(heightDiff);
            int z = chunkZ * 16 + random.nextInt(16);
            generator.generate(world, random, new BlockPos(x, y, z));
        }
    }
}
