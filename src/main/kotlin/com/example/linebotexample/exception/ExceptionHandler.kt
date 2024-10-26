package com.example.linebotexample.exception

import com.linecorp.bot.model.message.TextMessage
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@Component
@ControllerAdvice
class ExceptionHandler {

	companion object {
		private val logger = LoggerFactory.getLogger(this::class.java)
	}

	@ExceptionHandler(EmptyMessageException::class)
	fun handleEmptyMessageException(e: EmptyMessageException): TextMessage {
		logger.error("メッセージ受け取りエラー", e)
		return TextMessage(e.message)
	}

	@ExceptionHandler(Exception::class)
	fun handleException(e: Exception): TextMessage {
		logger.error("想定外エラー", e)
		return TextMessage("想定外のエラーが発生しました。")
	}
}
