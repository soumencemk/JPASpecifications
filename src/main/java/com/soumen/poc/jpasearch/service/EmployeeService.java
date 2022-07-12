package com.soumen.poc.jpasearch.service;

import com.soumen.poc.jpasearch.domain.common.query.SearchRequest;
import com.soumen.poc.jpasearch.domain.common.query.SearchSpecification;
import com.soumen.poc.jpasearch.domain.dao.Employee;
import com.soumen.poc.jpasearch.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> searchOperatingSystem(SearchRequest request) {
        SearchSpecification<Employee> specification = new SearchSpecification<>(request);
        return employeeRepository.findAll(specification);
    }

}
