package com.agsjohn.labfreela.domain.model;

import java.math.BigDecimal;
import java.util.List;

public class ServiceOffer {
    private Long id;
    private Long freelancerId;
    private String title;
    private String description;
    private BigDecimal price;
    private List<String> tags;
}
