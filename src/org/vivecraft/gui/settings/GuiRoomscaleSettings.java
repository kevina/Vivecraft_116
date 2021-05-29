package org.vivecraft.gui.settings;

import org.vivecraft.gui.framework.GuiVROptionsBase;
import org.vivecraft.settings.VRSettings;

import net.minecraft.client.gui.screen.Screen;

public class GuiRoomscaleSettings extends GuiVROptionsBase
{
	static VRSettings.VrOptions[] roomscaleSettings = new VRSettings.VrOptions[]
			{
					VRSettings.VrOptions.WEAPON_COLLISION,
					VRSettings.VrOptions.REALISTIC_JUMP,
					VRSettings.VrOptions.REALISTIC_SNEAK,
					VRSettings.VrOptions.REALISTIC_CLIMB,
					VRSettings.VrOptions.REALISTIC_ROW,
					VRSettings.VrOptions.REALISTIC_SWIM,
					VRSettings.VrOptions.BOW_MODE,
					VRSettings.VrOptions.BACKPACK_SWITCH,
					VRSettings.VrOptions.ALLOW_CRAWLING,
					//VRSettings.VrOptions.PHYSICAL_GUI
			};

	public GuiRoomscaleSettings(Screen guiScreen) {
		super( guiScreen );
	}

	@Override
	public void init()
	{ 	
		vrTitle = "vivecraft.options.screen.roomscale";
		super.init(roomscaleSettings, true);
		super.addDefaultButtons();
	}

	@Override
	protected void loadDefaults() {
		this.settings.weaponCollision = VRSettings.WC_SURVIVAL;
		this.settings.realisticClimbEnabled = true;
		this.settings.realisticJumpEnabled = true;
		this.settings.realisticSneakEnabled = true;
		this.settings.realisticSwimEnabled = true;
		this.settings.realisticRowEnabled = true;
		this.settings.backpackSwitching = true;
		this.settings.vrAllowCrawling = true;
	}
}
