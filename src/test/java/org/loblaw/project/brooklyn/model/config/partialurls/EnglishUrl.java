package org.loblaw.project.brooklyn.model.config.partialurls;

import java.util.HashMap;

public class EnglishUrl {

	HashMap partialUrls = new HashMap();

	public void partialUrls() {
		partialUrls.put("account_points", "/account");
		partialUrls.put("account_cards", "/account/cards");
		partialUrls.put("account_household", "/account/household");
		partialUrls.put("account_settings", "/account/settings");
		partialUrls.put("registration", "/register");
		partialUrls.put("communication_opt_in", "/communication-opt-in");
		partialUrls.put("offers", "/offers");
		partialUrls.put("login", "/login");

	}

}
