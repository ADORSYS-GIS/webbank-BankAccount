/*
 * Copyright (c) 2018-2024 adorsys GmbH and Co. KG
 * All rights are reserved.
 */

package de.adorsys.ledgers.bank.rest.resource;

import de.adorsys.ledgers.bank.rest.EmptyLedgersApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = EmptyLedgersApplication.class)
@ActiveProfiles("h2")
class StarterIT {

    @Test
    void should_laod_context_without_exception() {
        // This test will load the application context and ensure everything is wired correctly
        // But test will not load chart of account
        assertTrue(true);
    }
}
