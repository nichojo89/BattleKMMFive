package com.nicholssoftware.battlekmm.data

/**
 * An opponent
 */
data class Enemy(
    override val name: String,
    override var health: Int,
    override var maxAttack: Int,
    val warCry: String,
    override var isAlive: Boolean = true,
    override val characterGif: Int
) : CharacterBase()