package com.nicholssoftware.battlekmm.data

/**
 * Users character
 */
data class Player(
    override val name: String,
    override var health: Int,
    override var maxAttack: Int,
    val weaponName: String,
    val level: Int,
    override var isAlive: Boolean = true,
    override val characterGif: Int
) : CharacterBase()