package com.beust.kobalt.intellij

//
// The classes in this file are mapped from the JSON coming back from the server
//

class DependencyData(val id: String, val scope: String, val path: String)

class ProjectData(val name: String, val directory: String,
        val dependentProjects: List<String>,
        val compileDependencies: List<DependencyData>,
        val testDependencies: List<DependencyData>,
        val sourceDirs: Set<String>, val testDirs: Set<String>,
        val sourceResourceDirs: Set<String>, val testResourceDirs: Set<String>)

class GetDependenciesData(val projects: List<ProjectData>, val errorMessage: String?)

