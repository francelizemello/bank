package com.example.projetobank.data.source.local

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.projetobank.data.model.Usuario

@Dao
interface UsuarioDao {

    @Query("SELECT * FROM  usuario")
    fun pegarUsuario(): List<Usuario>

    @Insert
    fun adicionarLogin(login: Usuario?)

    @Query("DELETE FROM usuario")
    fun deletarUsuario()
}