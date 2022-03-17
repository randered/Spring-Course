package com.vasilyanev.sfgdi.controler;

import com.vasilyanev.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
       return greetingService.sayGreetings();
    }
}
