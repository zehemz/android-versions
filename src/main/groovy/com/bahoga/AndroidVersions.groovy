package com.bahoga

import org.gradle.api.Project
import org.gradle.api.Plugin

class AndroidVersions implements Plugin<Project> {
    void apply(Project project) {
       	project.extensions.create('android_version', AndroidVersionsPluginExtension)
    }
}