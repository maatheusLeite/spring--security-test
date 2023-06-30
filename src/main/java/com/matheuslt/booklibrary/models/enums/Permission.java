package com.matheuslt.booklibrary.models.enums;

public enum Permission {
	ADMIN_READ("admin:read"),
	ADMIN_CREATE("admin:create"),
	ADMIN_UPDATE("admin:update"),
	ADMIN_DELETE("admin:delete"),
	USER_READ("user:read"),
	USER_CREATE("user:create"),
	USER_UPDATE("user:update"),
	USER_DELETE("user:delete");
		
	private Permission(String permission) {
		this.permission = permission;
	}

	private final String permission;

	public String getPermission() {
		return permission;
	}
}
