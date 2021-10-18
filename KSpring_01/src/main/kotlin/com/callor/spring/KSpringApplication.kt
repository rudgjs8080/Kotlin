package com.callor.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * web.xml 파일을 대신하는 boot 클래스 만들기
 *
 */
@SpringBootApplication
class KSpringApplication

/**
 * main 함수에서 runApplication...을 이용해서
 * 프로젝트를 start 한다
 *
 *
 */
fun main(args: Array<String>) {
	runApplication<KSpringApplication>(*args)
}
