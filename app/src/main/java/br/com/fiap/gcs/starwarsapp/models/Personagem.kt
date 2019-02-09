package br.com.fiap.gcs.starwarsapp.models

data class Personagem (
        val nome: String,
        val altura: Double,
        val peso: Double,
        val cor_cabelo: String,
        val cor_olhos: String,
        val ano_nascimento: String,
        val genero: String,
        val url_planeta_natal: String,
        val filmes_url: Array<String>,
        val especies_url: Array<String>
)