package com.akzholbek.websurvey.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.akzholbek.websurvey.entity.Product}
 */
public record ProductDto(Long id, String name, String description) implements Serializable {

}