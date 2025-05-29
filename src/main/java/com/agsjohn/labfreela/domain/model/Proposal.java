package com.agsjohn.labfreela.domain.model;

import java.time.LocalDateTime;

public class Proposal {
    private Long id;
    private Long serviceId;
    private Long clientId;
    private ProposalStatus status;
    private LocalDateTime submittedAt;
}