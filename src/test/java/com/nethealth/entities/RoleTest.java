package com.nethealth.entities;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RoleTest {

	@Test
	void test() {
		Role role = Role.DOCTOR;
		assertThat(role).isEqualTo(Role.DOCTOR);
	}

}
