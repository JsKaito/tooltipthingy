package me.owdding.iconographic.features.pet

import me.owdding.iconographic.config.categories.pets.PetsConfig
import tech.thatgravyboat.skyblockapi.utils.extentions.toFormattedString

object PetExperienceFormat {
    fun format(value: Float): String {
        return if (PetsConfig.petExperienceDecimal) {
            value.toFormattedString()
        } else {
            value.toInt().toFormattedString()
        }
    }
}