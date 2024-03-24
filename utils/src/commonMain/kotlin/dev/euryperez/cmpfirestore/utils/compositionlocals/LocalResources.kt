package dev.euryperez.cmpfirestore.utils.compositionlocals

import androidx.compose.runtime.compositionLocalOf
import dev.euryperez.cmpfirestore.utils.Resources

val LocalResources = compositionLocalOf<Resources> {
    error("No LocalResources provided")
}
