package com.intime.assetharmony;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

/**
 * @author chigui.meng
 * @date 25/10/2023 7:25 pm
 */
public interface PersonMapper extends R2dbcRepository<Person, Long> {
}
