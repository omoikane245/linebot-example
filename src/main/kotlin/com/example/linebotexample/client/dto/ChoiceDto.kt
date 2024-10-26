package com.example.linebotexample.client.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class ChoiceDto(
	val message: MessageDto,
	val index: Int,
	@JsonProperty("finish_reason")
	val finishReason: String
)
