package com.example.linebotexample.controller

import com.example.linebotexample.service.AiService
import com.linecorp.bot.model.event.MessageEvent
import com.linecorp.bot.model.event.message.TextMessageContent
import com.linecorp.bot.model.message.TextMessage
import com.linecorp.bot.spring.boot.annotation.EventMapping
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler
import org.springframework.stereotype.Controller

@Controller
@LineMessageHandler
class WebhookController(
	private val aiService: AiService
) {

	@EventMapping
	fun handleTextMessageEvent(
		event: MessageEvent<TextMessageContent>
	): TextMessage {
		return aiService.handleTextMessageEvent(event)
	}
}
