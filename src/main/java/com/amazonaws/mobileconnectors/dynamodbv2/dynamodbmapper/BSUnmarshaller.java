/*
 * Copyright 2011-2015 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import java.lang.reflect.Method;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

abstract class BSUnmarshaller implements ArgumentUnmarshaller {

    @Override
    public void typeCheck(AttributeValue value, Method setter) {
        if ( value.getBS() == null ) {
            throw new DynamoDBMappingException("Expected BS in value " + value + " when invoking " + setter);
        }
    }

}
