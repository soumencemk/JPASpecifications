package com.soumen.poc.jpasearch.domain.common.query;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
public enum FieldType {
    STRING {
        public Object parse(String value) {
            return value;
        }
    };

    public abstract Object parse(String value);

}
