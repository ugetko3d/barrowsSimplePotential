package com.barrowssimplepotential;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BarrowsSimplePotentialTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BarrowsSimplePotentialPlugin.class);
		RuneLite.main(args);
	}
}