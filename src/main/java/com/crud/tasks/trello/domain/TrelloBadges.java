package com.crud.tasks.trello.domain;

import com.crud.tasks.trello.domain.TrelloAttachmentsByType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloBadges {

    @JsonProperty("votes")
    private int votes;

    @JsonProperty("attachmentByType")
    private TrelloAttachmentsByType attachmentsByType;
}
