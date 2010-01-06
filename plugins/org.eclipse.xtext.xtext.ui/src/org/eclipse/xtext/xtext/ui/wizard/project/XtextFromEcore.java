/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.ui.wizard.project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.ENamedElement;

/**
 * @author koehnlein - Initial contribution and API
 */
public class XtextFromEcore {

	private static Map<ENamedElement, String> element2uniqueName = new HashMap<ENamedElement, String>();

	private static final List<String> RESERVED_RULES = Arrays.asList(new String[] { "ml_comment", "id", "ws", "int",
			"string", "any_other", "sl_comment" });

	private static final List<String> RESERVED_KEYWORDS = Arrays.asList(new String[] { "returns", "generate",
			"terminal", "with", "hidden", "enum", "grammar", "import", "as", "current" });

	public static String uniqueName(ENamedElement element) {
		String uniqueName = element2uniqueName.get(element);
		if (uniqueName != null) {
			return uniqueName;
		}
		String trueName = element.getName();
		uniqueName = trueName;
		for (int i = 0; RESERVED_KEYWORDS.contains(uniqueName) 
				|| RESERVED_RULES.contains(uniqueName.toLowerCase())
				|| element2uniqueName.containsValue(uniqueName); ++i) {
			uniqueName = trueName + i;
		}
		element2uniqueName.put(element, uniqueName);
		return uniqueName;
	}

	public static void clearUniqueNames() {
		element2uniqueName.clear();
	}

}
