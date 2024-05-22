package com.example.SnippetShare.Controller

import com.example.SnippetShare.Entity.Snippet
import com.example.SnippetShare.Service.SnippetService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/snippets")
class SnippetController @Autowired constructor(
    private val snippetService: SnippetService
) {
    @GetMapping
    fun getAllSnippets(): ResponseEntity<List<Snippet>> {
        val snippets = snippetService.getAllSnippets()
        return ResponseEntity.ok(snippets)
    }
}