package org.jetbrains.spek.api.extension.execution

import org.jetbrains.spek.api.extension.Extension
import org.jetbrains.spek.api.extension.GroupExtensionContext
import org.jetbrains.spek.api.meta.Experimental

/**
 * @author Ranie Jade Ramiso
 */
@Experimental
interface BeforeExecuteGroup: Extension {
    fun beforeExecuteGroup(group: GroupExtensionContext)
}
