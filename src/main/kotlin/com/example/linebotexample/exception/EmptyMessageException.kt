package com.example.linebotexample.exception

class EmptyMessageException: RuntimeException {
	constructor(message: String)

	constructor(message: String, throwable: Throwable)
}
