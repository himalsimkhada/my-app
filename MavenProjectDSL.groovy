job('example') {
    description("First Maven demo project")
    logRotator(-1, 1)
    scm {
        github('https://github.com/himalsimkhada/my-app.git', 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package')
    }
    publishers {
        archiveArtifacts('**/*.war')
    }
}
