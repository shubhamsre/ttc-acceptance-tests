/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.cloud.qa.model;

import java.io.Serializable;

public class Tweet implements Serializable {

    private String text;
    private String author;
    private String lang;
    private String attitude;
    private long timestamp;

    public Tweet() {
    }

    public Tweet(String text,
                 String author,
                 String lang) {
        this.text = text;
        this.author = author;
        this.lang = lang;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public String getLang() {
        return lang;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getAttitude() {
        return attitude;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", lang='" + lang + '\'' +
                ", attitude='" + attitude + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

}
