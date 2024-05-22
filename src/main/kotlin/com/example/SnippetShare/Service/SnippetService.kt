package com.example.SnippetShare.Service

import com.example.SnippetShare.Entity.Snippet
import com.example.SnippetShare.Repository.SnippetRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SnippetService @Autowired constructor(private val snippetRepository: SnippetRepository){
    fun getAllSnippets(): List<Snippet> {
        return snippetRepository.findAll()
    }
}