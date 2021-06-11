package com.haige.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @className: com.haige.config-> MyLocalResolver
 * @description:
 * @author: cqh
 * @createDate: 2021-06-09 17:22
 * @version: 1.0
 * @todo:
 */
public class MyLocalResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String language = httpServletRequest.getParameter("lan");
        Locale locale = Locale.getDefault();

        if(!StringUtils.isEmpty(language)){
            String[] split = language.split("_");
            // 语言 国家
            locale = new Locale(split[0], split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
