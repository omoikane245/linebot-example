package com.example.linebotexample.client

import com.example.linebotexample.client.dto.ChatRequestDto
import com.example.linebotexample.client.dto.ChatResponseDto
import com.example.linebotexample.constant.ChatGptConstant
import com.example.linebotexample.exception.EmptyMessageException
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder

@Component
class ChatGptClient(
	private val restTemplate: RestTemplate,
	private val chatGptConstant: ChatGptConstant
) {

	fun post(request: ChatRequestDto): ChatResponseDto {
		val uriComponents = UriComponentsBuilder.fromUriString(chatGptConstant.url).build()
		val headers = HttpHeaders()
		headers.set(HttpHeaders.AUTHORIZATION, "Bearer ${chatGptConstant.key}")
		val entity = HttpEntity(request, headers)
		val exchange = restTemplate.exchange(uriComponents.toUriString(), HttpMethod.POST, entity, ChatResponseDto::class.java)
		return exchange.body ?: throw EmptyMessageException("ChatGPTからメッセージを受け取れませんでした。")
	}
}
