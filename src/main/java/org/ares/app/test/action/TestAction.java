package org.ares.app.test.action;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestAction {

	@RequestMapping("/info/{id}")
    public String getBlogById(@PathVariable String id) {
        return "this is blog "+id;
    }
	
}
