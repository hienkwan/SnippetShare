package com.example.SnippetShare.Entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "snippets")
class Snippet(
    @Id @GeneratedValue var id: Long? = null,
    val content: String? = null,
    val language: String? = null,
    @Column(name = "created_date") val createdDate: LocalDateTime? = null,
    @Column(name = "updated_date") val updatedDate: LocalDateTime? = null
)