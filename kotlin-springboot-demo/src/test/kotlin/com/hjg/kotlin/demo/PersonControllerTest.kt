package com.hjg.kotlin.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

/**
 * 测试类的层级与启动类保持一致。
 */
@SpringBootTest
@AutoConfigureMockMvc
class PersonControllerTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `GET hello should return message`() {
        mockMvc.perform(MockMvcRequestBuilders.get("/users/12345"))
            .andExpect(MockMvcResultMatchers.status().isOk)
            //.andExpect(content().string("Hello from Kotlin!"))
            .andExpect(MockMvcResultMatchers.jsonPath("$.id").value("12345"))
    }
}
