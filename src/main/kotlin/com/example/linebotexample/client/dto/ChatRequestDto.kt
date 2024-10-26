package com.example.linebotexample.client.dto

data class ChatRequestDto(
	val model: String,
	val messages: List<MessageDto>
)
