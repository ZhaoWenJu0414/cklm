package com.cklm.com.cklm.util;

import org.hibernate.cfg.ImprovedNamingStrategy;
import org.hibernate.cfg.NamingStrategy;
import org.hibernate.internal.util.StringHelper;

import java.io.Serializable;

public class MoShopImprovedNamingStrategy extends ImprovedNamingStrategy
        implements NamingStrategy, Serializable {

    private static final long serialVersionUID = 3088474161734101900L;

    public String propertyToColumnName(String propertyName) {
        if (propertyName.endsWith("__")) {
            return propertyName.replace("__", "").toLowerCase();
        }
        return addUnderscores(StringHelper.unqualify(propertyName));
    }
}
