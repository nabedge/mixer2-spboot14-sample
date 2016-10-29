package com.example.view;

import org.mixer2.jaxb.xhtml.Div;
import org.mixer2.jaxb.xhtml.Html;
import org.mixer2.spring.webmvc.AbstractMixer2XhtmlView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class IndexView extends AbstractMixer2XhtmlView{

    @Override
    protected Html renderHtml(Html html, Map<String, Object> model,
                              HttpServletRequest request, HttpServletResponse response) throws Exception {

        String msg = (String) model.get("message");
        html.getById("hellomsg", Div.class).replaceInner(msg);

        PathAdjusterUtil.pathAdjuster(html, request.getContextPath());

        return html;
    }
}
