package com.project.demo.logic.entity.rol;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RoleEnum {
    USER("USER"),
    SUPER_ADMIN_ROLE("SUPER-ADMIN-ROLE");

    private final String value;

    RoleEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}