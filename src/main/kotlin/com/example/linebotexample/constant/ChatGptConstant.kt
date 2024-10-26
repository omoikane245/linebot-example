package com.example.linebotexample.constant

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class ChatGptConstant {

	@Value("\${chatgpt.url}")
	val url = ""

	@Value("\${chatgpt.key}")
	val key = ""
}
