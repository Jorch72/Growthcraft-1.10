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

package growthcraft.core;

public class References {

    public static final String MODID = "growthcraft";
    public static final String NAME = "Growthcraft";

    // Growthcraft.ALL Minecraft and GC Version Reference
    public static final String MCVERSION = "[1.10.2]";
    public static final String VERSION = "4.0.0-alpha";

    public static final String CLIENT_PROXY_CLASS = "growthcraft.core.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "growthcraft.core.proxy.ServerProxy";

    public static enum GrowthCraftCoreItems {
        SALT("salt", "ItemSalt"),
        ROPE("rope", "ItemRope");

        private String unlocalizedName;
        private String registryName;

        GrowthCraftCoreItems(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }

        public String getRegistryName() {
            return this.registryName;
        }
    }

    // Encapsulates the Block unlocalized and registry names
    public static enum GrowthCraftCoreBlocks {
        SALT_BLOCK("salt_block", "BlockSalt");

        private String unlocalizedName;
        private String registryName;

        GrowthCraftCoreBlocks(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName() {
            return this.unlocalizedName;
        }

        public String getRegistryName() {
            return this.registryName;
        }
    }


}
