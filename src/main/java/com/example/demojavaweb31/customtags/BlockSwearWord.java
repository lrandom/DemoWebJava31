package com.example.demojavaweb31.customtags;

import jakarta.servlet.jsp.JspContext;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.PageContext;
import jakarta.servlet.jsp.tagext.*;

import java.io.IOException;

public class BlockSwearWord extends SimpleTagSupport {
    private String[] swearWords = new String[]{
            "damn","shit"
    };
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter jspWriter = getJspContext().getOut();
        String filterContent = this.content;
        for (String swearWord : swearWords
        ) {
            filterContent = filterContent.replaceAll(swearWord, "***");
        }
        jspWriter.write(filterContent);
    }
}
