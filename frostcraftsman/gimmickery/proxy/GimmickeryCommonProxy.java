package net.frostcraftsman.gimmickery.proxy;

import cpw.mods.fml.common.registry.LanguageRegistry;


/**
* 加载代理（Server端）
*/
public class GimmickeryCommonProxy {

	/**
	 * 执行第1阶段的加载行为。
	 */
	public void preInit() {
	    	
	}
	    
	/**
	 * 执行第2阶段的加载行为。
	 */
	public void init() {
		LanguageRegistry.instance().addStringLocalization("itemGroup.Gimmickery", "机巧"); //创造模式栏的名称
		LanguageRegistry.instance().addStringLocalization("entity.WoodKarakuriNingy.name","木质人偶");
		LanguageRegistry.instance().addStringLocalization("entity.KarakuriNingy.name","人偶初版");
		LanguageRegistry.instance().addStringLocalization("entity.PrinnyBlue.name","蓝色普利尼");
	}
	    
	/**
	 * 执行第3阶段的加载行为。
	 */
	public void postInit() {
		
	}
	
	 public void registerRenderThings() {
     }
     
     public void registerSound() {
     }

}

