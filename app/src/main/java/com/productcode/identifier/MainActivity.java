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

package com.productcode.identifier;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.productcode.identifier.library.ProductCodeType;
import com.productcode.identifier.library.ProductCodeValidator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the code type
        System.out.println(">>>>>>" + ProductCodeValidator.getCodeType("V4C3D5R2")); // SKU
        System.out.println(">>>>>>" + ProductCodeValidator.getCodeType("96385074")); // EAN-8
        System.out.println(">>>>>>" + ProductCodeValidator.getCodeType("B01GINN32E")); // ASIN
        System.out.println(">>>>>>" + ProductCodeValidator.getCodeType("0-201-53082-1")); // ISBN-10
        System.out.println(">>>>>>" + ProductCodeValidator.getCodeType("190198160980")); // UPC
        System.out.println(">>>>>>" + ProductCodeValidator.getCodeType("4011200296908")); // EAN-13
        System.out.println(">>>>>>" + ProductCodeValidator.getCodeType("96385074QQQQQQEE")); // NONE

        // check if code is valid or not
        System.out.println(">>>>>>" + ProductCodeValidator.isValidISBN_10("0-201-53082-1")); /// ISBN-10
        System.out.println(">>>>>>" + ProductCodeValidator.isValidISBN_13("9781940363776")); // ISBN-13
        System.out.println(">>>>>>" + ProductCodeValidator.isValidUPC("049057200193")); // UPC
        System.out.println(">>>>>>" + ProductCodeValidator.isValidEAN("96385074")); // EAN

        // get the real name
        System.out.println(">>>>>>" + ProductCodeType.ISBN_10.getRealName()); // ISBN
        System.out.println(">>>>>>" + ProductCodeType.ISBN_13.getRealName()); // ISBN
    }
}
