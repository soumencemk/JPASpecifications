package com.soumen.poc.jpasearch.controller;

import com.soumen.poc.jpasearch.domain.common.query.SearchRequest;
import com.soumen.poc.jpasearch.domain.dao.Employee;
import com.soumen.poc.jpasearch.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/operating-system", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class OperatingSystemController {

    @Autowired
    private EmployeeService operatingSystemService;

    @PostMapping(value = "/search")
    public List<Employee> search(@RequestBody SearchRequest request) {
        return operatingSystemService.searchOperatingSystem(request);
    }

}
