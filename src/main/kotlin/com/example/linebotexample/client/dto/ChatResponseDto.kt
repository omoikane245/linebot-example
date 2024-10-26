package com.example.linebotexample.client.dto

data class ChatResponseDto(
	val id: String,
	val model: String,
	val choices: List<ChoiceDto>
)
