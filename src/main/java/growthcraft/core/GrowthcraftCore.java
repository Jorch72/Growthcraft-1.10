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

import growthcraft.core.init.Blocks;
import growthcraft.core.init.CreativeTab;
import growthcraft.core.init.Items;
import growthcraft.core.proxy.CommonProxy;
import growthcraft.core.world.GrowthCraftWorldGenerator;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(name = References.NAME, version = References.VERSION, modid = References.MODID, acceptedMinecraftVersions = References.MCVERSION)
public class GrowthCraftCore {

    @Mod.Instance
    public static GrowthCraftCore instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.Instance
    public static GrowthCraftCore modInstance;

    // Establish the Creative Tab that wil be used for all Growthcraft Mods.
    public static CreativeTab tabGrowthcraft = new CreativeTab(CreativeTabs.getNextID(), "tabGrowthcraft");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Items.init();
        Blocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
        GameRegistry.registerWorldGenerator(new GrowthCraftWorldGenerator(), 0);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
