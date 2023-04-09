package com.example.androidunittest


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{
    // TDD -> Test Driven Development

    private val regisUtil = RegistrationUtil()

    @Test
    fun `empty username return false` (){
        val result = regisUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `valid username and correctly repeated password return true` (){
        val result = regisUtil.validateRegistrationInput(
            "Yas",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `username already exist return false` (){
        val result = regisUtil.validateRegistrationInput(
            "Jas",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `incorrectly confirmed password returns false` (){
        val result = regisUtil.validateRegistrationInput(
            "Yas",
            "12345",
            "12345"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `empty password return false` (){
        val result = regisUtil.validateRegistrationInput(
            "Yas",
            "",
            ""
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `less than 2 digit password returns false` (){
        val result = regisUtil.validateRegistrationInput(
            "Yas",
            "12345a",
            "12345a"
        )
        assertThat(result).isFalse()
    }
}