/*
 * Copyright 2013 The GDG Frisbee Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gdg.frisbee.android.api.model;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * GDG Aachen
 * org.gdg.frisbee.android.api.model
 * <p/>
 * User: maui
 * Date: 22.04.13
 * Time: 22:44
 */
public class Event implements Response {
    private ArrayList<String> className;
    private DateTime start, end;
    private boolean allDay;
    private String location, title, url, iconUrl, id;

    public Event() {
        className = new ArrayList<String>();
    }

    public ArrayList<String> getClassName() {
        return className;
    }

    public DateTime getStart() {
        return start;
    }

    public DateTime getEnd() {
        return end;
    }

    public boolean isAllDay() {
        return allDay;
    }

    public String getLocation() {
        return location;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getId() {
        return id;
    }
}