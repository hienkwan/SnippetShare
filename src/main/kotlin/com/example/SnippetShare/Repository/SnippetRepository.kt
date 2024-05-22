package com.example.SnippetShare.Repository

import com.example.SnippetShare.Entity.Snippet
import org.springframework.data.jpa.repository.JpaRepository

interface SnippetRepository : JpaRepository<Snippet, Long>