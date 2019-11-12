@file:Suppress("NOTHING_TO_INLINE")

package org.xbrowser.prosuperfast

/**
 * Use to implement an unimplemented method.
 */
inline fun unimplemented(): Nothing {
    throw NotImplementedError("Not implemented")
}
