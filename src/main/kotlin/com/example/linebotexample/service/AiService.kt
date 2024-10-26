package com.example.linebotexample.service

import com.example.linebotexample.repository.AiRepository
import com.linecorp.bot.model.event.MessageEvent
import com.linecorp.bot.model.event.message.TextMessageContent
import com.linecorp.bot.model.message.TextMessage
import org.springframework.stereotype.Service

@Service
class AiService(
	private val aiRepository: AiRepository
) {

	fun handleTextMessageEvent(
		event: MessageEvent<TextMessageContent>
	): TextMessage {
		val response = aiRepository.chat(listOf(event.message.text))
		return TextMessage(response)
	}
}
