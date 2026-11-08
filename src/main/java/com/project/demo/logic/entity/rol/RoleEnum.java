package com.project.demo.logic.entity.rol;

public enum RoleEnum {
    USER("USER"),
    SUPER_ADMIN_ROLE("SUPER-ADMIN-ROLE");

    private final String value;

    RoleEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}