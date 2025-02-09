/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.metadata.rest.springmvc;

import org.apache.dubbo.metadata.rest.AbstractNoAnnotatedParameterProcessor;
import org.apache.dubbo.metadata.rest.RestMethodMetadata;
import org.apache.dubbo.metadata.rest.media.MediaType;

import static org.apache.dubbo.metadata.rest.RestMetadataConstants.SPRING_MVC.REQUEST_BODY_ANNOTATION_CLASS_NAME;
import static org.apache.dubbo.metadata.rest.media.MediaType.APPLICATION_FORM_URLENCODED_VALUE;

public class FormBodyNoAnnotatedProcessor extends AbstractNoAnnotatedParameterProcessor {
    @Override
    public MediaType consumerContentType() {
        return APPLICATION_FORM_URLENCODED_VALUE;
    }

    @Override
    public String defaultAnnotationClassName(RestMethodMetadata restMethodMetadata) {
        return REQUEST_BODY_ANNOTATION_CLASS_NAME;
    }

    @Override
    protected boolean isFormContentType(RestMethodMetadata restMethodMetadata) {
        return true;
    }
}
