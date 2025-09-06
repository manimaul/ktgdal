@file:OptIn(ExperimentalForeignApi::class)

import kotlinx.cinterop.ExperimentalForeignApi

fun main(args: Array<String>) {
    args.forEach {
        val s57 = S57(
            path = it
        )
        s57.layerNames.forEach {
            println("layer name $it")
        }
        val fc = s57.featureCount()
        println("feature count = $fc")
    }
}
