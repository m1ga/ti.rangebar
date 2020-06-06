/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2019 by Axway, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 * Warning: This file is GENERATED, and should not be modified
 */
package ti.rangebar;

import org.appcelerator.kroll.common.KrollSourceCodeProvider;
import org.appcelerator.kroll.util.KrollAssetHelper;

public class CommonJsSourceProvider implements KrollSourceCodeProvider
{
	public String getSourceCode()
	{
		return getSourceCode("ti.rangebar");
	}

	public String getSourceCode(String module)
	{
		if (module.equals("${moduleid}/ti.rangebar")) {
			module = "ti.rangebar";
		}

		return KrollAssetHelper.readAsset("Resources/ti.rangebar/" + module + ".js");
	}
}
