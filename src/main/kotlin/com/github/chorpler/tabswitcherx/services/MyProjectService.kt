package com.github.chorpler.tabswitcherx.services

import com.intellij.openapi.project.Project
import com.github.chorpler.tabswitcherx.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
