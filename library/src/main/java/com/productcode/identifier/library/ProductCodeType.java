/*
 * Copyright (c) 2018, Deepak Goyal under Apache License.
 *     All rights reserved.
 *     Redistribution and use in source and binary forms, with or without
 *     modification, are permitted provided that the following conditions are met:
 *     - Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *
 *     - Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 */

package com.productcode.identifier.library;

public enum ProductCodeType {
    SKU("SKU"),
    EAN_8("EAN"),
    ASIN("ASIN"),
    ISBN_10("ISBN"),
    UPC("UPC"),
    EAN_13("EAN"),
    ISBN_13("ISBN"),
    NONE("NONE");

    private String realName;

    ProductCodeType(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return realName;
    }
}
