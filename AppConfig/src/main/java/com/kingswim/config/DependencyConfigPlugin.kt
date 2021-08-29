package com.kingswim.config

import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("unused")
class DependencyConfigPlugin :Plugin<Project> {
    override fun apply(target: Project) {
        println("DependencyConfigPlugin:${target.buildFile}")
    }
}