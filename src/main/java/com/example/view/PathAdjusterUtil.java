package com.example.view;

import org.mixer2.jaxb.xhtml.Html;
import org.mixer2.xhtml.PathAdjuster;

import java.util.regex.Pattern;

public class PathAdjusterUtil {

    private PathAdjusterUtil(){}

    public static final void pathAdjuster(Html html, String contextPath) {
        Pattern pattern = Pattern.compile("^\\.+/.*static/(.*)$");
        if (contextPath == null) {
            contextPath = "";
        }
        PathAdjuster.replacePath(html, pattern, contextPath + "/$1");
    }
}
