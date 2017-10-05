package com.yhyy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${ds_driverClassName}")
    private String ds_driverClassName;

    @Value("${ds_password}")
    private String ds_password;

    @Value("${ds_url}")
    private String ds_url;

    @Value("${ds_username}")
    private String ds_username;

    @RequestMapping("/ds_driverClassName")
    public String ds_driverClassName() {
        return this.ds_driverClassName;
    }

    @RequestMapping("/ds_password")
    public String ds_password() {
        return this.ds_password;
    }

    @RequestMapping("/ds_url")
    public String ds_url() {
        return this.ds_url;
    }

    @RequestMapping("/ds_username")
    public String ds_username() {
        return this.ds_username;
    }

    public String getDs_driverClassName() {
        return ds_driverClassName;
    }

    public void setDs_driverClassName(String ds_driverClassName) {
        this.ds_driverClassName = ds_driverClassName;
    }

    public String getDs_password() {
        return ds_password;
    }

    public void setDs_password(String ds_password) {
        this.ds_password = ds_password;
    }

    public String getDs_url() {
        return ds_url;
    }

    public void setDs_url(String ds_url) {
        this.ds_url = ds_url;
    }

    public String getDs_username() {
        return ds_username;
    }

    public void setDs_username(String ds_username) {
        this.ds_username = ds_username;
    }
}