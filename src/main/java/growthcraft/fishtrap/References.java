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

package growthcraft.fishtrap;

public class References {
    public static final String MODID = "growthcraft_fishtrap";
    public static final String NAME = "Growthcraft Fishtrap";

    public static final String CLIENT_PROXY_CLASS = "growthcraft.fishtrap.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "growthcraft.fishtrap.proxy.ServerProxy";

    public static enum GrowthCraftFishtrapBlocks {
        FISHTRAP_BLOCK("fishtrap", "BlockFishtrap");

        private String unlocalizedName;
        private String registryName;

        GrowthCraftFishtrapBlocks(String unlocalizedName, String registryName) {
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
