package br.firewandcoffee;

import net.fabricmc.api.ModInitializer;

/**
 * Entry point only. The actual fire and coffee gameplay is not implemented
 * in this repository revision. Do not publish as a playable mod.
 */
public class FireWandCoffee implements ModInitializer {
    public static final String MOD_ID = "firewandcoffee";

    @Override
    public void onInitialize() {
        System.out.println("[Fire Wand Powers + Coffee Mod] Experimental project loaded.");
    }
}
