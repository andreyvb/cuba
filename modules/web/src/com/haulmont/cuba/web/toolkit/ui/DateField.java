/*
 * Copyright (c) 2008 Haulmont Technology Ltd. All Rights Reserved.
 * Haulmont Technology proprietary and confidential.
 * Use is subject to license terms.

 * Author: Nikolay Gorodnov
 * Created: 02.11.2009 11:28:58
 *
 * $Id$
 */
package com.haulmont.cuba.web.toolkit.ui;

import com.vaadin.data.Property;

import java.util.Date;

public class DateField extends com.vaadin.ui.DateField {
    public DateField() {
    }

    public DateField(String caption) {
        super(caption);
    }

    public DateField(String caption, Property dataSource) {
        super(caption, dataSource);
    }

    public DateField(Property dataSource) throws IllegalArgumentException {
        super(dataSource);
    }

    public DateField(String caption, Date value) {
        super(caption, value);
    }

    @Override
    protected Date handleUnparsableDateString(String dateString) throws ConversionException {
        return null;
    }

    @Override
    protected boolean isEmpty() {
        return getValue() == null;
    }
}
