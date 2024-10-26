package com.example.linebotexample.repository

import com.example.linebotexample.client.ChatGptClient
import com.example.linebotexample.client.dto.ChatRequestDto
import com.example.linebotexample.client.dto.MessageDto
import org.springframework.stereotype.Repository

@Repository
class AiRepository(
	private val chatGptClient: ChatGptClient
) {

	companion object {
		const val model = "gpt-3.5-turbo"
	}

	fun chat(messages: List<String>): String {
		val request = ChatRequestDto(
			model = model,
			messages = messages.map { MessageDto(role = "user", content = it) },
		)
		val response = chatGptClient.post(request)
		return response.choices.joinToString { it.message.content }
	}
}
